package com.example.interactivemap.logic.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.interactivemap.ui.screens.account.creator.CreatorScreen
import com.example.interactivemap.ui.screens.account.editor.EditorScreen
import com.example.interactivemap.ui.screens.account.login.enter.EnterScreen
import com.example.interactivemap.ui.screens.account.login.landing.LandingScreen
import com.example.interactivemap.ui.screens.account.table.TableViewerScreen
import com.example.interactivemap.ui.screens.navigation.NavigationScreen
import com.example.interactivemap.ui.screens.schedule.editor.ScheduleEditorScreen
import com.example.interactivemap.ui.screens.schedule.viewer.ScheduleViewerScreen
import com.example.interactivemap.ui.screens.settings.SettingsScreen
import com.example.interactivemap.ui.screens.welcome.SplashScreen
import com.example.interactivemap.ui.screens.welcome.onboarding.account.AccountOnboarding
import com.example.interactivemap.ui.screens.welcome.onboarding.all_app.ApplicationOnboarding

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun AppNavigationGraph (navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = Splash.route) {
        composable(Splash.route){ SplashScreen(navHostController = navHostController)}
        composable(AppOnboard.route){ ApplicationOnboarding(navHostController = navHostController) }
        composable(AccOnboard.route){ AccountOnboarding(navHostController = navHostController) }
        composable(NavigationScreen.route){ NavigationScreen(navHostController = navHostController) }
        composable(AccountCreator.route){ CreatorScreen(navHostController = navHostController) }
        composable(SettingsScreen.route){ SettingsScreen(navHostController = navHostController) }
        composable(LandingScreen.route){ LandingScreen(navHostController = navHostController) }
        composable(EnterScreen.route){ EnterScreen(navHostController = navHostController) }
        composable(ScheduleViewer.route){ ScheduleViewerScreen(navHostController = navHostController) }
        composable(ScheduleEditor.route){ ScheduleEditorScreen(navHostController = navHostController) }
        composable(CreatorScreen.route){ CreatorScreen(navHostController = navHostController) }
        composable(EditorScreen.route){ EditorScreen(navHostController = navHostController) }
        composable(TableScreen.route){ TableViewerScreen(navHostController = navHostController) }
    }
}


