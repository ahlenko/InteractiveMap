package com.example.interactivemap.ui.screens.settings

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.interactivemap.R
import com.example.interactivemap.logic.navigation.AppOnboard
import com.example.interactivemap.logic.navigation.LandingScreen
import com.example.interactivemap.logic.navigation.NavigationScreen
import com.example.interactivemap.logic.navigation.ScheduleViewer
import com.example.interactivemap.ui.resource.button.DropDownRowButton
import com.example.interactivemap.ui.resource.button.SwitchRowButton
import com.example.interactivemap.ui.resource.fields.IconTextRow
import com.example.interactivemap.ui.resource.header.DefaultHeader
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import com.maxkeppeker.sheets.core.models.base.rememberUseCaseState
import com.maxkeppeler.sheets.list.ListDialog
import com.maxkeppeler.sheets.list.models.ListSelection


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(navHostController: NavHostController,
    settingsViewModel: SettingsViewModel = viewModel()
){
    val languageSelected = settingsViewModel.languageSelected.collectAsState()
    val distanceSelected = settingsViewModel.distanceSelected.collectAsState()
    val intervalSelected = settingsViewModel.intervalSelected.collectAsState()

    val pointsViewDistanceList = settingsViewModel.pointsViewDistanceList.collectAsState()
    val updateIntervalList = settingsViewModel.updateIntervalList.collectAsState()
    val languageList = settingsViewModel.languageList.collectAsState()

    val languageDialogState = rememberUseCaseState()
    val distanceDialogState = rememberUseCaseState()
    val timeIntervalDialogState = rememberUseCaseState()

    ListDialog(
        state = languageDialogState,
        selection = ListSelection.Single( showRadioButtons = true,
            options = languageList.value
        ) { _, option ->
            settingsViewModel.onLanguageChanged(option)
        }
    )

    ListDialog(
        state = distanceDialogState,
        selection = ListSelection.Single(showRadioButtons = true,
            options = pointsViewDistanceList.value
        ) { _, option ->
            settingsViewModel.onDistanceChanged(option)
        }
    )

    ListDialog(
        state = timeIntervalDialogState,
        selection = ListSelection.Single( showRadioButtons = true,
            options = updateIntervalList.value
        ) { _, option ->
            settingsViewModel.onTimeIntervalChanged(option)
        }
    )

    val fullScreen = true
    val spacerInterval = 4.dp

    InteractiveMapTheme {
        Column (modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ){
            Box(modifier = Modifier.height(50.dp).fillMaxWidth()
                .then(ShadowMaterial.CustomShadow.createModifier
                        (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                .then(ShadowMaterial.CustomReShadow.createModifier
                        (5.dp, MaterialTheme.colorScheme.onTertiaryContainer))
            ){
                DefaultHeader(titleId = R.string.settings, leftImgId = R.drawable.ic_prew_page,
                    rightImgId = R.drawable.ic_account, onClickLeft = {
                        navHostController.navigate(NavigationScreen.route) { popUpTo(0) }
                    }, onClickRight = {
                        navHostController.navigate(LandingScreen.route) { popUpTo(0) }
                    })
            }

            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = stringResource(id = R.string.general), Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.headlineMedium
                    .copy(color = MaterialTheme.colorScheme.onPrimary, textAlign = TextAlign.Center)
            )

            Spacer(modifier = Modifier.height(spacerInterval))

            Row (modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .clickable { languageDialogState.show() },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
                ){
                Box(modifier = Modifier.weight(1f)){
                    IconTextRow(imageId = R.drawable.ic_language, textId = R.string.language) }
                DropDownRowButton(text = languageSelected.value)
            }

            Spacer(modifier = Modifier.height(spacerInterval))

            Row (modifier = Modifier
                .fillMaxWidth().height(50.dp)
                .clickable { settingsViewModel.onSystemThemeChanged() },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Box(modifier = Modifier.weight(1f)){
                IconTextRow(imageId = R.drawable.ic_theme, textId = R.string.dark_theme)}
                SwitchRowButton(state = settingsViewModel.darkThemeSelected)
            }

            Spacer(modifier = Modifier.height(spacerInterval))

            Row (modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .clickable { settingsViewModel.onEducationTypeChanged() },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Box(modifier = Modifier.weight(1f)){
                IconTextRow(imageId = R.drawable.ic_distant, textId = R.string.online_education)}
                SwitchRowButton(state = settingsViewModel.onlineEducation)
            }

            Spacer(modifier = Modifier.height(spacerInterval))

            Row (modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .clickable {  navHostController.navigate(AppOnboard.route) { popUpTo(0) }},
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Box(modifier = Modifier.weight(1f)){
                IconTextRow(imageId = R.drawable.ic_demo, textId = R.string.view_demo)}
                Text(text = ">>", style = MaterialTheme.typography.headlineLarge
                    .copy(color = MaterialTheme.colorScheme.onPrimary),
                    modifier = Modifier.padding(end = 8.dp))
            }

            if (settingsViewModel.onlineEducation.value){
                Spacer(modifier = Modifier.height(spacerInterval))

                Text(
                    text = stringResource(id = R.string.geolocation), Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.headlineMedium
                        .copy(color = MaterialTheme.colorScheme.onPrimary, textAlign = TextAlign.Center),
                )

                Spacer(modifier = Modifier.height(spacerInterval))

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { settingsViewModel.onTranslationStateChanged() },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Box(modifier = Modifier.weight(1f)){
                    IconTextRow(imageId = R.drawable.ic_translation, textId = R.string.translation_geo)}
                    SwitchRowButton(state = settingsViewModel.translationGeo)
                }

                Spacer(modifier = Modifier.height(spacerInterval))

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { distanceDialogState.show() },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Box(modifier = Modifier.weight(1f)){
                    IconTextRow(imageId = R.drawable.ic_map_view, textId = R.string.point_view)}
                    DropDownRowButton(text = distanceSelected.value)
                }

                Spacer(modifier = Modifier.height(spacerInterval))

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { timeIntervalDialogState.show() },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Box(modifier = Modifier.weight(1f)){
                    IconTextRow(imageId = R.drawable.ic_interval, textId = R.string.update_interval)}
                    DropDownRowButton(text = intervalSelected.value)
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                Text(
                    text = stringResource(id = R.string.to_main_page), Modifier.clickable {
                        settingsViewModel.openUrlInBrowser()
                    },
                    style = MaterialTheme.typography.headlineMedium
                        .copy(
                            color = MaterialTheme.colorScheme.onBackground,
                            textAlign = TextAlign.Center
                        ),
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = stringResource(id = R.string.version), Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.headlineSmall
                    .copy(
                        color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.6f),
                        textAlign = TextAlign.Center
                    ),
            )
        }
    }
}

@Preview
@Composable
fun ScheduleViewerScreenPreview(){
    SettingsScreen(rememberNavController())
}
