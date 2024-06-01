package com.example.interactivemap.ui.screens.navigation

import android.app.Application
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.location.Location
import android.provider.Settings
import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.CompositionContext
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.Constants
import com.example.interactivemap.logic.model.navigation.graph.NavGraphList
import com.example.interactivemap.logic.model.navigation.graph.NavGraphNew
import com.example.interactivemap.logic.model.navigation.graph.NavGraphOld
import com.example.interactivemap.logic.model.navigation.graph.NavGraphSk
import com.example.interactivemap.logic.model.navigation.graph.NavGraphYard
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.logic.model.navigation.models.NavigationEventModel
import com.example.interactivemap.logic.model.navigation.models.RoadElementModel
import com.example.interactivemap.logic.repository.DescriptorRepository
import com.example.interactivemap.logic.service.LocationBroadcastData.BROADCAST_LOCATION_DATA
import com.example.interactivemap.logic.service.LocationBroadcastData.BROADCAST_LOCATION_PROVIDERS_STATE
import com.example.interactivemap.logic.service.LocationBroadcastData.BROADCAST_LOCATION_PROVIDERS_STATE_GPS_OFF
import com.example.interactivemap.logic.service.LocationBroadcastData.BROADCAST_LOCATION_PROVIDERS_STATE_GPS_ON
import com.example.interactivemap.logic.service.LocationServiceConstants.ACTION
import com.example.interactivemap.logic.util.GoogleMapUtil
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class NavigationViewModel(application: Application): AndroidViewModel(application)  {
    var loadingMapComponent by mutableStateOf(true)
    private var broadcastReceiver: BroadcastReceiver? = null
    private val _movementState = MutableStateFlow(false)
    val movementState = _movementState.asStateFlow()
    private val _loading = MutableStateFlow(true)
    val loading = _loading.asStateFlow()

    private val _locationMarkerShown = MutableStateFlow(false)
    val locationMarkerShown = _locationMarkerShown.asStateFlow()

    private val _searchResults = MutableStateFlow(arrayListOf<NavModel>())
    val searchResults = _searchResults.asStateFlow()

    private val _foundNearestPoint = MutableStateFlow(
        NavModel(0, 0, null, null,
            LatLng(0.0,0.0), 0,
            0, listOf(), listOf(), 0,
            false))
    val foundNearestPoint = _foundNearestPoint.asStateFlow()

    private val _movedCameraPosition = MutableStateFlow(Constants.baseCameraPosition)
    val movedCameraPosition = _movedCameraPosition.asStateFlow()

    private var saverMultiFloorRoad: List<List<RoadElementModel>> = listOf(listOf())

    private val _googleMapRoad = MutableStateFlow(listOf<LatLng>())
    val googleMapRoad = _googleMapRoad.asStateFlow()

    private var _mapSelectionEnable = true
    private var _firstLocationEnable = false

    var dialogGPSBeShown by mutableStateOf(false)
    var activateGPSDialogShown by mutableStateOf(false)

    val descriptorRepository = getApplication<ThisApplication>().descriptorRepository

    var navigationEventDialogShown by mutableStateOf(false)
    var locationMarkerStateVisible by mutableStateOf(false)
    private var _navigationEventDialogData = MutableStateFlow(NavigationEventModel(0,0,0))
    val navigationEventDialogData = _navigationEventDialogData.asStateFlow()
    private var _navigationEventType = 0

    private var _observablePointLatLng = LatLng(0.0, 0.0)
    private var _observableMultiRoadListIndex = 0

    init {
        setBroadcastReceiver()
        viewModelScope.launch {
            descriptorRepository.loadDescriptors(application)
            loadingMapComponent = false
        }
    }

    fun disableLoadingState(){
        _loading.value = false
    }

    fun rebuildRoadByFloor(floor: Int) {
        _googleMapRoad.value = listOf()
        val multiFloorRoad = saverMultiFloorRoad
        val floorRoad = multiFloorRoad.flatten().filter { it.floor == floor }.map { it.location }
        _googleMapRoad.value = floorRoad
    }

    private fun clearRoad(){
        saverMultiFloorRoad = listOf(listOf())
        _googleMapRoad.value = listOf()
        _mapSelectionEnable = true
    }

    fun makeRoad(startPoint: Int, endPoint: Int){
        clearRoad()

//        val startTime = System.nanoTime()
//        val path = GoogleMapUtil.dijkstra(NavGraphList.nawGraphList, 1, 1756)
//
//        saverMultiFloorRoad = GoogleMapUtil.toMultiLocationRoad(path)
//
//        val endTime = System.nanoTime()
//        val duration = endTime - startTime
//
//        Log.d("ROAD", "Маршрут: $path")
//        Log.d("ROAD", "Маршрут мультирівневий: $saverMultiFloorRoad")
//        Log.d("TIME", "Час виконання: ${duration / 1000000} мс")

//        val startTime = System.nanoTime()
        val path = GoogleMapUtil.aStar(NavGraphList.nawGraphList, startPoint, endPoint)
        saverMultiFloorRoad = GoogleMapUtil.toMultiLocationRoad(path)

//        val endTime = System.nanoTime()
//        val duration = endTime - startTime
//
//        Log.d("ROAD", "Маршрут A*: $path")
//        Log.d("ROAD", "Маршрут мультирівневий A*: $saverMultiFloorRoad")
//        Log.d("TIME", "Час виконання A*: ${duration / 1000000} мс")

        if (saverMultiFloorRoad.isNotEmpty()){
            rebuildRoadByFloor(saverMultiFloorRoad.first().first().floor)
        }
    }

    fun rememberLastCameraPosition(position: CameraPosition){
        ThisApplication.getInstance().setLastCameraState(position)
    }

    fun setMovementObserver(){
        if (activateGPSDialogShown) dialogGPSBeShown = false
        _movementState.value = true
        if (_movedCameraPosition.value == Constants.baseCameraPosition && broadcastReceiver != null) { _movementState.value = false
            Toast.makeText(getApplication(), getApplication<ThisApplication>().getText(R.string.location_not_found), Toast.LENGTH_SHORT).show()
        }
    }

    fun disableMovementObserver(){
        _movementState.value = false
    }

    private fun setBroadcastReceiver() {
        if (broadcastReceiver != null) {
            LocalBroadcastManager.getInstance(getApplication())
                .unregisterReceiver(broadcastReceiver!!)
            broadcastReceiver = null
        }
        broadcastReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {
                val intentExtraKey = intent.getIntExtra("key", 0)
                val intentExtraValue = intent.getIntExtra("value", 0)
                val locationData = intent.getParcelableExtra<Location>("location")
                if (intentExtraKey > 0) {
                    when (intentExtraKey) { BROADCAST_LOCATION_PROVIDERS_STATE ->
                        if (intentExtraValue == BROADCAST_LOCATION_PROVIDERS_STATE_GPS_OFF) {
                            activateGPSDialogShown = true
                            _locationMarkerShown.value = false

                        } else if (intentExtraValue == BROADCAST_LOCATION_PROVIDERS_STATE_GPS_ON) {
                            activateGPSDialogShown = false
                            _locationMarkerShown.value = true
                        }

                        BROADCAST_LOCATION_DATA -> locationData?.let { locationChanged(it) } else -> {}
                    }
                }
            }
        }
        LocalBroadcastManager.getInstance(getApplication())
            .registerReceiver(broadcastReceiver!!, IntentFilter(ACTION))
    }

    private fun locationChanged(location: Location) {
        if (!_firstLocationEnable) {
            _locationMarkerShown.value = true
            _firstLocationEnable = true
        }

        if (_navigationEventType == 0 && _observablePointLatLng != LatLng(0.0,0.0)){
            if (GoogleMapUtil.distanceBetweenPoints(LatLng(location.latitude, location.longitude), _observablePointLatLng) < 15){
                _navigationEventType = 1
                sendNavigationEvent()
            }
        }

        _movedCameraPosition.value = CameraPosition.Builder().target(
            LatLng(location.latitude, location.longitude)).zoom(Constants.ZOOM_BASE + 1f).build()
    }

    private fun sendNavigationEvent(){

    }


    fun findLocationByLatLng(latLng: LatLng, floor: Int) {
        if (!_mapSelectionEnable) return

        val resultList: ArrayList<NavModel?> = arrayListOf(
            GoogleMapUtil.findNearestLocation(NavGraphYard.navGraphYard, latLng))

        when (floor){
            0 -> { resultList.add(GoogleMapUtil.findNearestLocation(NavGraphOld.navGraphOld0, latLng)) }
            1 -> { resultList.add(GoogleMapUtil.findNearestLocation(NavGraphOld.navGraphOld1, latLng))
                resultList.add(GoogleMapUtil.findNearestLocation(NavGraphNew.navGraphNew1, latLng))
                resultList.add(GoogleMapUtil.findNearestLocation(NavGraphSk.navGraphSk1, latLng)) }
            2 -> { resultList.add(GoogleMapUtil.findNearestLocation(NavGraphOld.navGraphOld2, latLng))
                resultList.add(GoogleMapUtil.findNearestLocation(NavGraphNew.navGraphNew2, latLng))
                resultList.add(GoogleMapUtil.findNearestLocation(NavGraphSk.navGraphSk2, latLng)) }
            3 -> { resultList.add(GoogleMapUtil.findNearestLocation(NavGraphOld.navGraphOld3, latLng))
                resultList.add(GoogleMapUtil.findNearestLocation(NavGraphNew.navGraphNew3, latLng)) }
            4 -> { resultList.add(GoogleMapUtil.findNearestLocation(NavGraphOld.navGraphOld4, latLng))
                resultList.add(GoogleMapUtil.findNearestLocation(NavGraphNew.navGraphNew4, latLng)) }
            5 -> { resultList.add(GoogleMapUtil.findNearestLocation(NavGraphOld.navGraphOld5, latLng)) }
        }

        val result = GoogleMapUtil.findNearestLocation(resultList.filterNotNull().toList(), latLng)
        if (result != null){ _foundNearestPoint.value = result }
    }

    fun openGPSSettings() {
        val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        getApplication<Application>().startActivity(intent)
    }

    fun onSearchEnter(searchRequest: String) {
        _searchResults.value.clear()
        val searchRes = NavGraphList.findFirstFourMatchesByName(searchRequest)
        _searchResults.value.addAll(searchRes)
    }

    fun onSearchSelect(selectedElement: NavModel) {
        _searchResults.value.clear()
        _foundNearestPoint.value = selectedElement
    }
}