package com.example.interactivemap.ui.resource.material

import android.annotation.SuppressLint
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.asAndroidPath
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
class CustomButtonShape : Shape {
    @SuppressLint("RestrictedApi")
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val pathString = "M291.12,238.84C302.48,219.53 309,197.03 309,173C309,101.2 250.8,43 179,43C107.2,43 49,101.2 49,173C49,200.46 57.52,225.93 72.05,246.92L179.56,436.36L291.66,238.84H291.12Z"
        val path = PathParser().parsePathString(pathString).toPath()

        val pathSize = path.getBounds().size
        val matrix = android.graphics.Matrix()

        matrix.postScale(size.width / pathSize.width, size.height / pathSize.height)
        path.asAndroidPath().transform(matrix)

        return Outline.Generic(path)
    }
}