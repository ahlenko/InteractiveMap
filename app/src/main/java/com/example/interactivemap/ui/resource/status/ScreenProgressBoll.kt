package com.example.interactivemap.ui.resource.status

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun ScreenProgressBoll(state: MutableState<Int>){
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box(modifier = Modifier.clip(RoundedCornerShape(100.dp)).fillMaxSize()
                .background(if (state.value == 0) MaterialTheme.colorScheme.onBackground
                else MaterialTheme.colorScheme.onTertiary).weight(1f))
            Spacer(modifier = Modifier.height(15.dp))
            Box(modifier = Modifier.clip(RoundedCornerShape(100.dp)).fillMaxSize()
                .background(if (state.value == 1) MaterialTheme.colorScheme.onBackground
                else MaterialTheme.colorScheme.onTertiary).weight(1f))
            Spacer(modifier = Modifier.height(15.dp))
            Box(modifier = Modifier.clip(RoundedCornerShape(100.dp)).fillMaxSize()
                .background(if (state.value == 2) MaterialTheme.colorScheme.onBackground
                else MaterialTheme.colorScheme.onTertiary).weight(1f))
        }
    }
}

@Preview
@Composable
fun ScreenProgressBollPreview(){
    val state = remember { mutableIntStateOf(1) }
    ScreenProgressBoll(state)
}