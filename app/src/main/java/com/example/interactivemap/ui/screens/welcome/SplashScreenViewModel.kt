package com.example.interactivemap.ui.screens.welcome

import android.app.Application
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.model.datamodel.Lesson
import com.example.interactivemap.logic.model.datamodel.LessonData
import com.example.interactivemap.logic.model.datamodel.ScheduleDay
import com.example.interactivemap.logic.util.SharedPreferencesRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SplashScreenViewModel (application: Application) : AndroidViewModel(application) {
    private val _scheduleData = arrayListOf<ScheduleDay>()
    private var isLinkExist by mutableStateOf(false)
    private val _loading = MutableStateFlow(true)
    var onlineEducation by mutableStateOf(false)
    var isSecondEnter by mutableStateOf(false)
    var isFromMassage by mutableStateOf(false)
    var permissionGrantedDialogShown by mutableStateOf(false)

    val loading = _loading.asStateFlow()

    private fun navigateToNextScreen(afterRequestPermission: Boolean){
        checkStartLink()
        if (SharedPreferencesRepository.mainSchedule == null ||
            SharedPreferencesRepository.mainSchedule?.isEmpty() == true){
            fillEmptyItems()
            initScreen(afterRequestPermission)
        } else initScreen(afterRequestPermission)
    }

    private fun initScreen(afterRequestPermission: Boolean){
        loadSelectedOptions()
        isSecondEnter = SharedPreferencesRepository.isSecondEnter
        viewModelScope.launch {
            if (!afterRequestPermission) delay(1500)
            _loading.value = false
        }
    }

    private fun checkStartLink(){
        isLinkExist = SharedPreferencesRepository.linkList?.isNotEmpty() ?: false
        if (isLinkExist){
            isFromMassage = ThisApplication.getInstance().isFromMassage()
        }
    }

    private fun fillEmptyItems() {
        val emptyLessonData = LessonData("", "", 0, "", "", false)

        for (dayIndex in 0 until 7) {
            val lessons = ArrayList<Lesson>()
            for (lessonIndex in 0 until 6) {
                lessons.add(Lesson(lessonIndex, arrayListOf(emptyLessonData)))
            }
            _scheduleData.add(ScheduleDay(dayIndex, lessons))
        }
        SharedPreferencesRepository.mainSchedule = _scheduleData
    }

    private fun loadSelectedOptions() {
        onlineEducation = SharedPreferencesRepository.onlineEducationSelected
    }

    fun onPermissionGranted(afterRequestPermission: Boolean) {
        ThisApplication.getInstance().startForegroundService()
        navigateToNextScreen(afterRequestPermission)
    }

    fun onPermissionDenied() {
        viewModelScope.launch {
            delay(1500)
            permissionGrantedDialogShown = true
        }
    }
}