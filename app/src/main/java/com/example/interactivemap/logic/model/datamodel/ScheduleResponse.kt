package com.example.interactivemap.logic.model.datamodel

import com.google.gson.annotations.SerializedName


data class ScheduleResponse(
    @SerializedName("end") val end: String,
    @SerializedName("strt") val start: String,
    @SerializedName("День") val day: String,
    @SerializedName("ПІБ") val pib: String,
    @SerializedName("Пара") val lesson: String,
    @SerializedName("Парн") val twin: String,
    @SerializedName("Предмет") val lessonName: String,
    @SerializedName("Тижд") val week: String
)