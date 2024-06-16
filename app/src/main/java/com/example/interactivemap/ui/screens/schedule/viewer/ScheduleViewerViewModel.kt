package com.example.interactivemap.ui.screens.schedule.viewer

import android.annotation.SuppressLint
import android.app.Application
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.model.datamodel.Lesson
import com.example.interactivemap.logic.model.datamodel.LessonData
import com.example.interactivemap.logic.model.datamodel.ScheduleDay
import com.example.interactivemap.logic.util.DateUtil.getWeeksFromStartOfSchoolYear
import com.example.interactivemap.logic.util.JSONLoadSaveHelper
import com.example.interactivemap.logic.util.SharedPreferencesRepository
import com.example.interactivemap.ui.screens.schedule.DefScheduleViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.util.Calendar

@SuppressLint("MutableCollectionMutableState")
class ScheduleViewerViewModel(application: Application, override var dayOfWeek: MutableState<String>,
                              override val scheduleExist: MutableState<Boolean>,
                              override val onlineEducation: MutableState<Boolean>,
): AndroidViewModel(application), DefScheduleViewModel {
    private val _scheduleData = MutableStateFlow(arrayListOf<ScheduleDay>())
    val scheduleData = _scheduleData.asStateFlow()
    private val _toNextScreen = MutableStateFlow(false)
    val toNextScreen = _toNextScreen.asStateFlow()

    var showSheet by mutableStateOf(false)
    var areUpdate by mutableStateOf(false)

    private val _dayArray = getApplication<Application>()
        .resources.getStringArray(R.array.day_variant)
    private val _weekTypesArray = getApplication<Application>()
        .resources.getStringArray(R.array.week_types)
    private val _weekTypesArray2 = getApplication<Application>()
        .resources.getStringArray(R.array.week_types2)

    var currentDay by mutableIntStateOf(0)
    var selectedData by mutableStateOf(LessonData("", "", 0, "", ""))
    var dayDescription by mutableStateOf("")
    var lessonDescription by mutableStateOf("")

    private val _clearItem = LessonData("","",0,"","",false)

    init {
        loadScheduleData()
        loadSelectedOptions()
    }

    override fun loadSelectedOptions() {
        val calendar = Calendar.getInstance()
        val weeksFromStartOfSchoolYear = getWeeksFromStartOfSchoolYear()
        val delType = weeksFromStartOfSchoolYear % 2
        dayDescription = "$weeksFromStartOfSchoolYear" + getApplication<Application>().resources.getString(R.string.week) +
                if(delType.toInt() == 0) _weekTypesArray[0] else _weekTypesArray[1]
        currentDay = calendar.get(Calendar.DAY_OF_WEEK) - 1
        this.dayOfWeek.value = _dayArray[currentDay]
        onlineEducation.value = SharedPreferencesRepository.onlineEducationSelected
    }

    private fun loadScheduleData() {
        _scheduleData.value = SharedPreferencesRepository.mainSchedule!!
        scheduleExist.value = checkScheduleExist()
        clearSelection()
    }

    private fun checkScheduleExist():Boolean {
        scheduleData.value.forEach{
            day -> day.lessons.forEach {
                elem -> elem.lessonData.forEach {
                    if (it != _clearItem) return true
                }
            }
        }
        return false
    }

    fun onJSONObjectLoaded(schedule: ArrayList<ScheduleDay>){
        if (schedule.isNotEmpty()){
            SharedPreferencesRepository.reserveSchedule = schedule
            goToEditScreen(false)
        } else Toast.makeText(getApplication(), getApplication<Application>()
            .resources.getText(R.string.translation_error), Toast.LENGTH_LONG).show()
    }

    fun onSaveJsonClick(){
        viewModelScope.launch {
            if (SharedPreferencesRepository.mainScheduleSTR != null){
                JSONLoadSaveHelper.writeJsonToFileInDocumentsDirectory(getApplication(), SharedPreferencesRepository.mainScheduleSTR!!)
                Toast.makeText(getApplication(), getApplication<Application>()
                    .resources.getText(R.string.save_success), Toast.LENGTH_LONG).show()
            } else Toast.makeText(getApplication(), getApplication<Application>()
                .resources.getText(R.string.save_file_error), Toast.LENGTH_LONG).show()
        }
    }

    fun goToEditScreen(fromBigButton: Boolean){
        if (fromBigButton){
            if(scheduleExist.value)
                SharedPreferencesRepository.scheduleType = 0
            else SharedPreferencesRepository.scheduleType = 1
        } else SharedPreferencesRepository.scheduleType = 2
        _toNextScreen.value = true
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onDateSelected(date: LocalDate) {
        currentDay = date.dayOfWeek.value
        this.dayOfWeek.value = _dayArray[if (currentDay == 7) 0 else currentDay]
    }

    override fun getDayNumberByIndex(index: Int): String {
        return when (index){0 -> "I" 1 -> "II" 2 -> "III" 3 -> "IV" 4 -> "V" else -> "VI" }
    }

    override fun onClickNextDay(){
        if (currentDay == 6) currentDay = 0 else currentDay++
        this.dayOfWeek.value = _dayArray[currentDay]
    }

    override fun onClickPrevDay(){
        if (currentDay == 0) currentDay = 6 else currentDay--
        this.dayOfWeek.value = _dayArray[currentDay]
    }
    override fun onItemClick(itemId: Int, type: Int){
        if (_scheduleData.value[currentDay].lessons[itemId].lessonData[type] != _clearItem){ clearSelection()
            _scheduleData.value[currentDay].lessons[itemId].lessonData[type].selected = true
            openUrlInBrowser(_scheduleData.value[currentDay].lessons[itemId].lessonData[type].link)
            areUpdate = !areUpdate
        }
    }
    override fun onItemLongClick(itemId: Int, type: Int){
        if (_scheduleData.value[currentDay].lessons[itemId].lessonData[type] != _clearItem) { clearSelection()
            _scheduleData.value[currentDay].lessons[itemId].lessonData[type].selected = true
            lessonDescription = _dayArray[currentDay] + ", " + getDayNumberByIndex(itemId) + " пара, " + _weekTypesArray2[type]
            selectedData = _scheduleData.value[currentDay].lessons[itemId].lessonData[type]
            showSheet = true
        }
    }

    private fun clearSelection(){
        _scheduleData.value.forEach{day -> day.lessons.forEach { elem -> elem.lessonData.forEach{it.selected = false} }}
    }

    override fun openUrlInBrowser(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        getApplication<Application>().startActivity(intent)
    }

    companion object{
        val factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory{
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
                val application = (checkNotNull(extras[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]) as ThisApplication)
                val scheduleExist = mutableStateOf(false)
                val onlineEducation = mutableStateOf(false)
                val dayOfWeek = mutableStateOf("")
                return ScheduleViewerViewModel(application, dayOfWeek, scheduleExist, onlineEducation) as T
            }
        }
    }
}