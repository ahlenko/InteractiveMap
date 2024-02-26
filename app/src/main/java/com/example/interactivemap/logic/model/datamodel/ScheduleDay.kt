package com.example.interactivemap.logic.model.datamodel

import com.squareup.moshi.Json
import kotlinx.coroutines.flow.MutableStateFlow

data class ScheduleDay(
    @field:Json(name = "index") var index: Int,
    @field:Json(name = "lessons") var lessons: ArrayList<Lesson>
)
