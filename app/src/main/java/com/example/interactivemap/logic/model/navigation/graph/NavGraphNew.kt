package com.example.interactivemap.logic.model.navigation.graph

import com.example.interactivemap.logic.model.navigation.models.FloorModel
import com.example.interactivemap.logic.model.navigation.models.PointModel
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.logic.model.navigation.models.NavObjects.NEW
import com.example.interactivemap.logic.model.navigation.models.NavObjects.OLD
import com.example.interactivemap.logic.model.navigation.models.NavObjects.YARD
import com.google.android.gms.maps.model.LatLng

object NavGraphNew {
    val navGraphNew1: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 187 ,number = 1, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43536707202528, 35.046350844204426),
                connexionWith = listOf(PointModel(186,0), PointModel(188,2)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 188 ,number = 2, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435318801696646, 35.046468526124954),
                connexionWith = listOf(PointModel(187,1), PointModel(189,3)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 189 ,number = 3, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43530078372812, 35.04651311784983),
                connexionWith = listOf(PointModel(188,2), PointModel(190,4)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 190 ,number = 4, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43527342309705, 35.04657816141844),
                connexionWith = listOf(PointModel(189,3), PointModel(191,5)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 191 ,number = 5, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43521847934622, 35.04671026021242),
                connexionWith = listOf(PointModel(190,4), PointModel(192,6)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 192 ,number = 6, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435153080634194, 35.04646819084883),
                connexionWith = listOf(PointModel(191,5), PointModel(193,7)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 193 ,number = 7, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43539554482433, 35.04668612033129),
                connexionWith = listOf(PointModel(192,6), PointModel(194,8)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 194 ,number = 8, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435430468470145, 35.04662744700909),
                connexionWith = listOf(PointModel(193,7), PointModel(195,9)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 195 ,number = 9, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435497423927785, 35.04668679088354),
                connexionWith = listOf(PointModel(194,8), PointModel(196,10)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 196 ,number = 10, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43556148753888, 35.04674378782511),
                connexionWith = listOf(PointModel(195,9), PointModel(197,11)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 197 ,number = 11, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43562599595454, 35.046801790595055),
                connexionWith = listOf(PointModel(196,10), PointModel(198,12)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 198 ,number = 12, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.4356566930339, 35.04683095961809),
                connexionWith = listOf(PointModel(197,11), PointModel(199,13)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 199 ,number = 13, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435686945209916, 35.04685677587986),
                connexionWith = listOf(PointModel(198,12), PointModel(200,14)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 200 ,number = 14, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43573944159026, 35.04690572619438),
                connexionWith = listOf(PointModel(199,13), PointModel(201,15)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 201 ,number = 15, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.4357071874647, 35.04698485136032),
                connexionWith = listOf(PointModel(200,14), PointModel(202,16)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 202 ,number = 16, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435802615128594, 35.04696439951658),
                connexionWith = listOf(PointModel(201,15), PointModel(203,17)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 203 ,number = 17, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435820188035514, 35.04691477864981),
                connexionWith = listOf(PointModel(202,16), PointModel(204,18)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 204 ,number = 18, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43587268427817, 35.04678167402744),
                connexionWith = listOf(PointModel(203,17), PointModel(205,19)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 205 ,number = 19, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435786154425465, 35.04700228571892),
                connexionWith = listOf(PointModel(204,18), PointModel(206,20)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 206 ,number = 20, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.4357701386011, 35.04704620689154),
                connexionWith = listOf(PointModel(205,19), PointModel(207,21)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 207 ,number = 21, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435137064610245, 35.046358555555344),
                connexionWith = listOf(PointModel(206,20), PointModel(208,22)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 208 ,number = 22, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435066549555906, 35.046296864748),
                connexionWith = listOf(PointModel(207,21), PointModel(209,23)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 209 ,number = 23, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435041635696265, 35.04627741873264),
                connexionWith = listOf(PointModel(208,22), PointModel(210,24)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 210 ,number = 24, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43501093824526, 35.04624556750059),
                connexionWith = listOf(PointModel(209,23), PointModel(211,25)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 211 ,number = 25, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43494286991821, 35.04619091749191),
                connexionWith = listOf(PointModel(210,24), PointModel(212,26)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 212 ,number = 26, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43488036264865, 35.046131908893585),
                connexionWith = listOf(PointModel(211,25), PointModel(213,27)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 213 ,number = 27, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.434838765241594, 35.04609402269125),
                connexionWith = listOf(PointModel(212,26), PointModel(214,28)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 214 ,number = 28, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43480584320546, 35.04617013037205),
                connexionWith = listOf(PointModel(213,27), PointModel(215,29)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 215 ,number = 29, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43479583312268, 35.04605211317539),
                connexionWith = listOf(PointModel(214,28), PointModel(216,30)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 216 ,number = 30, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43476135393354, 35.04602059721947),
                connexionWith = listOf(PointModel(215,29), PointModel(217,31)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 217 ,number = 31, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43473844194331, 35.04600081592798),
                connexionWith = listOf(PointModel(216,30), PointModel(218,32)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 218 ,number = 32, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.434827420488325, 35.04595823585987),
                connexionWith = listOf(PointModel(217,31), PointModel(219,33)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 219 ,number = 33, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43471330547612, 35.046063512563705),
                connexionWith = listOf(PointModel(218,32), PointModel(220,34)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 220 ,number = 34, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.4347359950311, 35.04608999937773),
                connexionWith = listOf(PointModel(219,33), PointModel(221,35)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 221 ,number = 35, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43476446818386, 35.0461208447814),
                connexionWith = listOf(PointModel(220,34), PointModel(222,36)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 222 ,number = 36, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43486301186269, 35.04617717117071),
                connexionWith = listOf(PointModel(221,35), PointModel(223,37)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 223 ,number = 37, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.434928188502376, 35.046233497560024),
                connexionWith = listOf(PointModel(222,36), PointModel(224,38)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 224 ,number = 38, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.4349152866486, 35.046265348792076),
                connexionWith = listOf(PointModel(223,37), PointModel(225,39)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 225 ,number = 39, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43497801632068, 35.0463193282485),
                connexionWith = listOf(PointModel(224,38), PointModel(226,40)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 226 ,number = 40, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435027399199555, 35.046311281621456),
                connexionWith = listOf(PointModel(225,39), PointModel(227,41)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 227 ,number = 41, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43554435942853, 35.04678167402744),
                connexionWith = listOf(PointModel(226,40), PointModel(228,42)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 228 ,number = 42, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43560998007966, 35.046839006245136),
                connexionWith = listOf(PointModel(227,41), PointModel(229,43)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 229 ,number = 43, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435629999922455, 35.046901032328606),
                connexionWith = listOf(PointModel(228,42), PointModel(230,44)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 230 ,number = 44, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435657360361496, 35.04692651331425),
                connexionWith = listOf(PointModel(229,43), PointModel(231,45)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 231 ,number = 45, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.4358092883851, 35.047079399228096),
                connexionWith = listOf(PointModel(230,44), PointModel(232,46)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 232 ,number = 46, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43582485931353, 35.047038830816746),
                connexionWith = listOf(PointModel(231,45), PointModel(233,47)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 233 ,number = 47, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43585755824772, 35.04695199429989),
                connexionWith = listOf(PointModel(232,46), PointModel(234,48)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 234 ,number = 48, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43575567986644, 35.04685778170824),
                connexionWith = listOf(PointModel(233,47), PointModel(235,49)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 235 ,number = 49, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43570518548382, 35.04681620746851),
                connexionWith = listOf(PointModel(234,48), PointModel(236,50)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 236 ,number = 50, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.4356442362503, 35.046757869422436),
                connexionWith = listOf(PointModel(235,49), PointModel(237,51)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 237 ,number = 51, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43557772587192, 35.04669684916735),
                connexionWith = listOf(PointModel(236,50), PointModel(238,52)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 238 ,number = 52, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435516554042316, 35.04664119333029),
                connexionWith = listOf(PointModel(237,51), PointModel(239,53)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 239 ,number = 53, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43544648440158, 35.04658654332161),
                connexionWith = listOf(PointModel(238,52), PointModel(240,54)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 240 ,number = 54, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.435214697790336, 35.04638068377972),
                connexionWith = listOf(PointModel(239,53), PointModel(241,55)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 241 ,number = 55, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43517399043563, 35.04626903682947),
                connexionWith = listOf(PointModel(240,54), PointModel(242,56)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 242 ,number = 56, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43510325298757, 35.04620164632797),
                connexionWith = listOf(PointModel(241,55), PointModel(243,57)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 243 ,number = 57, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43502272784821, 35.046213045716286),
                connexionWith = listOf(PointModel(242,56), PointModel(244,58)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 244 ,number = 58, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43498202033967, 35.046092346310616),
                connexionWith = listOf(PointModel(243,57), PointModel(245,59)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 245 ,number = 59, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43491862333523, 35.04603937268257),
                connexionWith = listOf(PointModel(244,58), PointModel(246,60)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 246 ,number = 60, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43486301186269, 35.04586670547724),
                connexionWith = listOf(PointModel(245,59), PointModel(247,61)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 247 ,number = 61, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.434796278015284, 35.04592705518007),
                connexionWith = listOf(PointModel(246,60), PointModel(248,62)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 248 ,number = 62, name = null, description = null, locationIndex = NEW, floorIndex = 1,
                location = LatLng(48.43482452868806, 35.04585597664118),
                connexionWith = listOf(PointModel(247,61), PointModel(249,63)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
        )
    }
    val navGraphNew2: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 249 ,number = 1, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.435396434599035, 35.046689473092556),
                connexionWith = listOf(PointModel(248,0), PointModel(250,2)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 250 ,number = 2, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.435271421099074, 35.04657916724682),
                connexionWith = listOf(PointModel(249,1), PointModel(251,3)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 251 ,number = 3, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.435155305081544, 35.04647187888622),
                connexionWith = listOf(PointModel(250,2), PointModel(252,4)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 252 ,number = 4, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43523093623422, 35.046683102846146),
                connexionWith = listOf(PointModel(251,3), PointModel(253,5)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 253 ,number = 5, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.435155527526284, 35.04687521606684),
                connexionWith = listOf(PointModel(252,4), PointModel(254,6)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 254 ,number = 6, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43530234083678, 35.04651077091694),
                connexionWith = listOf(PointModel(253,5), PointModel(255,7)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 255 ,number = 7, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43521069378969, 35.04642829298973),
                connexionWith = listOf(PointModel(254,6), PointModel(256,8)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 256 ,number = 8, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.435136619720616, 35.04635822027922),
                connexionWith = listOf(PointModel(255,7), PointModel(257,9)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 257 ,number = 9, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.435043860148504, 35.04627540707588),
                connexionWith = listOf(PointModel(256,8), PointModel(258,10)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 258 ,number = 10, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43497801632068, 35.04621505737305),
                connexionWith = listOf(PointModel(257,9), PointModel(259,11)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 259 ,number = 11, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43495021062454, 35.04619259387255),
                connexionWith = listOf(PointModel(258,10), PointModel(260,12)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 260 ,number = 12, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43491395197388, 35.04616107791662),
                connexionWith = listOf(PointModel(259,11), PointModel(261,13)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 261 ,number = 13, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43488436667535, 35.046130903065205),
                connexionWith = listOf(PointModel(260,12), PointModel(262,14)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 262 ,number = 14, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43483965502607, 35.04609435796738),
                connexionWith = listOf(PointModel(261,13), PointModel(263,15)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 263 ,number = 15, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.434810069684275, 35.04616878926754),
                connexionWith = listOf(PointModel(262,14), PointModel(264,16)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 264 ,number = 16, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43479049441104, 35.04605244845152),
                connexionWith = listOf(PointModel(263,15), PointModel(265,17)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 265 ,number = 17, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43476268861227, 35.046024955809116),
                connexionWith = listOf(PointModel(264,16), PointModel(266,18)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 266 ,number = 18, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.434738664389855, 35.046004839241505),
                connexionWith = listOf(PointModel(265,17), PointModel(267,19)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 267 ,number = 19, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43482831027298, 35.04595689475536),
                connexionWith = listOf(PointModel(266,18), PointModel(268,20)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 268 ,number = 20, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.434775145611994, 35.04591062664986),
                connexionWith = listOf(PointModel(267,19), PointModel(269,21)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 269 ,number = 21, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.434856338481886, 35.04588648676872),
                connexionWith = listOf(PointModel(268,20), PointModel(270,22)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 270 ,number = 22, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.434898380766256, 35.04592873156071),
                connexionWith = listOf(PointModel(269,21), PointModel(271,23)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 271 ,number = 23, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43487368927014, 35.04599377512932),
                connexionWith = listOf(PointModel(270,22), PointModel(272,24)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 272 ,number = 24, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43491884578101, 35.04603870213032),
                connexionWith = listOf(PointModel(271,23), PointModel(273,25)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 273 ,number = 25, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43507989626138, 35.04618622362614),
                connexionWith = listOf(PointModel(272,24), PointModel(274,26)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 274 ,number = 26, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43517287821238, 35.04626635462046),
                connexionWith = listOf(PointModel(273,25), PointModel(275,27)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 275 ,number = 27, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43501583204303, 35.04634380340576),
                connexionWith = listOf(PointModel(274,26), PointModel(276,28)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 276 ,number = 28, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43494932084201, 35.04628948867321),
                connexionWith = listOf(PointModel(275,27), PointModel(277,29)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 277 ,number = 29, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43491884578101, 35.046261325478554),
                connexionWith = listOf(PointModel(276,28), PointModel(278,30)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 278 ,number = 30, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43488614624264, 35.046234503388405),
                connexionWith = listOf(PointModel(277,29), PointModel(279,31)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 279 ,number = 31, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43476513552316, 35.046121180057526),
                connexionWith = listOf(PointModel(278,30), PointModel(280,32)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 280 ,number = 32, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43473332567221, 35.046098716557026),
                connexionWith = listOf(PointModel(279,31), PointModel(281,33)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 281 ,number = 33, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.434710636116016, 35.04607189446688),
                connexionWith = listOf(PointModel(280,32), PointModel(282,34)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 282 ,number = 34, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43468238537995, 35.04614096134901),
                connexionWith = listOf(PointModel(281,33), PointModel(283,35)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 283 ,number = 35, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43466258761063, 35.04618622362614),
                connexionWith = listOf(PointModel(282,34), PointModel(284,36)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 284 ,number = 36, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.4354046650144, 35.0466076657176),
                connexionWith = listOf(PointModel(283,35), PointModel(285,37)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 285 ,number = 37, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.435465169648566, 35.04665829241276),
                connexionWith = listOf(PointModel(284,36), PointModel(286,38)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 286 ,number = 38, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43552723131244, 35.046712942421436),
                connexionWith = listOf(PointModel(285,37), PointModel(287,39)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 287 ,number = 39, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43555770600852, 35.04674211144447),
                connexionWith = listOf(PointModel(286,38), PointModel(288,40)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 288 ,number = 40, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.4355950764138, 35.04677429795265),
                connexionWith = listOf(PointModel(287,39), PointModel(289,41)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 289 ,number = 41, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43562532862651, 35.04680145531893),
                connexionWith = listOf(PointModel(288,40), PointModel(290,42)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 290 ,number = 42, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43565758280404, 35.04682995378971),
                connexionWith = listOf(PointModel(289,41), PointModel(291,43)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 291 ,number = 43, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43568761253713, 35.04685677587986),
                connexionWith = listOf(PointModel(290,42), PointModel(292,44)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 292 ,number = 44, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43573788449501, 35.04690371453762),
                connexionWith = listOf(PointModel(291,43), PointModel(293,45)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 293 ,number = 45, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43570763234932, 35.046979151666164),
                connexionWith = listOf(PointModel(292,44), PointModel(294,46)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 294 ,number = 46, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.435801502919105, 35.04696372896433),
                connexionWith = listOf(PointModel(293,45), PointModel(295,47)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 295 ,number = 47, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43578304023779, 35.04701267927885),
                connexionWith = listOf(PointModel(294,46), PointModel(296,48)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 296 ,number = 48, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43576635708626, 35.047058276832104),
                connexionWith = listOf(PointModel(295,47), PointModel(297,49)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 297 ,number = 49, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43582085536097, 35.046918131411076),
                connexionWith = listOf(PointModel(296,48), PointModel(298,50)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 298 ,number = 50, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.435868680329385, 35.04679273813963),
                connexionWith = listOf(PointModel(297,49), PointModel(299,51)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 299 ,number = 51, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43587579846035, 35.046968422830105),
                connexionWith = listOf(PointModel(298,50), PointModel(300,52)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 300 ,number = 52, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43582930814935, 35.047048553824425),
                connexionWith = listOf(PointModel(299,51), PointModel(301,53)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 301 ,number = 53, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43580884350138, 35.047095492482185),
                connexionWith = listOf(PointModel(300,52), PointModel(302,54)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 302 ,number = 54, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43566247653954, 35.046920478343964),
                connexionWith = listOf(PointModel(301,53), PointModel(303,55)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 303 ,number = 55, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43563155702102, 35.046895667910576),
                connexionWith = listOf(PointModel(302,54), PointModel(304,56)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 304 ,number = 56, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43559908038416, 35.04686448723078),
                connexionWith = listOf(PointModel(303,55), PointModel(305,57)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 305 ,number = 57, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43556749349827, 35.04683934152126),
                connexionWith = listOf(PointModel(304,56), PointModel(306,58)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 306 ,number = 58, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43553323727588, 35.04681184887886),
                connexionWith = listOf(PointModel(305,57), PointModel(307,59)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 307 ,number = 59, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.435788823729034, 35.04688862711191),
                connexionWith = listOf(PointModel(306,58), PointModel(308,60)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 308 ,number = 60, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.4358092883851, 35.04683967679739),
                connexionWith = listOf(PointModel(307,59), PointModel(309,61)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 309 ,number = 61, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43576546731805, 35.04686281085014),
                connexionWith = listOf(PointModel(308,60), PointModel(310,62)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 310 ,number = 62, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43570896700319, 35.04680313169956),
                connexionWith = listOf(PointModel(309,61), PointModel(311,63)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 311 ,number = 63, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43569428580873, 35.046728029847145),
                connexionWith = listOf(PointModel(310,62), PointModel(312,64)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 312 ,number = 64, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43563400389007, 35.04667740315199),
                connexionWith = listOf(PointModel(311,63), PointModel(313,65)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 313 ,number = 65, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.435594186642554, 35.04664722830057),
                connexionWith = listOf(PointModel(312,64), PointModel(314,66)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 314 ,number = 66, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43556460174014, 35.04662040621042),
                connexionWith = listOf(PointModel(313,65), PointModel(315,67)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 315 ,number = 67, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43550098301941, 35.046569779515266),
                connexionWith = listOf(PointModel(314,66), PointModel(316,68)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 316 ,number = 68, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.4354353622275, 35.046530552208424),
                connexionWith = listOf(PointModel(315,67), PointModel(317,69)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 317 ,number = 69, name = null, description = null, locationIndex = NEW, floorIndex = 2,
                location = LatLng(48.43524317067481, 35.04634212702513),
                connexionWith = listOf(PointModel(316,68), PointModel(318,70)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
        )
    }
    val navGraphNew3: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 318 ,number = 1, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.435394655049606, 35.04668779671192),
                connexionWith = listOf(PointModel(317,0), PointModel(319,2)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 319 ,number = 2, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43527631487177, 35.04657480865717),
                connexionWith = listOf(PointModel(318,1), PointModel(320,3)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 320 ,number = 3, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43515397041315, 35.04647623747587),
                connexionWith = listOf(PointModel(319,2), PointModel(321,4)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 321 ,number = 4, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.4353012286163, 35.046512112021446),
                connexionWith = listOf(PointModel(320,3), PointModel(322,5)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 322 ,number = 5, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43532102613677, 35.04652887582779),
                connexionWith = listOf(PointModel(321,4), PointModel(323,6)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 323 ,number = 6, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43541200565402, 35.04661068320274),
                connexionWith = listOf(PointModel(322,5), PointModel(324,7)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 324 ,number = 7, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43546116566765, 35.04665996879339),
                connexionWith = listOf(PointModel(323,6), PointModel(325,8)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 325 ,number = 8, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.435514107167634, 35.04670321941376),
                connexionWith = listOf(PointModel(324,7), PointModel(326,9)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 326 ,number = 9, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43558395427223, 35.04677262157202),
                connexionWith = listOf(PointModel(325,8), PointModel(327,10)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 327 ,number = 10, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43562666328254, 35.04680547863245),
                connexionWith = listOf(PointModel(326,9), PointModel(328,11)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 328 ,number = 11, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43565535837865, 35.04683330655098),
                connexionWith = listOf(PointModel(327,10), PointModel(329,12)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 329 ,number = 12, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.435687390094735, 35.04685677587986),
                connexionWith = listOf(PointModel(328,11), PointModel(330,13)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 330 ,number = 13, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43571675248338, 35.04688527435064),
                connexionWith = listOf(PointModel(329,12), PointModel(331,14)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 331 ,number = 14, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.435736994726284, 35.046909749507904),
                connexionWith = listOf(PointModel(330,13), PointModel(332,15)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 332 ,number = 15, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43571096898395, 35.046982169151306),
                connexionWith = listOf(PointModel(331,14), PointModel(333,16)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 333 ,number = 16, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43576190824494, 35.04692919552326),
                connexionWith = listOf(PointModel(332,15), PointModel(334,17)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 334 ,number = 17, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43580172536099, 35.046966411173344),
                connexionWith = listOf(PointModel(333,16), PointModel(335,18)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 335 ,number = 18, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43578370756373, 35.04701502621174),
                connexionWith = listOf(PointModel(334,17), PointModel(336,19)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 336 ,number = 19, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43576635708626, 35.04705794155598),
                connexionWith = listOf(PointModel(335,18), PointModel(337,20)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 337 ,number = 20, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43581596164074, 35.04709783941507),
                connexionWith = listOf(PointModel(336,19), PointModel(338,21)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 338 ,number = 21, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.435831977450654, 35.04705760627985),
                connexionWith = listOf(PointModel(337,20), PointModel(339,22)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 339 ,number = 22, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43585199720597, 35.04701066762209),
                connexionWith = listOf(PointModel(338,21), PointModel(340,23)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 340 ,number = 23, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.435820188035514, 35.04691679030657),
                connexionWith = listOf(PointModel(339,22), PointModel(341,24)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 341 ,number = 24, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43583865070332, 35.04687286913395),
                connexionWith = listOf(PointModel(340,23), PointModel(342,25)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 342 ,number = 25, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43590538318158, 35.04692584276199),
                connexionWith = listOf(PointModel(341,24), PointModel(343,26)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 343 ,number = 26, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.435941863565986, 35.04682928323746),
                connexionWith = listOf(PointModel(342,25), PointModel(344,27)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 344 ,number = 27, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43582574908072, 35.04673171788454),
                connexionWith = listOf(PointModel(343,26), PointModel(345,28)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 345 ,number = 28, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43578771151924, 35.04682458937168),
                connexionWith = listOf(PointModel(344,27), PointModel(346,29)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 346 ,number = 29, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.4357992785, 35.04683397710323),
                connexionWith = listOf(PointModel(345,28), PointModel(347,30)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 347 ,number = 30, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.435665590734594, 35.04691645503044),
                connexionWith = listOf(PointModel(346,29), PointModel(348,31)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 348 ,number = 31, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43563333656215, 35.04689499735832),
                connexionWith = listOf(PointModel(347,30), PointModel(349,32)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 349 ,number = 32, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43561064740789, 35.04685174673796),
                connexionWith = listOf(PointModel(348,31), PointModel(350,33)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 350 ,number = 33, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.4355677159412, 35.046814531087875),
                connexionWith = listOf(PointModel(349,32), PointModel(351,34)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 351 ,number = 34, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43574566997077, 35.046814866364),
                connexionWith = listOf(PointModel(350,33), PointModel(352,35)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 352 ,number = 35, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43571475050288, 35.04678804427385),
                connexionWith = listOf(PointModel(351,34), PointModel(353,36)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 353 ,number = 36, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.435613316720676, 35.04670590162277),
                connexionWith = listOf(PointModel(352,35), PointModel(354,37)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 354 ,number = 37, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.435528343527935, 35.046662986278534),
                connexionWith = listOf(PointModel(353,36), PointModel(355,38)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 355 ,number = 38, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.435479183579304, 35.046621076762676),
                connexionWith = listOf(PointModel(354,37), PointModel(356,39)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 356 ,number = 39, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.435434694897005, 35.04655200988054),
                connexionWith = listOf(PointModel(355,38), PointModel(357,40)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 357 ,number = 40, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.435343270532556, 35.046471543610096),
                connexionWith = listOf(PointModel(356,39), PointModel(358,41)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 358 ,number = 41, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43519645734033, 35.04641655832529),
                connexionWith = listOf(PointModel(357,40), PointModel(359,42)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 359 ,number = 42, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.4352320484562, 35.046318992972374),
                connexionWith = listOf(PointModel(358,41), PointModel(360,43)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 360 ,number = 43, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43513217082413, 35.04635654389858),
                connexionWith = listOf(PointModel(359,42), PointModel(361,44)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 361 ,number = 44, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43503918879868, 35.046273060142994),
                connexionWith = listOf(PointModel(360,43), PointModel(362,45)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 362 ,number = 45, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43500849134618, 35.04625026136637),
                connexionWith = listOf(PointModel(361,44), PointModel(363,46)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 363 ,number = 46, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43497512452899, 35.04621472209692),
                connexionWith = listOf(PointModel(362,45), PointModel(364,47)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 364 ,number = 47, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43494131279853, 35.04618488252163),
                connexionWith = listOf(PointModel(363,46), PointModel(365,48)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 365 ,number = 48, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43488547890492, 35.04613861441612),
                connexionWith = listOf(PointModel(364,47), PointModel(366,49)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 366 ,number = 49, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43484187948716, 35.046097710728645),
                connexionWith = listOf(PointModel(365,48), PointModel(367,50)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 367 ,number = 50, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43481162680795, 35.046173483133316),
                connexionWith = listOf(PointModel(366,49), PointModel(368,51)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 368 ,number = 51, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.434793608659554, 35.04605479538441),
                connexionWith = listOf(PointModel(367,50), PointModel(369,52)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 369 ,number = 52, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43487791574328, 35.04600618034601),
                connexionWith = listOf(PointModel(368,51), PointModel(370,53)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 370 ,number = 53, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.434762911058705, 35.04602562636137),
                connexionWith = listOf(PointModel(369,52), PointModel(371,54)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 371 ,number = 54, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43473377056538, 35.04600014537573),
                connexionWith = listOf(PointModel(370,53), PointModel(372,55)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 372 ,number = 55, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43466058558858, 35.04618354141712),
                connexionWith = listOf(PointModel(371,54), PointModel(373,56)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 373 ,number = 56, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43449508482679, 35.04617180675268),
                connexionWith = listOf(PointModel(372,55), PointModel(374,57)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 374 ,number = 57, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43481474105516, 35.04600249230862),
                connexionWith = listOf(PointModel(373,56), PointModel(375,58)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 375 ,number = 58, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43477403338001, 35.04590626806021),
                connexionWith = listOf(PointModel(374,57), PointModel(376,59)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 376 ,number = 59, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.434810069684275, 35.04581943154335),
                connexionWith = listOf(PointModel(375,58), PointModel(377,60)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 377 ,number = 60, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43491194996173, 35.04591464996338),
                connexionWith = listOf(PointModel(376,59), PointModel(378,61)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 378 ,number = 61, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43492107023864, 35.04605211317539),
                connexionWith = listOf(PointModel(377,60), PointModel(379,62)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 379 ,number = 62, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43497957343921, 35.04610240459442),
                connexionWith = listOf(PointModel(378,61), PointModel(380,63)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 380 ,number = 63, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.4350093811277, 35.04612889140844),
                connexionWith = listOf(PointModel(379,62), PointModel(381,64)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 381 ,number = 64, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43507322290907, 35.046185217797756),
                connexionWith = listOf(PointModel(380,63), PointModel(382,65)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 382 ,number = 65, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43516976398709, 35.04626736044884),
                connexionWith = listOf(PointModel(381,64), PointModel(383,66)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 383 ,number = 66, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.435013385144195, 35.0463367626071),
                connexionWith = listOf(PointModel(382,65), PointModel(384,67)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 384 ,number = 67, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43498313256712, 35.04631329327822),
                connexionWith = listOf(PointModel(383,66), PointModel(385,68)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 385 ,number = 68, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43495021062454, 35.04628412425518),
                connexionWith = listOf(PointModel(384,67), PointModel(386,69)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 386 ,number = 69, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.4349152866486, 35.0462556257844),
                connexionWith = listOf(PointModel(385,68), PointModel(387,70)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 387 ,number = 70, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.43490416435824, 35.04620499908924),
                connexionWith = listOf(PointModel(386,69), PointModel(388,71)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 388 ,number = 71, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.434871687256404, 35.04617482423782),
                connexionWith = listOf(PointModel(387,70), PointModel(389,72)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 389 ,number = 72, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.434766692648225, 35.04612285643816),
                connexionWith = listOf(PointModel(388,71), PointModel(390,73)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 390 ,number = 73, name = null, description = null, locationIndex = NEW, floorIndex = 3,
                location = LatLng(48.434733993011974, 35.046093352138996),
                connexionWith = listOf(PointModel(389,72), PointModel(391,74)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
        )
    }
    val navGraphNew4: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 391 ,number = 1, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43539532238064, 35.0466888025403),
                connexionWith = listOf(PointModel(390,0), PointModel(392,2)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 392 ,number = 2, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43527498020653, 35.04657614976168),
                connexionWith = listOf(PointModel(391,1), PointModel(393,3)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 393 ,number = 3, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43515219085522, 35.04647187888622),
                connexionWith = listOf(PointModel(392,2), PointModel(394,4)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 394 ,number = 4, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435299671507636, 35.04650607705116),
                connexionWith = listOf(PointModel(393,3), PointModel(395,5)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 395 ,number = 5, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435329256564344, 35.04653289914131),
                connexionWith = listOf(PointModel(394,4), PointModel(396,6)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 396 ,number = 6, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43540555478895, 35.04660364240408),
                connexionWith = listOf(PointModel(395,5), PointModel(397,7)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 397 ,number = 7, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435468951185825, 35.04666030406952),
                connexionWith = listOf(PointModel(396,6), PointModel(398,8)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 398 ,number = 8, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435561709981805, 35.04674647003412),
                connexionWith = listOf(PointModel(397,7), PointModel(399,9)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 399 ,number = 9, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435595743742205, 35.046775974333286),
                connexionWith = listOf(PointModel(398,8), PointModel(400,10)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 400 ,number = 10, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43562555106918, 35.04680681973696),
                connexionWith = listOf(PointModel(399,9), PointModel(401,11)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 401 ,number = 11, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43565602570627, 35.04683196544647),
                connexionWith = listOf(PointModel(400,10), PointModel(402,12)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 402 ,number = 12, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43568850230672, 35.046864822506905),
                connexionWith = listOf(PointModel(401,11), PointModel(403,13)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 403 ,number = 13, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43571786469473, 35.04688661545515),
                connexionWith = listOf(PointModel(402,12), PointModel(404,14)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 404 ,number = 14, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.4357383293794, 35.04690606147051),
                connexionWith = listOf(PointModel(403,13), PointModel(405,15)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 405 ,number = 15, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43570829967626, 35.04698149859905),
                connexionWith = listOf(PointModel(404,14), PointModel(406,16)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 406 ,number = 16, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435761018476626, 35.0469271838665),
                connexionWith = listOf(PointModel(405,15), PointModel(407,17)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 407 ,number = 17, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43580217024479, 35.04696473479271),
                connexionWith = listOf(PointModel(406,16), PointModel(408,18)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 408 ,number = 18, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43578481977363, 35.04701167345047),
                connexionWith = listOf(PointModel(407,17), PointModel(409,19)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 409 ,number = 19, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43576635708626, 35.047056935727596),
                connexionWith = listOf(PointModel(408,18), PointModel(410,20)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 410 ,number = 20, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43581084547816, 35.04709515720606),
                connexionWith = listOf(PointModel(409,19), PointModel(411,21)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 411 ,number = 21, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43582730617327, 35.0470482185483),
                connexionWith = listOf(PointModel(410,20), PointModel(412,22)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 412 ,number = 22, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43582085536097, 35.04692014306784),
                connexionWith = listOf(PointModel(411,21), PointModel(413,23)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 413 ,number = 23, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435839540470255, 35.046871192753315),
                connexionWith = listOf(PointModel(412,22), PointModel(414,24)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 414 ,number = 24, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435799945825764, 35.04683464765549),
                connexionWith = listOf(PointModel(413,23), PointModel(415,25)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 415 ,number = 25, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.4357894910549, 35.04682224243879),
                connexionWith = listOf(PointModel(414,24), PointModel(416,26)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 416 ,number = 26, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43581796361725, 35.04674814641476),
                connexionWith = listOf(PointModel(415,25), PointModel(417,27)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 417 ,number = 27, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435750118813544, 35.04680447280407),
                connexionWith = listOf(PointModel(416,26), PointModel(418,28)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 418 ,number = 28, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43569072673066, 35.046752505004406),
                connexionWith = listOf(PointModel(417,27), PointModel(419,29)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 419 ,number = 29, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43562644083986, 35.04669852554798),
                connexionWith = listOf(PointModel(418,28), PointModel(420,30)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 420 ,number = 30, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43558195228652, 35.04670053720474),
                connexionWith = listOf(PointModel(419,29), PointModel(421,31)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 421 ,number = 31, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43548518954841, 35.04661303013563),
                connexionWith = listOf(PointModel(420,30), PointModel(422,32)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 422 ,number = 32, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43543736421902, 35.046516470611095),
                connexionWith = listOf(PointModel(421,31), PointModel(423,33)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 423 ,number = 33, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43535950893535, 35.04645310342312),
                connexionWith = listOf(PointModel(422,32), PointModel(424,34)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 424 ,number = 34, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435332593223784, 35.04642929881811),
                connexionWith = listOf(PointModel(423,33), PointModel(425,35)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 425 ,number = 35, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435298114398925, 35.04639811813831),
                connexionWith = listOf(PointModel(424,34), PointModel(426,36)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 426 ,number = 36, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435206689788714, 35.04628278315067),
                connexionWith = listOf(PointModel(425,35), PointModel(427,37)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 427 ,number = 37, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43566314386706, 35.04692282527685),
                connexionWith = listOf(PointModel(426,36), PointModel(428,38)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 428 ,number = 38, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435632446791594, 35.046893656253815),
                connexionWith = listOf(PointModel(427,37), PointModel(429,39)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 429 ,number = 39, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43561064740789, 35.04684705287218),
                connexionWith = listOf(PointModel(428,38), PointModel(430,40)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 430 ,number = 40, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435579727857814, 35.04681922495365),
                connexionWith = listOf(PointModel(429,39), PointModel(431,41)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 431 ,number = 41, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435547251187835, 35.04678703844547),
                connexionWith = listOf(PointModel(430,40), PointModel(432,42)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 432 ,number = 42, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435267639547135, 35.04647623747587),
                connexionWith = listOf(PointModel(431,41), PointModel(433,43)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 433 ,number = 43, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43516464775945, 35.04638101905584),
                connexionWith = listOf(PointModel(432,42), PointModel(434,44)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 434 ,number = 44, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43514151350629, 35.04636123776436),
                connexionWith = listOf(PointModel(433,43), PointModel(435,45)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 435 ,number = 45, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43507811670086, 35.04630658775568),
                connexionWith = listOf(PointModel(434,44), PointModel(436,46)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 436 ,number = 46, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435003597547706, 35.046239867806435),
                connexionWith = listOf(PointModel(435,45), PointModel(437,47)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 437 ,number = 47, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43494264747253, 35.04618287086487),
                connexionWith = listOf(PointModel(436,46), PointModel(438,48)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 438 ,number = 48, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.434884811567194, 35.046135261654854),
                connexionWith = listOf(PointModel(437,47), PointModel(439,49)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 439 ,number = 49, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.434838765241594, 35.04609536379576),
                connexionWith = listOf(PointModel(438,48), PointModel(440,50)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 440 ,number = 50, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.434804730974136, 35.04616979509592),
                connexionWith = listOf(PointModel(439,49), PointModel(441,51)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 441 ,number = 51, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.434793608659554, 35.046051777899265),
                connexionWith = listOf(PointModel(440,50), PointModel(442,52)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 442 ,number = 52, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.434759796808315, 35.04602260887623),
                connexionWith = listOf(PointModel(441,51), PointModel(443,53)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 443 ,number = 53, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43473510524482, 35.04599712789059),
                connexionWith = listOf(PointModel(442,52), PointModel(444,54)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 444 ,number = 54, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43470596473556, 35.04607390612364),
                connexionWith = listOf(PointModel(443,53), PointModel(445,55)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 445 ,number = 55, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.4347306563132, 35.04609905183315),
                connexionWith = listOf(PointModel(444,54), PointModel(446,56)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 446 ,number = 56, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43476179882644, 35.04612855613232),
                connexionWith = listOf(PointModel(445,55), PointModel(447,57)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 447 ,number = 57, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43485745071209, 35.046202316880226),
                connexionWith = listOf(PointModel(446,56), PointModel(448,58)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 448 ,number = 58, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.434914396865445, 35.04625394940376),
                connexionWith = listOf(PointModel(447,57), PointModel(449,59)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 449 ,number = 59, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43497801632068, 35.0463106110692),
                connexionWith = listOf(PointModel(448,58), PointModel(450,60)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 450 ,number = 60, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43515486019209, 35.04632234573364),
                connexionWith = listOf(PointModel(449,59), PointModel(451,61)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 451 ,number = 61, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435111261005495, 35.04628714174032),
                connexionWith = listOf(PointModel(450,60), PointModel(452,62)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 452 ,number = 62, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43518133110856, 35.04626031965017),
                connexionWith = listOf(PointModel(451,61), PointModel(453,63)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 453 ,number = 63, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.435101250982896, 35.04625093191862),
                connexionWith = listOf(PointModel(452,62), PointModel(454,64)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 454 ,number = 64, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43503696434622, 35.04615671932697),
                connexionWith = listOf(PointModel(453,63), PointModel(455,65)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 455 ,number = 65, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43497556942004, 35.046096704900265),
                connexionWith = listOf(PointModel(454,64), PointModel(456,66)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 456 ,number = 66, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43491083773272, 35.04606485366821),
                connexionWith = listOf(PointModel(455,65), PointModel(457,67)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 457 ,number = 67, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43487480149996, 35.046000480651855),
                connexionWith = listOf(PointModel(456,66), PointModel(458,68)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 458 ,number = 68, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.434885923796756, 35.04600752145052),
                connexionWith = listOf(PointModel(457,67), PointModel(459,69)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 459 ,number = 69, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.43492040290135, 35.04592202603817),
                connexionWith = listOf(PointModel(458,68), PointModel(460,70)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 460 ,number = 70, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.434828087826816, 35.045959912240505),
                connexionWith = listOf(PointModel(459,69), PointModel(461,71)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 461 ,number = 71, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.434810069684275, 35.04600115120411),
                connexionWith = listOf(PointModel(460,70), PointModel(462,72)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 462 ,number = 72, name = null, description = null, locationIndex = NEW, floorIndex = 4,
                location = LatLng(48.434786490376965, 35.04592336714268),
                connexionWith = listOf(PointModel(461,71), PointModel(463,73)),
                connexionFloor = null, connectedLocIndex = NEW, locked = false
            ),
        )
    }
}