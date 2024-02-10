package com.example.interactivemap.ui.resource.schedule

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.ui.theme.InteractiveMapTheme


@Composable
fun ScheduleContainer (){
    InteractiveMapTheme {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Box(modifier = Modifier.height(170.dp)) {
                    ScheduleGroupRow(true, "I", false)
                }
            }
            item {
                Box(modifier = Modifier.height(85.dp)) {
                    ScheduleGroupRow(false, "II", false)
                }
            }
            item {
                Box(modifier = Modifier.height(85.dp)) {
                    ScheduleGroupRow(false, "III", false)
                }
            }
            item {
                Box(modifier = Modifier.height(85.dp)) {
                    ScheduleGroupRow(false, "IV", false)
                }
            }
            item {
                Box(modifier = Modifier.height(170.dp)) {
                    ScheduleGroupRow(true, "V", false)
                }
            }
            item {
                Box(modifier = Modifier.height(85.dp)) {
                    ScheduleGroupRow(false, "VI", true)
                }
            }
        }
    }
}

@Preview
@Composable
fun ScheduleContainerPreview(){
    ScheduleContainer ()
}