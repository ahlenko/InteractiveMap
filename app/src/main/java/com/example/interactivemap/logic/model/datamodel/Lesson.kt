package com.example.interactivemap.logic.model.datamodel

import androidx.compose.runtime.MutableState
import com.squareup.moshi.Json
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class Lesson (
    @field:Json(name = "index") val index: Int,
    @field:Json(name = "lessonData") val lessonData: ArrayList<LessonData>
)