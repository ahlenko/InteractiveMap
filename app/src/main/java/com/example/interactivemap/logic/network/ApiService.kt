package com.example.interactivemap.logic.network

import com.example.interactivemap.logic.model.datamodel.ScheduleResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("stud/{route}")
    suspend fun getSchedule(@Path("route") route: String): List<ScheduleResponse>
}