package com.example.interactivemap.ui.screens.navigation

import android.app.Application
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.location.Location
import android.os.Bundle
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
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlin.random.Random

class NavigationViewModel(application: Application): AndroidViewModel(application)  {
    var loadingMapComponent by mutableStateOf(true)
    private var broadcastReceiver: BroadcastReceiver? = null
    private val _movementState = MutableStateFlow(false)
    val movementState = _movementState.asStateFlow()

    private val _loading = MutableStateFlow(true)
    val loading = _loading.asStateFlow()

    private val _floor = MutableStateFlow(0)
    val floor = _floor.asStateFlow()

    private val _locationMarkerShown = MutableStateFlow(false)
    val locationMarkerShown = _locationMarkerShown.asStateFlow()

    private val _searchResults = MutableStateFlow(arrayListOf<NavModel>())
    val searchResults = _searchResults.asStateFlow()

    private val _movedCameraPosition = MutableStateFlow(Constants.baseCameraPosition)
    val movedCameraPosition = _movedCameraPosition.asStateFlow()

    private var savedMultiFloorRoad: List<List<RoadElementModel>> = listOf(listOf())

    private val _googleMapRoad = MutableStateFlow(listOf<LatLng>())
    val googleMapRoad = _googleMapRoad.asStateFlow()

    private var _mapSelectionEnable = true
    private var _firstLocationEnable = false

    var dialogGPSBeShown by mutableStateOf(false)
    var activateGPSDialogShown by mutableStateOf(false)

    val descriptorRepository = getApplication<ThisApplication>().descriptorRepository

    var navigationEventDialogShown by mutableStateOf(false)

    private var _navigationEventDialogData = MutableStateFlow(NavigationEventModel(0,0,0))
    val navigationEventDialogData = _navigationEventDialogData.asStateFlow()
    private var _navigationEventType = 0

    private var _observablePointLatLng = LatLng(0.0, 0.0)
    private var _observableMultiRoadListIndex = 0

    var startMarkerType by mutableStateOf(DescriptorRepository.LOCATION_MARKER)
    var startMarkerStateVisible by mutableStateOf(false)
    private val _foundNearestPointStart = MutableStateFlow(
        NavModel(0, 0, null, null,
            LatLng(0.0,0.0), 0,
            0, listOf(), listOf(), 0,
            false))
    val foundNearestPointStart = _foundNearestPointStart.asStateFlow()

    var endMarkerType by mutableStateOf(DescriptorRepository.FINISH_MARKER)
    var endMarkerStateVisible by mutableStateOf(false)
    private val _foundNearestPointEnd = MutableStateFlow(
        NavModel(0, 0, null, null,
            LatLng(0.0,0.0), 0,
            0, listOf(), listOf(), 0,
            false))
    val foundNearestPointEnd = _foundNearestPointEnd.asStateFlow()

    var isEndPointSelectable by mutableStateOf(true)

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

    fun clearRoad(){
        _observableMultiRoadListIndex = 0
        startMarkerType = DescriptorRepository.LOCATION_MARKER
        endMarkerType = DescriptorRepository.FINISH_MARKER
        savedMultiFloorRoad = listOf(listOf())
        _googleMapRoad.value = listOf()
        _mapSelectionEnable = true
    }

    fun makeFullRoad() {
        clearRoad()
        val path = GoogleMapUtil.aStar(NavGraphList.nawGraphList,
            _foundNearestPointStart.value.id, _foundNearestPointEnd.value.id)
        savedMultiFloorRoad = GoogleMapUtil.toMultiLocationRoad(path)
        _googleMapRoad.value =  path.map { it.location }
    }

    fun nextSegmentExist(): Boolean {
        return savedMultiFloorRoad.size -1 != _observableMultiRoadListIndex
    }

    fun makeSegmentRoad(nextRoad: Boolean) {
        _googleMapRoad.value = listOf()
        _mapSelectionEnable = false
        if (nextRoad && savedMultiFloorRoad.size > _observableMultiRoadListIndex) _observableMultiRoadListIndex++
        _googleMapRoad.value = savedMultiFloorRoad[_observableMultiRoadListIndex].map { it.location }
        val firstPoint = savedMultiFloorRoad[_observableMultiRoadListIndex].first()
        val lastPoint = savedMultiFloorRoad[_observableMultiRoadListIndex].last()
        _foundNearestPointStart.value = NavGraphList.getElementById(firstPoint.id)
        _foundNearestPointEnd.value = NavGraphList.getElementById(lastPoint.id)

        _floor.value = lastPoint.floor

        startMarkerStateVisible = false
        endMarkerStateVisible = false

        if (_observableMultiRoadListIndex > 0) {
            if (firstPoint.floor != savedMultiFloorRoad[
                    _observableMultiRoadListIndex].last().floor) {
                startMarkerType = if (firstPoint.floor > savedMultiFloorRoad[
                        _observableMultiRoadListIndex - 1].last().floor)
                    DescriptorRepository.UP_MARKER else DescriptorRepository.DOWN_MARKER
            } else if (firstPoint.locationIndex != savedMultiFloorRoad[
                    _observableMultiRoadListIndex - 1].last().locationIndex
            ) startMarkerType = DescriptorRepository.ENTER_MARKER
        }

        if (savedMultiFloorRoad.size -1 != _observableMultiRoadListIndex) {
            if (lastPoint.floor != savedMultiFloorRoad[
                    _observableMultiRoadListIndex + 1].last().floor) {
                endMarkerType = if (lastPoint.floor > savedMultiFloorRoad[
                        _observableMultiRoadListIndex + 1].last().floor) {
                    DescriptorRepository.DOWN_MARKER } else DescriptorRepository.UP_MARKER
            } else if (lastPoint.locationIndex != savedMultiFloorRoad[
                    _observableMultiRoadListIndex + 1].last().locationIndex)
                endMarkerType = DescriptorRepository.ENTER_MARKER
        } else endMarkerType = DescriptorRepository.FINISH_MARKER

        startMarkerStateVisible = true
        endMarkerStateVisible = true
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

        startMarkerStateVisible = isEndPointSelectable
        endMarkerStateVisible = !isEndPointSelectable

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
        if (result != null){
            if (isEndPointSelectable) _foundNearestPointEnd.value = result
            else  _foundNearestPointStart.value = result
        }
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
        if (isEndPointSelectable) _foundNearestPointEnd.value = selectedElement
        else  _foundNearestPointStart.value = selectedElement
    }

    fun showCreateRoadError() {
        Toast.makeText(getApplication(), "Точки для прокладання маршруту не обрано", Toast.LENGTH_SHORT).show()
    }



}