package com.example.interactivemap.ui.resource.material

import android.annotation.SuppressLint
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed class ShadowMaterial(private val borderRadius: Dp, private val blurRadius: Dp,
    private val offsetY: Dp, private val offsetX: Dp, private val spread: Dp,
    private val modifier: Modifier = Modifier) {

    @SuppressLint("ModifierFactoryExtensionFunction")
    fun ShadowMaterial.createModifier(color: Color): Modifier {
        return modifier.shadow( color = color,
            borderRadius = borderRadius, blurRadius = blurRadius,
            offsetY = offsetY, offsetX = offsetX, spread = spread
        )
    }
}