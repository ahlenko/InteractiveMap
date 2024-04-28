package com.example.interactivemap.logic.model

import com.google.android.gms.maps.model.LatLng

data class NavModel(
    val id:Int,                             // Унікальна мітка точки
    val name:String,                        // Назва точки (для пошуку)
    val location: LatLng,                   // Координати на мапі
    val locationIndex:Int,                  // Ідентифікатор спорідненої локації
    val floorIndex:Int,                     // Поверх
    val connexionWith:List<Int>,            // Зв'язки з точками
    val connexionFloor:List<FloorModel>,    // Зв'язки з точками на іншому поверсі
    val connectedLocIndex:Int               // Зв'язки з точками інших локацій
)
