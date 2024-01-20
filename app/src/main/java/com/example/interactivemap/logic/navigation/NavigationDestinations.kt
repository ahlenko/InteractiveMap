package com.example.interactivemap.logic.navigation

interface NavigationDestinations {
    val route: String
}

// All app navigation
object Splash : NavigationDestinations {
    override val route = "Splash" }
