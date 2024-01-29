package com.example.interactivemap.ui.screens.account.login.enter

import android.app.Application
import android.widget.Toast
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.AndroidViewModel
import androidx.navigation.NavHostController

class EnterViewModel(application: Application): AndroidViewModel(application) {
    val enteredEmail = mutableStateOf("")
    val enteredPassword = mutableStateOf("")
    val allowNextScreen = mutableStateOf(false)

    fun onPressEnterButton(){
        if (enteredEmail.value.length < 20 && enteredPassword.value.length < 8)
            Toast.makeText(getApplication(), "Не коректні дані", Toast.LENGTH_SHORT).show()
        else allowNextScreen.value = true
    }
}