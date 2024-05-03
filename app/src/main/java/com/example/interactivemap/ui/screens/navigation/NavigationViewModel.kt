package com.example.interactivemap.ui.screens.navigation

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.example.interactivemap.R
import com.example.interactivemap.logic.Constants
import com.example.interactivemap.logic.util.GoogleMapUtil
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class NavigationViewModel(application: Application): AndroidViewModel(application) {

    val baseCameraPosition: CameraPosition by lazy {
        CameraPosition.Builder().target(Constants.baseLocation).zoom(16f).build()
    }

    val skCameraPosition: CameraPosition by lazy {
        CameraPosition.Builder().target(Constants.skLocation).zoom(19f).bearing(Constants.BEARING_SK - 40f).build()
    }

    val oldCameraPosition: CameraPosition by lazy {
        CameraPosition.Builder().target(Constants.oldLocation).zoom(18f).bearing(Constants.BEARING_OLD - 40f).build()
    }

    val newCameraPosition: CameraPosition by lazy {
        CameraPosition.Builder().target(Constants.newLocation).zoom(17f).bearing(Constants.BEARING_NEW - 40f).build()
    }

    val drawBackground: BitmapDescriptor by lazy {
        GoogleMapUtil.drawableToBitmapDescriptor(getApplication(), R.drawable.background)
    }

    var positionNum = 147

    fun removeLast(){
        positionNum--
    }

    fun logPosition(position: CameraPosition) {
        Log.d(
            "CamPosition",
            "            NavModel(\n" +
                    "                id = " + positionNum + ", name = \"\",\n" +
                    "                location = LatLng("+ position.target.latitude +", "+ position.target.longitude +"),\n" +
                    "                locationIndex = NEW, floorIndex = 5,\n" +
                    "                connexionWith = listOf(" + (positionNum - 1) + ", "+ (positionNum + 1) +"),\n" +
                    "                connexionFloor = listOf(),\n" +
                    "                connectedLocIndex = NEW\n" +
                    "           ),\n"
        )
        positionNum++
    }


    val drawFloor0New: BitmapDescriptor by lazy {
        GoogleMapUtil.drawableToBitmapDescriptor(getApplication(), R.drawable.new_0)
    }

    val drawFloor1New: BitmapDescriptor by lazy {
        GoogleMapUtil.drawableToBitmapDescriptor(getApplication(), R.drawable.new_1)
    }

    val drawFloor2New: BitmapDescriptor by lazy {
        GoogleMapUtil.drawableToBitmapDescriptor(getApplication(), R.drawable.new_2)
    }

    val drawFloor3New: BitmapDescriptor by lazy {
        GoogleMapUtil.drawableToBitmapDescriptor(getApplication(), R.drawable.new_3)
    }

    val drawFloor4New: BitmapDescriptor by lazy {
        GoogleMapUtil.drawableToBitmapDescriptor(getApplication(), R.drawable.new_4)
    }

    val drawFloor5New: BitmapDescriptor by lazy {
        GoogleMapUtil.drawableToBitmapDescriptor(getApplication(), R.drawable.new_5)
    }
//
//    val drawFloor1Old: BitmapDescriptor by lazy {
//        GoogleMapUtil.drawableToBitmapDescriptor(getApplication(), R.drawable.old_1)
//    }
//
//    val drawFloor2Old: BitmapDescriptor by lazy {
//        GoogleMapUtil.drawableToBitmapDescriptor(getApplication(), R.drawable.old_2)
//    }
//
//    val drawFloor3Old: BitmapDescriptor by lazy {
//        GoogleMapUtil.drawableToBitmapDescriptor(getApplication(), R.drawable.old_3)
//    }
//
//    val drawFloor4Old: BitmapDescriptor by lazy {
//        GoogleMapUtil.drawableToBitmapDescriptor(getApplication(), R.drawable.old_4)
//    }
//
//    val drawFloor1Sk: BitmapDescriptor by lazy {
//        GoogleMapUtil.drawableToBitmapDescriptor(getApplication(), R.drawable.sk_1)
//    }
//
//    val drawFloor2Sk: BitmapDescriptor by lazy {
//        GoogleMapUtil.drawableToBitmapDescriptor(getApplication(), R.drawable.sk_2)
//    }
}