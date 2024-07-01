package com.example.interactivemap

import android.app.Application
import android.content.Intent
import android.location.Location
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.interactivemap.logic.Constants
import com.example.interactivemap.logic.repository.DescriptorRepository
import com.example.interactivemap.logic.service.LocationForegroundService
import com.example.interactivemap.logic.util.SharedPreferencesHelper.loadSettingsHelper
import com.example.interactivemap.logic.util.SharedPreferencesRepository
import com.google.android.gms.maps.MapsInitializer
import com.google.android.gms.maps.OnMapsSdkInitializedCallback
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.CameraPosition
import com.google.firebase.FirebaseApp
import com.jakewharton.threetenabp.AndroidThreeTen

class ThisApplication: Application(), OnMapsSdkInitializedCallback{

    private var fromMassage: Boolean = false
    private var lastKnownLocation: Location? = null
    lateinit var lastCameraPosition: CameraPosition
    private var needNavigateAfterClickSchedule = false
    private var navigationEndPointIndex = 0

    val descriptorRepository: DescriptorRepository by lazy {
        DescriptorRepository(this) }
    var isGpsOn = true

    var darkThemeSelected by mutableStateOf(false)

    override fun onCreate() { super.onCreate()
        MapsInitializer.initialize(applicationContext, MapsInitializer.Renderer.LATEST, this)
        AndroidThreeTen.init(this)
        FirebaseApp.initializeApp(this)
        loadSettingsHelper(this, this.packageName)
        darkThemeSelected = SharedPreferencesRepository.darkThemeSelected
        lastCameraPosition = CameraPosition.Builder().target(
            Constants.baseLocation).zoom(Constants.ZOOM_BASE).build()
        instance = this
    }

    fun setNavigationEndPointIndex(param: Int){
        this.navigationEndPointIndex = param
    }

    fun getNavigationEndPointIndex(): Int {
        return navigationEndPointIndex
    }

    fun setNeedNavigateAfterClickSchedule(param: Boolean){
        this.needNavigateAfterClickSchedule = param
    }

    fun isNeedNavigateAfterClickSchedule(): Boolean {
        return needNavigateAfterClickSchedule
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

    override fun onMapsSdkInitialized(renderer: MapsInitializer.Renderer) {
        when (renderer) {
            MapsInitializer.Renderer.LATEST -> Log.d(
                "MapsDemo",
                "The latest version of the renderer is used."
            )

            MapsInitializer.Renderer.LEGACY -> Log.d(
                "MapsDemo",
                "The legacy version of the renderer is used."
            )
        }
    }

    companion object {
        private lateinit var instance: ThisApplication

        fun getInstance(): ThisApplication {
            return instance
        }
    }
}