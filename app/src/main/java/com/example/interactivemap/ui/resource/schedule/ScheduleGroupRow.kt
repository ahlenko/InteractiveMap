package com.example.interactivemap.ui.resource.schedule

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.logic.model.datamodel.Lesson
import com.example.interactivemap.ui.screens.schedule.DefScheduleViewModel
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import kotlinx.coroutines.flow.MutableStateFlow

@Composable
fun ScheduleGroupRow (lesson: Lesson, viewModel: DefScheduleViewModel){

    InteractiveMapTheme {
        Column (modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally){

            Box(modifier = Modifier
                .height(1.dp)
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.onBackground)
            )

            Row (modifier = Modifier.weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly){

                Text(text = viewModel.getDayNumberByIndex(lesson.index), Modifier.fillMaxWidth(0.16f),
                    style = MaterialTheme.typography.displayLarge
                        .copy(color = MaterialTheme.colorScheme.onBackground
                            , textAlign = TextAlign.Center)
                )

                Box(modifier = Modifier
                    .width(1.dp)
                    .fillMaxHeight()
                    .background(MaterialTheme.colorScheme.onBackground))

                Column (modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally){

                    Box(modifier = Modifier
                        .weight(1f)
                        .pointerInput(Unit) {
                            detectTapGestures(
                                onDoubleTap = {
                                    viewModel.onItemClick(lesson.index, 0)
                                },
                                onLongPress  = {
                                    viewModel.onItemLongClick(lesson.index, 0)
                                }
                            )
                        }){
                        ScheduleRow (lesson.lessonData[0].name, tutor =
                            if (lesson.lessonData[0].tutor != "") {
                                stringResource(id = R.string.tutor) + ": " + lesson.lessonData[0].tutor
                            } else "",
                            if (lesson.lessonData[0].link != "") {
                                if (viewModel.onlineEducation.value) "Дистанційне заняття"
                                else "Невідомо"
                            } else "", lesson.lessonData[0].selected
                        )
                    }

                    if (lesson.lessonData.size > 1){
                    Box(modifier = Modifier
                        .height(1.dp)
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.onBackground))
                        Box(modifier = Modifier
                            .weight(1f)
                            .pointerInput(Unit) {
                                detectTapGestures(
                                    onDoubleTap = {
                                        viewModel.onItemClick(lesson.index, 1)
                                    },
                                    onLongPress = {
                                        viewModel.onItemLongClick(lesson.index, 1)
                                    }
                                )
                            }){
                            ScheduleRow (lesson.lessonData[1].name, tutor =
                            if (lesson.lessonData[1].tutor != "") {
                                stringResource(id = R.string.tutor) + ": " + lesson.lessonData[1].tutor
                            } else "",
                                if (lesson.lessonData[1].link != "") {
                                    if (viewModel.onlineEducation.value) "Дистанційне заняття"
                                    else "Невідомо"
                                }else "", lesson.lessonData[1].selected
                            )
                        }
                    }
                }
            }

            if (lesson.index == 5) {
                Box(modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.onBackground)
                )
            }
        }

    }
}