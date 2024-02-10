package com.example.interactivemap.ui.resource.fields

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun PhoneField(text: MutableState<String>, textStyle: TextStyle) {
    val phoneNumber = text.value

    val formattedPhoneNumber = buildString {
        append("+38(")
        if (phoneNumber.length >= 3) append(phoneNumber.substring(3, minOf(5, phoneNumber.length)))
        if (phoneNumber.length >= 5) append(")" + phoneNumber.substring(5, minOf(8, phoneNumber.length)))
        if (phoneNumber.length >= 8) append("-" + phoneNumber.substring(8, minOf(10, phoneNumber.length)))
        if (phoneNumber.length >= 10) append("-" + phoneNumber.substring(10, minOf(12, phoneNumber.length)))
    }

    Box(modifier = Modifier.fillMaxSize().border(2.dp, MaterialTheme.colorScheme.onBackground, RoundedCornerShape(10.dp))) {
        BasicTextField(
            modifier = Modifier.align(Alignment.Center).padding(horizontal = 12.dp).fillMaxWidth(),
            value = formattedPhoneNumber,
            onValueChange = { newValue ->
                val onlyDigits = newValue.filter { it.isDigit() }
                if (onlyDigits.length <= 10) text.value = onlyDigits
            }, textStyle = textStyle,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ), singleLine = true
        )
    }
}