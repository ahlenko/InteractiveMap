package com.example.interactivemap.ui.screens.account.login.enter

import android.app.Application
import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.navigation.NavHostController
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class EnterViewModel(application: Application): AndroidViewModel(application) {
    private val emailRegex = Regex("""^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$""")
    private var _enteredApproved = MutableStateFlow(false)
    var emailOrPasswordError by mutableStateOf(false)
    val enteredApproved = _enteredApproved.asStateFlow()
    val enteredPassword = mutableStateOf("")
    var emailError by mutableStateOf(false)
    var passwordError by mutableStateOf(false)
    val enteredEmail = mutableStateOf("")

    var blockEnter by mutableStateOf(false)

    fun checkEnterData() {
        clearError()
        if (enteredEmail.value.isEmpty()){
            Toast.makeText(getApplication(), "Усі поля мають бути заповненими", Toast.LENGTH_LONG).show()
            emailError = true
        } else if (enteredPassword.value.isEmpty()){
            Toast.makeText(getApplication(), "Усі поля мають бути заповненими", Toast.LENGTH_LONG).show()
            passwordError = true
        } else if (!emailRegex.matches(enteredEmail.value)) {
            Toast.makeText(getApplication(), "Email не відповідає формату", Toast.LENGTH_LONG).show()
            emailError = true
        } else if (!logIn()) { blockEnter = false
            Toast.makeText(getApplication(), "Не вірний email або пароль", Toast.LENGTH_LONG).show()
            emailOrPasswordError = true
        } else _enteredApproved.value = true
    }

    private fun clearError() {
        emailOrPasswordError = false
        emailError = false
    }

    private fun logIn(): Boolean {
        blockEnter = true
        blockEnter = false
        return true
    }
}