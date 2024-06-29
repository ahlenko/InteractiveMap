package com.example.interactivemap.logic.model.navigation.models

import com.google.android.gms.maps.model.LatLng

data class RoadElementModel(
    val id: Int,
    val location: LatLng,
    val floor: Int,
    val locationIndex: Int,
    var locked: Boolean
)
