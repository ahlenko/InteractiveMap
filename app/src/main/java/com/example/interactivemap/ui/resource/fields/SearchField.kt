package com.example.interactivemap.ui.resource.fields

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.captionBarPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.SoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun SearchField (text: MutableState<String>, searchRes: MutableState<String>, textStyle: TextStyle,
                 getSearchRes: () -> Unit, keyboardController: SoftwareKeyboardController){
    var isTextFieldActive by remember { mutableStateOf(false) }

    InteractiveMapTheme {
        Box(modifier = Modifier
            .fillMaxSize()
            .border(2.dp, MaterialTheme.colorScheme.onBackground, RoundedCornerShape(10.dp))
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .align(Alignment.Center)
                    .fillMaxWidth()
            ) {
                BasicTextField(
                    value = text.value, onValueChange = { newValue ->
                        text.value = newValue
                        if (newValue.length >= 3) {  getSearchRes() }
                    },
                    singleLine = true, textStyle = textStyle,
                    modifier = Modifier
                        .widthIn(min = 2.dp)
                        .then(
                            if (isTextFieldActive) Modifier.wrapContentWidth()
                            else Modifier.fillMaxWidth()
                        )
                        .onFocusChanged { focusState ->
                            isTextFieldActive = focusState.isFocused
                        }
                )

                Text(
                    text = searchRes.value, maxLines = 1, style = textStyle,
                    modifier = Modifier
                        .padding(start = 2.dp)
                        .wrapContentWidth()
                        .alpha(0.6f)
                        .clickable {
                            keyboardController.hide()
                            text.value = searchRes.value
                            searchRes.value = ""
                        }
                )
            }
        }
    }
}

@Preview
@Composable
fun SearchFieldPreview (){
    LocalSoftwareKeyboardController.current?.let {
        SearchField( text = remember {
        mutableStateOf("") },
        searchRes = remember {
            mutableStateOf("fds") },
        textStyle = MaterialTheme.typography.bodySmall
            .copy(color = MaterialTheme.colorScheme.onPrimary), keyboardController = it, getSearchRes = {})
    }
}
