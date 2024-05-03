package com.example.interactivemap.logic.model.navigation.graph
import com.example.interactivemap.logic.model.navigation.models.FloorModel
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.logic.model.navigation.models.NavObjects.NEW
import com.example.interactivemap.logic.model.navigation.models.NavObjects.OLD
import com.example.interactivemap.logic.model.navigation.models.NavObjects.SK
import com.example.interactivemap.logic.model.navigation.models.NavObjects.YARD
import com.google.android.gms.maps.model.LatLng
object NavGraphOld {
    val navGraphOld: List<NavModel> by lazy { // Старий корпус
        listOf(
            // I поверх
            NavModel(
                id = 1, name = "",
                location = LatLng(48.43534794185444, 35.04634749144316),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(2),
                connexionFloor = listOf(FloorModel(1, 155)),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 2, name = "",
                location = LatLng(48.435325919904656, 35.046450421214104),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(1, 3, 27, 28),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 3, name = "",
                location = LatLng(48.435312350819764, 35.046487636864185),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(2, 4, 8, 29),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 4, name = "",
                location = LatLng(48.435281208643964, 35.046557039022446),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(3, 5, 7, 6),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 5, name = "",
                location = LatLng(48.43518889422501, 35.04677329212427),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(4),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 6, name = "",
                location = LatLng(48.435163980425365, 35.04644874483347),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(4),
                connexionFloor = listOf(FloorModel(2, 56), FloorModel(3, 123), FloorModel(4, 204)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 7, name = "",
                location = LatLng(48.43540488745805, 35.046667009592056),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(4),
                connexionFloor = listOf(FloorModel(2, 55), FloorModel(3, 122), FloorModel(4, 200)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 8, name = "",
                location = LatLng(48.43543758666251, 35.04660498350859),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(3, 9, 27),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 9, name = "",
                location = LatLng(48.43550476455397, 35.04666332155466),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(8, 10, 275),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 10, name = "",
                location = LatLng(48.4355688281558, 35.04672233015299),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(9, 11, 26, 274),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 11, name = "",
                location = LatLng(48.43563378144742, 35.046780332922935),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(10, 12, 273, 276),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 12, name = "",
                location = LatLng(48.4356651458496, 35.046810172498226),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(11, 13, 272),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 13, name = "",
                location = LatLng(48.435694953135865, 35.0468373298645),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(12, 14, 271, 25),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 14, name = "",
                location = LatLng(48.43574611485506, 35.046884939074516),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(13, 15, 24),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 15, name = "",
                location = LatLng(48.435810623036296, 35.04694025963545),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(14, 16, 18),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 16, name = "",
                location = LatLng(48.43579594187122, 35.04698250442743),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(15, 17, 22),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 17, name = "",
                location = LatLng(48.43577836895593, 35.04702340811491),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(16, 23),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 18, name = "",
                location = LatLng(48.43582864082401, 35.04689399152994),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(15, 19, 20, 21),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 19, name = "",
                location = LatLng(48.43587624334352, 35.046769939363),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(18),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 20, name = "",
                location = LatLng(48.43587290671976, 35.04693489521742),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(18),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 21, name = "",
                location = LatLng(48.43577436499969, 35.04684403538704),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(18, 25),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 22, name = "",
                location = LatLng(48.43583976291199, 35.047021731734276),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(16),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 23, name = "",
                location = LatLng(48.43582597152253, 35.04706531763077),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(17),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 24, name = "",
                location = LatLng(48.435714528060586, 35.046967417001724),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(14),
                connexionFloor = listOf(FloorModel(2, 58), FloorModel(3, 125), FloorModel(4, 259)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 25, name = "",
                location = LatLng(48.435710079214715, 35.04679173231125),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(13, 21, 276),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 26, name = "",
                location = LatLng(48.43558617870075, 35.04668075591326),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(10, 275),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 27, name = "",
                location = LatLng(48.43545493725227, 35.04656475037336),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(8, 2),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 28, name = "",
                location = LatLng(48.43521803445733, 35.046353191137314),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(2),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 29, name = "",
                location = LatLng(48.43514485017807, 35.04633877426386),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(3, 30, 45),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 30, name = "",
                location = LatLng(48.43507300046398, 35.04627641290426),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(29, 31, 44),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 31, name = "",
                location = LatLng(48.43505142328543, 35.04625428467989),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(30, 32, 47),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 32, name = "",
                location = LatLng(48.43501627693372, 35.0462244451046),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(31, 33, 48, 47),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 33, name = "",
                location = LatLng(48.43495310241764, 35.04616878926754),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(32, 34, 43, 49),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 34, name = "",
                location = LatLng(48.434889482931204, 35.04610877484083),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(33, 35, 50, 42),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 35, name = "",
                location = LatLng(48.434847218193376, 35.04607155919075),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(34, 36, 51),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 36, name = "",
                location = LatLng(48.43480406363532, 35.046030320227146),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(35, 37, 52, 39),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 37, name = "",
                location = LatLng(48.4347709191303, 35.046001486480236),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(36, 38, 41, 53),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 38, name = "",
                location = LatLng(48.43474600512568, 35.04598170518875),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(37, 54),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 39, name = "",
                location = LatLng(48.43483965502607, 35.0459361076355),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(36, 40, 41, 42),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 40, name = "",
                location = LatLng(48.43487146481042, 35.04586033523083),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(39),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 41, name = "",
                location = LatLng(48.43480562075919, 35.04590794444084),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(39, 37),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 42, name = "",
                location = LatLng(48.43492796605665, 35.04601623862982),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(39, 34, 43),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 43, name = "",
                location = LatLng(48.43499225283123, 35.04606921225786),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(42, 33, 44),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 44, name = "",
                location = LatLng(48.435112595675015, 35.04618085920811),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(43, 45, 30),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 45, name = "",
                location = LatLng(48.43518222088703, 35.0462432205677),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(44, 29),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 46, name = "",
                location = LatLng(48.43503073587881, 35.04619192332029),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(32),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 47, name = "",
                location = LatLng(48.43503763168196, 35.04628647118807),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(31),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 48, name = "",
                location = LatLng(48.4349846896855, 35.046296529471874),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(32),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 49, name = "",
                location = LatLng(48.43493419453662, 35.04621237516403),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(33, 50),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 50, name = "",
                location = LatLng(48.434871909702395, 35.046155378222466),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(34, 49),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 51, name = "",
                location = LatLng(48.4348178553022, 35.046148002147675),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(50, 52),
                connexionFloor = listOf(FloorModel(2, 57), FloorModel(3, 124), FloorModel(4, 228)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 52, name = "",
                location = LatLng(48.43477381093359, 35.04610776901245),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(36),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 53, name = "",
                location = LatLng(48.43474044396228, 35.0460759177804),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(37),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 54, name = "",
                location = LatLng(48.4347157523894, 35.0460534542799),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(38),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),

            NavModel(
                id = 271, name = "",
                location = LatLng(48.435665590734594, 35.046909749507904),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(13),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 272, name = "",
                location = LatLng(48.435636673201635, 35.046886280179024),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(12),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 273, name = "",
                location = LatLng(48.43561843290313, 35.04681956022978),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(11, 274),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 274, name = "",
                location = LatLng(48.43555503669281, 35.04676189273596),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(10, 273),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 275, name = "",
                location = LatLng(48.435524339551996, 35.046619065105915),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(9, 26),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 276, name = "",
                location = LatLng(48.43564912998707, 35.04673507064581),
                locationIndex = OLD, floorIndex = 1,
                connexionWith = listOf(11, 25),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),

            // II поверх

            NavModel(
                id = 55, name = "",
                location = LatLng(48.43540444257076, 35.046666003763676),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(59),
                connexionFloor = listOf(FloorModel(1, 7), FloorModel(3, 122), FloorModel(4, 200)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 56, name = "",
                location = LatLng(48.43516375798068, 35.04644338041544),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(59),
                connexionFloor = listOf(FloorModel(1, 6), FloorModel(3, 123), FloorModel(4, 204)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 57, name = "",
                location = LatLng(48.43481918997946, 35.04614666104317),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(108),
                connexionFloor = listOf(FloorModel(1, 51), FloorModel(3, 124), FloorModel(4, 228)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 58, name = "",
                location = LatLng(48.43571653004111, 35.0469583645463),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(71),
                connexionFloor = listOf(FloorModel(1, 24), FloorModel(3, 125), FloorModel(4, 259)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 59, name = "",
                location = LatLng(48.435284100418244, 35.04655368626118),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(55, 56, 62, 60),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 60, name = "",
                location = LatLng(48.435239166676375, 35.04666097462177),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(59, 61),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 61, name = "",
                location = LatLng(48.435171543544406, 35.046852082014084),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(60),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 62, name = "",
                location = LatLng(48.435314575260165, 35.04648596048355),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(59, 63, 94),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 63, name = "",
                location = LatLng(48.435417789187504, 35.0465801730752),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(62, 64, 277),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 64, name = "",
                location = LatLng(48.43547451226948, 35.04663247615099),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(63, 65, 88),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 65, name = "",
                location = LatLng(48.435535906592754, 35.046688467264175),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(64, 66, 87),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 66, name = "",
                location = LatLng(48.43556838326999, 35.04671461880207),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(65, 67, 86, 93),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 67, name = "",
                location = LatLng(48.43560553122463, 35.04674881696701),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(66, 68, 85, 92),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 68, name = "",
                location = LatLng(48.43563689564426, 35.04677698016167),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(67, 69, 91),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 69, name = "",
                location = LatLng(48.43566714783206, 35.04680313169956),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(68, 70, 84, 90),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 70, name = "",
                location = LatLng(48.43569517557821, 35.04683565348387),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(69, 71, 83, 89),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 71, name = "",
                location = LatLng(48.43574811683434, 35.04688259214163),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(70, 72, 58),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 72, name = "",
                location = LatLng(48.435812625013035, 35.04693824797869),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(71, 73, 77, 78),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 73, name = "",
                location = LatLng(48.43579416233577, 35.0469858571887),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(72, 74, 76),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 74, name = "",
                location = LatLng(48.43577592209382, 35.04702910780907),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(73, 75),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 75, name = "",
                location = LatLng(48.4358170738499, 35.04706934094429),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(74),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 76, name = "",
                location = LatLng(48.43583865070332, 35.04702877253294),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(73),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 77, name = "",
                location = LatLng(48.435858670455985, 35.04698283970356),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(72),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 78, name = "",
                location = LatLng(48.435831977450654, 35.04689130932093),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(72, 79, 81),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 79, name = "",
                location = LatLng(48.43580194780291, 35.046866834163666),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(78, 80),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 80, name = "",
                location = LatLng(48.43581974315187, 35.04681620746851),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(79),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 81, name = "",
                location = LatLng(48.435870904745414, 35.046927854418755),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(78),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 82, name = "",
                location = LatLng(48.43587824531766, 35.046762228012085),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(78),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 83, name = "",
                location = LatLng(48.43572186865543, 35.04675954580307),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(70),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 84, name = "",
                location = LatLng(48.4357049630415, 35.04670523107052),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(69, 85),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 85, name = "",
                location = LatLng(48.43564468113549, 35.046655274927616),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(84, 86, 67),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 86, name = "",
                location = LatLng(48.43561064740789, 35.046630799770355),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(85, 66),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 87, name = "",
                location = LatLng(48.43557394434276, 35.04660163074732),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(65),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 88, name = "",
                location = LatLng(48.43551121540642, 35.04654597491026),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(64),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 89, name = "",
                location = LatLng(48.43566959469939, 35.04690304398537),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(70),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 90, name = "",
                location = LatLng(48.435638007857364, 35.04688125103712),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(69),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 91, name = "",
                location = LatLng(48.43560575366738, 35.04685040563345),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(68),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 92, name = "",
                location = LatLng(48.43557416678566, 35.04682157188654),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(67),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 93, name = "",
                location = LatLng(48.43553968812472, 35.046792067587376),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(66),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 94, name = "",
                location = LatLng(48.435220926235175, 35.046401135623455),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(62, 95, 96),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 95, name = "",
                location = LatLng(48.43525028889341, 35.04632972180843),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(94),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 96, name = "",
                location = LatLng(48.4351484092944, 35.046336092054844),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(94, 97, 99),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 97, name = "",
                location = LatLng(48.43519000644793, 35.04624657332897),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(96, 98),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 98, name = "",
                location = LatLng(48.43509101851329, 35.04615806043148),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(97, 99, 109),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 99, name = "",
                location = LatLng(48.43505097839507, 35.04624892026186),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(96, 98, 100, 101),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 100, name = "",
                location = LatLng(48.435027399199555, 35.04631295800209),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(99, 100),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 101, name = "",
                location = LatLng(48.43498802636758, 35.04619091749191),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(99, 102, 103),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 102, name = "",
                location = LatLng(48.43496222268714, 35.04625461995602),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(101),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 103, name = "",
                location = LatLng(48.43495933089456, 35.046168118715286),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(101, 104, 105),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 104, name = "",
                location = LatLng(48.43493530676512, 35.046227127313614),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(103),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 105, name = "",
                location = LatLng(48.434926853827996, 35.04613358527422),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(103, 106, 107),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 106, name = "",
                location = LatLng(48.43490105011649, 35.04619728773832),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(105),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 107, name = "",
                location = LatLng(48.43489415429482, 35.046105086803436),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(105, 108, 109),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 108, name = "",
                location = LatLng(48.43485166711481, 35.0460672006011),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(107, 57, 115),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 109, name = "",
                location = LatLng(48.43493197007958, 35.04601188004017),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(98, 107, 110),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 110, name = "",
                location = LatLng(48.434884144229414, 35.045964270830154),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(109, 111),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 111, name = "",
                location = LatLng(48.4349046092499, 35.04591967910528),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(110, 112),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 112, name = "",
                location = LatLng(48.43485789560413, 35.04588212817907),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(111, 113),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 113, name = "",
                location = LatLng(48.43483965502607, 35.045931078493595),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(112, 114, 115),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 114, name = "",
                location = LatLng(48.434786490376965, 35.04588481038809),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(113, 119),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 115, name = "",
                location = LatLng(48.434802728957685, 35.04602327942848),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(108, 113, 117),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 116, name = "",
                location = LatLng(48.43477381093359, 35.04609737545252),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(115),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 117, name = "",
                location = LatLng(48.43477403338001, 35.04599679261446),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(115, 118, 119),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 118, name = "",
                location = LatLng(48.43474400310694, 35.04606854170561),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(117),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 119, name = "",
                location = LatLng(48.434748229590895, 35.045977011322975),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(114, 117, 120),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 120, name = "",
                location = LatLng(48.434720423768965, 35.046040043234825),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(119, 121),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 121, name = "",
                location = LatLng(48.43469350771886, 35.04610911011696),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(120, 122),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 277, name = "",
                location = LatLng(48.43545004349679, 35.046498365700245),
                locationIndex = OLD, floorIndex = 2,
                connexionWith = listOf(63),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),

            // III поверх

            NavModel(
                id = 122, name = "",
                location = LatLng(48.43540444257076, 35.046666003763676),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(126),
                connexionFloor = listOf(FloorModel(1, 7), FloorModel(2, 55), FloorModel(4, 200)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 123, name = "",
                location = LatLng(48.43516375798068, 35.04644338041544),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(126),
                connexionFloor = listOf(FloorModel(1, 6), FloorModel(2, 56), FloorModel(4, 204)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 124, name = "",
                location = LatLng(48.43481918997946, 35.04614666104317),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(180),
                connexionFloor = listOf(FloorModel(1, 51), FloorModel(2, 57), FloorModel(4, 228)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 125, name = "",
                location = LatLng(48.43571653004111, 35.0469583645463),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(137),
                connexionFloor = listOf(FloorModel(1, 24), FloorModel(2, 58), FloorModel(4, 259)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 126, name = "",
                location = LatLng(48.435281208643964, 35.04656106233597),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(122, 123, 127),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 127, name = "",
                location = LatLng(48.43530812438275, 35.046495012938976),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(126, 128, 164),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 128, name = "",
                location = LatLng(48.435327254568556, 35.04651244729757),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(127, 129, 163),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 129, name = "",
                location = LatLng(48.435418678961824, 35.04659526050091),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(128, 130, 162),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 130, name = "",
                location = LatLng(48.435468951185825, 35.04664018750191),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(129, 131, 161),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 131, name = "",
                location = LatLng(48.43551677648548, 35.04668578505516),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(130, 132, 160),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 132, name = "",
                location = LatLng(48.435592407100025, 35.04675284028053),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(131, 133, 155, 159),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 133, name = "",
                location = LatLng(48.435634893660605, 35.04678938537836),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(132, 134, 158),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 134, name = "",
                location = LatLng(48.43566158676947, 35.046813525259495),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(133, 135, 157),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 135, name = "",
                location = LatLng(48.43569250626973, 35.046841353178024),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(134, 136, 154, 156),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 136, name = "",
                location = LatLng(48.435722091097674, 35.04686750471592),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(135, 137, 153),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 137, name = "",
                location = LatLng(48.43574589241292, 35.04689164459705),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(136, 138, 125),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 138, name = "",
                location = LatLng(48.43576680197039, 35.04690941423178),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(137, 139, 148),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 139, name = "",
                location = LatLng(48.435808398617624, 35.04694528877735),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(138, 140, 142, 280),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 140, name = "",
                location = LatLng(48.435789268612965, 35.046992897987366),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(139, 141, 279),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 141, name = "",
                location = LatLng(48.4357712508113, 35.0470344722271),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(140, 142, 278),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 142, name = "",
                location = LatLng(48.435826861289705, 35.04690270870924),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(139, 143),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 143, name = "",
                location = LatLng(48.435846436163615, 35.04685375839472),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(142, 144, 148),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 144, name = "",
                location = LatLng(48.43591027689319, 35.04691008478403),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(143, 145),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 145, name = "",
                location = LatLng(48.435928517086914, 35.04686515778303),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(144, 146, 152),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 146, name = "",
                location = LatLng(48.435815294315205, 35.046757869422436),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(151, 145, 147),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 147, name = "",
                location = LatLng(48.43579482966158, 35.046807155013084),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(146, 148),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 148, name = "",
                location = LatLng(48.4358066190826, 35.04681754857302),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(147, 143, 130),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 149, name = "",
                location = LatLng(48.435847325930425, 35.04666768014431),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(141, 150),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 150, name = "",
                location = LatLng(48.43596388524875, 35.04677429795265),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(149, 152),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 151, name = "",
                location = LatLng(48.435827528615064, 35.04671260714531),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(146, 149, 152),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 152, name = "",
                location = LatLng(48.43594453286136, 35.046817883849144),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(151, 145, 150),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 153, name = "",
                location = LatLng(48.43576524487598, 35.04677463322878),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(136),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 154, name = "",
                location = LatLng(48.43572965413364, 35.046744123101234),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(135, 155),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 155, name = "",
                location = LatLng(48.4356335590048, 35.04665929824114),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(154, 132),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 156, name = "",
                location = LatLng(48.435668482487, 35.046902038156986),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(135),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 157, name = "",
                location = LatLng(48.43563578343113, 35.04688158631325),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(134),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 158, name = "",
                location = LatLng(48.435617320689616, 35.04683431237936),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(133, 159),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 159, name = "",
                location = LatLng(48.43557438922854, 35.04679575562477),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(132, 158),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 160, name = "",
                location = LatLng(48.43553479437741, 35.046647898852825),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(131, 161),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 161, name = "",
                location = LatLng(48.4354858568783, 35.0465989485383),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(160, 130),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 162, name = "",
                location = LatLng(48.435438031549516, 35.0465489923954),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(129),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 163, name = "",
                location = LatLng(48.43536306803662, 35.04641890525818),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(128),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 164, name = "",
                location = LatLng(48.4352024633429, 35.04639342427254),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(127, 165, 166),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 165, name = "",
                location = LatLng(48.43523872178764, 35.0463055819273),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(164, 167),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 166, name = "",
                location = LatLng(48.43513528505171, 35.04633575677872),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(164, 168, 167),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 167, name = "",
                location = LatLng(48.435174435324925, 35.04624590277672),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(166, 165),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 168, name = "",
                location = LatLng(48.4350451948198, 35.046252608299255),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(166, 169, 170, 171),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 169, name = "",
                location = LatLng(48.43507856159099, 35.046176835894585),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(168),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 170, name = "",
                location = LatLng(48.43501850138708, 35.0463193282485),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(168),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 171, name = "",
                location = LatLng(48.43501471981631, 35.046229138970375),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(168, 172, 173),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 172, name = "",
                location = LatLng(48.43498802636758, 35.046296864748),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(171),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 173, name = "",
                location = LatLng(48.43498313256712, 35.046198293566704),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(171, 174, 175, 177),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 174, name = "",
                location = LatLng(48.43495399220009, 35.04626467823982),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(173),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 175, name = "",
                location = LatLng(48.43501805649643, 35.046121180057526),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(173, 176),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 176, name = "",
                location = LatLng(48.434987359031176, 35.04607927054167),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(175, 177, 199),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 177, name = "",
                location = LatLng(48.434948875950724, 35.04616878926754),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(176, 178, 179, 173),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 178, name = "",
                location = LatLng(48.4349235171419, 35.0462331622839),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(177),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 179, name = "",
                location = LatLng(48.43489370940305, 35.04611983895302),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(177, 180, 188, 199),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 180, name = "",
                location = LatLng(48.434843881502054, 35.04607457667589),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(179, 181, 124),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 181, name = "",
                location = LatLng(48.434800949387466, 35.04603501409292),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(180, 182, 187, 190),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 182, name = "",
                location = LatLng(48.4347689171125, 35.046003833413124),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(181, 183, 186),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 183, name = "",
                location = LatLng(48.43474044396228, 35.0459810346365),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(182, 184),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 184, name = "",
                location = LatLng(48.434666591654484, 35.04616241902113),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(183, 185),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 185, name = "",
                location = LatLng(48.434502203150224, 35.04615504294634),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(184),
                connexionFloor = listOf(FloorModel(4, 328)),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 186, name = "",
                location = LatLng(48.43473933172954, 35.04608228802681),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(182),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 187, name = "",
                location = LatLng(48.43476958445177, 35.04611011594534),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(181),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 188, name = "",
                location = LatLng(48.43487546883784, 35.04615671932697),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(179, 189),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 189, name = "",
                location = LatLng(48.43491039284114, 35.046186558902264),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(188),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 190, name = "",
                location = LatLng(48.43482141444144, 35.04598740488291),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(181),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 191, name = "",
                location = LatLng(48.43488436667535, 35.04598941653967),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(180, 192,193),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 192, name = "",
                location = LatLng(48.43477981698611, 35.045889504253864),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(191, 197),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 193, name = "",
                location = LatLng(48.43490839082886, 35.04592873156071),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(191, 198,197),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 194, name = "",
                location = LatLng(48.434936418993594, 35.04585161805153),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(198, 195),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 195, name = "",
                location = LatLng(48.43483631833424, 35.04575941711664),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(194, 196),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 196, name = "",
                location = LatLng(48.43481763285599, 35.04579562693834),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(195, 197,198),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 197, name = "",
                location = LatLng(48.43479828003199, 35.045842565596104),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(196, 193,192),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 198, name = "",
                location = LatLng(48.43492018045559, 35.0458962097764),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(193, 194, 196),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 199, name = "",
                location = LatLng(48.43492907828527, 35.046034678816795),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(176, 179),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 278, name = "",
                location = LatLng(48.43581796361725, 35.04707973450422),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(141),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 279, name = "",
                location = LatLng(48.43583442431007, 35.04703212529421),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(140),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 280, name = "",
                location = LatLng(48.43584710348874, 35.04698183387518),
                locationIndex = OLD, floorIndex = 3,
                connexionWith = listOf(139),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),

            // IV поверх

            NavModel(
                id = 200, name = "",
                location = LatLng(48.43540444257076, 35.046666003763676),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(202),
                connexionFloor = listOf(FloorModel(1, 7), FloorModel(2, 55), FloorModel(3, 122)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 201, name = "",
                location = LatLng(48.43516375798068, 35.04644338041544),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(202),
                connexionFloor = listOf(FloorModel(1, 6), FloorModel(2, 56), FloorModel(3, 123)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 202, name = "",
                location = LatLng(48.43528254330903, 35.04655670374632),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(200, 201, 203),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 203, name = "",
                location = LatLng(48.43531057126739, 35.04648830741644),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(202, 204, 203, 209),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 204, name = "",
                location = LatLng(48.435343937864275, 35.04640515893698),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(203),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 205, name = "",
                location = LatLng(48.43533704210271, 35.04651311784983),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(203, 206, 207),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 206, name = "",
                location = LatLng(48.43537330045142, 35.04641957581043),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(205),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 207, name = "",
                location = LatLng(48.43541489742083, 35.04657983779907),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(205, 208, 241),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 208, name = "",
                location = LatLng(48.43544159064529, 35.04651177674532),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(207),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 209, name = "",
                location = LatLng(48.435275647539164, 35.046454444527626),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(203, 210, 212),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 210, name = "",
                location = LatLng(48.435316799700466, 35.04634816199541),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(209, 211),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 211, name = "",
                location = LatLng(48.435215142679276, 35.04625730216503),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(210, 212, 213),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 212, name = "",
                location = LatLng(48.435172433323054, 35.04636123776436),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(209, 211, 214),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 213, name = "",
                location = LatLng(48.435189339114174, 35.046240873634815),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(211, 215),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 214, name = "",
                location = LatLng(48.43514907662869, 35.046340115368366),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(212, 215, 216),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 215, name = "",
                location = LatLng(48.435163980425365, 35.04629887640476),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(213, 214, 281),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 216, name = "",
                location = LatLng(48.43508946139817, 35.04628546535969),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(214, 217, 218),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 217, name = "",
                location = LatLng(48.43511037122578, 35.04622645676136),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(216),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 218, name = "",
                location = LatLng(48.43501360758957, 35.04621874541044),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(216, 219, 220, 222),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 219, name = "",
                location = LatLng(48.434987359031176, 35.04628110677004),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(218),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 220, name = "",
                location = LatLng(48.43504408259373, 35.04613861441612),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(218, 221),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 221, name = "",
                location = LatLng(48.434986914140254, 35.046077594161034),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(220, 222),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 222, name = "",
                location = LatLng(48.43495132285266, 35.04615940153599),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(218, 221, 223, 224),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 223, name = "",
                location = LatLng(48.43492729871946, 35.04622310400009),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(222),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 224, name = "",
                location = LatLng(48.43489304206543, 35.04611011594534),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(222, 225, 226, 227),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 225, name = "",
                location = LatLng(48.43486879545866, 35.04617314785719),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(224),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 226, name = "",
                location = LatLng(48.43491862333523, 35.04604674875736),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(224),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 227, name = "",
                location = LatLng(48.43484855286984, 35.04606954753399),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(224, 229, 228, 235),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 228, name = "",
                location = LatLng(48.43481918997946, 35.04614666104317),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(227),
                connexionFloor = listOf(FloorModel(1, 51), FloorModel(2, 57), FloorModel(3, 124)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 229, name = "",
                location = LatLng(48.434802728957685, 35.04602763801813),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(227, 230, 231),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 230, name = "",
                location = LatLng(48.434773588487204, 35.0460983812809),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(229),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 231, name = "",
                location = LatLng(48.43476958445177, 35.04599913954735),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(229, 232, 233),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 232, name = "",
                location = LatLng(48.434744892893065, 35.04606485366821),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(231),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 233, name = "",
                location = LatLng(48.4347420010881, 35.04597835242748),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(231, 234),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 234, name = "",
                location = LatLng(48.434721091108855, 35.046034678816795),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(233),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 235, name = "",
                location = LatLng(48.43488280955389, 35.0459773465991),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(227, 236, 239),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),

            NavModel(
                id = 236, name = "",
                location = LatLng(48.43483854279548, 35.0459361076355),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(235, 237, 238),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 237, name = "",
                location = LatLng(48.43482163688762, 35.04597935825586),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(236),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 238, name = "",
                location = LatLng(48.43479249642798, 35.04589654505253),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(236),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 239, name = "",
                location = LatLng(48.43489393184893, 35.04598807543516),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(235, 240),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 240, name = "",
                location = LatLng(48.434928188502376, 35.04589553922415),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(239),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 241, name = "",
                location = LatLng(48.4354760693728, 35.04663784056902),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(207, 242, 244),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 242, name = "",
                location = LatLng(48.4354943097224, 35.04659291356802),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(241, 243),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 243, name = "",
                location = LatLng(48.43558907045766, 35.0466750562191),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(242, 244),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 244, name = "",
                location = LatLng(48.435570830142076, 35.04672434180975),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(241, 243, 245, 246),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 245, name = "",
                location = LatLng(48.43555036538996, 35.04677899181843),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(244),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 246, name = "",
                location = LatLng(48.43560375168253, 35.04675418138504),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(244, 247, 248, 252),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 247, name = "",
                location = LatLng(48.435585956257896, 35.04679575562477),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(246),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 248, name = "",
                location = LatLng(48.435630889693066, 35.04668511450291),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(246, 249),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 249, name = "",
                location = LatLng(48.43569384092398, 35.046741776168346),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(248, 250),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 250, name = "",
                location = LatLng(48.43567026202683, 35.046809166669846),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(249, 251, 252, 254),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 251, name = "",
                location = LatLng(48.43564156693915, 35.04687923938036),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(250),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 252, name = "",
                location = LatLng(48.43563533854586, 35.046784691512585),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(246, 250, 253),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 253, name = "",
                location = LatLng(48.43561954511664, 35.04682458937168),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(247, 252),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 254, name = "",
                location = LatLng(48.435697622444216, 35.04683665931225),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(250, 255, 256),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 255, name = "",
                location = LatLng(48.435672486451566, 35.046900026500225),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(254),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 256, name = "",
                location = LatLng(48.43572542773133, 35.04686314612627),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(254, 257, 258),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 257, name = "",
                location = LatLng(48.435751898350524, 35.0467924028635),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(256),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 258, name = "",
                location = LatLng(48.435747671950054, 35.0468822568655),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(256, 259, 260),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 259, name = "",
                location = LatLng(48.43571653004111, 35.0469583645463),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(258),
                connexionFloor = listOf(FloorModel(1, 24), FloorModel(2, 58), FloorModel(3, 125)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 260, name = "",
                location = LatLng(48.43576947127498, 35.04690371453762),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(258, 261, 265),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 261, name = "",
                location = LatLng(48.435807508850125, 35.046815536916256),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(260, 262, 263),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 262, name = "",
                location = LatLng(48.43579594187122, 35.046802796423435),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(261, 270),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 263, name = "",
                location = LatLng(48.43584932790571, 35.04684504121542),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(261, 264),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 264, name = "",
                location = LatLng(48.43583286721772, 35.04689298570156),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(263, 265),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 265, name = "",
                location = LatLng(48.4358128474549, 35.04693925380707),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(264, 266, 260),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 266, name = "",
                location = LatLng(48.43579238280026, 35.04698853939772),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(265, 267, 269),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 267, name = "",
                location = LatLng(48.435775699651806, 35.04703111946583),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(266, 268),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 268, name = "",
                location = LatLng(48.43582063291914, 35.04707269370556),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(267),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 269, name = "",
                location = LatLng(48.43583931802852, 35.047029443085194),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(266),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 270, name = "",
                location = LatLng(48.4358308652418, 35.04671327769756),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(262),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 281, name = "",
                location = LatLng(48.43512994637577, 35.046259984374046),
                locationIndex = OLD, floorIndex = 4,
                connexionWith = listOf(215),
                connexionFloor = listOf(),
                connectedLocIndex = OLD
            ),
        )
    }
}