package com.example.interactivemap.ui.resource.button

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import kotlinx.coroutines.flow.MutableStateFlow

@Composable
fun SwitchRowButton (state: Boolean, onChanged: ()->Unit){
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Switch(checked = state, onCheckedChange = {
            onChanged() },
            colors = SwitchDefaults.colors(
                checkedTrackColor = MaterialTheme.colorScheme.onPrimaryContainer,
                uncheckedTrackColor = MaterialTheme.colorScheme.onPrimaryContainer,
                checkedThumbColor = MaterialTheme.colorScheme.onBackground,
                uncheckedThumbColor = MaterialTheme.colorScheme.onBackground,
            )
        )
    }
}

@Preview
@Composable
fun SwitchRowButtonPreview(){
    SwitchRowButton(true){}
}