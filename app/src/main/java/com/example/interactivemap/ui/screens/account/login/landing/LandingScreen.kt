package com.example.interactivemap.ui.screens.account.login.landing

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.interactivemap.R
import com.example.interactivemap.logic.navigation.AccOnboard
import com.example.interactivemap.logic.navigation.AppOnboard
import com.example.interactivemap.logic.navigation.CreatorScreen
import com.example.interactivemap.logic.navigation.EditorScreen
import com.example.interactivemap.logic.navigation.EnterScreen
import com.example.interactivemap.logic.navigation.NavigationScreen
import com.example.interactivemap.logic.navigation.ScheduleViewer
import com.example.interactivemap.ui.resource.button.DefaultButton
import com.example.interactivemap.ui.resource.header.DefaultHeader
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.resource.photo.ProfilePhotoPreview
import com.example.interactivemap.ui.screens.welcome.SplashScreenViewModel
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun LandingScreen(navHostController: NavHostController, landingViewModel: LandingScreenViewModel = viewModel()){
    NavigateToNextScreen(navHostController, landingViewModel)
    InteractiveMapTheme { val borderRadius = 15.dp
        Column (modifier = Modifier.fillMaxSize().padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ){
            Box(modifier = Modifier.height(50.dp).fillMaxWidth()
                .then(ShadowMaterial.CustomShadow.createModifier
                        (borderRadius, MaterialTheme.colorScheme.tertiaryContainer))
                .then(ShadowMaterial.CustomReShadow.createModifier
                        (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer))
            ){
                DefaultHeader(titleId = R.string.account, leftImgId = R.drawable.ic_prew_page,
                    rightImgId = R.drawable.ic_information, onClickLeft = {
                        navHostController.navigate(
                            if (!landingViewModel.onlineEducation)
                                NavigationScreen.route
                            else ScheduleViewer.route) { popUpTo(0) }
                    }, onClickRight = {
                        navHostController.navigate(AccOnboard.route) {}
                    })
            }

            Spacer(modifier = Modifier.height(80.dp))

            Box(modifier = Modifier.size(240.dp)
                .then(ShadowMaterial.CustomShadow.createModifier
                        (200.dp, MaterialTheme.colorScheme.tertiaryContainer))
                .then(ShadowMaterial.CustomReShadow.createModifier
                        (200.dp, MaterialTheme.colorScheme.onTertiaryContainer))
            ) {
                ProfilePhotoPreview()
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = stringResource(id = R.string.user_not_auth), Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.headlineLarge
                    .copy(color = MaterialTheme.colorScheme.onBackground, textAlign = TextAlign.Center)
            )

            Spacer(modifier = Modifier.height(25.dp))

            Text(text = stringResource(id = R.string.you_might), Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.headlineSmall
                    .copy(color = MaterialTheme.colorScheme.onBackground, textAlign = TextAlign.Center)
            )

            Spacer(modifier = Modifier.height(18.dp))

            Box(modifier = Modifier.height(50.dp).fillMaxWidth(0.7f)
                .then(ShadowMaterial.CustomShadow.createModifier
                        (borderRadius, MaterialTheme.colorScheme.tertiaryContainer))
                .then(ShadowMaterial.CustomReShadow.createModifier
                        (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer))
            ) {
                DefaultButton(buttonColor = MaterialTheme.colorScheme.onBackground,
                    textString = stringResource(id = R.string.enter), borderRadius,
                    textStyle = MaterialTheme.typography.headlineLarge.copy(
                        color = MaterialTheme.colorScheme.background, fontWeight = FontWeight.Light)
                ) { navHostController.navigate(EnterScreen.route) {} }
            }

            Spacer(modifier = Modifier.height(25.dp))

            Text(text = stringResource(id = R.string.or), Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.headlineSmall
                    .copy(color = MaterialTheme.colorScheme.onBackground, textAlign = TextAlign.Center)
            )

            Spacer(modifier = Modifier.height(25.dp))

            Box(modifier = Modifier.height(50.dp).fillMaxWidth(0.7f)
                .then(ShadowMaterial.CustomShadow.createModifier
                        (borderRadius, MaterialTheme.colorScheme.tertiaryContainer))
                .then(ShadowMaterial.CustomReShadow.createModifier
                        (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer))
            ) {
                DefaultButton(buttonColor = MaterialTheme.colorScheme.onBackground,
                    textString = stringResource(id = R.string.register), borderRadius,
                    textStyle = MaterialTheme.typography.headlineLarge.copy(
                        color = MaterialTheme.colorScheme.background, fontWeight = FontWeight.Light)
                ) { navHostController.navigate(CreatorScreen.route) {} }
            }

            Spacer(modifier = Modifier.weight(1f))

            Box(Modifier.fillMaxWidth().padding(bottom = 10.dp), contentAlignment = Alignment.Center){
                Text(text = stringResource(id = R.string.authorization_preview), Modifier.clickable {
                        navHostController.navigate(AccOnboard.route){}
                    }, style = MaterialTheme.typography.headlineMedium.copy(
                            color = MaterialTheme.colorScheme.onBackground, textAlign = TextAlign.Center),
                )
            }
        }
    }
}

@Composable
fun NavigateToNextScreen(navController: NavHostController,
                         landingViewModel: LandingScreenViewModel) {
    val authorized = landingViewModel.isAuthorize.collectAsState()
    if (authorized.value) navController.navigate(EditorScreen.route) { popUpTo(0) }
}

@Preview
@Composable
fun LandingPreview(){
    LandingScreen(navHostController = rememberNavController())
}