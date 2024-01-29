package com.example.interactivemap.logic.navigation

interface NavigationDestinations {
    val route: String
}

// All app navigation
object Splash : NavigationDestinations {
    override val route = "Splash" }

object AppOnboard : NavigationDestinations {
    override val route = "AppOnboard" }

object ScheduleViewer : NavigationDestinations {
    override val route = "ScheduleViewer" }

object LandingScreen : NavigationDestinations {
    override val route = "LandingScreen" }

object EnterScreen : NavigationDestinations {
    override val route = "EnterScreen" }

object AccOnboard : NavigationDestinations {
    override val route = "AccOnboard" }

object AccountCreator : NavigationDestinations {
    override val route = "AccountCreator" }

object NavigationScreen : NavigationDestinations {
    override val route = "NavigationScreen" }

object SettingsScreen : NavigationDestinations {
    override val route = "SettingsScreen" }

object CreatorScreen : NavigationDestinations {
    override val route = "CreatorScreen" }
object EditorScreen : NavigationDestinations {
    override val route = "EditorScreen" }
