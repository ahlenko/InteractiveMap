package com.example.interactivemap.ui.screens.account.login.enter

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
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
import com.example.interactivemap.logic.navigation.AccOnboard
import com.example.interactivemap.logic.navigation.AppOnboard
import com.example.interactivemap.logic.navigation.CreatorScreen
import com.example.interactivemap.logic.navigation.EditorScreen
import com.example.interactivemap.logic.navigation.LandingScreen
import com.example.interactivemap.logic.navigation.NavigationScreen
import com.example.interactivemap.logic.navigation.ScheduleViewer
import com.example.interactivemap.ui.resource.button.DefaultButton
import com.example.interactivemap.ui.resource.fields.EmailField
import com.example.interactivemap.ui.resource.fields.PasswordField
import com.example.interactivemap.ui.resource.header.DefaultHeader
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.resource.photo.ProfilePhotoPreview
import com.example.interactivemap.ui.screens.welcome.SplashScreenViewModel
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun EnterScreen(navHostController: NavHostController,
    enterViewModel: EnterViewModel = viewModel()
){
    NavigateToNextScreen(navHostController, enterViewModel)

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
                DefaultHeader(titleId = R.string.enter_title, leftImgId = R.drawable.ic_prew_page,
                    rightImgId = R.drawable.ic_information, onClickLeft = {
                        navHostController.navigate(LandingScreen.route) { popUpTo(0) }
                    }, onClickRight = {
                        navHostController.navigate(AccOnboard.route) {}
                    })
            }

            Spacer(modifier = Modifier.height(55.dp))

            Column (
                Modifier.fillMaxWidth().padding(bottom = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ){
                Icon(painter = painterResource(id = R.drawable.ic_logo),
                    tint = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.size(175.dp), contentDescription = null)
                androidx.compose.material.Text(
                    stringResource(id = R.string.un_name),
                    style = MaterialTheme.typography.titleLarge.copy(
                        MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.Normal
                    ),
                    modifier = Modifier.padding(top = 10.dp)
                )
                androidx.compose.material.Text(
                    stringResource(id = R.string.app_description),
                    style = MaterialTheme.typography.titleMedium.copy(
                        MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.Normal
                    ),
                    modifier = Modifier.padding(top = 20.dp)
                )
            }

            Text(text = stringResource(id = R.string.enter_description), Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.headlineLarge
                    .copy(color = MaterialTheme.colorScheme.onBackground, textAlign = TextAlign.Center)
            )

            Spacer(modifier = Modifier.height(25.dp))

            Box(modifier = Modifier.fillMaxWidth(0.68f)){
                Text(text = stringResource(id = R.string.email), Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.headlineSmall
                        .copy(color = if (enterViewModel.emailError || enterViewModel.emailOrPasswordError)
                            MaterialTheme.colorScheme.onError
                        else MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.7f), textAlign = TextAlign.Left)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Box(modifier = Modifier.fillMaxWidth(0.75f).height(60.dp)){
                EmailField(text = enterViewModel.enteredEmail, MaterialTheme.typography.headlineMedium
                    .copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.85f)))
            }

            Spacer(modifier = Modifier.height(12.dp))

            Box(modifier = Modifier.fillMaxWidth(0.68f)){
                Text(text = stringResource(id = R.string.password), Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.headlineSmall
                        .copy(color = if (enterViewModel.emailOrPasswordError || enterViewModel.passwordError)
                            MaterialTheme.colorScheme.onError
                        else MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.7f), textAlign = TextAlign.Left)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Box(modifier = Modifier.fillMaxWidth(0.75f).height(60.dp)){
                PasswordField(text = enterViewModel.enteredPassword, MaterialTheme.typography.headlineMedium
                    .copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.85f)))
            }

            Spacer(modifier = Modifier.height(20.dp))

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
                ) { if(!enterViewModel.blockEnter) enterViewModel.checkEnterData() }
            }

            Spacer(modifier = Modifier.height(25.dp))

            Text(text = stringResource(id = R.string.return_back),
                Modifier.fillMaxWidth()
                    .clickable { navHostController.navigate(LandingScreen.route) { popUpTo(0) } },
                style = MaterialTheme.typography.headlineSmall
                    .copy(color = MaterialTheme.colorScheme.onBackground, textAlign = TextAlign.Center)
            )

            Spacer(modifier = Modifier.weight(1f))

            Box(
                Modifier.fillMaxWidth()
                    .padding(bottom = 10.dp), contentAlignment = Alignment.Center){
                Text(text = stringResource(id = R.string.authorization_preview), Modifier.clickable {
                    navHostController.navigate(AccOnboard.route){ popUpTo(0)}
                }, style = MaterialTheme.typography.headlineMedium.copy(
                    color = MaterialTheme.colorScheme.onBackground, textAlign = TextAlign.Center),
                )
            }
        }
    }
}

@Composable
fun NavigateToNextScreen(navController: NavHostController,
                         enterViewModel: EnterViewModel) {
    val enteredApproved = enterViewModel.enteredApproved.collectAsState()
    if (enteredApproved.value) navController.navigate(EditorScreen.route) { popUpTo(0) }

}

@Preview
@Composable
fun EnterScreenPreview(){
    EnterScreen(rememberNavController())
}