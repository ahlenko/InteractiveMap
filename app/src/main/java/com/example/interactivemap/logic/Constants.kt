package com.example.interactivemap.logic

import com.google.android.gms.maps.model.LatLng

object Constants {
    const val BEARING_BASE = 120.9f
    const val BEARING_SK = 120.9f
    const val BEARING_NEW = 183.6f
    const val BEARING_OLD = 120.9f

    const val SIZE_BASE = 627f
    const val SIZE_SK = 87f
    const val SIZE_NEW = 232f
    const val SIZE_OLD = 167f

    val baseLocation = LatLng(48.4350308753804, 35.048444673578764)
    val skLocation = LatLng(48.436372921825196, 35.04789602320485)
    val newLocation = LatLng(48.43403860865103, 35.04695180038605)
    val oldLocation = LatLng(48.43519666161228, 35.04660184309876)

    const val DURATION_ANIM = 400
}