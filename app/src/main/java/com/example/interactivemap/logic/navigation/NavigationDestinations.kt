package com.example.interactivemap.logic.navigation

interface NavigationDestinations {
    val route: String
}

// All app navigation
object Splash : NavigationDestinations {
    override val route = "Splash" }

object AppOnboard : NavigationDestinations {
    override val route = "AppOnboard" }

object AccOnboard : NavigationDestinations {
    override val route = "AccOnboard" }

object AccountCreator : NavigationDestinations {
    override val route = "AccountCreator" }

object NavigationScreen : NavigationDestinations {
    override val route = "NavigationScreen" }
