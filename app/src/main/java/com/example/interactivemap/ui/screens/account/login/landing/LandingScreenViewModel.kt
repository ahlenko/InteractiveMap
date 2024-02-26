package com.example.interactivemap.ui.screens.account.login.landing

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import com.example.interactivemap.logic.util.SharedPreferencesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LandingScreenViewModel (application: Application): AndroidViewModel(application){
    private var _authToken by mutableStateOf("")
    private val _isAuthorize = MutableStateFlow(false)
    var onlineEducation by mutableStateOf(false)
    val isAuthorize = _isAuthorize.asStateFlow()

    init {
        loadSelectedOptions()
        getAuthToken()
        checkTokenState()
    }

    private fun loadSelectedOptions() {
        onlineEducation = SharedPreferencesRepository.onlineEducationSelected
    }

    private fun getAuthToken(){

        _authToken = SharedPreferencesRepository.authToken ?: ""
    }

    private fun checkTokenState(){
        if (_authToken.isNotEmpty()){
            _isAuthorize.value = false
        } else {
            _isAuthorize.value = false
        }
    }
}