package com.example.interactivemap

import android.app.Application
import com.example.interactivemap.logic.util.SharedPreferencesHelper.loadSettingsHelper
import com.jakewharton.threetenabp.AndroidThreeTen

class ThisApplication:  Application(){
    private var fromMassage: Boolean = false

    override fun onCreate() { super.onCreate()
        loadSettingsHelper(this, this.packageName)
        AndroidThreeTen.init(this)
        instance = this
    }

    fun setFromMassage(param: Boolean){
        this.fromMassage = param
    }

    fun isFromMassage(): Boolean {
        return fromMassage
    }

    companion object {
        private lateinit var instance: ThisApplication

        fun getInstance(): ThisApplication {
            return instance
        }
    }
}