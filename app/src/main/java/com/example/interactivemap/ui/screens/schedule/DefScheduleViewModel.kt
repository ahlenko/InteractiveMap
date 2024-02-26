package com.example.interactivemap.ui.screens.schedule

import androidx.compose.runtime.MutableState
import kotlinx.coroutines.flow.MutableStateFlow
import java.time.LocalDate

interface DefScheduleViewModel {
    val scheduleExist: MutableState<Boolean>
    var dayOfWeek: MutableState<String>
    val onlineEducation: MutableState<Boolean>
    fun onDateSelected(date: LocalDate) {}
    fun getDayNumberByIndex(index: Int):String {return ""}
    fun loadSelectedOptions()
    fun onClickNextDay(){}
    fun onClickPrevDay(){}
    fun openUrlInBrowser(url: String){}
    fun onItemClick(itemId: Int, type: Int){}
    fun onItemLongClick(itemId: Int, type: Int){}

}