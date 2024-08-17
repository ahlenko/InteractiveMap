package com.example.interactivemap.ui.screens.schedule.viewer

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.navigation.NavigationScreen
import com.example.interactivemap.logic.navigation.ScheduleEditor
import com.example.interactivemap.logic.navigation.ScheduleViewer
import com.example.interactivemap.logic.navigation.SettingsScreen
import com.example.interactivemap.logic.util.SharedPreferencesRepository
import com.example.interactivemap.ui.dialogs.LessonViewDialog
import com.example.interactivemap.ui.resource.schedule.ScheduleDayController
import com.example.interactivemap.ui.resource.schedule.ScheduleLoader
import com.example.interactivemap.ui.resource.header.DefaultHeader
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.resource.schedule.ScheduleContainer
import com.example.interactivemap.ui.screens.welcome.SplashScreenViewModel
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import com.example.interactivemap.ui.translations.Translation

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ScheduleViewerScreen(navHostController: NavHostController,
    scheduleViewerViewModel: ScheduleViewerViewModel = viewModel(factory = ScheduleViewerViewModel.factory)
){
    val scheduleData by scheduleViewerViewModel.scheduleData.collectAsState()
    if (scheduleViewerViewModel.showSheet) { LessonViewDialog(scheduleViewerViewModel.selectedData,
        scheduleViewerViewModel.lessonDescription, scheduleViewerViewModel) { scheduleViewerViewModel.showSheet = false } }

    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        NavigateToNextScreen(navHostController, scheduleViewerViewModel)
        Scaffold (containerColor = MaterialTheme.colorScheme.background) { _ ->
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
                            SharedPreferencesRepository.onlineEducationSelected = false
                            navHostController.navigate(NavigationScreen.route) { popUpTo(0) }
                        }, onClickRight = {
                            navHostController.navigate(SettingsScreen.route) { popUpTo(0) }
                        }
                    )

                }

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = scheduleViewerViewModel.dayDescription, Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.headlineMedium
                        .copy(
                            color = MaterialTheme.colorScheme.onPrimary,
                            textAlign = TextAlign.Center
                        )
                )

                Spacer(modifier = Modifier.height(6.dp))

                Box(modifier = Modifier.padding(10.dp).height(25.dp).fillMaxSize()) {
                    ScheduleDayController(scheduleViewerViewModel)
                }

                Box(
                    modifier = Modifier.weight(1f).padding(horizontal = 10.dp)
                        .padding(top = 4.dp, bottom = 10.dp)
                ) {
                    if (!scheduleViewerViewModel.scheduleExist.value) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            Spacer(modifier = Modifier.height(40.dp))

                            Icon(
                                painter = painterResource(id = R.drawable.ic_schedule_not_exist),
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.3f),
                                modifier = Modifier.fillMaxHeight(0.2f)
                            )

                            Spacer(modifier = Modifier.height(55.dp))

                            Text(
                                text = Translation.scheduleNotExist,
                                Modifier.fillMaxWidth(),
                                style = MaterialTheme.typography.headlineLarge
                                    .copy(
                                        color = MaterialTheme.colorScheme.onBackground,
                                        textAlign = TextAlign.Center,
                                        fontWeight = FontWeight.Light
                                    )
                            )

                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = stringResource(id = R.string.schedule_not_exist_text),
                                Modifier.fillMaxWidth(),
                                style = MaterialTheme.typography.titleSmall
                                    .copy(
                                        color = MaterialTheme.colorScheme.onBackground,
                                        textAlign = TextAlign.Center,
                                        fontWeight = FontWeight.Light
                                    )
                            )

                            Spacer(modifier = Modifier.weight(1f))

                            Text(
                                text = stringResource(id = R.string.schedule_not_exist_description),
                                Modifier.fillMaxWidth(),
                                style = MaterialTheme.typography.titleSmall
                                    .copy(
                                        color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.7f),
                                        textAlign = TextAlign.Center,
                                        fontWeight = FontWeight.ExtraLight
                                    )
                            )
                        }
                    } else {
                        ScheduleContainer(
                            scheduleData[scheduleViewerViewModel.currentDay],
                            scheduleViewerViewModel
                        )
                    }
                }

                if (scheduleViewerViewModel.areUpdate) {
                    Spacer(modifier = Modifier.height(1.dp))
                }

                Box(
                    Modifier.fillMaxWidth().padding(horizontal = 25.dp)
                        .padding(bottom = 15.dp).height(115.dp)
                ) {
                    ScheduleLoader(scheduleViewerViewModel)
                }
            }
        }
    }
}

@Composable
fun NavigateToNextScreen(navController: NavHostController, viewModel: ScheduleViewerViewModel) {
    val next = viewModel.toNextScreen.collectAsState()
    if (next.value) navController.navigate(ScheduleEditor.route)
}