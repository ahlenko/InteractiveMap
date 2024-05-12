package com.example.interactivemap.logic.model.navigation.models

import com.google.android.gms.maps.model.LatLng

data class NavModel(
    val id:Int,                             // Унікальна мітка точки
    val number: Number,                     // Номер точки у масиві
    val name:String?,                       // Назва точки (для пошуку)
    val description:String?,                // Додатковий опис
    val location: LatLng,                   // Координати на мапі
    val locationIndex:Int,                  // Ідентифікатор спорідненої локації
    val floorIndex: Int,                     // Поверх
    val connexionWith: List<PointModel>,     // Зв'язки з точками
    val connexionFloor: List<FloorModel>?,   // Зв'язки з точками на іншому поверсі
    val connectedLocIndex: Int?,             // Зв'язки з точками інших локацій
    val locked: Boolean?                     // Точка відвідана (пройдена)
)
