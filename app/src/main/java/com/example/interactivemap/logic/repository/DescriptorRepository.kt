package com.example.interactivemap.logic.repository

import android.app.Application
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.example.interactivemap.R
import com.example.interactivemap.logic.Constants
import com.example.interactivemap.logic.util.GoogleMapUtil
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.CameraPosition
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DescriptorRepository (application: Application){
    private val _bitmapDescriptors = mutableStateOf<Map<String, BitmapDescriptor>>(emptyMap())
    val bitmapDescriptors: State<Map<String, BitmapDescriptor>> = _bitmapDescriptors

     suspend fun loadDescriptors(application: Application) {
         if (_bitmapDescriptors.value.isEmpty()) {
             withContext(Dispatchers.IO) {
                 val descriptors = mapOf(
                     LAYER_BACKGROUND to GoogleMapUtil.drawableToBitmapDescriptor(
                         application,
                         R.drawable.background
                     ),
                     LAYER_0_OLD to GoogleMapUtil.drawableToBitmapDescriptor(
                         application,
                         R.drawable.old0
                     ),
                     LAYER_1_OLD to GoogleMapUtil.drawableToBitmapDescriptor(
                         application,
                         R.drawable.old1
                     ),
                     LAYER_2_OLD to GoogleMapUtil.drawableToBitmapDescriptor(
                         application,
                         R.drawable.old2
                     ),
                     LAYER_3_OLD to GoogleMapUtil.drawableToBitmapDescriptor(
                         application,
                         R.drawable.old3
                     ),
                     LAYER_4_OLD to GoogleMapUtil.drawableToBitmapDescriptor(
                         application,
                         R.drawable.old4
                     ),
                     LAYER_5_OLD to GoogleMapUtil.drawableToBitmapDescriptor(
                         application,
                         R.drawable.old5
                     ),
                     LAYER_1_NEW to GoogleMapUtil.drawableToBitmapDescriptor(
                         application,
                         R.drawable.new1
                     ),
                     LAYER_2_NEW to GoogleMapUtil.drawableToBitmapDescriptor(
                         application,
                         R.drawable.new2
                     ),
                     LAYER_3_NEW to GoogleMapUtil.drawableToBitmapDescriptor(
                         application,
                         R.drawable.new3
                     ),
                     LAYER_4_NEW to GoogleMapUtil.drawableToBitmapDescriptor(
                         application,
                         R.drawable.new4
                     ),
                     LAYER_1_SK to GoogleMapUtil.drawableToBitmapDescriptor(
                         application,
                         R.drawable.sk1
                     ),
                     LAYER_2_SK to GoogleMapUtil.drawableToBitmapDescriptor(
                         application,
                         R.drawable.sk2
                     )
                 )
                 _bitmapDescriptors.value = descriptors
             }
         }
    }

    val bitmapDescriptorsMarkers: Map<String, BitmapDescriptor> by lazy {
        mapOf(
            USER_MARKER  to GoogleMapUtil.drawableToBitmapDescriptor(application, R.drawable.trip_pointer),
            LOCATION_MARKER  to GoogleMapUtil.drawableToBitmapDescriptor(application, R.drawable.map_pointer),
        )
    }

    companion object{
        const val LAYER_BACKGROUND = "background"
        const val LAYER_0_OLD = "drawFloor0Old"
        const val LAYER_1_OLD = "drawFloor1Old"
        const val LAYER_2_OLD = "drawFloor2Old"
        const val LAYER_3_OLD = "drawFloor3Old"
        const val LAYER_4_OLD = "drawFloor4Old"
        const val LAYER_5_OLD = "drawFloor5Old"
        const val LAYER_1_NEW = "drawFloor1New"
        const val LAYER_2_NEW = "drawFloor2New"
        const val LAYER_3_NEW = "drawFloor3New"
        const val LAYER_4_NEW = "drawFloor4New"
        const val LAYER_1_SK = "drawFloor1Sk"
        const val LAYER_2_SK = "drawFloor2Sk"

        const val USER_MARKER = "userMarker"
        const val LOCATION_MARKER = "locationMarker"
    }
}