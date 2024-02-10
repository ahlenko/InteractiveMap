package com.example.interactivemap.ui.screens.schedule.editor

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.interactivemap.logic.navigation.LandingScreen
import com.example.interactivemap.logic.navigation.NavigationScreen
import com.example.interactivemap.ui.resource.schedule.ScheduleDayController
import com.example.interactivemap.ui.resource.schedule.ScheduleEditor
import com.example.interactivemap.ui.resource.header.DefaultHeader
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.resource.schedule.ScheduleContainer
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun ScheduleEditorScreen(navHostController: NavHostController,
    scheduleEditorViewModel: ScheduleEditorViewModel = viewModel(
        factory = ScheduleEditorViewModel.factory)
){
    val type: Int = 0

    InteractiveMapTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Box(
                modifier = Modifier.padding(15.dp).height(50.dp).fillMaxWidth()
                    .then(ShadowMaterial.CustomShadow.createModifier
                            (5.dp, MaterialTheme.colorScheme.tertiaryContainer)
                    ).then(ShadowMaterial.CustomReShadow.createModifier
                            (5.dp, MaterialTheme.colorScheme.onTertiaryContainer))
            ) {
                DefaultHeader(titleId = R.string.schedule, leftImgId = R.drawable.ic_prew_page,
                    rightImgId = R.drawable.ic_account, onClickLeft = {
                        navHostController.navigate(NavigationScreen.route) { popUpTo(0) }
                    }, onClickRight = {
                        navHostController.navigate(LandingScreen.route) { popUpTo(0) }
                    })
            }

            Spacer(modifier = Modifier.height(15.dp))

            Text(text = stringResource(
                id = when (type){
                    0 -> R.string.create
                    1 -> R.string.edit
                    else -> R.string.recover
                }

            ), Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.headlineMedium
                    .copy(color = MaterialTheme.colorScheme.onPrimary, textAlign = TextAlign.Center)
            )

            Spacer(modifier = Modifier.height(15.dp))

            Box(modifier = Modifier
                .padding(10.dp)
                .height(25.dp)
                .fillMaxSize()){
                ScheduleDayController(isActive = true, daySelected = 1)
            }

            Box(modifier = Modifier.weight(1f).padding(horizontal = 10.dp).padding(top = 4.dp, bottom = 10.dp)){
                ScheduleContainer ()
            }

            Box(
                Modifier.fillMaxWidth().padding(horizontal = 25.dp)
                    .padding(bottom = 15.dp).height(115.dp)
            ) {
                ScheduleEditor()
            }
        }
    }
}

@Preview
@Composable
fun ScheduleLoaderPreview(){
    ScheduleEditorScreen(rememberNavController())
}