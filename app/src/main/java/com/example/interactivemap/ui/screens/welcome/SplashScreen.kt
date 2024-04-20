package com.example.interactivemap.ui.screens.welcome

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.interactivemap.R
import com.example.interactivemap.logic.navigation.AppOnboard
import com.example.interactivemap.logic.navigation.NavigationScreen
import com.example.interactivemap.logic.navigation.ScheduleEditor
import com.example.interactivemap.logic.navigation.ScheduleViewer
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SplashScreen(navHostController: NavHostController){
    NavigateToNextScreen(navHostController)
    InteractiveMapTheme {
        Scaffold (containerColor = MaterialTheme.colorScheme.background){ _ ->
            Column (Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Column (
                    Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .padding(bottom = 25.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Icon(painter = painterResource(id = R.drawable.ic_logo),
                        tint = MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier.size(175.dp), contentDescription = null)
                    Text(stringResource(id = R.string.un_name),
                        style = MaterialTheme.typography.titleLarge.copy(
                            MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.Normal),
                        modifier = Modifier.padding(top = 10.dp))
                    Text(stringResource(id = R.string.app_description),
                        style = MaterialTheme.typography.titleMedium.copy(
                            MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.Normal),
                        modifier = Modifier.padding(top = 20.dp))
                }

                Text(stringResource(id = R.string.un_site),
                    style = MaterialTheme.typography.titleMedium.copy(
                        MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.Normal),
                    modifier = Modifier.padding(vertical = 10.dp))
            }
        }

    }
}

@Composable
fun NavigateToNextScreen(navController: NavHostController,
    splashViewModel: SplashScreenViewModel = viewModel()) {
    val loading = splashViewModel.loading.collectAsState()
    if (!loading.value) {
        if (splashViewModel.isFromMassage){
            navController.navigate(ScheduleEditor.route) { popUpTo(0) }
        } else if (!splashViewModel.isSecondEnter)
            navController.navigate(AppOnboard.route) { popUpTo(0) }
        else if(!splashViewModel.onlineEducation)
            navController.navigate(NavigationScreen.route) { popUpTo(0) }
        else navController.navigate(ScheduleViewer.route) { popUpTo(0) }
    }
}

@Preview
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}