package com.example.interactivemap.logic.util

import com.example.interactivemap.logic.model.datamodel.ScheduleDay
import com.example.interactivemap.logic.util.SharedPreferencesHelper.SCHEDULE_MAIN
import com.example.interactivemap.logic.util.SharedPreferencesHelper.SCHEDULE_RESERVE
import com.example.interactivemap.logic.util.SharedPreferencesHelper.convertScheduleListToJson
import com.example.interactivemap.logic.util.SharedPreferencesHelper.loadBoolean
import com.example.interactivemap.logic.util.SharedPreferencesHelper.loadInt
import com.example.interactivemap.logic.util.SharedPreferencesHelper.loadScheduleFromJson
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

    var scheduleType: Int
        get() = loadInt(SharedPreferencesHelper.SCHEDULE_TYPE)
        set(languageType) {
            saveInt(SharedPreferencesHelper.SCHEDULE_TYPE, languageType)
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

    var isSecondEnter: Boolean
        get() = loadBoolean(SharedPreferencesHelper.SECOND_ENTER)
        set(isSecondEnter) {
            saveBoolean(SharedPreferencesHelper.SECOND_ENTER, isSecondEnter)
        }

    var mainSchedule: ArrayList<ScheduleDay>?
        get() = loadScheduleFromJson(loadString(SCHEDULE_MAIN))
        set(reserveSchedule) {
            saveString(SCHEDULE_MAIN, convertScheduleListToJson(reserveSchedule))
        }

    var mainScheduleSTR: String?
        get() = loadString(SCHEDULE_MAIN)
        set(reserveSchedule) {}

    var reserveSchedule: ArrayList<ScheduleDay>?
        get() = loadScheduleFromJson(loadString(SCHEDULE_RESERVE))
        set(reserveSchedule) {
            saveString(SCHEDULE_RESERVE, convertScheduleListToJson(reserveSchedule))
        }

    var locationList: String?
        get() = loadString(SharedPreferencesHelper.MAP_LOCATION)
        set(locationList) {
            saveString(SharedPreferencesHelper.MAP_LOCATION, locationList)
        }

    var authToken: String?
        get() = loadString(SharedPreferencesHelper.AUTH_TOKEN)
        set(authToken) {
            saveString(SharedPreferencesHelper.AUTH_TOKEN, authToken)
        }

    var navigationGraph: String?
        get() = loadString(SharedPreferencesHelper.NAVIGATION_GRAPH)
        set(navigationGraph) {
            saveString(SharedPreferencesHelper.NAVIGATION_GRAPH, navigationGraph)
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