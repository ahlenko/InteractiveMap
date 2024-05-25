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
    private val _languageList = MutableStateFlow(arrayListOf<ListOption>())
    val languageList = _languageList.asStateFlow()

    var darkThemeSelected by mutableStateOf(false)
    var onlineEducation by mutableStateOf(false)

    private val _languageSelected = MutableStateFlow("")

    val languageSelected = _languageSelected.asStateFlow()

    init {
        loadSelectedOptions()
        insertListOptions()
    }

    private fun loadSelectedOptions() {
        _languageSelected.value = _stringLanguage[SharedPreferencesRepository.languageType]
        onlineEducation = SharedPreferencesRepository.onlineEducationSelected
        darkThemeSelected = SharedPreferencesRepository.darkThemeSelected
    }

    private fun insertListOptions() {
        _languageList.value.clear()
        _languageList.value = _stringLanguage.map { ListOption(titleText = it,
            selected = it == languageSelected.value) } as ArrayList<ListOption>
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


    fun onLanguageChanged(option: ListOption) {
        _languageSelected.value = option.titleText
        SharedPreferencesRepository.languageType = _languageList
            .value.indexOfFirst { it.titleText == option.titleText }
        insertListOptions()
    }

    fun openUrlInBrowser() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(MAIN_PAGE_URL))
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        getApplication<Application>().startActivity(intent)
    }

    companion object{
        const val MAIN_PAGE_URL = "https://ust.edu.ua/"
    }
}