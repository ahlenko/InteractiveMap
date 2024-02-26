package com.example.interactivemap.ui.screens.account.creator

import android.app.Application
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import com.example.interactivemap.logic.network.responce.LessonResponse
import com.example.interactivemap.ui.screens.settings.SettingsViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CreatorViewModel(application: Application): AndroidViewModel(application) {
    private val emailRegex = Regex("""^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$""")
    private var _registerApproved = MutableStateFlow(false)
    val registerApproved = _registerApproved.asStateFlow()
    var blockRegister by mutableStateOf(false)

    private val _lessonList = MutableStateFlow(arrayListOf<LessonResponse>())

    private val _filteredLessonList = MutableStateFlow(arrayListOf<LessonResponse>())
    val filteredLessonList = _filteredLessonList.asStateFlow()

    private val _subjectText = MutableStateFlow("")
    val subjectText = _subjectText.asStateFlow()

    var isStudent by mutableStateOf(true)
    var isTutor by mutableStateOf(false)

    val photo = mutableStateOf<Bitmap?>(null)
    val lastName = mutableStateOf("")
    val firstName = mutableStateOf("")
    val middleName = mutableStateOf("")
    val phoneNumber = mutableStateOf("0")
    val lessonsList = mutableStateOf("")
    val group = mutableStateOf("")
    val regNumber = mutableStateOf("")
    val email = mutableStateOf("")
    val password = mutableStateOf("")

    var subjectDialog by mutableStateOf(false)

    var photoError by mutableStateOf(false)
    var lastNameError by mutableStateOf(false)
    var firstNameError by mutableStateOf(false)
    var middleNameError by mutableStateOf(false)
    var phoneNumberError by mutableStateOf(false)
    var groupError by mutableStateOf(false)
    var regNumberError by mutableStateOf(false)
    var emailError by mutableStateOf(false)
    var passwordError by mutableStateOf(false)

    var inEditState by mutableStateOf(false)

    init {
        _lessonList.value.add(LessonResponse(1, "Алгебра",false))
        _lessonList.value.add(LessonResponse(2, "Геометрія",false))
        _lessonList.value.add(LessonResponse(3, "Математика", false))
        _lessonList.value.add(LessonResponse(4, "Біологія", false))

        filteredLessonList.value.addAll(_lessonList.value)
    }

    fun changeSelectedType(){
        isStudent = !isStudent
        isTutor = !isTutor
    }

    fun checkRegistrationData() { clearError()
        var dataNotEmpty = true

        if (photo.value == null) {
            dataNotEmpty = false
            photoError = true }
        if (lastName.value == "") {
            lastNameError = true
            dataNotEmpty = false }
        if (firstName.value == "") {
            dataNotEmpty = false
            firstNameError = true }
        if (middleName.value == "") {
            middleNameError = true
            dataNotEmpty = false }
        if (phoneNumber.value == "0") {
            phoneNumberError = true
            dataNotEmpty = false }
        if (isStudent && group.value == "") {
            groupError = true
            dataNotEmpty = false }
        if (regNumber.value == "") {
            regNumberError = true
            dataNotEmpty = false }
        if (email.value == "") {
            emailError = true
            dataNotEmpty = false }
        if (password.value == "") {
            passwordError = true
            dataNotEmpty = false }

        if (!dataNotEmpty){
            Toast.makeText(getApplication(), "Усі поля мають бути заповненими", Toast.LENGTH_LONG).show()
        } else if(password.value.length != 10){ phoneNumberError = true
            Toast.makeText(getApplication(), "Номер телефону не відповідає формату", Toast.LENGTH_LONG).show()
        }
        else if(!emailRegex.matches(email.value)){ emailError = true
            Toast.makeText(getApplication(), "Email не відповідає формату", Toast.LENGTH_LONG).show()
        }
        else if(password.value.length < 8){ passwordError = true
            Toast.makeText(getApplication(), "Довжина паролю має бути від 8 символів", Toast.LENGTH_LONG).show()
        }

        val checkRes = checkExist()
        when (checkRes){
            0 -> _registerApproved.value = true
            1 -> { Toast.makeText(getApplication(), "Номер телефону вже зареєстровано в системі", Toast.LENGTH_LONG).show()
                phoneNumberError = true }
            2 -> { if (isStudent) Toast.makeText(getApplication(), "Студентський вже зареєстровано в системі", Toast.LENGTH_LONG).show()
                else Toast.makeText(getApplication(), "Реєстраційний номер вже зареєстровано в системі", Toast.LENGTH_LONG).show()
                regNumberError = true }
            3 -> { Toast.makeText(getApplication(), "Email телефону вже зареєстровано в системі", Toast.LENGTH_LONG).show()
                emailError = true }
        }
    }

    private fun checkExist():Int{ return 0 }

    private fun clearError() {
         lastNameError = false
         firstNameError = false
         middleNameError = false
         phoneNumberError = false
         groupError= false
         regNumberError = false
         emailError = false
         passwordError = false
         photoError = false
    }

    fun addALesson(){
        if (_subjectText.value.length < 5){
            Toast.makeText(getApplication(),
                "Мінімальне введення - 5 символів", Toast.LENGTH_LONG).show()
        }else {
            _lessonList.value.add(LessonResponse(_lessonList.value.size + 1, _subjectText.value,  false))
            _filteredLessonList.value.clear()
            filteredLessonList.value.addAll(_lessonList.value)
            _subjectText.value = ""
        }
    }

    fun onSelected(id: Int){ photoError = false
        _lessonList.value.forEach { if(it.id == id) it.selected = !it.selected}
        filteredLessonList.value.forEach { if(it.id == id) it.selected = !it.selected}
    }

    fun filterList(searchValue: String){
        _subjectText.value = searchValue
        _filteredLessonList.value.clear()

        if (searchValue.isNotEmpty()) {
            for (subject in _lessonList.value)
                if (subject.name.lowercase()?.contains(searchValue.lowercase()) == true)
                    _filteredLessonList.value.add(subject)
        } else  _filteredLessonList.value.addAll(_lessonList.value)
    }

    fun openUrlInBrowser() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(SettingsViewModel.MAIN_PAGE_URL))
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        getApplication<Application>().startActivity(intent)
    }
}