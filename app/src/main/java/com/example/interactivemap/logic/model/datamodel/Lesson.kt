package com.example.interactivemap.logic.model.datamodel

import com.squareup.moshi.Json

data class Lesson (
    @field:Json(name = "index") val index: Int,
    @field:Json(name = "lessonData") var lessonData: ArrayList<LessonData>
)