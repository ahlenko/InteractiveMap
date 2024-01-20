package com.example.interactivemap.ui.screens.account.creator

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.database.AppDatabase
import com.example.interactivemap.ui.screens.schedule.editor.ScheduleEditorViewModel

class CreatorViewModel(database: AppDatabase, application: Application): AndroidViewModel(application) {
    companion object{
        val factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory{
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
                val application = (checkNotNull(extras[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]) as ThisApplication)
                val database = (checkNotNull(extras[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]) as ThisApplication).database
                return CreatorViewModel(database, application) as T
            }
        }
    }
}