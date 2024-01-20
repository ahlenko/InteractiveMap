package com.example.interactivemap.logic.util

import android.content.Context
import android.content.SharedPreferences

object SharedPreferencesHelper {
    private var sharedPreferences: SharedPreferences? = null

    @JvmStatic
    fun loadSettingsHelper(context: Context, name: String) {
        sharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)
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