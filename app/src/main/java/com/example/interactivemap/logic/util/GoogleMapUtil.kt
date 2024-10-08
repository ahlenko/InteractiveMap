package com.example.interactivemap.logic.util

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.logic.model.navigation.models.RoadElementModel
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

object GoogleMapUtil {
    private const val EARTH_RADIUS = 6371e3
    private const val waypointDistance = 3.0
    private var waypointIdCounter = 1000000

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

     fun distanceBetweenPoints(point1: LatLng, point2: LatLng): Double {
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

    private fun heuristic(current: LatLng, goal: LatLng): Double {
        return distanceBetweenPoints(current, goal)
    }

    fun aStar(navGraphs: List<List<NavModel>>, startId: Int, endId: Int): List<RoadElementModel> {
        val openSet = mutableSetOf<Int>()
        val cameFrom = mutableMapOf<Int, Int?>()
        val gScore = mutableMapOf<Int, Double>()
        val fScore = mutableMapOf<Int, Double>()

        val navGraph = navGraphs.flatten()
        val startNode = navGraph.find { it.id == startId } ?: return emptyList()
        val endNode = navGraph.find { it.id == endId } ?: return emptyList()

        openSet.add(startId)
        navGraph.forEach {
            gScore[it.id] = Double.MAX_VALUE
            fScore[it.id] = Double.MAX_VALUE
        }
        gScore[startId] = 0.0
        fScore[startId] = heuristic(startNode.location, endNode.location)

        while (openSet.isNotEmpty()) {
            val current = openSet.minByOrNull { fScore[it] ?: Double.MAX_VALUE } ?: break
            if (current == endId) {
                return reconstructPath(cameFrom, current, navGraph)
            }

            openSet.remove(current)
            val currentNode = navGraph.find { it.id == current } ?: continue

            currentNode.connexionWith.forEach { neighbor ->
                val neighborNode = navGraph.find { it.id == neighbor.id } ?: return@forEach
                val tentativeGScore = gScore[current]!! + distanceBetweenPoints(currentNode.location, neighborNode.location)
                if (tentativeGScore < gScore[neighbor.id]!!) {
                    cameFrom[neighbor.id] = current
                    gScore[neighbor.id] = tentativeGScore
                    fScore[neighbor.id] = gScore[neighbor.id]!! + heuristic(neighborNode.location, endNode.location)
                    if (neighbor.id !in openSet) {
                        openSet.add(neighbor.id)
                    }
                }
            }

            currentNode.connexionFloor?.forEach { floorConnection ->
                val neighborNode = navGraph.find { it.id == floorConnection.point.id } ?: return@forEach
                val tentativeGScore = gScore[current]!! + distanceBetweenPoints(currentNode.location, neighborNode.location)
                if (tentativeGScore < gScore[floorConnection.point.id]!!) {
                    cameFrom[floorConnection.point.id] = current
                    gScore[floorConnection.point.id] = tentativeGScore
                    fScore[floorConnection.point.id] = gScore[floorConnection.point.id]!! + heuristic(neighborNode.location, endNode.location)
                    if (floorConnection.point.id !in openSet) {
                        openSet.add(floorConnection.point.id)
                    }
                }
            }
        }

        return emptyList()
    }

    private fun reconstructPath(
        cameFrom: Map<Int, Int?>,
        current: Int,
        navGraph: List<NavModel>,
    ): List<RoadElementModel> {
        val totalPath = mutableListOf<RoadElementModel>()
        var currentNode: Int? = current
        while (currentNode != null) {
            val node = navGraph.find { it.id == currentNode }!!
            totalPath.add(RoadElementModel(node.id, node.location, node.floorIndex, node.locationIndex, node.locked ?: false))
            currentNode = cameFrom[currentNode]
        }
        val pathWithWaypoints = mutableListOf<RoadElementModel>()
        for (i in 0 until totalPath.size - 1) {
            val start = totalPath[i]
            val end = totalPath[i + 1]
            pathWithWaypoints.add(start)

            val distance = distanceBetweenPoints(start.location, end.location)
            val numWaypoints = (distance / waypointDistance).toInt()

            for (j in 1..numWaypoints) {
                val waypointLocation = interpolateLocation(start.location, end.location, j.toDouble() / numWaypoints)
                pathWithWaypoints.add(
                    RoadElementModel(
                        id = generateWaypointId(),
                        location = waypointLocation,
                        floor = start.floor,
                        locationIndex = -1,
                        locked = false
                    )
                )
            }
        }
        pathWithWaypoints.add(totalPath.last())
        return pathWithWaypoints
    }

    private fun interpolateLocation(start: LatLng, end: LatLng, fraction: Double): LatLng {
        val lat = start.latitude + fraction * (end.latitude - start.latitude)
        val lon = start.longitude + fraction * (end.longitude - start.longitude)
        return LatLng(lat, lon)
    }



    private fun generateWaypointId(): Int {
        return waypointIdCounter++
    }

    fun toMultiLocationRoad(singleRoad: List<RoadElementModel>): List<List<RoadElementModel>> {
        if (singleRoad.isEmpty()) return emptyList()

        val multiLocationRoad = mutableListOf<MutableList<RoadElementModel>>()
        var currentList = mutableListOf<RoadElementModel>()

        singleRoad.forEachIndexed { index, element ->
            if (index == 0) {
                currentList.add(element)
            } else {
                val previousElement = singleRoad[index - 1]
                if (element.floor != previousElement.floor || element.locationIndex != previousElement.locationIndex) {
                    multiLocationRoad.add(currentList)
                    currentList = mutableListOf()
                }
                currentList.add(element)
            }
        }

        if (currentList.isNotEmpty()) {
            multiLocationRoad.add(currentList)
        }

        return multiLocationRoad
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

    fun getMapStyleDarkTheme(): String {
        return """[
    {
        "elementType": "geometry",
        "stylers": [
        {
            "color": "#212121"
        }
        ]
    },
    {
        "elementType": "labels.icon",
        "stylers": [
        {
            "visibility": "off"
        }
        ]
    },
    {
        "elementType": "labels.text.fill",
        "stylers": [
        {
            "color": "#757575"
        }
        ]
    },
    {
        "elementType": "labels.text.stroke",
        "stylers": [
        {
            "color": "#212121"
        }
        ]
    },
    {
        "featureType": "administrative",
        "elementType": "geometry",
        "stylers": [
        {
            "color": "#757575"
        }
        ]
    },
    {
        "featureType": "administrative.country",
        "elementType": "labels.text.fill",
        "stylers": [
        {
            "color": "#9e9e9e"
        }
        ]
    },
    {
        "featureType": "administrative.land_parcel",
        "stylers": [
        {
            "visibility": "off"
        }
        ]
    },
    {
        "featureType": "administrative.locality",
        "elementType": "labels.text.fill",
        "stylers": [
        {
            "color": "#bdbdbd"
        }
        ]
    },
    {
        "featureType": "poi",
        "elementType": "labels.text.fill",
        "stylers": [
        {
            "color": "#757575"
        }
        ]
    },
    {
        "featureType": "poi.park",
        "elementType": "geometry",
        "stylers": [
        {
            "color": "#181818"
        }
        ]
    },
    {
        "featureType": "poi.park",
        "elementType": "labels.text.fill",
        "stylers": [
        {
            "color": "#616161"
        }
        ]
    },
    {
        "featureType": "poi.park",
        "elementType": "labels.text.stroke",
        "stylers": [
        {
            "color": "#1b1b1b"
        }
        ]
    },
    {
        "featureType": "road",
        "elementType": "geometry.fill",
        "stylers": [
        {
            "color": "#2c2c2c"
        }
        ]
    },
    {
        "featureType": "road",
        "elementType": "labels.text.fill",
        "stylers": [
        {
            "color": "#8a8a8a"
        }
        ]
    },
    {
        "featureType": "road.arterial",
        "elementType": "geometry",
        "stylers": [
        {
            "color": "#373737"
        }
        ]
    },
    {
        "featureType": "road.highway",
        "elementType": "geometry",
        "stylers": [
        {
            "color": "#3c3c3c"
        }
        ]
    },
    {
        "featureType": "road.highway.controlled_access",
        "elementType": "geometry",
        "stylers": [
        {
            "color": "#4e4e4e"
        }
        ]
    },
    {
        "featureType": "road.local",
        "elementType": "labels.text.fill",
        "stylers": [
        {
            "color": "#616161"
        }
        ]
    },
    {
        "featureType": "transit",
        "elementType": "labels.text.fill",
        "stylers": [
        {
            "color": "#757575"
        }
        ]
    },
    {
        "featureType": "water",
        "elementType": "geometry",
        "stylers": [
        {
            "color": "#000000"
        }
        ]
    },
    {
        "featureType": "water",
        "elementType": "labels.text.fill",
        "stylers": [
        {
            "color": "#3d3d3d"
        }
        ]
    }
    ]""".trimIndent()
    }
}