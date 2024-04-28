package com.example.interactivemap.logic

import com.google.android.gms.maps.model.LatLng

object Constants {
    const val DURATION_ANIM = 400 // Тривалість анімації

    // Параметри розміщення фону (розмір, поворот та координати)
    const val SIZE_BASE = 627f
    const val BEARING_BASE = 120.9f
    val baseLocation = LatLng(48.4350308753804, 35.048444673578764)

    // Параметри розміщення плану спорткомплексу (розмір, поворот та координати)
    const val SIZE_SK = 87f
    const val BEARING_SK = 120.9f
    val skLocation = LatLng(48.436372921825196, 35.04789602320485)

    // Параметри розміщення плану нового корпусу (розмір, поворот та координати)
    const val SIZE_NEW = 232f
    const val BEARING_NEW = 183.6f
    val newLocation = LatLng(48.43403860865103, 35.04695180038605)

    // Параметри розміщення плану старого корпусу (розмір, поворот та координати)
    const val SIZE_OLD = 167f
    const val BEARING_OLD = 120.9f
    val oldLocation = LatLng(48.43518251500212, 35.04660168031577)
}