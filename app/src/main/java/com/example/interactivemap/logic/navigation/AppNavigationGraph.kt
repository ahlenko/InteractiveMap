package com.example.interactivemap.logic.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.interactivemap.ui.screens.navigation.NavigationScreen
import com.example.interactivemap.ui.screens.schedule.editor.ScheduleEditorScreen
import com.example.interactivemap.ui.screens.schedule.viewer.ScheduleViewerScreen
import com.example.interactivemap.ui.screens.settings.SettingsScreen
import com.example.interactivemap.ui.screens.welcome.SplashScreen
import com.example.interactivemap.ui.screens.welcome.onboarding.ApplicationOnboarding

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun AppNavigationGraph (navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = Splash.route) {
        composable(Splash.route){ SplashScreen(navHostController = navHostController)}
        composable(AppOnboard.route){ ApplicationOnboarding(navHostController = navHostController) }
        composable(NavigationScreen.route){ NavigationScreen(navHostController = navHostController) }
        composable(SettingsScreen.route){ SettingsScreen(navHostController = navHostController) }
        composable(ScheduleViewer.route){ ScheduleViewerScreen(navHostController = navHostController) }
        composable(ScheduleEditor.route){ ScheduleEditorScreen(navHostController = navHostController) }
    }
}


