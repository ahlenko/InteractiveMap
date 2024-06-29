package com.example.interactivemap.logic.navigation

interface NavigationDestinations {
    val route: String
}

object Splash : NavigationDestinations {
    override val route = "Splash" }

object AppOnboard : NavigationDestinations {
    override val route = "AppOnboard" }

object ScheduleViewer : NavigationDestinations {
    override val route = "ScheduleViewer" }

object ScheduleEditor : NavigationDestinations {
    override val route = "ScheduleEditor" }

object NavigationScreen : NavigationDestinations {
    override val route = "NavigationScreen" }

object SettingsScreen : NavigationDestinations {
    override val route = "SettingsScreen" }