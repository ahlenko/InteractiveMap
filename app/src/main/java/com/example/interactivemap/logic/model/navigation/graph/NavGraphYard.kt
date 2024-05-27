package com.example.interactivemap.logic.model.navigation.graph

import com.example.interactivemap.logic.model.navigation.models.FloorModel
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.logic.model.navigation.models.PointModel
import com.example.interactivemap.logic.model.navigation.models.NavObjects.NEW
import com.example.interactivemap.logic.model.navigation.models.NavObjects.OLD
import com.example.interactivemap.logic.model.navigation.models.NavObjects.SK
import com.example.interactivemap.logic.model.navigation.models.NavObjects.YARD
import com.google.android.gms.maps.model.LatLng
object NavGraphYard {
    val navGraphYard: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 1 ,number = 1, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43780944629653, 35.04951652139425),
                connexionWith = listOf(PointModel(2,2), PointModel(37,37), PointModel(68,68)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 2 ,number = 2, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43818513443262, 35.04870280623436),
                connexionWith = listOf(PointModel(1,1), PointModel(3,3)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 3 ,number = 3, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43604485377812, 35.04675518721342),
                connexionWith = listOf(PointModel(2,2), PointModel(4,4), PointModel(155,155)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 4 ,number = 4, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43542980113954, 35.04618152976036),
                connexionWith = listOf(PointModel(3,3), PointModel(5,5), PointModel(6,6)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 5 ,number = 5, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.435373745338985, 35.046337097883224),
                connexionWith = listOf(PointModel(4,4)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 6 ,number = 6, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43472064621561, 35.04555054008961),
                connexionWith = listOf(PointModel(4,4), PointModel(7,7), PointModel(123,123)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 7 ,number = 7, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.433397071496366, 35.04435662180185),
                connexionWith = listOf(PointModel(6,6), PointModel(8,8)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 8 ,number = 8, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43330720063513, 35.044575557112694),
                connexionWith = listOf(PointModel(7,7), PointModel(9,9)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 9 ,number = 9, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43330831289924, 35.04474487155676),
                connexionWith = listOf(PointModel(8,8), PointModel(10,10)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 10 ,number = 10, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.433335229683166, 35.04493296146393),
                connexionWith = listOf(PointModel(9,9), PointModel(11,11)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 11 ,number = 11, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.433415535044695, 35.045118033885956),
                connexionWith = listOf(PointModel(10,10), PointModel(12,12)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 12 ,number = 12, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43353766123766, 35.04553310573101),
                connexionWith = listOf(PointModel(11,11), PointModel(13,13)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 13 ,number = 13, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43356902693383, 35.04577215760946),
                connexionWith = listOf(PointModel(12,12), PointModel(14,14)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 14 ,number = 14, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43357125145057, 35.04600550979376),
                connexionWith = listOf(PointModel(13,13), PointModel(15,15), PointModel(122,122)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 15 ,number = 15, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.433571028998884, 35.04633206874132),
                connexionWith = listOf(PointModel(14,14), PointModel(16,16), PointModel(121,121)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 16 ,number = 16, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43355545737972, 35.04668142646551),
                connexionWith = listOf(PointModel(15,15), PointModel(17,17), PointModel(120,120)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 17 ,number = 17, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43353632652676, 35.04701368510723),
                connexionWith = listOf(PointModel(16,16), PointModel(18,18), PointModel(117,117)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 18 ,number = 18, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43350562816627, 35.04764936864376),
                connexionWith = listOf(PointModel(17,17), PointModel(19,19)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 19 ,number = 19, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43357859235504, 35.048045329749584),
                connexionWith = listOf(PointModel(18,18), PointModel(20,20), PointModel(113,113)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 20 ,number = 20, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43363620729595, 35.04843056201935),
                connexionWith = listOf(PointModel(19,19), PointModel(21,21)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 21 ,number = 21, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43363131336527, 35.04858009517193),
                connexionWith = listOf(PointModel(20,20), PointModel(22,22), PointModel(108,108)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 22 ,number = 22, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.4335859332585, 35.04878897219896),
                connexionWith = listOf(PointModel(21,21), PointModel(23,23)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 23 ,number = 23, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43357169635389, 35.048951245844364),
                connexionWith = listOf(PointModel(22,22), PointModel(24,24)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 24 ,number = 24, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43357859235504, 35.049092061817646),
                connexionWith = listOf(PointModel(23,23), PointModel(25,25)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 25 ,number = 25, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43363954406658, 35.04922281950712),
                connexionWith = listOf(PointModel(24,24), PointModel(26,26)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 26 ,number = 26, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43374565325857, 35.04930831491947),
                connexionWith = listOf(PointModel(25,25), PointModel(27,27)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 27 ,number = 27, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43400992424516, 35.04956278949976),
                connexionWith = listOf(PointModel(26,26), PointModel(28,28)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 28 ,number = 28, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43420834903192, 35.049782395362854),
                connexionWith = listOf(PointModel(27,27), PointModel(29,29), PointModel(105,105)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 29 ,number = 29, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.434417005651184, 35.0500251352787),
                connexionWith = listOf(PointModel(28,28), PointModel(30,30), PointModel(102,102)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 30 ,number = 30, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43490082767063, 35.05058906972408),
                connexionWith = listOf(PointModel(29,29), PointModel(31,31), PointModel(141,141)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 31 ,number = 31, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43533081367212, 35.05109265446663),
                connexionWith = listOf(PointModel(30,30), PointModel(32,32), PointModel(142,142)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 32 ,number = 32, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.435535461706614, 35.051327012479305),
                connexionWith = listOf(PointModel(31,31), PointModel(33,33), PointModel(151,151)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 33 ,number = 33, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.435805284431325, 35.05164485424757),
                connexionWith = listOf(PointModel(32,32), PointModel(34,34), PointModel(152,152)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 34 ,number = 34, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.4360466333048, 35.05192045122385),
                connexionWith = listOf(PointModel(33,33), PointModel(35,35), PointModel(153,153)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 35 ,number = 35, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43628108539832, 35.052185989916325),
                connexionWith = listOf(PointModel(34,34), PointModel(36,36)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 36 ,number = 36, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43646637741649, 35.05185708403587),
                connexionWith = listOf(PointModel(35,35), PointModel(37,37),  PointModel(146,146)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 37 ,number = 37, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43747312631878, 35.05010794848204),
                connexionWith = listOf(PointModel(1,1),PointModel(36,36), PointModel(38,38)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 38 ,number = 38, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43702269428936, 35.049756579101086),
                connexionWith = listOf(PointModel(37,37), PointModel(39,39), PointModel(45,45)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 39 ,number = 39, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43689501554569, 35.04997383803129),
                connexionWith = listOf(PointModel(38,38), PointModel(40,40), PointModel(44,44)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 40 ,number = 40, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.4367655569797, 35.05021020770073),
                connexionWith = listOf(PointModel(39,39), PointModel(41,41), PointModel(42,42)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 41 ,number = 41, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43680782012171, 35.05025044083595),
                connexionWith = listOf(PointModel(40,40)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 42 ,number = 42, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43653021736706, 35.050616562366486),
                connexionWith = listOf(PointModel(40,40), PointModel(43,43)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 43 ,number = 43, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43640654129242, 35.050363428890705),
                connexionWith = listOf(PointModel(42,42), PointModel(44,44), PointModel(48,48)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 44 ,number = 44, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43673486057031, 35.04978574812412),
                connexionWith = listOf(PointModel(39,39),PointModel(43,43), PointModel(45,45)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 45 ,number = 45, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43682872924212, 35.04961173981428),
                connexionWith = listOf(PointModel(38,38), PointModel(44,44), PointModel(46,46)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 46 ,number = 46, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43660807085674, 35.049438402056694),
                connexionWith = listOf(PointModel(45,45), PointModel(47,47)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 47 ,number = 47, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43652198713402, 35.049337819218636),
                connexionWith = listOf(PointModel(46,46), PointModel(48,48), PointModel(52,52)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 48 ,number = 48, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43617854054556, 35.04991851747036),
                connexionWith = listOf(PointModel(47,47), PointModel(49,49)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 49 ,number = 49, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.435906717830235, 35.04957117140293),
                connexionWith = listOf(PointModel(48,48), PointModel(50,50), PointModel(51,51)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 50 ,number = 50, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.4358960406399, 35.049590952694416),
                connexionWith = listOf(PointModel(49,49), PointModel(88,88), PointModel(89,89)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 51 ,number = 51, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43605508605562, 35.04930563271046),
                connexionWith = listOf(PointModel(49,49), PointModel(52,52), PointModel(87,87)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 52 ,number = 52, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43621791245495, 35.04901494830847),
                connexionWith = listOf(PointModel(47,47), PointModel(51,51), PointModel(53,53)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 53 ,number = 53, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.436253280415315, 35.04897102713585),
                connexionWith = listOf(PointModel(52,52), PointModel(54,54), PointModel(86,86)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 54 ,number = 54, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43639341737475, 35.04871051758528),
                connexionWith = listOf(PointModel(53,53), PointModel(55,55), PointModel(85,85)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 55 ,number = 55, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43648906618859, 35.048762150108814),
                connexionWith = listOf(PointModel(54,54), PointModel(56,56)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 56 ,number = 56, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.436552683672026, 35.04879668354988),
                connexionWith = listOf(PointModel(55,55), PointModel(57,57), PointModel(58,58)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 57 ,number = 57, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43648661936072, 35.04890698939562),
                connexionWith = listOf(PointModel(56,56)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 58 ,number = 58, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.436728409873226, 35.04889726638794),
                connexionWith = listOf(PointModel(56,56), PointModel(59,59), PointModel(60,60)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 59 ,number = 59, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43669704612744, 35.04895828664303),
                connexionWith = listOf(PointModel(58,58)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 60 ,number = 60, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.436850305665864, 35.04896901547909),
                connexionWith = listOf(PointModel(58,58), PointModel(61,61), PointModel(78,78)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 61 ,number = 61, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43696908705106, 35.04903204739094),
                connexionWith = listOf(PointModel(60,60), PointModel(62,62), PointModel(63,63)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 62 ,number = 62, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.436909696393165, 35.04912123084068),
                connexionWith = listOf(PointModel(61,61)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 63 ,number = 63, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.437035818044485, 35.04906825721264),
                connexionWith = listOf(PointModel(61,61), PointModel(64,64), PointModel(79,79)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 64 ,number = 64, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43720108809418, 35.0491688400507),
                connexionWith = listOf(PointModel(63,63), PointModel(65,65), PointModel(66,66)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 65 ,number = 65, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.437124347693825, 35.04931904375553),
                connexionWith = listOf(PointModel(64,64)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 66 ,number = 66, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43743442268642, 35.0492949038744),
                connexionWith = listOf(PointModel(64,64), PointModel(67,67), PointModel(68,68)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 67 ,number = 67, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43732854363344, 35.04949405789375),
                connexionWith = listOf(PointModel(66,66)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 68 ,number = 68, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43774672012039, 35.04947528243065),
                connexionWith = listOf(PointModel(1,1),PointModel(66,66), PointModel(69,69), PointModel(84,84)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 69 ,number = 69, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43797382409995, 35.04894956946373),
                connexionWith = listOf(PointModel(68,68), PointModel(70,70)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 70 ,number = 70, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43799206355281, 35.0488680973649),
                connexionWith = listOf(PointModel(69,69), PointModel(71,71)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 71 ,number = 71, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.437983166259556, 35.04880003631115),
                connexionWith = listOf(PointModel(70,70), PointModel(72,72)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 72 ,number = 72, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43793423111881, 35.04871353507042),
                connexionWith = listOf(PointModel(71,71), PointModel(73,73)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 73 ,number = 73, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43682517024352, 35.0479132309556),
                connexionWith = listOf(PointModel(55,55), PointModel(72,72), PointModel(74,74), PointModel(156,156)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 74 ,number = 74, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43697842939539, 35.04807248711586),
                connexionWith = listOf(PointModel(73,73), PointModel(75,75), PointModel(80,80)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 75 ,number = 75, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43701112758711, 35.048345066607),
                connexionWith = listOf(PointModel(74,74), PointModel(76,76)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 76 ,number = 76, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43701891286777, 35.0484848767519),
                connexionWith = listOf(PointModel(75,75), PointModel(77,77)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 77 ,number = 77, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43700957053085, 35.048580430448055),
                connexionWith = listOf(PointModel(76,76), PointModel(78,78)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 78 ,number = 78, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.436975092844044, 35.04866223782301),
                connexionWith = listOf(PointModel(60,60), PointModel(77,77), PointModel(79,79)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 79 ,number = 79, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43713413488178, 35.0488094240427),
                connexionWith = listOf(PointModel(63,63), PointModel(78,78)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 80 ,number = 80, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43760191577967, 35.04882149398327),
                connexionWith = listOf(PointModel(74,74), PointModel(81,81)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 81 ,number = 81, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.437688664973436, 35.04894956946373),
                connexionWith = listOf(PointModel(80,80), PointModel(82,82)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 82 ,number = 82, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43773137221441, 35.049056857824326),
                connexionWith = listOf(PointModel(81,81), PointModel(83,83)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 83 ,number = 83, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43775717448844, 35.04919867962599),
                connexionWith = listOf(PointModel(82,82), PointModel(84,84)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 84 ,number = 84, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.437763402621606, 35.049334801733494),
                connexionWith = listOf(PointModel(68,68), PointModel(83,83)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 85 ,number = 85, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.436024611657885, 35.04849895834923),
                connexionWith = listOf(PointModel(54,54), PointModel(133,133)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 86 ,number = 86, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.436098017110474, 35.04877187311649),
                connexionWith = listOf(PointModel(53,53)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 87 ,number = 87, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.435941196242105, 35.04916414618492),
                connexionWith = listOf(PointModel(51,51)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 88 ,number = 88, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43575723696112, 35.04940889775753),
                connexionWith = listOf(PointModel(50,50)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 89 ,number = 89, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.435835536518844, 35.049660354852676),
                connexionWith = listOf(PointModel(50,50), PointModel(90,90)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 90 ,number = 90, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.435747671950054, 35.04973512142897),
                connexionWith = listOf(PointModel(89,89), PointModel(91,91)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 91 ,number = 91, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43562621839719, 35.04978507757187),
                connexionWith = listOf(PointModel(90,90), PointModel(92,92), PointModel(94,94)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 92 ,number = 92, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43577903628193, 35.049996972084045),
                connexionWith = listOf(PointModel(91,91), PointModel(93,93)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 93 ,number = 93, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43581484943153, 35.0499302521348),
                connexionWith = listOf(PointModel(92,92)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 94 ,number = 94, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43552256000702, 35.04978407174349),
                connexionWith = listOf(PointModel(91,91), PointModel(95,95), PointModel(138,138)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 95 ,number = 95, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43551900091692, 35.049732103943825),
                connexionWith = listOf(PointModel(94,94), PointModel(96,96), PointModel(98,98)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 96 ,number = 96, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43549497705216, 35.04944209009409),
                connexionWith = listOf(PointModel(95,95), PointModel(97,97), PointModel(135,135)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 97 ,number = 97, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.435465392091956, 35.04944745451212),
                connexionWith = listOf(PointModel(96,96), PointModel(98,98)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 98 ,number = 98, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.435343270532556, 35.049723386764526),
                connexionWith = listOf(PointModel(95,95),PointModel(97,97), PointModel(99,99)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 99 ,number = 99, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.4349152866486, 35.04970461130142),
                connexionWith = listOf(PointModel(98,98), PointModel(100,100), PointModel(101,101)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 100 ,number = 100, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.434918178443695, 35.049867890775204),
                connexionWith = listOf(PointModel(99,99)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 101 ,number = 101, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43483275919608, 35.04967577755451),
                connexionWith = listOf(PointModel(99,99), PointModel(102,102)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 102 ,number = 102, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43444014023426, 35.049632862210274),
                connexionWith = listOf(PointModel(29,29), PointModel(101,101), PointModel(103,103)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 103 ,number = 103, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43428531628549, 35.049612410366535),
                connexionWith = listOf(PointModel(102,102), PointModel(104,104)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 104 ,number = 104, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.434220806167595, 35.0494759529829),
                connexionWith = listOf(PointModel(103,103), PointModel(105,105)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 105 ,number = 105, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43419411230173, 35.04948165267706),
                connexionWith = listOf(PointModel(28,28), PointModel(104,104), PointModel(106,106)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 106 ,number = 106, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.434177651077476, 35.049078315496445),
                connexionWith = listOf(PointModel(105,105), PointModel(107,107)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 107 ,number = 107, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.434204344951965, 35.04881042987108),
                connexionWith = listOf(PointModel(106,106), PointModel(108,108)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 108 ,number = 108, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.434237712275376, 35.048650838434696),
                connexionWith = listOf(PointModel(21,21), PointModel(107,107), PointModel(109,109)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 109 ,number = 109, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.4343591691475, 35.04850801080465),
                connexionWith = listOf(PointModel(108,108), PointModel(110,110)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 110 ,number = 110, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43450086846465, 35.04845269024372),
                connexionWith = listOf(PointModel(109,109), PointModel(111,111), PointModel(135,135)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 111 ,number = 111, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.434511990843305, 35.04832796752453),
                connexionWith = listOf(PointModel(110,110), PointModel(112,112), PointModel(154,154)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 112 ,number = 112, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.434521778534524, 35.048147924244404),
                connexionWith = listOf(PointModel(111,111), PointModel(113,113), PointModel(134,134)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 113 ,number = 113, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43443902799492, 35.048131830990314),
                connexionWith = listOf(PointModel(19,19), PointModel(112,112), PointModel(114,114)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 114 ,number = 114, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.434439695338526, 35.04804667085409),
                connexionWith = listOf(PointModel(113,113), PointModel(115,115), PointModel(126,126)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 115 ,number = 115, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.434457268716855, 35.047446861863136),
                connexionWith = listOf(PointModel(114,114), PointModel(116,116), PointModel(118,118),PointModel(125,125)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 116 ,number = 116, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43417053270858, 35.04741836339235),
                connexionWith = listOf(PointModel(115,115), PointModel(117,117)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 117 ,number = 117, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43418076536354, 35.04707872867584),
                connexionWith = listOf(PointModel(17,17), PointModel(116,116)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 118 ,number = 118, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.4344921930076, 35.04685040563345),
                connexionWith = listOf(PointModel(115,115), PointModel(119,119), PointModel(124,124)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 119 ,number = 119, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43449664196011, 35.046768598258495),
                connexionWith = listOf(PointModel(118,118), PointModel(120,120), PointModel(122,122)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 120 ,number = 120, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.434034393711414, 35.046727024018764),
                connexionWith = listOf(PointModel(16,16), PointModel(119,119), PointModel(121,121)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 121 ,number = 121, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43404863048636, 35.04637531936169),
                connexionWith = listOf(PointModel(15,15), PointModel(120,120)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 122 ,number = 122, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.434523558114535, 35.04608765244484),
                connexionWith = listOf(PointModel(119,119), PointModel(123,123)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 123 ,number = 123, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43452578258947, 35.04601892083883),
                connexionWith = listOf(PointModel(6,6), PointModel(122,122)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 124 ,number = 124, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.4350705535679, 35.04736237227917),
                connexionWith = listOf(PointModel(118,118), PointModel(125,125), PointModel(128,128)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 125 ,number = 125, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43492084779286, 35.04771776497364),
                connexionWith = listOf(PointModel(115,115),PointModel(124,124), PointModel(126,126)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 126 ,number = 126, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43498246523067, 35.047759003937244),
                connexionWith = listOf(PointModel(114,114), PointModel(125,125), PointModel(127,127)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 127 ,number = 127, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.435034962338925, 35.04777442663908),
                connexionWith = listOf(PointModel(126,126), PointModel(128,128), PointModel(131,131)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 128 ,number = 128, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.4351655375382, 35.047444850206375),
                connexionWith = listOf(PointModel(124,124), PointModel(127,127), PointModel(129,129)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 129 ,number = 129, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43527876175793, 35.047577284276485),
                connexionWith = listOf(PointModel(128,128), PointModel(130,130)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 130 ,number = 130, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43534037876166, 35.04773788154125),
                connexionWith = listOf(PointModel(129,129), PointModel(131,131)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 131 ,number = 131, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.435373745338985, 35.0479494407773),
                connexionWith = listOf(PointModel(127,127),PointModel(130,130), PointModel(132,132)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 132 ,number = 132, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43538197575801, 35.04799537360668),
                connexionWith = listOf(PointModel(131,131), PointModel(133,133), PointModel(136,136)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 133 ,number = 133, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43538642463261, 35.048145577311516),
                connexionWith = listOf(PointModel(85,85), PointModel(132,132), PointModel(134,134)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 134 ,number = 134, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43539087350683, 35.048214979469776),
                connexionWith = listOf(PointModel(112,112), PointModel(133,133), PointModel(135,135)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 135 ,number = 135, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43541467497724, 35.04854053258896),
                connexionWith = listOf(PointModel(96,96), PointModel(110,110), PointModel(134,134)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 136 ,number = 136, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43556326708248, 35.047852881252766),
                connexionWith = listOf(PointModel(132,132), PointModel(137,137)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 137 ,number = 137, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43566247653954, 35.04772078245878),
                connexionWith = listOf(PointModel(136,136), PointModel(155,155)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 138 ,number = 138, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.4355697179275, 35.0503084436059),
                connexionWith = listOf(PointModel(94,94), PointModel(139,139), PointModel(140,140)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 139 ,number = 139, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43548630176485, 35.05029905587435),
                connexionWith = listOf(PointModel(138,138)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 140 ,number = 140, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43561109229335, 35.050466023385525),
                connexionWith = listOf(PointModel(138,138), PointModel(141,141)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 141 ,number = 141, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43543269290536, 35.0506591424346),
                connexionWith = listOf(PointModel(30,30),PointModel(140,140), PointModel(142,142)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 142 ,number = 142, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.435363735368085, 35.05085729062557),
                connexionWith = listOf(PointModel(31,31), PointModel(141,141)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 143 ,number = 143, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43570229373353, 35.05063131451607),
                connexionWith = listOf(PointModel(140,140), PointModel(144,144), PointModel(150,150)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 144 ,number = 144, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.435891591809934, 35.05092199891806),
                connexionWith = listOf(PointModel(143,143), PointModel(145,145), PointModel(149,149)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 145 ,number = 145, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43606442856804, 35.051209665834904),
                connexionWith = listOf(PointModel(144,144), PointModel(146,146), PointModel(148,148)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 146 ,number = 146, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43621613293428, 35.05145139992237),
                connexionWith = listOf(PointModel(36,36), PointModel(145,145), PointModel(147,147)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 147 ,number = 147, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43634492558173, 35.0512271001935),
                connexionWith = listOf(PointModel(146,146)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 148 ,number = 148, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.436219691975545, 35.05093742161989),
                connexionWith = listOf(PointModel(145,145)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 149 ,number = 149, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43606909982361, 35.05060013383627),
                connexionWith = listOf(PointModel(144,144)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 150 ,number = 150, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.435923845818415, 35.050260834395885),
                connexionWith = listOf(PointModel(143,143)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 151 ,number = 151, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43566225409702, 35.05110740661621),
                connexionWith = listOf(PointModel(32,32)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 152 ,number = 152, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.4358895898363, 35.05149397999048),
                connexionWith = listOf(PointModel(33,33)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 153 ,number = 153, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.4360937907388, 35.05183193832636),
                connexionWith = listOf(PointModel(34,34)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 154 ,number = 154, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43440343632355, 35.04831355065107),
                connexionWith = listOf(PointModel(111,111)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 155 ,number = 155, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43591961943227, 35.04707504063845),
                connexionWith = listOf(PointModel(3,3), PointModel(137,137), PointModel(156,156)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 156 ,number = 156, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43648372765488, 35.04757896065712),
                connexionWith = listOf(PointModel(73,73), PointModel(155,155), PointModel(157,157)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 157 ,number = 157, name = null, description = null, locationIndex = YARD, floorIndex = 1,
                location = LatLng(48.43644079692597, 35.04768759012222),
                connexionWith = listOf(PointModel(156,156)),
                connexionFloor = null, connectedLocIndex = YARD, locked = false
            ),
        )
    }
}