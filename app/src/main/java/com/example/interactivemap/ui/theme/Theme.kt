package com.example.interactivemap.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LightColorScheme = lightColorScheme(
    background = AppColorsLight.background,
    onBackground = AppColorsLight.onBackground,
    onTertiary = AppColorsLight.onTertiary,
    tertiaryContainer = AppColorsLight.shadow,
    onTertiaryContainer = AppColorsLight.reShadow,
    onPrimary = AppColorsLight.onPrimary,
    onPrimaryContainer = AppColorsLight.mountainGray,
    onSecondary = AppColorsLight.gray,
    onSecondaryContainer = AppColorsLight.mountainGray100,
    onError = AppColorsLight.red,
    onErrorContainer = AppColorsLight.pink,
    surfaceDim = AppColorsLight.dark
)

private val DarkColorScheme = darkColorScheme(
    background = AppColorsDark.background,
    onBackground = AppColorsDark.onBackground,
    onTertiary = AppColorsDark.onTertiary,
    tertiaryContainer = AppColorsDark.shadow,
    onTertiaryContainer = AppColorsDark.reShadow,
    onPrimary = AppColorsDark.onPrimary,
    onPrimaryContainer = AppColorsDark.mountainGray,
    onSecondary = AppColorsDark.gray,
    onSecondaryContainer = AppColorsDark.mountainGray100,
    onError = AppColorsDark.red,
    onErrorContainer = AppColorsDark.pink,
    surfaceDim = AppColorsDark.dark
)

@Composable
fun InteractiveMapTheme(darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true, content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> { LocalContext.current
            if (darkTheme) DarkColorScheme else LightColorScheme }
        darkTheme -> DarkColorScheme else -> LightColorScheme }

    val view = LocalView.current

    if (!view.isInEditMode) { SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.onBackground.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme } }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content)
}