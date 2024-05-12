package com.example.interactivemap

import android.Manifest
import android.app.ActivityManager
import android.app.Application
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import com.example.interactivemap.logic.Constants
import com.example.interactivemap.logic.repository.DescriptorRepository
import com.example.interactivemap.logic.service.LocationForegroundService
import com.example.interactivemap.logic.util.SharedPreferencesHelper.loadSettingsHelper
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.jakewharton.threetenabp.AndroidThreeTen

class ThisApplication: Application(){

    private var fromMassage: Boolean = false
    private var lastKnownLocation: Location? = null
    lateinit var lastCameraPosition: CameraPosition
    var isGpsOn = true

    override fun onCreate() { super.onCreate()
        loadSettingsHelper(this, this.packageName)
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

    val bitmapDescriptors: Map<String, BitmapDescriptor> by lazy {
        repository.bitmapDescriptors
    }

    fun setLastKnownLocation(location: Location) {
        this.lastKnownLocation = location
    }

    fun getLastKnownLocation(fragment: Fragment): Location? {
        return if (lastKnownLocation != null) lastKnownLocation else {
            if (ActivityCompat.checkSelfPermission(
                    fragment.requireContext(),
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(
                    fragment.requireContext(),
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                null
            } else lastKnownLocation
        }
    }

    fun startForegroundService() {
        startService(Intent(this, LocationForegroundService::class.java))
    }

    fun stopForegroundService() {
        stopService(Intent(this, LocationForegroundService::class.java))
    }

    fun isForegroundServiceRunning(): Boolean {
        val manager = getSystemService(ACTIVITY_SERVICE) as ActivityManager
        for (service in manager.getRunningServices(Int.MAX_VALUE)) {
            if ("sn.kai.driver.locationservice.DriverForegroundService" == service.service.className) {
                return true
            }
        }
        return false
    }



    companion object {
        private lateinit var instance: ThisApplication

        fun getInstance(): ThisApplication {
            return instance
        }
    }
}