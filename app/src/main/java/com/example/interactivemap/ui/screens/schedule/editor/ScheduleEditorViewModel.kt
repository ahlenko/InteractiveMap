package com.example.interactivemap.ui.screens.schedule.editor

import android.app.Application
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
import com.example.interactivemap.logic.Constants
import com.example.interactivemap.logic.model.datamodel.Lesson
import com.example.interactivemap.logic.model.datamodel.LessonData
import com.example.interactivemap.logic.model.datamodel.ScheduleDay
import com.example.interactivemap.logic.model.datamodel.ScheduleResponse
import com.example.interactivemap.logic.model.navigation.graph.NavGraphList
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.logic.network.ApiFactory
import com.example.interactivemap.logic.network.ApiService
import com.example.interactivemap.logic.util.SharedPreferencesRepository
import com.example.interactivemap.ui.screens.schedule.DefScheduleViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
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

    private var apiService: ApiService? = null

    var showSheet by mutableStateOf(false)
    var showReserveInfo by mutableStateOf(false)
    var showReserveCopy by mutableStateOf(false)
    var showDeleteAgree by mutableStateOf(false)
    var areUpdate by mutableStateOf(false)

    var addDoubleEnable by mutableStateOf(false)
    var deleteEnable by mutableStateOf(false)
    var editEnable by mutableStateOf(false)

    var isTextFieldActive by mutableStateOf(false)

    private val _dayArray = getApplication<Application>()
        .resources.getStringArray(R.array.day_variant)
    private val _weekTypesArray2 = getApplication<Application>()
        .resources.getStringArray(R.array.week_types2)

    private val _searchResults = MutableStateFlow(arrayListOf<NavModel>())
    val searchResults = _searchResults.asStateFlow()

    private val _foundNearestPoint = MutableStateFlow(Constants.defaultNavModel)
    val foundNearestPoint = _foundNearestPoint.asStateFlow()

    var currentDay by mutableIntStateOf(0)
    var scheduleType by mutableIntStateOf(0)
    var selectedData by mutableStateOf(LessonData("", "", 0, "", ""))
    var lessonDescription by mutableStateOf("")

    private val _clearItem = LessonData("","",0,"","",false)

    private var _selectedId = 0
    private var _selectedType = 0

    private lateinit var _link: String
    private lateinit var _route: String

    private val locationIndex = 0

    init {
        fetchScheduleApiBaseUrl()
        loadSelectedOptions()
    }

    fun onSearchEnter(searchRequest: String) {
        _searchResults.value.clear()
        val searchRes = NavGraphList.findFirstFourMatchesByName(searchRequest)
        _searchResults.value.addAll(searchRes)
    }

    fun onSearchSelect(selectedElement: NavModel) {
        _searchResults.value.clear()
        _foundNearestPoint.value = selectedElement
    }

    private fun fetchScheduleApiBaseUrl(){
        if (ThisApplication.getInstance().isFromMassage() && SharedPreferencesRepository.linkList?.isNotEmpty() == true){
            if (SharedPreferencesRepository.linkList != null){
                _link = SharedPreferencesRepository.linkList!![0]
                val startIndex = _link.indexOf("://") + "://".length
                val endIndex = _link.indexOf("/", startIndex)
                _link = _link.substring(0, endIndex)
                SharedPreferencesRepository.baseUrl = _link
                _route = SharedPreferencesRepository.linkList!![0].replace("$_link/stud/", "")
                fetchScheduleApiData()
            }
        } else  loadScheduleData()
    }

    private fun fillEmptyItems() {
        _scheduleData.value = arrayListOf()
        for (dayIndex in 0 until 7) {
            val lessons = ArrayList<Lesson>()
            for (lessonIndex in 0 until 6) {
                val emptyLessonData = LessonData("", "", 0, "", "", false)
                val lesson = Lesson(lessonIndex, arrayListOf(emptyLessonData))
                lessons.add(lesson)
            }
            _scheduleData.value.add(ScheduleDay(dayIndex, lessons))
        }
    }

    private fun fetchScheduleApiData(){ fillEmptyItems()
        apiService = ApiFactory.getApiService(_link)
        viewModelScope.launch {
            var remoteSchedule: List<ScheduleResponse>
            withContext(Dispatchers.IO) {
                remoteSchedule = apiService?.getSchedule("$_route/23/1")!!
            }
            withContext(Dispatchers.Main) {
                var prevData: ScheduleResponse? = null
                remoteSchedule.forEach {
                    val tempLesson = _scheduleData.value[it.day].lessons[it.lesson-1].lessonData.toMutableList()
                    if (it.week == "чис") {
                        tempLesson[0].tutor = it.pib
                        tempLesson[0].name = it.lessonName
                    } else {
                        if (prevData != null) {
                            if (!(prevData!!.day == it.day && prevData!!.lesson == it.lesson)){
                                val emptyLessonData = LessonData("", "", 0, "", "", false)
                                tempLesson.add(emptyLessonData)
                                tempLesson[1].tutor = it.pib
                                tempLesson[1].name = it.lessonName
                            }
                        } else {
                            val emptyLessonData = LessonData("", "", 0, "", "", false)
                            tempLesson.add(emptyLessonData)
                            tempLesson[1].tutor = it.pib
                            tempLesson[1].name = it.lessonName
                        }
                    }
                    _scheduleData.value[it.day].lessons[it.lesson-1].lessonData = tempLesson as ArrayList<LessonData>
                    prevData = it
                }
            }
        }
    }

    fun onDeleteButtonClick(){
       showDeleteAgree = true
    }

    fun onDoubleButtonClick(){ clearSelection()
        addDoubleEnable = false
        _selectedType = 1
        val emptyLessonData = LessonData("", "", 0, "", "", false)
        _scheduleData.value[currentDay].lessons[_selectedId].lessonData.add(emptyLessonData)
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

    fun onDataChanged(link: String, lidLink: String, tutor: String, name: String) { clearSelection()
        _scheduleData.value[currentDay].lessons[_selectedId].lessonData[_selectedType] = LessonData(name, tutor, locationIndex, link, lidLink, selected = true)
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
        if (!ThisApplication.getInstance().isFromMassage()){
            if (SharedPreferencesRepository.scheduleType == 2)
                _scheduleData.value = SharedPreferencesRepository.reserveSchedule!!
            else { _scheduleData.value = SharedPreferencesRepository.mainSchedule!!
                if (SharedPreferencesRepository.reserveSchedule != null) showReserveCopy = true
            }
        } else ThisApplication.getInstance().setFromMassage(false)
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

    fun onSaveClick() {
        clearSelection()
        SharedPreferencesRepository.reserveSchedule = null
        SharedPreferencesRepository.mainSchedule = _scheduleData.value
        _toBackScreen.value = true
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onDateSelected(date: LocalDate) {
        currentDay = if (date.dayOfWeek.value == 7) 0 else date.dayOfWeek.value
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

    fun checkFields(tutor: String, name: String): Boolean {
        return tutor.isNotEmpty() && name.isNotEmpty();
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