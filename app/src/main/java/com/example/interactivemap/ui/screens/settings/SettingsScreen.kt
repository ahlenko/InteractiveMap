package com.example.interactivemap.ui.screens.settings

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.navigation.AppOnboard
import com.example.interactivemap.logic.navigation.NavigationScreen
import com.example.interactivemap.logic.navigation.ScheduleViewer
import com.example.interactivemap.logic.util.SharedPreferencesRepository
import com.example.interactivemap.ui.resource.button.DropDownRowButton
import com.example.interactivemap.ui.resource.button.SwitchRowButton
import com.example.interactivemap.ui.resource.fields.IconTextRow
import com.example.interactivemap.ui.resource.header.DefaultHeader
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import com.example.interactivemap.ui.translations.Tr
import com.maxkeppeker.sheets.core.models.base.rememberUseCaseState
import com.maxkeppeler.sheets.list.ListDialog
import com.maxkeppeler.sheets.list.models.ListSelection

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(navHostController: NavHostController,
    settingsViewModel: SettingsViewModel = viewModel()
){
    val languageList by settingsViewModel.languageList.collectAsState()
    val languageSelected by settingsViewModel.languageSelected.collectAsState()
    val languageDialogState = rememberUseCaseState()
    val context = LocalContext.current

    if (!ThisApplication.getInstance().darkThemeSelected){
        MaterialTheme{
            ListDialog(
                state = languageDialogState,
                selection = ListSelection.Single( showRadioButtons = true,
                    options = languageList
                ) { _, option ->
                    settingsViewModel.onLanguageChanged(option)
                }
            )
        }
    } else {
        InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected){
            ListDialog(
                state = languageDialogState,
                selection = ListSelection.Single( showRadioButtons = true,
                    options = languageList
                ) { _, option ->
                    settingsViewModel.onLanguageChanged(option)
                }
            )
        }
    }

    val spacerInterval = 4.dp

    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Scaffold (containerColor = MaterialTheme.colorScheme.background) { _ ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 15.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Box(
                    modifier = Modifier
                        .padding(horizontal = 15.dp)
                        .height(50.dp)
                        .fillMaxWidth()
                        .then(
                            ShadowMaterial.CustomShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.tertiaryContainer)
                        )
                        .then(
                            ShadowMaterial.CustomReShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.onTertiaryContainer)
                        )
                ) {
                    DefaultHeader(titleId = Tr.settings, leftImgId = R.drawable.ic_prew_page,
                        rightImgId = R.drawable.ic_schedule_mini, onClickLeft = {
                            navHostController.navigate(
                                if (!settingsViewModel.onlineEducation)
                                    NavigationScreen.route
                                else ScheduleViewer.route
                            ) { popUpTo(0) }
                        }, onClickRight = {
                            navHostController.navigate(ScheduleViewer.route) { popUpTo(0) }
                        })
                }

                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    text = Tr.general, Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.headlineMedium
                        .copy(
                            color = MaterialTheme.colorScheme.onPrimary,
                            textAlign = TextAlign.Center
                        )
                )

                Spacer(modifier = Modifier.height(spacerInterval))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .clickable { languageDialogState.show() },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(modifier = Modifier
                        .padding(start = 15.dp)
                        .weight(1f)) {
                        IconTextRow(
                            imageId = R.drawable.ic_language, textId = Tr.language,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    }
                    Box (
                        modifier = Modifier.padding(end = 15.dp)
                    ) {
                        DropDownRowButton(text = languageSelected)
                    }
                }

                Spacer(modifier = Modifier.height(spacerInterval))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .clickable { settingsViewModel.onSystemThemeChanged() },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(modifier = Modifier
                        .padding(start = 15.dp)
                        .weight(1f)) {
                        IconTextRow(
                            imageId = R.drawable.ic_theme, textId = Tr.dark_theme,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    }
                    Box (
                        modifier = Modifier.padding(end = 15.dp)
                    ) {
                        SwitchRowButton(state = settingsViewModel.darkThemeSelected) {
                            ThisApplication.getInstance().darkThemeSelected =
                                !settingsViewModel.darkThemeSelected
                            settingsViewModel.onSystemThemeChanged()
                        }
                    }
                }

                Spacer(modifier = Modifier.height(spacerInterval))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .clickable { settingsViewModel.onEducationTypeChanged() },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(modifier = Modifier
                        .padding(start = 15.dp)
                        .weight(1f)) {
                        IconTextRow(
                            imageId = R.drawable.ic_distant, textId = Tr.online_education,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    }
                    Box (
                        modifier = Modifier.padding(end = 15.dp)
                    ){
                        SwitchRowButton(state = settingsViewModel.onlineEducation)
                        { settingsViewModel.onEducationTypeChanged() }
                    }

                }

                Spacer(modifier = Modifier.height(spacerInterval))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .clickable { navHostController.navigate(AppOnboard.route) { popUpTo(0) } },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(modifier = Modifier
                        .padding(start = 15.dp)
                        .weight(1f)) {
                        IconTextRow(
                            imageId = R.drawable.ic_demo, textId = Tr.view_demo,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    }
                    Text(
                        text = ">>", style = MaterialTheme.typography.headlineLarge
                            .copy(color = MaterialTheme.colorScheme.onPrimary),
                        modifier = Modifier.padding(end = 23.dp)
                    )
                }

                Spacer(modifier = Modifier.weight(1f))

                Box(
                    Modifier
                        .height(50.dp)
                        .clip(RoundedCornerShape(6.dp))
                        .clickable {
                            settingsViewModel.openUrlInBrowser()
                        }, contentAlignment = Alignment.Center) {
                    Text(
                        text = Tr.to_main_page,
modifier = Modifier.padding(horizontal = 14.dp),
                        style = MaterialTheme.typography.headlineMedium
                            .copy(
                                color = MaterialTheme.colorScheme.onBackground,
                                textAlign = TextAlign.Center
                            ),
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = settingsViewModel.getAppVersion(context = context) ?: Tr.version, Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.headlineSmall
                        .copy(
                            color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.6f),
                            textAlign = TextAlign.Center
                        ),
                )
            }
        }
    }
}

@Preview
@Composable
fun ScheduleViewerScreenPreview(){
    SettingsScreen(rememberNavController())
}
