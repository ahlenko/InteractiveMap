package com.example.interactivemap.ui.resource.fields

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun BasicField (text: MutableState<String>, textStyle: TextStyle, placeholder: String){
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Box(modifier = Modifier.fillMaxSize()
            .border(2.dp, MaterialTheme.colorScheme.onBackground, RoundedCornerShape(10.dp))
        ) {
            BasicTextField(
                modifier = Modifier.align(Alignment.Center).padding(horizontal = 12.dp).fillMaxWidth(),
                value = text.value, onValueChange = { text.value = it },
                textStyle = textStyle, maxLines = 1,
                decorationBox = { innerTextField ->
                    if (text.value.isEmpty()) {
                        Text(
                            text = placeholder,
                            style = TextStyle(color = Color.Gray)
                        )
                    }
                    innerTextField()
                }
            )
        }
    }
}