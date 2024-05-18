package com.example.interactivemap.logic.model.navigation.graph

import com.example.interactivemap.logic.model.navigation.models.FloorModel
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.logic.model.navigation.models.PointModel
import com.example.interactivemap.logic.model.navigation.models.NavObjects.NEW
import com.example.interactivemap.logic.model.navigation.models.NavObjects.OLD
import com.example.interactivemap.logic.model.navigation.models.NavObjects.SK
import com.example.interactivemap.logic.model.navigation.models.NavObjects.YARD
import com.google.android.gms.maps.model.LatLng
object NavGraphSk {
    val navGraphSk1: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 158 ,number = 1, name = null, description = null, locationIndex = SK, floorIndex = 1,
                location = LatLng(48.436441241804175, 35.04768658429384),
                connexionWith = listOf(PointModel(159,2)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 159 ,number = 2, name = null, description = null, locationIndex = SK, floorIndex = 1,
                location = LatLng(48.43643456863067, 35.04769999533892),
                connexionWith = listOf(PointModel(158,1), PointModel(160,3)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 160 ,number = 3, name = null, description = null, locationIndex = SK, floorIndex = 1,
                location = LatLng(48.436468156928385, 35.04773050546646),
                connexionWith = listOf(PointModel(159,2), PointModel(161,4)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 161 ,number = 4, name = null, description = null, locationIndex = SK, floorIndex = 1,
                location = LatLng(48.43644813741588, 35.047779120504856),
                connexionWith = listOf(PointModel(160,3), PointModel(162,5), PointModel(168,11)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 162 ,number = 5, name = null, description = null, locationIndex = SK, floorIndex = 1,
                location = LatLng(48.43641254715194, 35.04775196313858),
                connexionWith = listOf(PointModel(161,4), PointModel(163,6), PointModel(164,7)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 163 ,number = 6, name = null, description = null, locationIndex = SK, floorIndex = 1,
                location = LatLng(48.43635782707247, 35.04788909107447),
                connexionWith = listOf(PointModel(162,5)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 164 ,number = 7, name = null, description = null, locationIndex = SK, floorIndex = 1,
                location = LatLng(48.4363091128058, 35.0476560741663),
                connexionWith = listOf(PointModel(162,5), PointModel(165,8), PointModel(166,9), PointModel(167,10)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 165 ,number = 8, name = null, description = null, locationIndex = SK, floorIndex = 1,
                location = LatLng(48.4362833097963, 35.04771910607815),
                connexionWith = listOf(PointModel(164,7)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 166 ,number = 9, name = null, description = null, locationIndex = SK, floorIndex = 1,
                location = LatLng(48.43633936459334, 35.047581642866135),
                connexionWith = listOf(PointModel(164,7)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 167 ,number = 10, name = null, description = null, locationIndex = SK, floorIndex = 1,
                location = LatLng(48.436201007006055, 35.04756052047014),
                connexionWith = listOf(PointModel(164,7)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 168 ,number = 11, name = null, description = null, locationIndex = SK, floorIndex = 1,
                location = LatLng(48.43653555589587, 35.047861598432064),
                connexionWith = listOf(PointModel(161,4), PointModel(169,12), PointModel(170,13), PointModel(171,14)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 169 ,number = 12, name = null, description = null, locationIndex = SK, floorIndex = 1,
                location = LatLng(48.436508863246175, 35.047926642000675),
                connexionWith = listOf(PointModel(168,11)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 170 ,number = 13, name = null, description = null, locationIndex = SK, floorIndex = 1,
                location = LatLng(48.43662386397867, 35.04793871194124),
                connexionWith = listOf(PointModel(168,11)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 171 ,number = 14, name = null, description = null, locationIndex = SK, floorIndex = 1,
                location = LatLng(48.436564472917226, 35.04778649657965),
                connexionWith = listOf(PointModel(168,11)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),

        )
    }
    val navGraphSk2: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 172 ,number = 1, name = null, description = null, locationIndex = SK, floorIndex = 2,
                location = LatLng(48.436564250478646, 35.047786831855774),
                connexionWith = listOf(PointModel(173,2)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 173 ,number = 2, name = null, description = null, locationIndex = SK, floorIndex = 2,
                location = LatLng(48.43653666808931, 35.04785891622305),
                connexionWith = listOf(PointModel(172,1), PointModel(174,3), PointModel(175,4)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 174 ,number = 3, name = null, description = null, locationIndex = SK, floorIndex = 2,
                location = LatLng(48.43656135877726, 35.04788372665644),
                connexionWith = listOf(PointModel(173,2)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 175 ,number = 4, name = null, description = null, locationIndex = SK, floorIndex = 2,
                location = LatLng(48.436521542256536, 35.04789479076862),
                connexionWith = listOf(PointModel(173,2), PointModel(176,5), PointModel(177,6)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 176 ,number = 5, name = null, description = null, locationIndex = SK, floorIndex = 2,
                location = LatLng(48.43654556563589, 35.047914907336235),
                connexionWith = listOf(PointModel(175,4)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 177 ,number = 6, name = null, description = null, locationIndex = SK, floorIndex = 2,
                location = LatLng(48.436504414469866, 35.04792731255293),
                connexionWith = listOf(PointModel(175,4), PointModel(178,7), PointModel(179,8)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 178 ,number = 7, name = null, description = null, locationIndex = SK, floorIndex = 2,
                location = LatLng(48.436477944242746, 35.04798799753189),
                connexionWith = listOf(PointModel(177,6), PointModel(181,10)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 179 ,number = 8, name = null, description = null, locationIndex = SK, floorIndex = 2,
                location = LatLng(48.43639008078496, 35.04782773554325),
                connexionWith = listOf(PointModel(177,6), PointModel(180,9)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 180 ,number = 9, name = null, description = null, locationIndex = SK, floorIndex = 2,
                location = LatLng(48.43627330000461, 35.047724805772305),
                connexionWith = listOf(PointModel(179,8), PointModel(181,10), PointModel(182,11)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 181 ,number = 10, name = null, description = null, locationIndex = SK, floorIndex = 2,
                location = LatLng(48.436250388696195, 35.047783479094505),
                connexionWith = listOf(PointModel(178,7), PointModel(180,9)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 182 ,number = 11, name = null, description = null, locationIndex = SK, floorIndex = 2,
                location = LatLng(48.43628931567038, 35.04768021404743),
                connexionWith = listOf(PointModel(180,9), PointModel(183,12), PointModel(184,13)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 183 ,number = 12, name = null, description = null, locationIndex = SK, floorIndex = 2,
                location = LatLng(48.436303329373764, 35.04764869809151),
                connexionWith = listOf(PointModel(182,11), PointModel(185,14), PointModel(186,15)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 184 ,number = 13, name = null, description = null, locationIndex = SK, floorIndex = 2,
                location = LatLng(48.436260620932295, 35.04765339195728),
                connexionWith = listOf(PointModel(182,11)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 185 ,number = 14, name = null, description = null, locationIndex = SK, floorIndex = 2,
                location = LatLng(48.43627285512493, 35.04762187600136),
                connexionWith = listOf(PointModel(183,12)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
            NavModel(
                id = 186 ,number = 15, name = null, description = null, locationIndex = SK, floorIndex = 2,
                location = LatLng(48.43632824261472, 35.04757694900036),
                connexionWith = listOf(PointModel(183,12)),
                connexionFloor = null, connectedLocIndex = SK, locked = false
            ),
        )
    }
}