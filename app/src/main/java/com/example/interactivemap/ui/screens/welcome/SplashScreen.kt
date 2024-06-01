package com.example.interactivemap.ui.screens.welcome

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.os.Build
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.navigation.AppOnboard
import com.example.interactivemap.logic.navigation.NavigationScreen
import com.example.interactivemap.logic.navigation.ScheduleEditor
import com.example.interactivemap.logic.navigation.ScheduleViewer
import com.example.interactivemap.ui.dialogs.ConfirmationDialog
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.MultiplePermissionsState
import com.google.accompanist.permissions.rememberMultiplePermissionsState


@RequiresApi(Build.VERSION_CODES.Q)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SplashScreen(navHostController: NavHostController){
    NavigateToNextScreen(navHostController)
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
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

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun NavigateToNextScreen(navController: NavHostController,
    splashViewModel: SplashScreenViewModel = viewModel()) {
    val loading = splashViewModel.loading.collectAsState()
    val activity = LocalContext.current as Activity
    var afterGrant by remember { mutableStateOf(false) }


    val multiplePermissionsState = rememberMultiplePermissionsState(
        listOf(
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION,
        )
    )

    if (splashViewModel.permissionGrantedDialogShown) { ConfirmationDialog(
        titleRes = R.string.permission, textRes = R.string.permission_description,
        dismissRes = R.string.permission_denied, confirmRes = if (!afterGrant) R.string.permission_grant else R.string.permission_check,
        reverseColors = true,
        onDismiss = {
            splashViewModel.permissionGrantedDialogShown = false
            if (!multiplePermissionsState.allPermissionsGranted) activity.finish()
        }, onConfirm = {
            afterGrant = !afterGrant
            splashViewModel.permissionGrantedDialogShown = false
            if (multiplePermissionsState.allPermissionsGranted) splashViewModel.onPermissionGranted(true)
            else multiplePermissionsState.launchMultiplePermissionRequest()
        })
    }

    if (!multiplePermissionsState.allPermissionsGranted){
        splashViewModel.onPermissionDenied()
    } else {
        splashViewModel.onPermissionGranted(false)
    }

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
