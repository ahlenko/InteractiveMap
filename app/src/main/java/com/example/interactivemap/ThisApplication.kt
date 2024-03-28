package com.example.interactivemap

import android.app.Application
import com.example.interactivemap.logic.util.SharedPreferencesHelper.loadSettingsHelper
import com.jakewharton.threetenabp.AndroidThreeTen

class ThisApplication:  Application(){

    override fun onCreate() { super.onCreate()
        loadSettingsHelper(this, this.packageName)
        AndroidThreeTen.init(this)
    }
}