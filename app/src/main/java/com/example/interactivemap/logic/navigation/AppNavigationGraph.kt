package com.example.interactivemap.logic.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.interactivemap.ui.screens.landings.SplashScreen

@Composable
fun AppNavigationGraph (navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = Splash.route) {
        composable(Splash.route){ SplashScreen(navHostController = navHostController)}
    }
}