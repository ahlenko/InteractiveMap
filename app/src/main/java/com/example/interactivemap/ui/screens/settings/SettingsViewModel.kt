package com.example.interactivemap.ui.screens.settings

import android.app.Application
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.util.SharedPreferencesRepository
import com.example.interactivemap.ui.translations.Tr
import com.maxkeppeler.sheets.list.models.ListOption
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SettingsViewModel(application: Application): AndroidViewModel(application) {
    private var _stringLanguage = getApplication<Application>()
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
        _stringLanguage = getApplication<Application>()
            .resources.getStringArray(R.array.language_variant)
        _languageSelected.value = _stringLanguage[SharedPreferencesRepository.languageType]
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
        var langChanged = false
        if ( _languageSelected.value != option.titleText){
            langChanged = true
        }

        _languageSelected.value = option.titleText
        SharedPreferencesRepository.languageType = _languageList
            .value.indexOfFirst { it.titleText == option.titleText }

        if (langChanged) getApplication<ThisApplication>().changeAppLanguage()
        insertListOptions()
    }

    fun openUrlInBrowser() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(MAIN_PAGE_URL))
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        try {
            getApplication<Application>().startActivity(intent)
        } catch (e:Exception){
          throw e
        }
    }

    fun getAppVersion(context: Context): String? {
        return try {
            val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)
            Tr.version_ + " " + packageInfo.versionName + " (" + packageInfo.versionCode + ")"
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
            null
        }
    }

    companion object{
        const val MAIN_PAGE_URL = "https://ust.edu.ua/"
    }
}