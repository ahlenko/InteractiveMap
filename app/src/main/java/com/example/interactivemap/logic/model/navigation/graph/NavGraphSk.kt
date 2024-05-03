package com.example.interactivemap.logic.model.navigation.graph
import com.example.interactivemap.logic.model.navigation.models.FloorModel
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.logic.model.navigation.models.NavObjects.NEW
import com.example.interactivemap.logic.model.navigation.models.NavObjects.OLD
import com.example.interactivemap.logic.model.navigation.models.NavObjects.SK
import com.example.interactivemap.logic.model.navigation.models.NavObjects.YARD
import com.google.android.gms.maps.model.LatLng
object NavGraphSk {
    val navGraphSk: List<NavModel> by lazy { // Спорткомплекс
        listOf(

            // I поверх

            NavModel(
                id = 1, name = "",
                location = LatLng(48.43641966520671, 35.04768993705511),
                locationIndex = SK, floorIndex = 1,
                connexionWith = listOf(2),
                connexionFloor = listOf(FloorModel(1, 125)),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 2, name = "",
                location = LatLng(48.43642188959861, 35.04770267754793),
                locationIndex = SK, floorIndex = 1,
                connexionWith = listOf(1, 3),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 3, name = "",
                location = LatLng(48.43645659009989, 35.047732181847095),
                locationIndex = SK, floorIndex = 1,
                connexionWith = listOf(2, 4),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 4, name = "",
                location = LatLng(48.436443688634256, 35.047789849340916),
                locationIndex = SK, floorIndex = 1,
                connexionWith = listOf(3, 5, 10),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 5, name = "",
                location = LatLng(48.43640209250716, 35.04775498062372),
                locationIndex = SK, floorIndex = 1,
                connexionWith = listOf(4, 6, 8),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 6, name = "",
                location = LatLng(48.436372952953974, 35.04781600087881),
                locationIndex = SK, floorIndex = 1,
                connexionWith = listOf(5, 7),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 7, name = "",
                location = LatLng(48.43631133720254, 35.04796486347914),
                locationIndex = SK, floorIndex = 1,
                connexionWith = listOf(6),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 8, name = "",
                location = LatLng(48.436295099103994, 35.04765909165144),
                locationIndex = SK, floorIndex = 1,
                connexionWith = listOf(9, 5,12,  15),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 9, name = "",
                location = LatLng(48.43627552440293, 35.047713071107864),
                locationIndex = SK, floorIndex = 1,
                connexionWith = listOf(8),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 10, name = "",
                location = LatLng(48.436520430062764, 35.04786226898432),
                locationIndex = SK, floorIndex = 1,
                connexionWith = listOf(4, 11, 13, 14),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 11, name = "",
                location = LatLng(48.43649840862121, 35.04791792482138),
                locationIndex = SK, floorIndex = 1,
                connexionWith = listOf(10),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 12, name = "",
                location = LatLng(48.43619277671969, 35.04756521433592),
                locationIndex = SK, floorIndex = 1,
                connexionWith = listOf(8),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 13, name = "",
                location = LatLng(48.43661407669242, 35.04794541746378),
                locationIndex = SK, floorIndex = 1,
                connexionWith = listOf(10),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 14, name = "",
                location = LatLng(48.436547122706386, 35.04779186099768),
                locationIndex = SK, floorIndex = 1,
                connexionWith = listOf(10),
                connexionFloor = listOf(FloorModel(2, 17)),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 15, name = "",
                location = LatLng(48.43632379382259, 35.04758834838867),
                locationIndex = SK, floorIndex = 1,
                connexionWith = listOf(8),
                connexionFloor = listOf(FloorModel(2, 16)),
                connectedLocIndex = SK
            ),

            // II поверх

            NavModel(
                id = 16, name = "",
                location = LatLng(48.43631155964221, 35.04758030176163),
                locationIndex = SK, floorIndex = 2,
                connexionWith = listOf(28),
                connexionFloor = listOf(FloorModel(1, 15)),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 17, name = "",
                location = LatLng(48.43654979196998, 35.047789849340916),
                locationIndex = SK, floorIndex = 2,
                connexionWith = listOf(18),
                connexionFloor = listOf(FloorModel(1, 14)),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 18, name = "",
                location = LatLng(48.436521097379014, 35.04786126315594),
                locationIndex = SK, floorIndex = 2,
                connexionWith = listOf(17, 19),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 19, name = "",
                location = LatLng(48.43655557537395, 35.04789479076862),
                locationIndex = SK, floorIndex = 2,
                connexionWith = listOf(18),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 20, name = "",
                location = LatLng(48.436507083735705, 35.0478944554925),
                locationIndex = SK, floorIndex = 2,
                connexionWith = listOf(18, 21, 22),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 21, name = "",
                location = LatLng(48.43654267393344, 35.04792496562004),
                locationIndex = SK, floorIndex = 2,
                connexionWith = listOf(20),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 22, name = "",
                location = LatLng(48.436491290577464, 35.04793267697096),
                locationIndex = SK, floorIndex = 2,
                connexionWith = listOf(20, 23, 24),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 23, name = "",
                location = LatLng(48.43638229540797, 35.04784248769283),
                locationIndex = SK, floorIndex = 2,
                connexionWith = listOf(22, 25),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 24, name = "",
                location = LatLng(48.436462151075474, 35.047996044158936),
                locationIndex = SK, floorIndex = 2,
                connexionWith = listOf(22),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 25, name = "",
                location = LatLng(48.43625928629293, 35.04772078245878),
                locationIndex = SK, floorIndex = 2,
                connexionWith = listOf(23, 30, 26),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 26, name = "",
                location = LatLng(48.43627396732411, 35.0476835668087),
                locationIndex = SK, floorIndex = 2,
                connexionWith = listOf(25, 27, 28),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 27, name = "",
                location = LatLng(48.436239489138096, 35.047652050852776),
                locationIndex = SK, floorIndex = 2,
                connexionWith = listOf(26),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 28, name = "",
                location = LatLng(48.43628664639309, 35.04764802753925),
                locationIndex = SK, floorIndex = 2,
                connexionWith = listOf(26, 29, 16),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 29, name = "",
                location = LatLng(48.436255282374596, 35.04762154072523),
                locationIndex = SK, floorIndex = 2,
                connexionWith = listOf(28),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
            NavModel(
                id = 30, name = "",
                location = LatLng(48.43623103641796, 35.04778213799),
                locationIndex = SK, floorIndex = 2,
                connexionWith = listOf(25),
                connexionFloor = listOf(),
                connectedLocIndex = SK
            ),
        )
    }
}