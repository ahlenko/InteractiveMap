package com.example.interactivemap.logic.util

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

object GoogleMapUtil {
    const val EARTH_RADIUS = 6371 // Радіус Землі в кілометрах
    fun drawableToBitmapDescriptor(context: Context, drawableId: Int): BitmapDescriptor {
        val drawableResource: Drawable? = ContextCompat.getDrawable(context, drawableId)
        drawableResource ?. let { drawable ->
            val width = drawable.intrinsicWidth
            val height = drawable.intrinsicHeight

            val bitmap: Bitmap = Bitmap.createBitmap(
                width, height, Bitmap.Config.ARGB_8888)

            val canvas = Canvas(bitmap)
            drawable.setBounds( 0, 0, canvas.width, canvas.height)
            drawable.draw(canvas)
            canvas.scale(15f, 15f)

            return BitmapDescriptorFactory.fromBitmap(bitmap)
        } ?: run {
            throw IllegalArgumentException("Drawable not found")
        }
    }

    fun findNearestLocation(locations: List<NavModel>, targetLocation: LatLng): NavModel? {
        var nearestLocation: NavModel? = null
        var shortestDistance = Double.MAX_VALUE

        locations.forEach { location ->
            val distance = distanceBetweenPoints(
                location.location.latitude, location.location.longitude,
                targetLocation.latitude, targetLocation.longitude
            )

            if (distance < shortestDistance) {
                shortestDistance = distance
                nearestLocation = location
            }
        }
        return nearestLocation
    }

    private fun distanceBetweenPoints(
        lat1: Double, lon1: Double, lat2: Double, lon2: Double): Double {
        val latDistance = Math.toRadians(lat2 - lat1)
        val lonDistance = Math.toRadians(lon2 - lon1)
        val a = (sin(latDistance / 2) * sin(latDistance / 2)
                + (cos(Math.toRadians(lat1)) * cos(Math.toRadians(lat2))
                * sin(lonDistance / 2) * sin(lonDistance / 2)))
        val c = 2 * atan2(sqrt(a), sqrt(1 - a))
        return EARTH_RADIUS * c * 1000
    }

    fun getMapStyleWithoutLabels(): String {
        return """
        [
            {
                "featureType": "poi",
                "elementType": "labels",
                "stylers": [
                    { "visibility": "off" }
                ]
            },
            {
                "featureType": "road",
                "elementType": "labels.icon",
                "stylers": [
                    { "visibility": "off" }
                ]
            },
            {
                "featureType": "road",
                "elementType": "labels.text.fill",
                "stylers": [
                    { "color": "#9e9e9e" }
                ]
            },
            {
                "featureType": "road",
                "elementType": "labels.text.stroke",
                "stylers": [
                    { "visibility": "off" }
                ]
            }
        ]
    """.trimIndent()
    }
}