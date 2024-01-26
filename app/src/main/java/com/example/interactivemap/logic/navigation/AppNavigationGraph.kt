package com.example.interactivemap.logic.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.interactivemap.ui.screens.account.creator.CreatorScreen
import com.example.interactivemap.ui.screens.navigation.NavigationScreen
import com.example.interactivemap.ui.screens.welcome.SplashScreen
import com.example.interactivemap.ui.screens.welcome.onboarding.account.AccountOnboarding
import com.example.interactivemap.ui.screens.welcome.onboarding.all_app.ApplicationOnboarding

@Composable
fun AppNavigationGraph (navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = Splash.route) {
        composable(Splash.route){ SplashScreen(navHostController = navHostController)}
        composable(AppOnboard.route){ ApplicationOnboarding(navHostController = navHostController) }
        composable(AccOnboard.route){ AccountOnboarding(navHostController = navHostController) }
        composable(NavigationScreen.route){ NavigationScreen(navHostController = navHostController) }
        composable(AccountCreator.route){ CreatorScreen(navHostController = navHostController) }
    }
}