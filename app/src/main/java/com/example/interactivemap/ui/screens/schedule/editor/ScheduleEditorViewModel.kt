package com.example.interactivemap.ui.screens.schedule.editor

import android.app.Application
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.model.datamodel.LessonData
import com.example.interactivemap.logic.model.datamodel.ScheduleDay
import com.example.interactivemap.logic.util.SharedPreferencesRepository
import com.example.interactivemap.ui.screens.schedule.DefScheduleViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.time.LocalDate
import java.util.Calendar

class ScheduleEditorViewModel(application: Application, override var dayOfWeek: MutableState<String>,
                              override val scheduleExist: MutableState<Boolean>,
                              override val onlineEducation: MutableState<Boolean>
): AndroidViewModel(application), DefScheduleViewModel {
    private val _scheduleData = MutableStateFlow(arrayListOf<ScheduleDay>())
    val scheduleData = _scheduleData.asStateFlow()

    private val _toBackScreen = MutableStateFlow(false)
    val toBackScreen = _toBackScreen.asStateFlow()

    var showSheet by mutableStateOf(false)
    var showReserveInfo by mutableStateOf(false)
    var showReserveCopy by mutableStateOf(false)
    var showDeleteAgree by mutableStateOf(false)
    var areUpdate by mutableStateOf(false)

    var addDoubleEnable by mutableStateOf(false)
    var deleteEnable by mutableStateOf(false)
    var editEnable by mutableStateOf(false)

    private val _dayArray = getApplication<Application>()
        .resources.getStringArray(R.array.day_variant)
    private val _weekTypesArray2 = getApplication<Application>()
        .resources.getStringArray(R.array.week_types2)

    var currentDay by mutableIntStateOf(0)
    var scheduleType by mutableIntStateOf(0)
    var selectedData by mutableStateOf(LessonData("", "", 0, "", ""))
    var lessonDescription by mutableStateOf("")

    private val _clearItem = LessonData("","",0,"","",false)

    private var _selectedId = 0
    private var _selectedType = 0

    init {
        loadScheduleData()
        loadSelectedOptions()
    }

    fun onDeleteButtonClick(){
        showDeleteAgree = true
    }

    fun onDoubleButtonClick(){ clearSelection()
        addDoubleEnable = false
        _selectedType = 1
        _scheduleData.value[currentDay].lessons[_selectedId].lessonData.add(_clearItem)
        _scheduleData.value[currentDay].lessons[_selectedId].lessonData[_selectedType].selected = true
        lessonDescription = _dayArray[currentDay] + ", " +  getDayNumberByIndex(_selectedId) + " пара, " + _weekTypesArray2[_selectedType]
        selectedData = _scheduleData.value[currentDay].lessons[_selectedId].lessonData[_selectedType]
        SharedPreferencesRepository.reserveSchedule = _scheduleData.value
        areUpdate = !areUpdate
        showSheet = true
    }

    fun onChangeClick(){ clearSelection()
        lessonDescription = _dayArray[currentDay] + ", " +  getDayNumberByIndex(_selectedId) + " пара, " + _weekTypesArray2[_selectedType]
        selectedData = _scheduleData.value[currentDay].lessons[_selectedId].lessonData[_selectedType]
        showSheet = true
    }

    fun onDataChanged(locationIndex: String, link: String, lidLink: String, tutor: String, name: String) { clearSelection()
        _scheduleData.value[currentDay].lessons[_selectedId].lessonData[_selectedType] = LessonData(name, tutor, locationIndex.toInt(), link, lidLink, selected = true)
        SharedPreferencesRepository.reserveSchedule = _scheduleData.value
        if (_scheduleData.value[currentDay].lessons[_selectedId].lessonData.size < 2){ addDoubleEnable = true }
        areUpdate = !areUpdate
        deleteEnable = true
        editEnable = true
    }

    fun onDeleteElement(){ clearSelection()
        _scheduleData.value[currentDay].lessons[_selectedId].lessonData[_selectedType] = _clearItem
        if (_selectedType == 1) _scheduleData.value[currentDay].lessons[_selectedId].lessonData.removeAt(1)
        SharedPreferencesRepository.reserveSchedule = _scheduleData.value
        areUpdate = !areUpdate
    }

    override fun loadSelectedOptions() {
        val calendar = Calendar.getInstance()
        currentDay = calendar.get(Calendar.DAY_OF_WEEK) - 1
        this.dayOfWeek.value = _dayArray[currentDay]
        onlineEducation.value = SharedPreferencesRepository.onlineEducationSelected
    }

    private fun loadScheduleData() {
        if (SharedPreferencesRepository.scheduleType == 2)
            _scheduleData.value = SharedPreferencesRepository.reserveSchedule!!
        else { _scheduleData.value = SharedPreferencesRepository.mainSchedule!!
            if (SharedPreferencesRepository.reserveSchedule != null) showReserveCopy = true
        }
    }

    fun onRecoverDismiss(){
        SharedPreferencesRepository.reserveSchedule = null
    }
    fun onRecoverAgree(){
        _scheduleData.value = SharedPreferencesRepository.reserveSchedule!!
        clearSelection()
    }
    fun onMoveOut(){ clearSelection()
        SharedPreferencesRepository.reserveSchedule = _scheduleData.value
        _toBackScreen.value = true
    }

    fun onSaveClick() { clearSelection()
        SharedPreferencesRepository.reserveSchedule = null
        SharedPreferencesRepository.mainSchedule = _scheduleData.value
        _toBackScreen.value = true
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onDateSelected(date: LocalDate) {
        currentDay = date.dayOfWeek.value
        this.dayOfWeek.value = _dayArray[currentDay]
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

    override fun onItemClick(itemId: Int, type: Int){ clearSelection()
        _selectedId = itemId
        _selectedType = type

        if (_scheduleData.value[currentDay].lessons[itemId].lessonData[type] != _clearItem || type == 1){ deleteEnable = true }
        if (_scheduleData.value[currentDay].lessons[itemId].lessonData.size != 2){ addDoubleEnable = true }
        editEnable = true

        _scheduleData.value[currentDay].lessons[itemId].lessonData[type].selected = true
        areUpdate = !areUpdate
    }

    override fun onItemLongClick(itemId: Int, type: Int){ clearSelection()
        _selectedId = itemId
        _selectedType = type

        if (_scheduleData.value[currentDay].lessons[itemId].lessonData[type] != _clearItem || type == 1){ deleteEnable = true }
        if (_scheduleData.value[currentDay].lessons[itemId].lessonData.size != 2){ addDoubleEnable = true }
        _scheduleData.value[currentDay].lessons[itemId].lessonData[type].selected = true
        editEnable = true

        lessonDescription = _dayArray[currentDay] + ", " +  getDayNumberByIndex(itemId) + " пара, " + _weekTypesArray2[type]
        selectedData = _scheduleData.value[currentDay].lessons[itemId].lessonData[type]
        showSheet = true
    }

    private fun clearSelection(){
        _scheduleData.value.forEach{day -> day.lessons.forEach { elem -> elem.lessonData.forEach{it.selected = false} }}

        deleteEnable = false
        editEnable = false
        addDoubleEnable = false
    }

    fun checkFields(locationIndex: String, link: String, lidLink: String, tutor: String, name: String): Boolean {
        return locationIndex.isNotEmpty() && link.isNotEmpty() && lidLink.isNotEmpty() && tutor.isNotEmpty() && name.isNotEmpty();
    }

    companion object{
        val factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory{
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
                val application = (checkNotNull(extras[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]) as ThisApplication)
                val onlineEducation = mutableStateOf(false)
                val scheduleExist = mutableStateOf(true)
                val dayOfWeek = mutableStateOf("")
                return ScheduleEditorViewModel(application, dayOfWeek, scheduleExist, onlineEducation) as T
            }
        }
    }
}