package com.example.interactivemap.logic.model.datamodel

import com.squareup.moshi.Json

data class LessonData(
    @field:Json(name = "name") var name: String,
    @field:Json(name = "tutor") var tutor: String,
    @field:Json(name = "locationIndex") val locationIndex: Int,
    @field:Json(name = "link") val link: String,
    @field:Json(name = "lidLink") val lidLink: String,
    var selected: Boolean = false
)