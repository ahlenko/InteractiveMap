package com.example.interactivemap.logic.service

import android.Manifest
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import android.os.Build
import android.os.IBinder
import android.os.Parcelable
import android.provider.Settings
import android.text.TextUtils
import androidx.core.app.ActivityCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.example.interactivemap.MainActivity
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.service.LocationBroadcastData.BROADCAST_LOCATION_DATA
import com.example.interactivemap.logic.service.LocationBroadcastData.BROADCAST_LOCATION_PROVIDERS_STATE
import com.example.interactivemap.logic.service.LocationBroadcastData.BROADCAST_LOCATION_PROVIDERS_STATE_GPS_OFF
import com.example.interactivemap.logic.service.LocationBroadcastData.BROADCAST_LOCATION_PROVIDERS_STATE_GPS_ON
import com.example.interactivemap.logic.service.LocationBroadcastData.BROADCAST_LOCATION_PROVIDERS_STATE_NET_OFF
import com.example.interactivemap.logic.service.LocationBroadcastData.BROADCAST_LOCATION_PROVIDERS_STATE_NET_ON
import com.example.interactivemap.logic.service.LocationServiceConstants.ACTION

class LocationForegroundService : Service() {
    private lateinit var resultPendingIntent: PendingIntent
    private var locationFromGps: Location? = null
    private var locationFromNetwork: Location? = null
    private var gpsCurrentStateOn = true


    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        val openActivityIntent = Intent(this, MainActivity::class.java)

        resultPendingIntent = PendingIntent.getActivity(
            this,
            0, openActivityIntent, PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )

        checkIsLocationProviderAvailable()
        startLocationUpdates()
        startCheckStatus()

        return START_NOT_STICKY
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onDestroy() {
        stopForeground(true)
        super.onDestroy()
    }

    private fun checkIsLocationProviderAvailable() {
        if (!isLocationProviderAvailable()) {
            // TODO send message
        }
    }

    private fun startLocationUpdates() {
        if (ActivityCompat.checkSelfPermission(
                baseContext,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
            && ActivityCompat.checkSelfPermission(
                baseContext,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            setLocationGpsListener()
            //setLocationNetworkListener()
        }
    }

    private fun setLocationGpsListener() {
        LocationHelperGps().startListeningUserLocation(
            this, object : MyLocationGpsListener {
                override fun onLocationChanged(location: Location?) {
                    location?.let {
                        locationFromGps = location
                        sendLocationToBroadcast()
                    }
                }

                override fun onProviderEnabled() {
                }

                override fun onProviderDisabled() {}
            })
    }

//    private fun setLocationNetworkListener() {
//        LocationHelperNetwork().startListeningUserLocation(
//            this, object : MyLocationNetworkListener {
//                override fun onLocationChanged(location: Location?) {
//                    location?.let {
//                        locationFromNetwork = location
//                        sendLocationToBroadcast()
//                    }
//                }
//
//                override fun onProviderEnabled() {
//                    sendBroadcastLocationStatus(
//                        BROADCAST_LOCATION_PROVIDERS_STATE,
//                        BROADCAST_LOCATION_PROVIDERS_STATE_NET_ON
//                    )
//                }
//
//                override fun onProviderDisabled() {
//                    sendBroadcastLocationStatus(
//                        BROADCAST_LOCATION_PROVIDERS_STATE,
//                        BROADCAST_LOCATION_PROVIDERS_STATE_NET_OFF
//                    )
//                }
//            })
//    }

    @Synchronized
    private fun sendLocationToBroadcast() {
        val currentLocation: Location = if (locationFromGps != null) {
            locationFromGps!!
        } else {
            locationFromNetwork!!
        }
        ThisApplication.getInstance().setLastKnownLocation(currentLocation)
        sendBroadcastLocationData(currentLocation)
    }

    private fun startCheckStatus() {
        Thread {
            while (true) {
                checkGps()
                Thread.sleep(1000)
            }
        }.start()
    }

    private fun isLocationEnabled(context: Context): Boolean {
        var locationMode = 0
        val locationProviders: String
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            locationMode = try {
                Settings.Secure.getInt(context.contentResolver, Settings.Secure.LOCATION_MODE)
            } catch (e: Settings.SettingNotFoundException) {
                e.printStackTrace()
                return false
            }
            locationMode != Settings.Secure.LOCATION_MODE_OFF
        } else {
            locationProviders = Settings.Secure.getString(
                context.contentResolver,
                Settings.Secure.LOCATION_PROVIDERS_ALLOWED
            )
            !TextUtils.isEmpty(locationProviders)
        }
    }


    private fun checkGps() {

        ThisApplication.getInstance().isGpsOn = isLocationEnabled(this)

        if (ThisApplication.getInstance().isGpsOn) {
            if (!gpsCurrentStateOn) {
                sendBroadcastLocationStatus(
                    BROADCAST_LOCATION_PROVIDERS_STATE,
                    BROADCAST_LOCATION_PROVIDERS_STATE_GPS_ON
                )
                gpsCurrentStateOn = true
            }
        } else {
            sendBroadcastLocationStatus(
                BROADCAST_LOCATION_PROVIDERS_STATE,
                BROADCAST_LOCATION_PROVIDERS_STATE_GPS_OFF
            )
            gpsCurrentStateOn = false
        }
    }

    private fun isLocationProviderAvailable(): Boolean {
        val locationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager?
        return locationManager != null && (locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER) ||
                locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER))
    }

    private fun sendBroadcastLocationStatus(key: Int, value: Int) {
        val broadcastIntent = Intent(ACTION)
        broadcastIntent.putExtra("key", key)
        broadcastIntent.putExtra("value", value)
        broadcastIntent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
        LocalBroadcastManager.getInstance(ThisApplication.getInstance().applicationContext)
            .sendBroadcast(broadcastIntent)
    }

    private fun sendBroadcastLocationData(data: Location) {
        val broadcastIntent = Intent(ACTION)
        broadcastIntent.putExtra("key", BROADCAST_LOCATION_DATA)
        broadcastIntent.putExtra("location", data as Parcelable)
        broadcastIntent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
        LocalBroadcastManager.getInstance(ThisApplication.getInstance().applicationContext)
            .sendBroadcast(broadcastIntent)
    }
}