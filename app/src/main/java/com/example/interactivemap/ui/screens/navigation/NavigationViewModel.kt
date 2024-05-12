package com.example.interactivemap.ui.screens.navigation

import android.app.Application
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.location.Location
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.Constants
import com.example.interactivemap.logic.model.navigation.graph.NavGraphNew
import com.example.interactivemap.logic.model.navigation.graph.NavGraphOld
import com.example.interactivemap.logic.model.navigation.graph.NavGraphSk
import com.example.interactivemap.logic.model.navigation.graph.NavGraphYard
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.logic.service.LocationBroadcastData.BROADCAST_LOCATION_DATA
import com.example.interactivemap.logic.service.LocationBroadcastData.BROADCAST_LOCATION_PROVIDERS_STATE
import com.example.interactivemap.logic.service.LocationBroadcastData.BROADCAST_LOCATION_PROVIDERS_STATE_GPS_OFF
import com.example.interactivemap.logic.service.LocationBroadcastData.BROADCAST_LOCATION_PROVIDERS_STATE_GPS_ON
import com.example.interactivemap.logic.service.LocationServiceConstants.ACTION
import com.example.interactivemap.logic.util.GoogleMapUtil
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class NavigationViewModel(application: Application): AndroidViewModel(application)  {
    private var broadcastReceiver: BroadcastReceiver? = null
    private val _movementState = MutableStateFlow(false)
    val movementState = _movementState.asStateFlow()
    private val _loading = MutableStateFlow(true)
    val loading = _loading.asStateFlow()

    private val _foundNearestPoint = MutableStateFlow(LatLng(0.0,0.0))
    val foundNearestPoint = _foundNearestPoint.asStateFlow()

    private val _movedCameraPosition = MutableStateFlow(
        CameraPosition.Builder().target(Constants.baseLocation).zoom(Constants.ZOOM_BASE).build())
    val movedCameraPosition = _movedCameraPosition.asStateFlow()

    fun disableLoadingState(){
        _loading.value = false
    }

    fun rememberLastCameraPosition(position: CameraPosition){
        ThisApplication.getInstance().setLastCameraState(position)
    }

    fun setMovementObserverState(enable: Boolean){ _movementState.value = enable
        if (enable) setBroadcastReceiver() else stopBroadcastReceiver()
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
                            //showLocationErrorDialog()
                        } else if (intentExtraValue == BROADCAST_LOCATION_PROVIDERS_STATE_GPS_ON) {
                            //hideLocationErrorDialog()
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
        _movedCameraPosition.value = CameraPosition.Builder().target(
            LatLng(location.latitude, location.longitude)).zoom(Constants.ZOOM_BASE + 1f).build()
    }

    private fun stopBroadcastReceiver() {
        if (broadcastReceiver != null) {
            LocalBroadcastManager.getInstance(getApplication())
                .unregisterReceiver(broadcastReceiver!!)
            broadcastReceiver = null
        }
    }

    fun findLocationByLatLng(latLng: LatLng, floor: Int) {
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
        if (result != null){ _foundNearestPoint.value = result.location }
    }
}