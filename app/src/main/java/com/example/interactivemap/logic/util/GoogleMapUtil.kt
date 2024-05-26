package com.example.interactivemap.logic.util

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.example.interactivemap.logic.model.navigation.graph.NavGraphNew
import com.example.interactivemap.logic.model.navigation.graph.NavGraphOld
import com.example.interactivemap.logic.model.navigation.graph.NavGraphSk
import com.example.interactivemap.logic.model.navigation.graph.NavGraphYard
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.logic.model.navigation.models.NavObjects
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

object GoogleMapUtil {
    const val EARTH_RADIUS = 6371e3 // Радіус Землі в кілометрах
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
                location.location,
                targetLocation
            )

            if (distance < shortestDistance) {
                shortestDistance = distance
                nearestLocation = location
            }
        }
        return nearestLocation
    }

    private fun distanceBetweenPoints(point1: LatLng, point2: LatLng): Double {
        val lat1 = Math.toRadians(point1.latitude)
        val lat2 = Math.toRadians(point2.latitude)
        val deltaLat = Math.toRadians(point2.latitude - point1.latitude)
        val deltaLon = Math.toRadians(point2.longitude - point1.longitude)

        val a = sin(deltaLat / 2) * sin(deltaLat / 2) +
                cos(lat1) * cos(lat2) *
                sin(deltaLon / 2) * sin(deltaLon / 2)
        val c = 2 * atan2(sqrt(a), sqrt(1 - a))

        return EARTH_RADIUS * c
    }

    fun dijkstra(navGraphs: List<List<NavModel>>, startId: Int, endId: Int): List<Int> {
        val distances = mutableMapOf<Int, Double>()
        val previous = mutableMapOf<Int, Int?>()
        val unvisited = navGraphs.flatten().map { it.id }.toMutableSet()

        navGraphs.flatten().forEach {
            distances[it.id] = Double.MAX_VALUE
            previous[it.id] = null
        }

        distances[startId] = 0.0

        while (unvisited.isNotEmpty()) {
            val current = unvisited.minByOrNull { distances[it]!! } ?: break
            if (current == endId) break

            unvisited.remove(current)

            val currentNode = navGraphs.flatten().find { it.id == current } ?: continue
            currentNode.connexionWith.forEach { neighbor ->
                val neighborNode = navGraphs.flatten().find { it.id == neighbor.id } ?: return@forEach
                val alt = distances[current]!! + distanceBetweenPoints(currentNode.location, neighborNode.location)
                if (alt < distances[neighbor.id]!!) {
                    distances[neighbor.id] = alt
                    previous[neighbor.id] = current
                }
            }

            currentNode.connexionFloor?.forEach { floorConnection ->
                val neighborNode = navGraphs.flatten().find { it.id == floorConnection.point.id } ?: return@forEach
                val alt = distances[current]!! + distanceBetweenPoints(currentNode.location, neighborNode.location)
                if (alt < distances[floorConnection.point.id]!!) {
                    distances[floorConnection.point.id] = alt
                    previous[floorConnection.point.id] = current
                }
            }
        }

        val path = mutableListOf<Int>()
        var currentNode: Int? = endId
        while (currentNode != null) {
            path.add(currentNode)
            currentNode = previous[currentNode]
        }

        return if (path.size == 1 && path[0] != startId) emptyList() else path.reversed()
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