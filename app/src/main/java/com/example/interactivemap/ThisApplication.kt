package com.example.interactivemap

import android.app.Application
import com.example.interactivemap.logic.util.SharedPreferencesHelper.loadSettingsHelper
import com.example.interactivemap.logic.database.AppDatabase

class ThisApplication:  Application(){
    val database by lazy { AppDatabase.getDatabase(this) }

    override fun onCreate() { super.onCreate()
        loadSettingsHelper(this, this.packageName)
    }
}