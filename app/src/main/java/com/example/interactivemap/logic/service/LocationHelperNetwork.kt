package com.example.interactivemap.logic.service

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import com.example.interactivemap.logic.service.LocationServiceConstants.LOCATION_REFRESH_DISTANCE
import com.example.interactivemap.logic.service.LocationServiceConstants.LOCATION_REFRESH_TIME

class LocationHelperNetwork {

    @SuppressLint("MissingPermission")
    fun startListeningUserLocation(context: Context, myListener: MyLocationNetworkListener) {
        val mLocationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        val locationListener: LocationListener = object : LocationListener {
            override fun onLocationChanged(location: Location) {
                myListener.onLocationChanged(location)
            }

            override fun onProviderEnabled(provider: String) {
                myListener.onProviderEnabled()
                startLocationUpdate(mLocationManager, this)
            }

            override fun onProviderDisabled(provider: String) {
                myListener.onProviderDisabled()
            }

            override fun onStatusChanged(provider: String, status: Int, extras: Bundle) {}
        }
        startLocationUpdate(mLocationManager, locationListener)
    }

    @SuppressLint("MissingPermission")
    private fun startLocationUpdate(
        mLocationManager: LocationManager,
        locationListener: LocationListener
    ) {
        mLocationManager.requestLocationUpdates(
            LocationManager.NETWORK_PROVIDER,
            LOCATION_REFRESH_TIME.toLong(),
            LOCATION_REFRESH_DISTANCE.toFloat(),
            locationListener
        )
    }
}

interface MyLocationNetworkListener {
    fun onLocationChanged(location: Location?)
    fun onProviderEnabled()
    fun onProviderDisabled()
}