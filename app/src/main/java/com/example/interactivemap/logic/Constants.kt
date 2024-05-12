package com.example.interactivemap.logic

import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng

object Constants {
    const val DURATION_ANIM = 400               // Тривалість анімації
    const val DURATION_ANIM_ON_MOVEMENT = 50    // Тривалість анімації в русі

    // Мінімальне допустиме віддалення камери
    const val ZOOM_MIN = 15f

    // Параметри розміщення фону (розмір, поворот та координати, зум)
    const val ZOOM_BASE = 16f
    const val SIZE_BASE = 627f
    const val BEARING_BASE = 120.9f
    val baseLocation = LatLng(48.4350308753804, 35.048444673578764)
    val baseCameraPosition: CameraPosition by lazy {
        CameraPosition.Builder().target(baseLocation).zoom(ZOOM_BASE).build()
    }

    // Параметри розміщення плану спорткомплексу (розмір, поворот та координати)
    private const val ZOOM_SK = 19f
    const val SIZE_SK = 87f
    const val BEARING_SK = 120.9f
    val skLocation = LatLng(48.436372921825196, 35.04789602320485)
    val skCameraPosition: CameraPosition by lazy {
        CameraPosition.Builder().target(skLocation).zoom(ZOOM_SK).bearing(
            BEARING_SK - 40f).build()
    }

    // Параметри розміщення плану нового корпусу (розмір, поворот та координати)
    private const val ZOOM_NEW =  18f
    const val SIZE_NEW =  167f
    const val BEARING_NEW =  120.9f
    val newLocation =  LatLng(48.43518251500212, 35.04660168031577)
    val oldCameraPosition: CameraPosition by lazy {
        CameraPosition.Builder().target(oldLocation).zoom(ZOOM_OLD).bearing(
            BEARING_OLD - 40f).build()
    }

    // Параметри розміщення плану старого корпусу (розмір, поворот та координати)
    private const val ZOOM_OLD = 17f
    const val SIZE_OLD = 232f
    const val BEARING_OLD = 183.6f
    val oldLocation = LatLng(48.43403860865103, 35.04695180038605)
    val newCameraPosition: CameraPosition by lazy {
        CameraPosition.Builder().target(newLocation).zoom(ZOOM_NEW).bearing(
            BEARING_NEW - 40f).build()
    }

    val mapBorder: List<LatLng> by lazy {
        listOf( // Межі території покритої інтерактивною областю
            LatLng(48.43901403074399, 35.04821961767467),
            LatLng(48.436368328569834, 35.05320867686716),
            LatLng(48.43345936956986, 35.049879507977906),
            LatLng(48.433201994729714, 35.04940134628943),
            LatLng(48.43316609048691, 35.04895928600469),
            LatLng(48.43302838004438, 35.042824614860976),
        )
    }

    val mapRedZone: List<LatLng> by lazy {
        listOf( // Межі зони на мапі зафарбованої червоним
            LatLng(48.465895167426055, 35.03017954465445),
            LatLng(48.44624925436703, 35.08327968689006),
            LatLng(48.40263041232425, 35.04937285091565),
            LatLng(48.42488844541925, 34.94675821254385)
        )
    }
}