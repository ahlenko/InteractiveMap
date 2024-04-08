package com.example.interactivemap.logic.util

import android.content.Context
import android.content.SharedPreferences
import com.example.interactivemap.logic.model.datamodel.ScheduleDay
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object SharedPreferencesHelper {
    private var sharedPreferences: SharedPreferences? = null

    const val LANGUAGE_TYPE = "language_type"
    const val DARK_MODE_STATE = "dark_theme"
    const val ONLINE_EDUCATION = "online_education"
    const val SECOND_ENTER = "second_enter"
    const val SCHEDULE_TYPE = "schedule_type"
    const val AUTH_TOKEN = "auth_token"
    const val BASE_URL_KEY = "base_url_key"

    const val SCHEDULE_MAIN = "schedule_main"
    const val SCHEDULE_RESERVE = "schedule_reserve"

    const val NAVIGATION_GRAPH = "navigation_graph"
    const val MAP_LOCATION = "map_location"
    const val LINK_LIST = "linkList"

    @JvmStatic
    fun loadSettingsHelper(context: Context, name: String) {
        sharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)
    }

    fun convertScheduleListToJson(scheduleList: ArrayList<ScheduleDay>?): String? {
        if (scheduleList == null) return null
        val gson = Gson()
        return gson.toJson(scheduleList)
    }

    fun loadScheduleFromJson(jsonString: String?): ArrayList<ScheduleDay>? {
        if (jsonString == null) return null
        val gson = Gson()
        val type = object : TypeToken<ArrayList<ScheduleDay>>() {}.type
        return gson.fromJson(jsonString, type)
    }

    @JvmStatic
    fun saveInt(key: String?, value: Int) {
        val editor = sharedPreferences!!.edit()
        editor.putInt(key, value)
        editor.apply()
    }

    @JvmStatic
    fun loadInt(key: String?): Int {
        return sharedPreferences!!.getInt(key, 0)
    }

    @JvmStatic
    fun saveString(key: String?, value: String?) {
        val editor = sharedPreferences!!.edit()
        editor.putString(key, value)
        editor.apply()
    }

    @JvmStatic
    fun loadString(key: String?): String? {
        return sharedPreferences!!.getString(key, null)
    }

    @JvmStatic
    fun saveBoolean(key: String?, value: Boolean) {
        val editor = sharedPreferences!!.edit()
        editor.putBoolean(key, value)
        editor.apply()
    }

    @JvmStatic
    fun loadBoolean(key: String?): Boolean {
        return sharedPreferences!!.getBoolean(key, false)
    }
}