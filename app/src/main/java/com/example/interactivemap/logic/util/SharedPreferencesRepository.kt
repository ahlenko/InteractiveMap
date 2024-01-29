package com.example.interactivemap.logic.util

import com.example.interactivemap.logic.util.SharedPreferencesHelper.loadBoolean
import com.example.interactivemap.logic.util.SharedPreferencesHelper.loadInt
import com.example.interactivemap.logic.util.SharedPreferencesHelper.loadString
import com.example.interactivemap.logic.util.SharedPreferencesHelper.saveBoolean
import com.example.interactivemap.logic.util.SharedPreferencesHelper.saveInt
import com.example.interactivemap.logic.util.SharedPreferencesHelper.saveString

object SharedPreferencesRepository {
    var languageType: Int
        get() = loadInt(SharedPreferencesHelper.LANGUAGE_TYPE)
        set(languageType) {
            saveInt(SharedPreferencesHelper.LANGUAGE_TYPE, languageType)
        }

    var darkThemeSelected: Boolean
        get() = loadBoolean(SharedPreferencesHelper.DARK_MODE_STATE)
        set(darkThemeSelected) {
            saveBoolean(SharedPreferencesHelper.DARK_MODE_STATE, darkThemeSelected)
        }

    var onlineEducationSelected: Boolean
        get() = loadBoolean(SharedPreferencesHelper.ONLINE_EDUCATION)
        set(onlineEducationSelected) {
            saveBoolean(SharedPreferencesHelper.ONLINE_EDUCATION, onlineEducationSelected)
        }

    var translationGeoOn: Boolean
        get() = loadBoolean(SharedPreferencesHelper.TRANSLATION_STATE)
        set(translationGeoOn) {
            saveBoolean(SharedPreferencesHelper.TRANSLATION_STATE, translationGeoOn)
        }

    var geoTranslationDistance: Int
        get() = loadInt(SharedPreferencesHelper.TRANSLATION_DISTANCE)
        set(geoTranslationDistance) {
            saveInt(SharedPreferencesHelper.TRANSLATION_DISTANCE, geoTranslationDistance)
        }

    var geoUpdateInterval: Int
        get() = loadInt(SharedPreferencesHelper.UPDATE_INTERVAL)
        set(geoUpdateInterval) {
            saveInt(SharedPreferencesHelper.UPDATE_INTERVAL, geoUpdateInterval)
        }
}