package com.example.interactivemap.ui.resource.schedule

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.logic.model.datamodel.ScheduleDay
import com.example.interactivemap.ui.screens.schedule.DefScheduleViewModel
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import kotlinx.coroutines.flow.MutableStateFlow


@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun ScheduleContainer(scheduleDataList: ScheduleDay, viewerViewModel: DefScheduleViewModel) {
    InteractiveMapTheme {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Box(modifier = Modifier.height(if(scheduleDataList.lessons[0].lessonData.size > 1) 170.dp else 85.dp)) {
                    ScheduleGroupRow(scheduleDataList.lessons[0], viewerViewModel)
                }
            }
            item {
                Box(modifier = Modifier.height(if(scheduleDataList.lessons[1].lessonData.size > 1) 170.dp else 85.dp)) {
                    ScheduleGroupRow(scheduleDataList.lessons[1], viewerViewModel)
                }
            }
            item {
                Box(modifier = Modifier.height(if(scheduleDataList.lessons[2].lessonData.size > 1) 170.dp else 85.dp)) {
                    ScheduleGroupRow(scheduleDataList.lessons[2], viewerViewModel)
                }
            }
            item {
                Box(modifier = Modifier.height(if(scheduleDataList.lessons[3].lessonData.size > 1) 170.dp else 85.dp)) {
                    ScheduleGroupRow(scheduleDataList.lessons[3], viewerViewModel)
                }
            }
            item {
                Box(modifier = Modifier.height(if(scheduleDataList.lessons[4].lessonData.size > 1) 170.dp else 85.dp)) {
                    ScheduleGroupRow(scheduleDataList.lessons[4], viewerViewModel)
                }
            }
            item {
                Box(modifier = Modifier.height(if(scheduleDataList.lessons[5].lessonData.size > 1) 170.dp else 85.dp)) {
                    ScheduleGroupRow(scheduleDataList.lessons[5], viewerViewModel)
                }
            }
        }
    }
}

@Preview
@Composable
fun ScheduleContainerPreview(){}