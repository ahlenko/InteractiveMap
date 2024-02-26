package com.example.interactivemap.ui.screens.account.editor

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.database.AppDatabase
import com.example.interactivemap.ui.screens.schedule.editor.ScheduleEditorViewModel

class EditorViewModel(application: Application): AndroidViewModel(application) {
    var isStudent by mutableStateOf(true)
    var showPhoneEdit by mutableStateOf(false)
    var showEmailEdit by mutableStateOf(false)
    var showPasswordEdit by mutableStateOf(false)
    var showDeleteAccount by mutableStateOf(false)
    var showStatusEdit by mutableStateOf(false)
    var showExitAccount by mutableStateOf(false)
    var showSubjectDialog by mutableStateOf(false)

    fun onDelete(){

    }

    fun onChangeEmail(){

    }

    fun onChangePassword(){

    }

    fun onChangePhone(){

    }

    fun onChangeStatus() {

    }

    fun onExit() {

    }
}