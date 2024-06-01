package com.example.interactivemap

import android.Manifest
import android.app.ActivityManager
import android.app.Application
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import com.example.interactivemap.logic.Constants
import com.example.interactivemap.logic.repository.DescriptorRepository
import com.example.interactivemap.logic.service.LocationForegroundService
import com.example.interactivemap.logic.util.SharedPreferencesHelper.loadSettingsHelper
import com.example.interactivemap.logic.util.SharedPreferencesRepository
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.jakewharton.threetenabp.AndroidThreeTen

class ThisApplication: Application(){

    private var fromMassage: Boolean = false
    private var lastKnownLocation: Location? = null
    lateinit var lastCameraPosition: CameraPosition
    val descriptorRepository: DescriptorRepository by lazy {
        DescriptorRepository(this) }
    var isGpsOn = true

    var darkThemeSelected by mutableStateOf(false)

    override fun onCreate() { super.onCreate()
        loadSettingsHelper(this, this.packageName)
        darkThemeSelected = SharedPreferencesRepository.darkThemeSelected
        AndroidThreeTen.init(this)
        lastCameraPosition = CameraPosition.Builder().target(
            Constants.baseLocation).zoom(Constants.ZOOM_BASE).build()
        instance = this
    }

    fun setFromMassage(param: Boolean){
        this.fromMassage = param
    }

    fun isFromMassage(): Boolean {
        return fromMassage
    }

    fun setLastCameraState(position: CameraPosition) {
        lastCameraPosition = position
    }

    private val repository = DescriptorRepository(this)

    val bitmapDescriptorsMarkers: Map<String, BitmapDescriptor> by lazy {
        repository.bitmapDescriptorsMarkers
    }

    fun setLastKnownLocation(location: Location) {
        this.lastKnownLocation = location
    }

    fun startForegroundService() {
        startService(Intent(this, LocationForegroundService::class.java))
    }

    fun stopForegroundService() {
        stopService(Intent(this, LocationForegroundService::class.java))
    }

    companion object {
        private lateinit var instance: ThisApplication

        fun getInstance(): ThisApplication {
            return instance
        }
    }
}