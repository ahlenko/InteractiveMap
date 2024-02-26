package com.example.interactivemap.ui.resource.material

import android.annotation.SuppressLint
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.asAndroidPath
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class CustomShape : Shape {
    @SuppressLint("RestrictedApi")
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val pathString = "M501.86,11.39C504.61,6.43 508.18,0 516.8,0H876.04V136H0V0H359.76C368.38,0" +
                " 371.95,6.43 374.7,11.39L374.7,11.39C375.22,12.34 375.71,13.23 376.21,14.01L422.63," +
                "95.65C429.53,107.79 447.02,107.79 453.93,95.65L500.35,14.01C500.85,13.23 501.34,12.34" +
                " 501.86,11.39Z"
        val path = PathParser().parsePathString(pathString).toPath()

        val pathSize = path.getBounds().size
        val matrix = android.graphics.Matrix()

        matrix.postScale(size.width / pathSize.width, size.height / pathSize.height)
        path.asAndroidPath().transform(matrix)

        return Outline.Generic(path)
    }
}