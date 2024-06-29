package com.example.interactivemap.logic.model.datamodel

import com.google.gson.annotations.SerializedName


data class ScheduleResponse(
    @SerializedName("end") val end: String,
    @SerializedName("strt") val start: String,
    @SerializedName("День") val day: Int,
    @SerializedName("ПІБ") val pib: String,
    @SerializedName("Пара") val lesson: Int,
    @SerializedName("Парн") val twin: Int,
    @SerializedName("Предмет") val lessonName: String,
    @SerializedName("Тижд") val week: String
)