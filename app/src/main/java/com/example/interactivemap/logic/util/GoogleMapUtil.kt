package com.example.interactivemap.logic.util

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory

object GoogleMapUtil {
    fun drawableToBitmapDescriptor(context: Context, drawableId: Int): BitmapDescriptor {
        val drawableResource: Drawable? = ContextCompat.getDrawable(context, drawableId)
        drawableResource ?. let { drawable ->
            val width = drawable.intrinsicWidth
            val height = drawable.intrinsicHeight

            val bitmap: Bitmap = Bitmap.createBitmap(
                width,
                height,
                Bitmap.Config.ARGB_8888
            )

            val canvas = Canvas(bitmap)
            drawable.setBounds( 0, 0, canvas.width, canvas.height)
            drawable.draw(canvas)
            canvas.scale(15f, 15f)

            return BitmapDescriptorFactory.fromBitmap(bitmap)
        } ?: run {
            throw IllegalArgumentException("Drawable not found")
        }
    }
}