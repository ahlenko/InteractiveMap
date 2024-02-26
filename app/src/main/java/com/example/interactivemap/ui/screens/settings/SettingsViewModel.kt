package com.example.interactivemap.ui.screens.settings

import android.app.Application
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.util.SharedPreferencesRepository
import com.maxkeppeler.sheets.list.models.ListOption
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SettingsViewModel(application: Application): AndroidViewModel(application) {
    private val _stringLanguage = getApplication<Application>()
        .resources.getStringArray(R.array.language_variant)

    private val _pointsViewDistanceList = MutableStateFlow(arrayListOf<ListOption>())
    private val _updateIntervalList = MutableStateFlow(arrayListOf<ListOption>())
    private val _languageList = MutableStateFlow(arrayListOf<ListOption>())

    val pointsViewDistanceList = _pointsViewDistanceList.asStateFlow()
    val updateIntervalList = _updateIntervalList.asStateFlow()
    val languageList = _languageList.asStateFlow()

    private var _index: Int = 0

    var darkThemeSelected by mutableStateOf(false)
    var onlineEducation by mutableStateOf(false)
    var translationGeo by mutableStateOf(false)

    private val _languageSelected = MutableStateFlow("")
    private val _distanceSelected = MutableStateFlow("")
    private val _intervalSelected = MutableStateFlow("")

    val languageSelected = _languageSelected.asStateFlow()
    val distanceSelected = _distanceSelected.asStateFlow()
    val intervalSelected = _intervalSelected.asStateFlow()

    init {
        loadSelectedOptions()
        insertListOptions()
    }

    private fun loadSelectedOptions() {
        _distanceSelected.value = getDistanceString(SharedPreferencesRepository.geoTranslationDistance)
        _intervalSelected.value = getIntervalString(SharedPreferencesRepository.geoUpdateInterval)
        _languageSelected.value = _stringLanguage[SharedPreferencesRepository.languageType]
        onlineEducation = SharedPreferencesRepository.onlineEducationSelected
        darkThemeSelected = SharedPreferencesRepository.darkThemeSelected
        translationGeo = SharedPreferencesRepository.translationGeoOn
    }

    private fun insertListOptions() {
        _languageList.value.clear()
        _languageList.value = _stringLanguage.map { ListOption(titleText = it,
            selected = it == languageSelected.value) } as ArrayList<ListOption>

        _pointsViewDistanceList.value.clear()
        _pointsViewDistanceList.value.add(ListOption(titleText = getDistanceString(0)))
        _pointsViewDistanceList.value.add(ListOption(titleText = getDistanceString(1)))
        _pointsViewDistanceList.value.add(ListOption(titleText = getDistanceString(2)))
        _index = _pointsViewDistanceList.value.indexOfFirst { it.titleText == _distanceSelected.value }
        _pointsViewDistanceList.value[_index] = ListOption(titleText = getDistanceString(_index), selected = true)

        _updateIntervalList.value.clear()
        _updateIntervalList.value.add(ListOption(titleText = getIntervalString(0)))
        _updateIntervalList.value.add(ListOption(titleText = getIntervalString(1)))
        _updateIntervalList.value.add(ListOption(titleText = getIntervalString(2)))
        _updateIntervalList.value.add(ListOption(titleText = getIntervalString(3)))
        _index = _updateIntervalList.value.indexOfFirst { it.titleText == _intervalSelected.value }
        _updateIntervalList.value[_index] = ListOption(titleText = getIntervalString(_index), selected = true)
    }

    fun onSystemThemeChanged(){
        darkThemeSelected = !darkThemeSelected
        SharedPreferencesRepository
            .darkThemeSelected = darkThemeSelected
    }

    fun onEducationTypeChanged(){
        onlineEducation = !onlineEducation
        SharedPreferencesRepository
            .onlineEducationSelected = onlineEducation
    }

    fun onTranslationStateChanged(){
        translationGeo = !translationGeo
        SharedPreferencesRepository
            .translationGeoOn = translationGeo
    }

    fun onLanguageChanged(option: ListOption) {
        _languageSelected.value = option.titleText
        SharedPreferencesRepository.languageType = _languageList
            .value.indexOfFirst { it.titleText == option.titleText }
        insertListOptions()
    }

    fun onDistanceChanged(option: ListOption) {
        _distanceSelected.value = option.titleText
        SharedPreferencesRepository.geoTranslationDistance = _pointsViewDistanceList
            .value.indexOfFirst { it.titleText == option.titleText }
        insertListOptions()
    }

    fun onTimeIntervalChanged(option: ListOption) {
        _intervalSelected.value = option.titleText
        SharedPreferencesRepository.geoUpdateInterval = _updateIntervalList
            .value.indexOfFirst { it.titleText == option.titleText }
        insertListOptions()
    }

    fun openUrlInBrowser() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(MAIN_PAGE_URL))
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        getApplication<Application>().startActivity(intent)
    }

    private fun getDistanceString(type: Int): String {
        return when (type){
            0 -> DISTANCE_500.toString() + getApplication<Application>().resources.getString(R.string.distance)
            1 -> DISTANCE_1000.toString() + getApplication<Application>().resources.getString(R.string.distance)
            else -> DISTANCE_2000.toString() + getApplication<Application>().resources.getString(R.string.distance)
        }
    }

    private fun getIntervalString(type: Int): String {
        return when (type){
            0 -> UPDATE_TIME_15.toString() + getApplication<Application>().resources.getString(R.string.time)
            1 -> UPDATE_TIME_30.toString() + getApplication<Application>().resources.getString(R.string.time)
            2 -> UPDATE_TIME_60.toString() + getApplication<Application>().resources.getString(R.string.time)
            else -> UPDATE_TIME_120.toString() + getApplication<Application>().resources.getString(R.string.time)
        }
    }

    companion object{
        const val MAIN_PAGE_URL = "https://ust.edu.ua/"

        const val DISTANCE_500 = 500
        const val DISTANCE_1000 = 1000
        const val DISTANCE_2000 = 2000

        const val UPDATE_TIME_15 = 10
        const val UPDATE_TIME_30 = 30
        const val UPDATE_TIME_60 = 60
        const val UPDATE_TIME_120 = 120
    }
}