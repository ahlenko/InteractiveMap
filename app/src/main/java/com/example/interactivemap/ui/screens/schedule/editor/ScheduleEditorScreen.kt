package com.example.interactivemap.ui.screens.schedule.editor

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.interactivemap.R
import com.example.interactivemap.logic.navigation.ScheduleViewer
import com.example.interactivemap.logic.navigation.SettingsScreen
import com.example.interactivemap.ui.dialogs.ConfirmationDialog
import com.example.interactivemap.ui.dialogs.LessonEditorDialog
import com.example.interactivemap.ui.resource.schedule.ScheduleDayController
import com.example.interactivemap.ui.resource.schedule.ScheduleEditor
import com.example.interactivemap.ui.resource.header.DefaultHeader
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.resource.schedule.ScheduleContainer
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import kotlinx.coroutines.delay

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ScheduleEditorScreen(navHostController: NavHostController,
    scheduleEditorViewModel: ScheduleEditorViewModel = viewModel(
        factory = ScheduleEditorViewModel.factory)){
    val scheduleData = scheduleEditorViewModel.scheduleData.collectAsState()

    if (scheduleEditorViewModel.showSheet) {
        LessonEditorDialog(scheduleEditorViewModel.selectedData,
        scheduleEditorViewModel.lessonDescription, scheduleEditorViewModel)
    { scheduleEditorViewModel.showSheet = false } }

    if (scheduleEditorViewModel.showReserveInfo) { ConfirmationDialog(
        titleRes = R.string.info, textRes = R.string.onEditDismiss,
        dismissRes = R.string.dismiss, confirmRes = R.string.exit, reverseColors = false,
        onDismiss = { scheduleEditorViewModel.showReserveInfo = false })
    { scheduleEditorViewModel.showReserveInfo = false
        scheduleEditorViewModel.onMoveOut() }}

    if (scheduleEditorViewModel.showReserveCopy) { ConfirmationDialog(
        titleRes = R.string.info, textRes = R.string.onFindReserveCopy,
        dismissRes = R.string.restore, confirmRes = R.string.delete, reverseColors = false,
        onDismiss = { scheduleEditorViewModel.showReserveCopy = false
            scheduleEditorViewModel.onRecoverAgree() })
    { scheduleEditorViewModel.showReserveCopy = false
        scheduleEditorViewModel.onRecoverDismiss() }}


    if (scheduleEditorViewModel.showDeleteAgree) { ConfirmationDialog(
        titleRes = R.string.confirmation, textRes = R.string.onDeleteLesson,
        dismissRes = R.string.dismiss, confirmRes = R.string.delete, reverseColors = false,
        onDismiss = { scheduleEditorViewModel.showDeleteAgree = false })
    { scheduleEditorViewModel.showDeleteAgree = false
        scheduleEditorViewModel.onDeleteElement() }}

    InteractiveMapTheme {
        Scaffold (containerColor = MaterialTheme.colorScheme.background) { _ ->
            ReturnBack(navHostController, scheduleEditorViewModel)
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Box(
                    modifier = Modifier.padding(15.dp).height(50.dp).fillMaxWidth()
                        .then(
                            ShadowMaterial.CustomShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.tertiaryContainer)
                        )
                        .then(
                            ShadowMaterial.CustomReShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.onTertiaryContainer)
                        )
                ) {
                    DefaultHeader(titleId = R.string.schedule, leftImgId = R.drawable.ic_prew_page,
                        rightImgId = R.drawable.ic_settings, onClickLeft = {
                            navHostController.navigate(ScheduleViewer.route) { popUpTo(0) }
                        }, onClickRight = {
                            navHostController.navigate(SettingsScreen.route) { popUpTo(0) }
                        }
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = stringResource(
                        id = when (scheduleEditorViewModel.scheduleType) {
                            0 -> R.string.create
                            1 -> R.string.edit
                            else -> R.string.recover
                        }
                    ), Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.headlineMedium
                        .copy(
                            color = MaterialTheme.colorScheme.onPrimary,
                            textAlign = TextAlign.Center
                        )
                )

                Spacer(modifier = Modifier.height(6.dp))

                Box(
                    modifier = Modifier
                        .padding(10.dp)
                        .height(25.dp)
                        .fillMaxSize()
                ) {
                    ScheduleDayController(scheduleEditorViewModel)
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 10.dp)
                        .padding(top = 4.dp, bottom = 10.dp)
                ) {
                    ScheduleContainer(
                        scheduleData.value[scheduleEditorViewModel.currentDay],
                        scheduleEditorViewModel
                    )
                }

                if (scheduleEditorViewModel.areUpdate) {
                    Spacer(modifier = Modifier.height(1.dp))
                }

                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 25.dp)
                        .padding(bottom = 15.dp)
                        .height(115.dp)
                ) {
                    ScheduleEditor(scheduleEditorViewModel)
                }
            }
        }
    }
}

@Composable
fun ReturnBack(navController: NavHostController, viewModel: ScheduleEditorViewModel) {
    val back = viewModel.toBackScreen.collectAsState()
    if (back.value) navController.navigate(ScheduleViewer.route)
}