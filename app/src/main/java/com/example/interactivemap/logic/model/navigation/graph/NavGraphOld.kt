package com.example.interactivemap.logic.model.navigation.graph

import com.example.interactivemap.logic.model.navigation.models.FloorModel
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.logic.model.navigation.models.PointModel
import com.example.interactivemap.logic.model.navigation.models.NavObjects.NEW
import com.example.interactivemap.logic.model.navigation.models.NavObjects.OLD
import com.example.interactivemap.logic.model.navigation.models.NavObjects.SK
import com.example.interactivemap.logic.model.navigation.models.NavObjects.YARD
import com.google.android.gms.maps.model.LatLng
object NavGraphOld {
    val navGraphOld0: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 672 ,number = 1, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43424082655778, 35.04826996475458),
                connexionWith = listOf(PointModel(673,2)),
                connexionFloor = listOf(FloorModel(1, PointModel(469, 7))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 673 ,number = 2, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43417609393436, 35.048265270888805),
                connexionWith = listOf(PointModel(672,1), PointModel(674,3), PointModel(701,30)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 674 ,number = 3, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43417320209703, 35.04830718040466),
                connexionWith = listOf(PointModel(673,2), PointModel(675,4), PointModel(677,6)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 675 ,number = 4, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434210573520666, 35.048311203718185),
                connexionWith = listOf(PointModel(674,3)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 676 ,number = 5, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43421235311157, 35.04833500832319),
                connexionWith = listOf(PointModel(677,6)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 677 ,number = 6, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43417787352649, 35.0483313202858),
                connexionWith = listOf(PointModel(674,3), PointModel(676,5), PointModel(678,7)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 678 ,number = 7, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43417297964799, 35.04835579544306),
                connexionWith = listOf(PointModel(677,6), PointModel(679,8), PointModel(680,9)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 679 ,number = 8, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43412404083716, 35.04834942519665),
                connexionWith = listOf(PointModel(678,7)),
                connexionFloor = listOf(FloorModel(1, PointModel(467, 5)), FloorModel(2, PointModel(829, 1)), FloorModel(3, PointModel(1083, 1)), FloorModel(4, PointModel(1309, 1)), FloorModel(5, PointModel(1560, 1))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 680 ,number = 9, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434171644953764, 35.04840172827244),
                connexionWith = listOf(PointModel(678,7), PointModel(681,10), PointModel(683,12)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 681 ,number = 10, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43419611434215, 35.04840474575758),
                connexionWith = listOf(PointModel(680,9), PointModel(682,11)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 682 ,number = 11, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434194334750664, 35.04845067858696),
                connexionWith = listOf(PointModel(681,10)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 683 ,number = 12, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434120481649074, 35.048398710787296),
                connexionWith = listOf(PointModel(680,9), PointModel(684,13), PointModel(693,22)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 684 ,number = 13, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.4340744346308, 35.04839334636927),
                connexionWith = listOf(PointModel(683,12), PointModel(685,14), PointModel(698,27)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 685 ,number = 14, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43394185457701, 35.048380605876446),
                connexionWith = listOf(PointModel(684,13), PointModel(686,15), PointModel(691,20)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 686 ,number = 15, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43386711130693, 35.0483762472868),
                connexionWith = listOf(PointModel(685,14), PointModel(828,157), PointModel(690,19), PointModel(699,28)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 687 ,number = 16, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43378413725036, 35.048365853726864),
                connexionWith = listOf(PointModel(828,157), PointModel(688,17), PointModel(700,29)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 688 ,number = 17, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43377768617863, 35.04846040159464),
                connexionWith = listOf(PointModel(687,16)),
                connexionFloor = listOf(FloorModel(1, PointModel(483, 21)), FloorModel(2, PointModel(846, 18)), FloorModel(3, PointModel(1097, 15)), FloorModel(4, PointModel(1324, 16)), FloorModel(5, PointModel(1579, 20))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 689 ,number = 18, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43382618042195, 35.048443637788296),
                connexionWith = listOf(PointModel(828,157)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 690 ,number = 19, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43386755620766, 35.04844933748245),
                connexionWith = listOf(PointModel(686,15)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 691 ,number = 20, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43394185457701, 35.048449002206326),
                connexionWith = listOf(PointModel(685,14), PointModel(692,21)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 692 ,number = 21, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43403105696671, 35.048459731042385),
                connexionWith = listOf(PointModel(691,20)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 693 ,number = 22, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43411959185201, 35.048438273370266),
                connexionWith = listOf(PointModel(683,12), PointModel(694,23), PointModel(696,25), PointModel(697,26)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 694 ,number = 23, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434106912242235, 35.048438273370266),
                connexionWith = listOf(PointModel(693,22), PointModel(695,24)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 695 ,number = 24, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434104242850296, 35.04848085343838),
                connexionWith = listOf(PointModel(694,23)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 696 ,number = 25, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43416230209329, 35.04844330251217),
                connexionWith = listOf(PointModel(693,22)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 697 ,number = 26, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.4341293796188, 35.048480182886124),
                connexionWith = listOf(PointModel(693,22)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 698 ,number = 27, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43407599177702, 35.04832360893488),
                connexionWith = listOf(PointModel(684,13)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 699 ,number = 28, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43387222766523, 35.048303827643394),
                connexionWith = listOf(PointModel(686,15)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 700 ,number = 29, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.4337859168562, 35.048297457396984),
                connexionWith = listOf(PointModel(687,16)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 701 ,number = 30, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43417609393436, 35.04822738468647),
                connexionWith = listOf(PointModel(673,2),  PointModel(702,31), PointModel(703,32)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 702 ,number = 31, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434214800049, 35.04823241382837),
                connexionWith = listOf(PointModel(701,30)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 703 ,number = 32, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43418076536354, 35.04810232669115),
                connexionWith = listOf(PointModel(701,30), PointModel(704,33), PointModel(705,34)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 704 ,number = 33, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43420545719644, 35.0481066852808),
                connexionWith = listOf(PointModel(703,32)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 705 ,number = 34, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43418766128203, 35.048004761338234),
                connexionWith = listOf(PointModel(703,32), PointModel(706,35), PointModel(707,36)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 706 ,number = 35, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43421435515128, 35.04800844937563),
                connexionWith = listOf(PointModel(705,34), PointModel(708,37)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 707 ,number = 36, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43418855107792, 35.047966204583645),
                connexionWith = listOf(PointModel(705,34), PointModel(708,37)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 708 ,number = 37, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43421635719091, 35.047972574830055),
                connexionWith = listOf(PointModel(706,35), PointModel(707,36)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 709 ,number = 38, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43420123066735, 35.04766345024109),
                connexionWith = listOf( PointModel(707,36), PointModel(710,39), PointModel(711,40)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 710 ,number = 39, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434239491865334, 35.047666132450104),
                connexionWith = listOf(PointModel(709,38)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 711 ,number = 40, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43420212046296, 35.047592371702194),
                connexionWith = listOf(PointModel(709,38), PointModel(712,41), PointModel(714,43), PointModel(717,46)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 712 ,number = 41, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434236822480344, 35.047598741948605),
                connexionWith = listOf(PointModel(711,40), PointModel(713,42)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 713 ,number = 42, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.4342399367628, 35.047532357275486),
                connexionWith = listOf(PointModel(712,41)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 714 ,number = 43, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43420723678752, 35.04754610359669),
                connexionWith = listOf(PointModel(711,40), PointModel(715,44), PointModel(716,45)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 715 ,number = 44, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434213242907006, 35.0474988296628),
                connexionWith = listOf(PointModel(714,43)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 716 ,number = 45, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43416385923681, 35.04753973335028),
                connexionWith = listOf(PointModel(714,43)),
                connexionFloor = listOf(FloorModel(1, PointModel(500, 38)), FloorModel(2, PointModel(891, 63)), FloorModel(3, PointModel(1127, 45)), FloorModel(4, PointModel(1356, 48)), FloorModel(5, PointModel(1613, 54))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 717 ,number = 46, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43411113877919, 35.047582648694515),
                connexionWith = listOf(PointModel(711,40), PointModel(718,47), PointModel(720,49), PointModel(721,50)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 718 ,number = 47, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434113585721455, 35.04753738641739),
                connexionWith = listOf(PointModel(717,46), PointModel(719,48)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 719 ,number = 48, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43412070409834, 35.047495141625404),
                connexionWith = listOf(PointModel(718,47)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 720 ,number = 49, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43410735714087, 35.047644674777985),
                connexionWith = listOf(PointModel(717,46)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 721 ,number = 50, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43404885293593, 35.047577284276485),
                connexionWith = listOf(PointModel(717,46), PointModel(722,51), PointModel(737,66), PointModel(738,67)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 722 ,number = 51, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433948528077906, 35.04756856709719),
                connexionWith = listOf(PointModel(721,50), PointModel(723,52), PointModel(736,65)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 723 ,number = 52, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43393073207352, 35.04756957292557),
                connexionWith = listOf(PointModel(722,51), PointModel(724,53), PointModel(734,63), PointModel(741,70)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 724 ,number = 53, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433816392596746, 35.04755649715662),
                connexionWith = listOf(PointModel(723,52), PointModel(725,54), PointModel(733,62), PointModel(742,71)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 725 ,number = 54, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433730081692886, 35.04754677414894),
                connexionWith = listOf(PointModel(724,53), PointModel(726,55), PointModel(732,61), PointModel(743,72)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 726 ,number = 55, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43367491382185, 35.04753973335028),
                connexionWith = listOf(PointModel(725,54), PointModel(727,56), PointModel(744,73)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 727 ,number = 56, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43362997865684, 35.047536715865135),
                connexionWith = listOf(PointModel(726,55), PointModel(728,57), PointModel(730,59), PointModel(745,74)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 728 ,number = 57, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433592161903, 35.047530345618725),
                connexionWith = listOf(PointModel(727,56), PointModel(729,58), PointModel(746,75)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 729 ,number = 58, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433590159838786, 35.04762187600136),
                connexionWith = listOf(PointModel(728,57)),
                connexionFloor = listOf(FloorModel(1, PointModel(533, 71)), FloorModel(2, PointModel(910, 82)), FloorModel(3, PointModel(1154, 72)), FloorModel(4, PointModel(1388, 80)), FloorModel(5, PointModel(1629, 70))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 730 ,number = 59, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43362775414268, 35.04758667200804),
                connexionWith = listOf(PointModel(727,56), PointModel(731,60)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 731 ,number = 60, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433678695492354, 35.04759203642607),
                connexionWith = listOf(PointModel(730,59)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 732 ,number = 61, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43372807963409, 35.04761852324009),
                connexionWith = listOf(PointModel(725,54), PointModel(733,62)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 733 ,number = 62, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43381394564015, 35.04762623459101),
                connexionWith = listOf(PointModel(724,53),PointModel(732,61)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 734 ,number = 63, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43392828512243, 35.04760343581438),
                connexionWith = listOf(PointModel(723,52), PointModel(735,64)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 735 ,number = 64, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433877121572685, 35.0475974008441),
                connexionWith = listOf(PointModel(734,63)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 736 ,number = 65, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433944523977466, 35.047641322016716),
                connexionWith = listOf(PointModel(722,51)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 737 ,number = 66, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434046628440136, 35.047649033367634),
                connexionWith = listOf(PointModel(721,50)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 738 ,number = 67, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.4340515223308, 35.04751291126013),
                connexionWith = listOf(PointModel(721,50), PointModel(739,68)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 739 ,number = 68, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43397144042437, 35.0475038588047),
                connexionWith = listOf(PointModel(738,67), PointModel(740,69)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 740 ,number = 69, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43397210777411, 35.04747502505779),
                connexionWith = listOf(PointModel(739,68), PointModel(741,70)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 741 ,number = 70, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433934513725, 35.047472678124905),
                connexionWith = listOf(PointModel(723,52), PointModel(740,69)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 742 ,number = 71, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43381906200382, 35.04748608916998),
                connexionWith = listOf(PointModel(724,53), PointModel(743,72)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 743 ,number = 72, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43373119394774, 35.04747971892357),
                connexionWith = listOf(PointModel(725,54),PointModel(742,71)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 744 ,number = 73, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43367758323635, 35.047472678124905),
                connexionWith = listOf(PointModel(726,55)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 745 ,number = 74, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43363309297647, 35.04746697843075),
                connexionWith = listOf(PointModel(727,56)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 746 ,number = 75, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433595721128086, 35.04746496677399),
                connexionWith = listOf(PointModel(728,57)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 747 ,number = 76, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43419611434215, 35.046865828335285),
                connexionWith = listOf(PointModel(748,77)),
                connexionFloor = listOf(FloorModel(1, PointModel(561, 99)), FloorModel(2, PointModel(938, 110)), FloorModel(3, PointModel(1185, 103)), FloorModel(4, PointModel(1415, 107)), FloorModel(5, PointModel(1659, 100))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 748 ,number = 77, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434237489826614, 35.04686884582043),
                connexionWith = listOf(PointModel(747,76), PointModel(749,78), PointModel(750,79)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 749 ,number = 78, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434239046967846, 35.046819895505905),
                connexionWith = listOf(PointModel(748,77)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 750 ,number = 79, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43422992656855, 35.046916119754314),
                connexionWith = listOf(PointModel(748,77), PointModel(751,80), PointModel(752,81), PointModel(762,91)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 751 ,number = 80, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434260179594105, 35.04691947251558),
                connexionWith = listOf(PointModel(750,79)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 752 ,number = 81, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43422903677339, 35.04700094461441),
                connexionWith = listOf(PointModel(750,79), PointModel(753,82), PointModel(754,83)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 753 ,number = 82, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43427330406283, 35.04700765013695),
                connexionWith = listOf(PointModel(752,81)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 754 ,number = 83, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43422547759268, 35.04707906395197),
                connexionWith = listOf(PointModel(752,81), PointModel(755,84), PointModel(756,85)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 755 ,number = 84, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43426351632377, 35.04708543419838),
                connexionWith = listOf(PointModel(754,83)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 756 ,number = 85, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434226367387865, 35.04710789769888),
                connexionWith = listOf(PointModel(754,83), PointModel(757,86), PointModel(758,87)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 757 ,number = 86, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43426262652922, 35.04711225628853),
                connexionWith = listOf(PointModel(756,85)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 758 ,number = 87, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43422058371876, 35.047188363969326),
                connexionWith = listOf(PointModel(756,85), PointModel(759,88), PointModel(761,90)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 759 ,number = 88, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43421591229322, 35.047325156629086),
                connexionWith = listOf(PointModel(758,87), PointModel(760,89)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 760 ,number = 89, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43425217144203, 35.04732716828585),
                connexionWith = listOf(PointModel(759,88), PointModel(761,90)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 761 ,number = 90, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.4342570653129, 35.04719406366348),
                connexionWith = listOf(PointModel(758,87), PointModel(760,89)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 762 ,number = 91, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434197893933586, 35.04691142588854),
                connexionWith = listOf(PointModel(750,79), PointModel(763,92), PointModel(764,93)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 763 ,number = 92, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434194334750664, 35.046986527740955),
                connexionWith = listOf(PointModel(762,91)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 764 ,number = 93, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.4341405020788, 35.046904720366),
                connexionWith = listOf(PointModel(762,91), PointModel(765,94), PointModel(766,95)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 765 ,number = 94, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43414361636716, 35.04682760685682),
                connexionWith = listOf(PointModel(764,93)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 766 ,number = 95, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43411581021435, 35.04690304398537),
                connexionWith = listOf(PointModel(764,93), PointModel(767,96)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 767 ,number = 96, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43411136122848, 35.04696775227785),
                connexionWith = listOf(PointModel(766,95)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 768 ,number = 97, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434221028616406, 35.0461882352829),
                connexionWith = listOf(PointModel(769,98)),
                connexionFloor = listOf(FloorModel(1, PointModel(610, 148)), FloorModel(2, PointModel(996, 168)), FloorModel(3, PointModel(1232, 150)), FloorModel(4, PointModel(1473, 165)), FloorModel(5, PointModel(1720, 161))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 769 ,number = 98, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43425862245351, 35.04619661718607),
                connexionWith = listOf(PointModel(768,97), PointModel(770,99), PointModel(773,102)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 770 ,number = 99, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43427285916564, 35.04619561135769),
                connexionWith = listOf(PointModel(769,98), PointModel(771,100)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 771 ,number = 100, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43427508365156, 35.04613861441612),
                connexionWith = listOf(PointModel(770,99), PointModel(772,101)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 772 ,number = 101, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434240159211555, 35.04613425582647),
                connexionWith = listOf(PointModel(771,100)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 773 ,number = 102, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434261069388704, 35.0462381914258),
                connexionWith = listOf(PointModel(769,98), PointModel(774,103), PointModel(776,105), PointModel(779,108)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 774 ,number = 103, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43429109994724, 35.04624221473932),
                connexionWith = listOf(PointModel(773,102), PointModel(775,104)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 775 ,number = 104, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43429465912334, 35.046169459819794),
                connexionWith = listOf(PointModel(774,103)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 776 ,number = 105, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43425417348016, 35.046413876116276),
                connexionWith = listOf(PointModel(773,102), PointModel(777,106)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 777 ,number = 106, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43424305104508, 35.04668679088354),
                connexionWith = listOf(PointModel(776,105), PointModel(778,107)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 778 ,number = 107, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43429310198382, 35.04669114947319),
                connexionWith = listOf(PointModel(777,106)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 779 ,number = 108, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.4342221408605, 35.04623718559742),
                connexionWith = listOf(PointModel(773,102), PointModel(780,109), PointModel(782,111)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 780 ,number = 109, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434169420463334, 35.04623148590326),
                connexionWith = listOf(PointModel(779,108), PointModel(781,110)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 781 ,number = 110, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43417253474991, 35.04616241902113),
                connexionWith = listOf(PointModel(780,109)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 782 ,number = 111, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43421746943511, 35.0463055819273),
                connexionWith = listOf(PointModel(779,108)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 783 ,number = 112, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43410335305295, 35.04632133990526),
                connexionWith = listOf(PointModel(784,113)),
                connexionFloor = listOf(FloorModel(1, PointModel(648, 186)), FloorModel(2, PointModel(1026, 198)), FloorModel(3, PointModel(1259, 177)), FloorModel(4, PointModel(1507, 199)), FloorModel(5, PointModel(1745, 186))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 784 ,number = 113, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43410624489425, 35.046224780380726),
                connexionWith = listOf(PointModel(783,112), PointModel(785,114), PointModel(786,115)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 785 ,number = 114, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43410891428609, 35.046156384050846),
                connexionWith = listOf(PointModel(784,113)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 786 ,number = 115, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434070208090795, 35.04622243344784),
                connexionWith = listOf(PointModel(784,113), PointModel(787,116), PointModel(800,129), PointModel(801,130)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 787 ,number = 116, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43395653627786, 35.04620868712664),
                connexionWith = listOf(PointModel(786,115), PointModel(788,117), PointModel(799,128), PointModel(802,131)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 788 ,number = 117, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43390515030633, 35.04620432853699),
                connexionWith = listOf(PointModel(787,116), PointModel(789,118), PointModel(797,126), PointModel(803,132)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 789 ,number = 118, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43387400726799, 35.04620298743248),
                connexionWith = listOf(PointModel(788,117), PointModel(790,119), PointModel(804,133)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 790 ,number = 119, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433817949750896, 35.046193934977055),
                connexionWith = listOf(PointModel(789,118), PointModel(791,120), PointModel(796,125), PointModel(805,134)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 791 ,number = 120, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433708503944025, 35.04618354141712),
                connexionWith = listOf(PointModel(790,119), PointModel(792,121), PointModel(795,124), PointModel(807,136)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 792 ,number = 121, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433650666633795, 35.04618018865585),
                connexionWith = listOf(PointModel(791,120), PointModel(793,122), PointModel(794,123)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 793 ,number = 122, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433645772704516, 35.046273060142994),
                connexionWith = listOf(PointModel(792,121)),
                connexionFloor = listOf(FloorModel(1, PointModel(638, 176))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 794 ,number = 123, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43364977682849, 35.04610273987055),
                connexionWith = listOf(PointModel(792,121)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 795 ,number = 124, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433704722275756, 35.04627574235201),
                connexionWith = listOf(PointModel(791,120), PointModel(796,125)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 796 ,number = 125, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43381505789318, 35.04628982394934),
                connexionWith = listOf(PointModel(790,119), PointModel(795,124), PointModel(797,126)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 797 ,number = 126, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433899811501114, 35.04630323499441),
                connexionWith = listOf(PointModel(788,117), PointModel(796,125), PointModel(798,127)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 798 ,number = 127, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43393718312584, 35.0463055819273),
                connexionWith = listOf(PointModel(797,126)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 799 ,number = 128, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433957426077754, 35.04627238959074),
                connexionWith = listOf(PointModel(787,116), PointModel(800,129)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 800 ,number = 129, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43406620399995, 35.04628345370293),
                connexionWith = listOf(PointModel(786,115), PointModel(799,128)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 801 ,number = 130, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.4340713203382, 35.04613760858774),
                connexionWith = listOf(PointModel(786,115), PointModel(802,131)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 802 ,number = 131, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43396254242697, 35.04612855613232),
                connexionWith = listOf(PointModel(787,116), PointModel(801,130)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 803 ,number = 132, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433907374808335, 35.046125538647175),
                connexionWith = listOf(PointModel(788,117)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 804 ,number = 133, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433877121572685, 35.04616040736437),
                connexionWith = listOf(PointModel(789,118), PointModel(805,134)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 805 ,number = 134, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43385198467937, 35.04615772515535),
                connexionWith = listOf(PointModel(804,133)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 806 ,number = 135, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433821064059025, 35.04612822085619),
                connexionWith = listOf(PointModel(790,119), PointModel(807,136)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 807 ,number = 136, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.433709393748266, 35.04611782729626),
                connexionWith = listOf(PointModel(791,120), PointModel(806,135)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 808 ,number = 137, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43424305104508, 35.045509301126),
                connexionWith = listOf(PointModel(809,138)),
                connexionFloor = listOf(FloorModel(1, PointModel(652, 190)), FloorModel(2, PointModel(1063, 235)), FloorModel(3, PointModel(1292, 210)), FloorModel(4, PointModel(1537, 229)), FloorModel(5, PointModel(1769, 210))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 809 ,number = 138, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43429176729277, 35.045515671372414),
                connexionWith = listOf(PointModel(808,137), PointModel(810,139), PointModel(814,143)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 810 ,number = 139, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43429421422636, 35.045499578118324),
                connexionWith = listOf(PointModel(809,138), PointModel(811,140), PointModel(813,142)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 811 ,number = 140, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43429510402035, 35.04545699805021),
                connexionWith = listOf(PointModel(810,139), PointModel(812,141)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 812 ,number = 141, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434325357007104, 35.0454593449831),
                connexionWith = listOf(PointModel(811,140)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 813 ,number = 142, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.4343240223169, 35.04550024867058),
                connexionWith = listOf(PointModel(810,139)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 814 ,number = 143, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434289320359056, 35.0455629453063),
                connexionWith = listOf(PointModel(809,138), PointModel(815,144), PointModel(817,146), PointModel(822,151)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 815 ,number = 144, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.4343160141749, 35.04556596279144),
                connexionWith = listOf(PointModel(814,143), PointModel(816,145)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 816 ,number = 145, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434315791726476, 35.0457426533103),
                connexionWith = listOf(PointModel(815,144), PointModel(817,146)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 817 ,number = 146, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43428464893985, 35.04573795944452),
                connexionWith = listOf(PointModel(814,143), PointModel(816,145), PointModel(818,147)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 818 ,number = 147, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43427908772595, 35.045838207006454),
                connexionWith = listOf(PointModel(817,146), PointModel(819,148), PointModel(821,150)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 819 ,number = 148, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43430711623785, 35.04584189504385),
                connexionWith = listOf(PointModel(818,147), PointModel(820,149)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 820 ,number = 149, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43430155502638, 35.046013221144676),
                connexionWith = listOf(PointModel(819,148), PointModel(821,150)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 821 ,number = 150, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434271969371245, 35.04601154476404),
                connexionWith = listOf(PointModel(818,147), PointModel(820,149)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 822 ,number = 151, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43425461837753, 35.04555758088827),
                connexionWith = listOf(PointModel(814,143), PointModel(823,152), PointModel(826,155)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 823 ,number = 152, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43420078576953, 35.0455491989851),
                connexionWith = listOf(PointModel(822,151), PointModel(824,153), PointModel(825,154)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 824 ,number = 153, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434164971482176, 35.04554685205221),
                connexionWith = listOf(PointModel(823,152)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 825 ,number = 154, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434202342911874, 35.04547879099846),
                connexionWith = listOf(PointModel(823,152)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 826 ,number = 155, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43425261633939, 35.045597814023495),
                connexionWith = listOf(PointModel(822,151), PointModel(827,156)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 827 ,number = 156, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.434179208220534, 35.04559379070997),
                connexionWith = listOf(PointModel(826,155)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 828 ,number = 157, name = null, description = null, locationIndex = OLD, floorIndex = 0,
                location = LatLng(48.43382929472958, 35.04837088286877),
                connexionWith = listOf(PointModel(827,15), PointModel(829,17)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
        )
    }
    val navGraphOld1: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 463 ,number = 1, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43440321387553, 35.04831288009882),
                connexionWith = listOf(PointModel(464,2)),
                connexionFloor = listOf(FloorModel(1, PointModel(154, 154))), connectedLocIndex = YARD, locked = false
            ),
            NavModel(
                id = 464 ,number = 2, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43430400195951, 35.048300474882126),
                connexionWith = listOf(PointModel(463,1), PointModel(465,3)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 465 ,number = 3, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43426329387514, 35.04836719483137),
                connexionWith = listOf(PointModel(464,2), PointModel(466,4)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 466 ,number = 4, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43416853066714, 35.04835847765207),
                connexionWith = listOf(PointModel(465,3), PointModel(467,5), PointModel(468,6), PointModel(471,9)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 467 ,number = 5, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4341293796188, 35.04835244268179),
                connexionWith = listOf(PointModel(466,4)),
                connexionFloor = listOf(FloorModel(0, PointModel(679, 8)), FloorModel(2, PointModel(829, 1)), FloorModel(3, PointModel(1083, 1)), FloorModel(4, PointModel(1309, 1)), FloorModel(5, PointModel(1560, 1))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 468 ,number = 6, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434174536791204, 35.04826661199331),
                connexionWith = listOf(PointModel(466,4), PointModel(469,7), PointModel(470,8)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 469 ,number = 7, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43423571023658, 35.04827331751585),
                connexionWith = listOf(PointModel(468,6)),
                connexionFloor = listOf(FloorModel(0, PointModel(672, 1))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 470 ,number = 8, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43417564903631, 35.04822537302971),
                connexionWith = listOf(PointModel(468,6)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 471 ,number = 9, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434166973523745, 35.04840038716793),
                connexionWith = listOf(PointModel(466,4), PointModel(472,10), PointModel(474,12)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 472 ,number = 10, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434200340871705, 35.04840441048145),
                connexionWith = listOf(PointModel(471,9), PointModel(473,11)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 473 ,number = 11, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43423103881244, 35.04841111600399),
                connexionWith = listOf(PointModel(472,10), PointModel(494,32)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 474 ,number = 12, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43413494084909, 35.04840038716793),
                connexionWith = listOf(PointModel(471,9), PointModel(475,13), PointModel(491,29)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 475 ,number = 13, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4340779938221, 35.04839334636927),
                connexionWith = listOf(PointModel(474,12), PointModel(476,14), PointModel(490,28), PointModel(495,33)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 476 ,number = 14, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43398990376399, 35.04838529974222),
                connexionWith = listOf(PointModel(475,13), PointModel(477,15), PointModel(496,34)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 477 ,number = 15, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43395609137788, 35.04838228225708),
                connexionWith = listOf(PointModel(476,14), PointModel(478,16), PointModel(489,27)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 478 ,number = 16, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43392561572113, 35.04838027060032),
                connexionWith = listOf(PointModel(477,15), PointModel(479,17), PointModel(488,26)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 479 ,number = 17, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43386866845951, 35.04837691783905),
                connexionWith = listOf(PointModel(478,16), PointModel(480,18), PointModel(486,24), PointModel(498,36)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 480 ,number = 18, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433837080497824, 35.04837390035391),
                connexionWith = listOf(PointModel(479,17), PointModel(481,19)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 481 ,number = 19, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43380905172662, 35.04837155342102),
                connexionWith = listOf(PointModel(480,18), PointModel(482,20), PointModel(484,22)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 482 ,number = 20, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4337816902922, 35.048368871212006),
                connexionWith = listOf(PointModel(481,19), PointModel(483,21)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 483 ,number = 21, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43377501676939, 35.048458725214005),
                connexionWith = listOf(PointModel(482,20)),
                connexionFloor = listOf(FloorModel(0, PointModel(688, 17)), FloorModel(2, PointModel(846, 18)), FloorModel(3, PointModel(1097, 15)), FloorModel(4, PointModel(1324, 16)), FloorModel(5, PointModel(1579, 20))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 484 ,number = 22, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43380816192411, 35.04844229668379),
                connexionWith = listOf(PointModel(481,19)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 485 ,number = 23, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43383307638858, 35.048442631959915),
                connexionWith = listOf(PointModel(480,18)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 486 ,number = 24, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4338664439558, 35.04842150956392),
                connexionWith = listOf(PointModel(479,17), PointModel(487,25)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 487 ,number = 25, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43389669719782, 35.04842318594456),
                connexionWith = listOf(PointModel(486,24)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 488 ,number = 26, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43392339121991, 35.048447996377945),
                connexionWith = listOf(PointModel(478,16)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 489 ,number = 27, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433955424027914, 35.04845101386309),
                connexionWith = listOf(PointModel(477,15), PointModel(490,28)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 490 ,number = 28, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434073322383455, 35.04846844822168),
                connexionWith = listOf(PointModel(475,13), PointModel(489,27)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 491 ,number = 29, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43413293880628, 35.04847079515457),
                connexionWith = listOf(PointModel(474,12)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 492 ,number = 30, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43416786331997, 35.04847448319197),
                connexionWith = listOf(PointModel(471,9)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 493 ,number = 31, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43419878372928, 35.048474818468094),
                connexionWith = listOf(PointModel(472,10)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 494 ,number = 32, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43422614493905, 35.04847750067711),
                connexionWith = listOf(PointModel(473,11)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 495 ,number = 33, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4340779938221, 35.04832796752453),
                connexionWith = listOf(PointModel(475,13)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 496 ,number = 34, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43398968131414, 35.04834271967411),
                connexionWith = listOf(PointModel(476,14), PointModel(497,35)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 497 ,number = 35, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43393251167424, 35.04833735525608),
                connexionWith = listOf(PointModel(496,34)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 498 ,number = 36, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43387556442036, 35.04829578101635),
                connexionWith = listOf(PointModel(479,17)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 499 ,number = 37, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4338375253988, 35.04830349236727),
                connexionWith = listOf(PointModel(480,18)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 500 ,number = 38, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43417587148535, 35.0475350394845),
                connexionWith = listOf(PointModel(501,39)),
                connexionFloor = listOf(FloorModel(0, PointModel(716, 45)), FloorModel(2, PointModel(891, 63)), FloorModel(3, PointModel(1127, 45)), FloorModel(4, PointModel(1356, 48)), FloorModel(5, PointModel(1613, 54))), connectedLocIndex = OLD, locked = false
            ), //las
            NavModel(
                id = 501 ,number = 39, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43417587148535, 35.047589018940926),
                connexionWith = listOf(PointModel(500,38), PointModel(502,40), PointModel(520,58), PointModel(545,83)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 502 ,number = 40, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43420345515638, 35.047591365873814),
                connexionWith = listOf(PointModel(501,39), PointModel(503,41), PointModel(505,43), PointModel(508,46)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 503 ,number = 41, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43420367760526, 35.04755012691021),
                connexionWith = listOf(PointModel(502,40), PointModel(504,42), PointModel(506,44)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 504 ,number = 42, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434206346991985, 35.04750285297632),
                connexionWith = listOf(PointModel(503,41)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 505 ,number = 43, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43423504289031, 35.0475937128067),
                connexionWith = listOf(PointModel(502,40), PointModel(506,44), PointModel(507,45), PointModel(511,49)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 506 ,number = 44, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434236155134094, 35.04755079746246),
                connexionWith = listOf(PointModel(505,43)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 507 ,number = 45, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43434849163191, 35.047605112195015),
                connexionWith = listOf(PointModel(505,43)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 508 ,number = 46, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43419566944431, 35.04777979105711),
                connexionWith = listOf(PointModel(502,40), PointModel(509,47), PointModel(512,50)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 509 ,number = 47, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434233485748955, 35.04778549075127),
                connexionWith = listOf(PointModel(508,46)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 510 ,number = 48, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434226589836676, 35.04774995148182),
                connexionWith = listOf(PointModel(511,49)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 511 ,number = 49, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43423081636365, 35.04768390208483),
                connexionWith = listOf(PointModel(505,43), PointModel(510,48)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 512 ,number = 50, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434194557199625, 35.047852881252766),
                connexionWith = listOf(PointModel(508,46), PointModel(513,51), PointModel(514,52)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 513 ,number = 51, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43422747963186, 35.04785791039467),
                connexionWith = listOf(PointModel(512,50)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 514 ,number = 52, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43418944087377, 35.04793267697096),
                connexionWith = listOf(PointModel(513,51)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 515 ,number = 53, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4342619591833, 35.048061423003674),
                connexionWith = listOf(PointModel(516,54)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 516 ,number = 54, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43421079596953, 35.04805739969015),
                connexionWith = listOf(PointModel(515,53), PointModel(517,55)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 517 ,number = 55, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43421346535587, 35.047997049987316),
                connexionWith = listOf(PointModel(516,54), PointModel(518,56), PointModel(519,57)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 518 ,number = 56, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43418365720045, 35.047995038330555),
                connexionWith = listOf(PointModel(517,55)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 519 ,number = 57, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43421524494669, 35.04792496562004),
                connexionWith = listOf(PointModel(517,55)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 520 ,number = 58, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43411047143126, 35.04758331924677),
                connexionWith = listOf(PointModel(501,39), PointModel(521,59), PointModel(546,84)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 521 ,number = 59, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43404751823847, 35.04757929593325),
                connexionWith = listOf(PointModel(520,58), PointModel(522,60), PointModel(543,81), PointModel(547,85)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 522 ,number = 60, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43400592014956, 35.04757326096296),
                connexionWith = listOf(PointModel(521,59), PointModel(523,61), PointModel(542,80), PointModel(548,86)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 523 ,number = 61, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43396187507711, 35.04757024347782),
                connexionWith = listOf(PointModel(522,60), PointModel(524,62), PointModel(541,79), PointModel(549,87)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 524 ,number = 62, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43390537275654, 35.04756823182106),
                connexionWith = listOf(PointModel(523,61), PointModel(525,63), PointModel(539,77), PointModel(551,89)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 525 ,number = 63, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43381617014615, 35.047555826604366),
                connexionWith = listOf(PointModel(524,62), PointModel(526,64), PointModel(538,76), PointModel(553,91)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 526 ,number = 64, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43378636175766, 35.047551803290844),
                connexionWith = listOf(PointModel(525,63), PointModel(527,65), PointModel(537,75), PointModel(554,92)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 527 ,number = 65, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43376233707361, 35.04754811525345),
                connexionWith = listOf(PointModel(526,64), PointModel(528,66), PointModel(555,93)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 528 ,number = 66, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433719404045114, 35.04754442721605),
                connexionWith = listOf(PointModel(527,65), PointModel(529,67), PointModel(556,94)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 529 ,number = 67, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433708281492954, 35.04754275083542),
                connexionWith = listOf(PointModel(528,66), PointModel(530,68), PointModel(536,74)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 530 ,number = 68, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43367958529713, 35.04754241555929),
                connexionWith = listOf(PointModel(529,67), PointModel(531,69), PointModel(535,73), PointModel(557,95)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 531 ,number = 69, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433646884961206, 35.04753973335028),
                connexionWith = listOf(PointModel(530,68), PointModel(532,70), PointModel(534,72), PointModel(558,96)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 532 ,number = 70, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433594163967136, 35.04753269255161),
                connexionWith = listOf(PointModel(531,69), PointModel(533,71), PointModel(559,97)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 533 ,number = 71, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43358838022608, 35.047621205449104),
                connexionWith = listOf(PointModel(532,70)),
                connexionFloor = listOf(FloorModel(0, PointModel(729, 58)), FloorModel(2, PointModel(910, 82)), FloorModel(3, PointModel(1154, 72)), FloorModel(4, PointModel(1388, 80)), FloorModel(5, PointModel(1629, 70))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 534 ,number = 72, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43363954406658, 35.047616846859455),
                connexionWith = listOf(PointModel(531,69)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 535 ,number = 73, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433675136273074, 35.04762154072523),
                connexionWith = listOf(PointModel(530,68)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 536 ,number = 74, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43370383247141, 35.0476248934865),
                connexionWith = listOf(PointModel(529,67)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 537 ,number = 75, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43378258009519, 35.04762623459101),
                connexionWith = listOf(PointModel(526,64), PointModel(538,76)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 538 ,number = 76, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433811721134056, 35.04763092845678),
                connexionWith = listOf(PointModel(525,63), PointModel(537,75)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 539 ,number = 77, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43390314825444, 35.047598741948605),
                connexionWith = listOf(PointModel(524,62), PointModel(540,78)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 540 ,number = 78, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43387511951969, 35.04759639501572),
                connexionWith = listOf(PointModel(539,77)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 541 ,number = 79, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4339587607776, 35.047638304531574),
                connexionWith = listOf(PointModel(523,61)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 542 ,number = 80, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434003250752305, 35.04763897508383),
                connexionWith = listOf(PointModel(522,60)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 543 ,number = 81, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43404395904504, 35.04764333367348),
                connexionWith = listOf(PointModel(521,59)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 544 ,number = 82, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43408733669809, 35.04762522876263),
                connexionWith = listOf(PointModel(545,83)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 545 ,number = 83, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43417120005569, 35.047632940113544),
                connexionWith = listOf(PointModel(501,39), PointModel(544,82)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 546 ,number = 84, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434114030620066, 35.04751022905111),
                connexionWith = listOf(PointModel(520,58)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 547 ,number = 85, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434050854982104, 35.04750452935696),
                connexionWith = listOf(PointModel(521,59)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 548 ,number = 86, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43400569769978, 35.047498159110546),
                connexionWith = listOf(PointModel(522,60)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 549 ,number = 87, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43396432202657, 35.047535710036755),
                connexionWith = listOf(PointModel(523,61), PointModel(550,88)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 550 ,number = 88, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43393050962344, 35.04753168672323),
                connexionWith = listOf(PointModel(549,87), PointModel(551,89)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 551 ,number = 89, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43390692990795, 35.04752900451422),
                connexionWith = listOf(PointModel(524,62), PointModel(550,88)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 552 ,number = 90, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43384597851717, 35.047519616782665),
                connexionWith = listOf(PointModel(553,91)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 553 ,number = 91, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43381750484972, 35.0475162640214),
                connexionWith = listOf(PointModel(525,63), PointModel(552,90)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 554 ,number = 92, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433790365870564, 35.04748173058033),
                connexionWith = listOf(PointModel(526,64)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 555 ,number = 93, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433763449327756, 35.04750721156597),
                connexionWith = listOf(PointModel(527,65), PointModel(556,94)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 556 ,number = 94, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43372029384918, 35.04750318825245),
                connexionWith = listOf(PointModel(528,66), PointModel(555,93)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 557 ,number = 95, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43367780568755, 35.047479048371315),
                connexionWith = listOf(PointModel(530,68)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 558 ,number = 96, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43364777476654, 35.047474689781666),
                connexionWith = listOf(PointModel(531,69)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 559 ,number = 97, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43359594357964, 35.04746798425913),
                connexionWith = listOf(PointModel(532,70)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 560 ,number = 98, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43418810617998, 35.046864822506905),
                connexionWith = listOf(PointModel(561,99), PointModel(563,101)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 561 ,number = 99, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434191220465415, 35.046825259923935),
                connexionWith = listOf(PointModel(560,98), PointModel(562,100)),
                connexionFloor = listOf(FloorModel(0, PointModel(747, 76)), FloorModel(2, PointModel(938, 110)), FloorModel(3, PointModel(1185, 103)), FloorModel(4, PointModel(1415, 107)), FloorModel(5, PointModel(1659, 100))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 562 ,number = 100, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4342399367628, 35.04682660102844),
                connexionWith = listOf(PointModel(561,99)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 563 ,number = 101, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43422836942702, 35.04687286913395),
                connexionWith = listOf(PointModel(560,98), PointModel(564,102), PointModel(566,104)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 564 ,number = 102, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4342873183223, 35.046876557171345),
                connexionWith = listOf(PointModel(563,101), PointModel(565,103)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 565 ,number = 103, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43428709587377, 35.04683297127485),
                connexionWith = listOf(PointModel(564,102)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 566 ,number = 104, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43423081636365, 35.0469134375453),
                connexionWith = listOf(PointModel(563,101), PointModel(567,105), PointModel(568,106), PointModel(576,114)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 567 ,number = 105, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434388309855656, 35.04692751914263),
                connexionWith = listOf(PointModel(566,104)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 568 ,number = 106, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43422236330931, 35.047089122235775),
                connexionWith = listOf(PointModel(566,104), PointModel(569,107)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 569 ,number = 107, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434256842864215, 35.047092474997044),
                connexionWith = listOf(PointModel(568,106), PointModel(570,108)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 570 ,number = 108, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43424950205773, 35.0472292676568),
                connexionWith = listOf(PointModel(569,107), PointModel(571,109), PointModel(572,110)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 571 ,number = 109, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43421791433278, 35.04722557961941),
                connexionWith = listOf(PointModel(570,108)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 572 ,number = 110, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43424594287845, 35.04728827625513),
                connexionWith = listOf(PointModel(570,108), PointModel(573,111), PointModel(575,113)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 573 ,number = 111, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43424416328869, 35.04731811583042),
                connexionWith = listOf(PointModel(572,110), PointModel(574,112)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 574 ,number = 112, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43421657963975, 35.04731711000204),
                connexionWith = listOf(PointModel(573,111)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 575 ,number = 113, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43421391025359, 35.0472829118371),
                connexionWith = listOf(PointModel(572,110)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 576 ,number = 114, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43420011842277, 35.046911761164665),
                connexionWith = listOf(PointModel(566,104), PointModel(577,115), PointModel(597,135)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 577 ,number = 115, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43414027962961, 35.04690606147051),
                connexionWith = listOf(PointModel(576,114), PointModel(578,116), PointModel(598,136)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 578 ,number = 116, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434076881574846, 35.04689868539572),
                connexionWith = listOf(PointModel(577,115), PointModel(579,117), PointModel(596,134), PointModel(602,140)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 579 ,number = 117, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43404351414582, 35.04689700901508),
                connexionWith = listOf(PointModel(578,116), PointModel(580,118), PointModel(595,133)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 580 ,number = 118, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434028610020455, 35.046894662082195),
                connexionWith = listOf(PointModel(579,117), PointModel(581,119), PointModel(603,141)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 581 ,number = 119, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433912268712405, 35.04688359797001),
                connexionWith = listOf(PointModel(580,118), PointModel(582,120), PointModel(604,142)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 582 ,number = 120, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43390270335402, 35.046882927417755),
                connexionWith = listOf(PointModel(581,119), PointModel(583,121), PointModel(594,132)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 583 ,number = 121, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43385265203069, 35.04687588661909),
                connexionWith = listOf(PointModel(582,120), PointModel(584,122)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 584 ,number = 122, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43384798057133, 35.04698820412159),
                connexionWith = listOf(PointModel(583,121)),
                connexionFloor = listOf(FloorModel(2, PointModel(973, 145)), FloorModel(4, PointModel(1441, 133)), FloorModel(5, PointModel(1683, 124))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 585 ,number = 123, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4338595479937, 35.04674781113863),
                connexionWith = listOf(PointModel(583,121)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 586 ,number = 124, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43379392508179, 35.046872198581696),
                connexionWith = listOf(PointModel(583,121), PointModel(587,125), PointModel(593,131), PointModel(605,143)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 587 ,number = 125, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433746987963936, 35.046869181096554),
                connexionWith = listOf(PointModel(586,124), PointModel(588,126), PointModel(606,144)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 588 ,number = 126, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43370672433544, 35.046864822506905),
                connexionWith = listOf(PointModel(587,125), PointModel(589,127), PointModel(607,145)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 589 ,number = 127, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43365111153643, 35.046859793365),
                connexionWith = listOf(PointModel(588,126), PointModel(590,128), PointModel(608,146)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 590 ,number = 128, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433649999279815, 35.046903379261494),
                connexionWith = listOf(PointModel(589,127), PointModel(591,129)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 591 ,number = 129, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43362174795398, 35.046901032328606),
                connexionWith = listOf(PointModel(590,128)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 592 ,number = 130, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43370160796048, 35.04692617803812),
                connexionWith = listOf(PointModel(588,126), PointModel(593,131)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 593 ,number = 131, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433793035278995, 35.046940594911575),
                connexionWith = listOf(PointModel(586,124), PointModel(592,130)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 594 ,number = 132, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43390047885178, 35.04695367068052),
                connexionWith = listOf(PointModel(582,120), PointModel(595,133)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 595 ,number = 133, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43403906515364, 35.046970434486866),
                connexionWith = listOf(PointModel(579,117), PointModel(594,132)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 596 ,number = 134, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43407354483293, 35.04696976393461),
                connexionWith = listOf(PointModel(578,116)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 597 ,number = 135, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434197671484654, 35.046984516084194),
                connexionWith = listOf(PointModel(576,114)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 598 ,number = 136, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4341393898329, 35.04686951637268),
                connexionWith = listOf(PointModel(577,115), PointModel(600,138)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 599 ,number = 137, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43410869183677, 35.04686515778303),
                connexionWith = listOf(PointModel(600,138)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 600 ,number = 138, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43413004696647, 35.046866834163666),
                connexionWith = listOf(PointModel(598,136), PointModel(599,137), PointModel(601,139)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 601 ,number = 139, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43413227145866, 35.04682458937168),
                connexionWith = listOf(PointModel(600,138)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 602 ,number = 140, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43408311015918, 35.04683330655098),
                connexionWith = listOf(PointModel(578,116)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 603 ,number = 141, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43403083451707, 35.04683095961809),
                connexionWith = listOf(PointModel(580,118), PointModel(604,142)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 604 ,number = 142, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433912491162566, 35.0468185544014),
                connexionWith = listOf(PointModel(581,119), PointModel(603,141)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 605 ,number = 143, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4337968169407, 35.046807155013084),
                connexionWith = listOf(PointModel(586,124)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 606 ,number = 144, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43375099207997, 35.046800784766674),
                connexionWith = listOf(PointModel(587,125)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 607 ,number = 145, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433705389629, 35.04679474979639),
                connexionWith = listOf(PointModel(588,126)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 608 ,number = 146, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4336508890851, 35.04678871482611),
                connexionWith = listOf(PointModel(589,127)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 609 ,number = 147, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43423103881244, 35.04619427025318),
                connexionWith = listOf(PointModel(610,148), PointModel(614,152)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 610 ,number = 148, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434231261261225, 35.0461520254612),
                connexionWith = listOf(PointModel(609,147), PointModel(611,149)),
                connexionFloor = listOf(FloorModel(0, PointModel(768, 97)), FloorModel(2, PointModel(996, 168)), FloorModel(3, PointModel(1232, 150)), FloorModel(4, PointModel(1473, 165)), FloorModel(5, PointModel(1720, 161))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 611 ,number = 149, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43426040204276, 35.04615604877472),
                connexionWith = listOf(PointModel(610,148), PointModel(612,150)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 612 ,number = 150, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43428754077085, 35.04615772515535),
                connexionWith = listOf(PointModel(611,149), PointModel(613,151), PointModel(671,209)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 613 ,number = 151, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43432068559123, 35.0461570546031),
                connexionWith = listOf(PointModel(612,150)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 614 ,number = 152, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43425840000486, 35.04619795829058),
                connexionWith = listOf(PointModel(609,147), PointModel(615,153), PointModel(617,155)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 615 ,number = 153, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4343871976152, 35.046205669641495),
                connexionWith = listOf(PointModel(614,152), PointModel(616,154)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 616 ,number = 154, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43438875475184, 35.046246238052845),
                connexionWith = listOf(PointModel(615,153), PointModel(617,155)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 617 ,number = 155, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43425884490217, 35.04623785614967),
                connexionWith = listOf(PointModel(614,152), PointModel(616,154), PointModel(618,156), PointModel(622,160)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 618 ,number = 156, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4342537285828, 35.04641655832529),
                connexionWith = listOf(PointModel(617,155), PointModel(619,157), PointModel(621,159)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 619 ,number = 157, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43424260614761, 35.04664119333029),
                connexionWith = listOf(PointModel(618,156), PointModel(620,158)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 620 ,number = 158, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43427152447406, 35.04664085805416),
                connexionWith = listOf(PointModel(619,157), PointModel(621,159)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 621 ,number = 159, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43428398159421, 35.04642225801945),
                connexionWith = listOf(PointModel(618,156), PointModel(620,158)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 622 ,number = 160, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43422903677339, 35.04623919725418),
                connexionWith = listOf(PointModel(617,155), PointModel(623,161), PointModel(646,184)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 623 ,number = 161, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43416786331997, 35.04622980952263),
                connexionWith = listOf(PointModel(622,160), PointModel(624,162), PointModel(645,183)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 624 ,number = 162, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43413872248535, 35.046230144798756),
                connexionWith = listOf(PointModel(623,161), PointModel(625,163), PointModel(644,182), PointModel(647,185)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 625 ,number = 163, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434104687748956, 35.04622679203749),
                connexionWith = listOf(PointModel(624,162), PointModel(626,164), PointModel(643,181), PointModel(648,186)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 626 ,number = 164, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43407243258557, 35.046221762895584),
                connexionWith = listOf(PointModel(625,163), PointModel(627,165), PointModel(642,180), PointModel(649,187)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 627 ,number = 165, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434022158979765, 35.04621606320143),
                connexionWith = listOf(PointModel(626,164), PointModel(628,166), PointModel(650,188)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 628 ,number = 166, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433964989376406, 35.04621271044016),
                connexionWith = listOf(PointModel(627,165), PointModel(629,167), PointModel(641,179)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 629 ,number = 167, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43393807292609, 35.046210028231144),
                connexionWith = listOf(PointModel(628,166), PointModel(630,168), PointModel(631,169)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 630 ,number = 168, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433882905280896, 35.046202316880226),
                connexionWith = listOf(PointModel(629,167)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 631 ,number = 169, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433938295376144, 35.046244226396084),
                connexionWith = listOf(PointModel(629,167), PointModel(632,170)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 632 ,number = 170, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.433888244087896, 35.0462381914258),
                connexionWith = listOf(PointModel(631,169), PointModel(633,171)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 633 ,number = 171, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43388223792999, 35.04628714174032),
                connexionWith = listOf(PointModel(632,170), PointModel(634,172), PointModel(635,173)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 634 ,number = 172, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43393607087549, 35.04629384726286),
                connexionWith = listOf(PointModel(633,171)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 635 ,number = 173, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43368047510188, 35.04627037793398),
                connexionWith = listOf(PointModel(633,171), PointModel(636,174)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 636 ,number = 174, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43367958529713, 35.04618387669325),
                connexionWith = listOf(PointModel(635,173), PointModel(637,175), PointModel(639,177)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 637 ,number = 175, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43364910947453, 35.04618287086487),
                connexionWith = listOf(PointModel(636,174), PointModel(638,176)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 638 ,number = 176, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43364555025319, 35.04627641290426),
                connexionWith = listOf(PointModel(637,175)),
                connexionFloor = listOf(FloorModel(0, PointModel(793, 122))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 639 ,number = 177, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43368603638133, 35.046135261654854),
                connexionWith = listOf(PointModel(636,174), PointModel(640,178)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 640 ,number = 178, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43365200134169, 35.046135261654854),
                connexionWith = listOf(PointModel(639,177)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 641 ,number = 179, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43396543427629, 35.046142637729645),
                connexionWith = listOf(PointModel(628,166)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 642 ,number = 180, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434074657080274, 35.04615135490894),
                connexionWith = listOf(PointModel(626,164)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 643 ,number = 181, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434106467343575, 35.04615738987923),
                connexionWith = listOf(PointModel(625,163)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 644 ,number = 182, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43414005718044, 35.046146996319294),
                connexionWith = listOf(PointModel(624,162)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 645 ,number = 183, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434169198014274, 35.04615135490894),
                connexionWith = listOf(PointModel(623,161)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 646 ,number = 184, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43422814697823, 35.04629887640476),
                connexionWith = listOf(PointModel(622,160)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 647 ,number = 185, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43413382860309, 35.0462881475687),
                connexionWith = listOf(PointModel(624,162)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 648 ,number = 186, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434100016312776, 35.04632335156202),
                connexionWith = listOf(PointModel(625,163)),
                connexionFloor = listOf(FloorModel(0, PointModel(783, 112)), FloorModel(2, PointModel(1026, 198)), FloorModel(3, PointModel(1259, 177)), FloorModel(4, PointModel(1507, 199)), FloorModel(5, PointModel(1745, 186))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 649 ,number = 187, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43406753869692, 35.04628378897905),
                connexionWith = listOf(PointModel(626,164)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 650 ,number = 188, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43401526303881, 35.04629720002413),
                connexionWith = listOf(PointModel(627,165)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 651 ,number = 189, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43425061430121, 35.0455042719841),
                connexionWith = listOf(PointModel(652,190), PointModel(654,192)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 652 ,number = 190, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4342510591986, 35.04546068608761),
                connexionWith = listOf(PointModel(651,189), PointModel(653,191)),
                connexionFloor = listOf(FloorModel(0, PointModel(808, 137)), FloorModel(2, PointModel(1063, 235)), FloorModel(3, PointModel(1292, 210)), FloorModel(4, PointModel(1537, 229)), FloorModel(5, PointModel(1769, 210))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 653 ,number = 191, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43428909791053, 35.04546571522951),
                connexionWith = listOf(PointModel(652,190)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 654 ,number = 192, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43428887546202, 35.04551064223051),
                connexionWith = listOf(PointModel(651,189), PointModel(655,193), PointModel(656,194)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 655 ,number = 193, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43431912845247, 35.04551365971565),
                connexionWith = listOf(PointModel(654,192)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 656 ,number = 194, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434286206079626, 35.04555858671665),
                connexionWith = listOf(PointModel(654,192), PointModel(657,195), PointModel(660,198), PointModel(667,205)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 657 ,number = 195, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434442142264984, 35.045570991933346),
                connexionWith = listOf(PointModel(656,194), PointModel(658,196)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 658 ,number = 196, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43444236471283, 35.04552137106657),
                connexionWith = listOf(PointModel(657,195), PointModel(659,197)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 659 ,number = 197, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4343544977347, 35.04551365971565),
                connexionWith = listOf(PointModel(658,196)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 660 ,number = 198, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434283091800026, 35.045655481517315),
                connexionWith = listOf(PointModel(656,194), PointModel(661,199), PointModel(662,200)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 661 ,number = 199, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434322020281535, 35.045657493174076),
                connexionWith = listOf(PointModel(660,198)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 662 ,number = 200, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43427619589449, 35.04583049565554),
                connexionWith = listOf(PointModel(660,198), PointModel(663,201), PointModel(666,204)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 663 ,number = 201, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.4343055590987, 35.04583418369293),
                connexionWith = listOf(PointModel(662,200), PointModel(664,202), PointModel(665,203)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 664 ,number = 202, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43430711623785, 35.04569906741381),
                connexionWith = listOf(PointModel(663,201)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 665 ,number = 203, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43430044278402, 35.04596997052431),
                connexionWith = listOf(PointModel(663,201)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 666 ,number = 204, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434268632642144, 35.045968629419804),
                connexionWith = listOf(PointModel(662,200)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 667 ,number = 205, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43425840000486, 35.04555590450764),
                connexionWith = listOf(PointModel(656,194), PointModel(668,206), PointModel(670,208)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 668 ,number = 206, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.434197893933586, 35.0455491989851),
                connexionWith = listOf(PointModel(667,205), PointModel(669,207)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 669 ,number = 207, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43420011842277, 35.04548046737909),
                connexionWith = listOf(PointModel(668,206)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 670 ,number = 208, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43425484082621, 35.045620277523994),
                connexionWith = listOf(PointModel(667,205)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 671 ,number = 209, name = null, description = null, locationIndex = OLD, floorIndex = 1,
                location = LatLng(48.43428820811644, 35.046118162572384),
                connexionWith = listOf(PointModel(612,150)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
        )
    }
    val navGraphOld2: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 829 ,number = 1, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43411847960567, 35.048349760472775),
                connexionWith = listOf(PointModel(830,2)),
                connexionFloor = listOf(FloorModel(0, PointModel(679, 8)), FloorModel(1, PointModel(467, 5)), FloorModel(3, PointModel(1083, 1)), FloorModel(4, PointModel(1309, 1)), FloorModel(5, PointModel(1560, 1))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 830 ,number = 2, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434171644953764, 35.0483537837863),
                connexionWith = listOf(PointModel(829,1), PointModel(831,3), PointModel(869,41)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 831 ,number = 3, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4341654163803, 35.04839938133955),
                connexionWith = listOf(PointModel(830,2), PointModel(832,4), PointModel(833,5), PointModel(858,30)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 832 ,number = 4, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43419566944431, 35.04840474575758),
                connexionWith = listOf(PointModel(831,3), PointModel(859,31)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 833 ,number = 5, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434107802039506, 35.04839636385441),
                connexionWith = listOf(PointModel(832,4), PointModel(834,6), PointModel(856,28)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 834 ,number = 6, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43407243258557, 35.04839301109314),
                connexionWith = listOf(PointModel(833,5), PointModel(835,7), PointModel(855,27), PointModel(860,32)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 835 ,number = 7, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434046628440136, 35.04838764667511),
                connexionWith = listOf(PointModel(834,6), PointModel(836,8), PointModel(854,26), PointModel(861,33)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 836 ,number = 8, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43401548548851, 35.04838764667511),
                connexionWith = listOf(PointModel(835,7), PointModel(837,9), PointModel(853,25), PointModel(862,34)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 837 ,number = 9, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43398634456651, 35.04838362336159),
                connexionWith = listOf(PointModel(836,8), PointModel(838,10), PointModel(852,24), PointModel(863,35)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 838 ,number = 10, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43396143017718, 35.04837825894356),
                connexionWith = listOf(PointModel(837,9), PointModel(839,11), PointModel(864,36)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 839 ,number = 11, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43395408932799, 35.048377588391304),
                connexionWith = listOf(PointModel(838,10), PointModel(840,12), PointModel(851,23)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 840 ,number = 12, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43393006472325, 35.04837457090616),
                connexionWith = listOf(PointModel(839,11), PointModel(841,13), PointModel(865,37)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 841 ,number = 13, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43388179302937, 35.048373229801655),
                connexionWith = listOf(PointModel(840,12), PointModel(842,14), PointModel(849,21)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 842 ,number = 14, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43386911336023, 35.0483725592494),
                connexionWith = listOf(PointModel(841,13), PointModel(843,15), PointModel(866,38)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 843 ,number = 15, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43383886010181, 35.04836820065975),
                connexionWith = listOf(PointModel(842,14), PointModel(844,16), PointModel(867,39)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 844 ,number = 16, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43380838437475, 35.048365853726864),
                connexionWith = listOf(PointModel(843,15), PointModel(845,17)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 845 ,number = 17, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43378035558772, 35.048364512622356),
                connexionWith = listOf(PointModel(844,16), PointModel(846,18), PointModel(868,40)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 846 ,number = 18, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433773904515505, 35.04845637828112),
                connexionWith = listOf(PointModel(845,17)),
                connexionFloor = listOf(FloorModel(0, PointModel(688, 17)), FloorModel(1, PointModel(483, 21)), FloorModel(3, PointModel(1097, 15)), FloorModel(4, PointModel(1324, 16)), FloorModel(5, PointModel(1579, 20))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 847 ,number = 19, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43380482516455, 35.04843860864639),
                connexionWith = listOf(PointModel(844,16)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 848 ,number = 20, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43383218658648, 35.04843760281801),
                connexionWith = listOf(PointModel(843,15)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 849 ,number = 21, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43387778892367, 35.04846040159464),
                connexionWith = listOf(PointModel(841,13), PointModel(850,22)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 850 ,number = 22, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433924058570284, 35.04846643656492),
                connexionWith = listOf(PointModel(849,21)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 851 ,number = 23, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43395208727803, 35.048458725214005),
                connexionWith = listOf(PointModel(839,11)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 852 ,number = 24, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4339825629189, 35.04845671355724),
                connexionWith = listOf(PointModel(837,9)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 853 ,number = 25, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434013705890706, 35.04845704883337),
                connexionWith = listOf(PointModel(836,8)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 854 ,number = 26, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4340470733393, 35.04843592643738),
                connexionWith = listOf(PointModel(835,7), PointModel(855,27)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 855 ,number = 27, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4340722101361, 35.04843592643738),
                connexionWith = listOf(PointModel(834,6), PointModel(854,26)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 856 ,number = 28, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434100461211465, 35.04848387092352),
                connexionWith = listOf(PointModel(833,5), PointModel(857,29)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 857 ,number = 29, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43413293880628, 35.048486553132534),
                connexionWith = listOf(PointModel(856,28)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 858 ,number = 30, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434163191889596, 35.04846978932619),
                connexionWith = listOf(PointModel(831,3)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 859 ,number = 31, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43419589189322, 35.04846911877394),
                connexionWith = listOf(PointModel(832,4)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 860 ,number = 32, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434078216271544, 35.048328302800655),
                connexionWith = listOf(PointModel(834,6)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 861 ,number = 33, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43405063253253, 35.048325285315514),
                connexionWith = listOf(PointModel(835,7)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 862 ,number = 34, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434017265086275, 35.04831925034523),
                connexionWith = listOf(PointModel(836,8)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 863 ,number = 35, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4339876792656, 35.04831522703171),
                connexionWith = listOf(PointModel(837,9)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 864 ,number = 36, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43396187507711, 35.0483138859272),
                connexionWith = listOf(PointModel(838,10)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 865 ,number = 37, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433933179024514, 35.04830986261368),
                connexionWith = listOf(PointModel(840,12)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 866 ,number = 38, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43387222766523, 35.048304833471775),
                connexionWith = listOf(PointModel(842,14)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 867 ,number = 39, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433839305002806, 35.048300474882126),
                connexionWith = listOf(PointModel(843,15)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 868 ,number = 40, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4337816902922, 35.04829477518797),
                connexionWith = listOf(PointModel(845,17)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 869 ,number = 41, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43418076536354, 35.04810903221369),
                connexionWith = listOf(PointModel(830,2), PointModel(870,42), PointModel(888,60)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 870 ,number = 42, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43418766128203, 35.04797223955393),
                connexionWith = listOf(PointModel(869,41), PointModel(871,43), PointModel(886,58)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 871 ,number = 43, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43419900617819, 35.04767920821905),
                connexionWith = listOf(PointModel(870,42), PointModel(872,44), PointModel(882,54)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 872 ,number = 44, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43420323270749, 35.047589018940926),
                connexionWith = listOf(PointModel(871,43), PointModel(873,45), PointModel(891,63), PointModel(892,64)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 873 ,number = 45, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434234153095254, 35.047591365873814),
                connexionWith = listOf(PointModel(872,44), PointModel(874,46)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 874 ,number = 46, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434237712275376, 35.04755012691021),
                connexionWith = listOf(PointModel(873,45), PointModel(875,47)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 875 ,number = 47, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43426284897785, 35.047552809119225),
                connexionWith = listOf(PointModel(874,46), PointModel(876,48), PointModel(877,49)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 876 ,number = 48, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43426351632377, 35.04759170114994),
                connexionWith = listOf(PointModel(875,47)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 877 ,number = 49, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43432113048798, 35.04755984991789),
                connexionWith = listOf(PointModel(875,47), PointModel(878,50), PointModel(879,51)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 878 ,number = 50, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43432068559123, 35.04759840667248),
                connexionWith = listOf(PointModel(877,49)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 879 ,number = 51, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434412556691726, 35.04756923764944),
                connexionWith = listOf(PointModel(877,49), PointModel(880,52)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 880 ,number = 52, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434412556691726, 35.04760108888149),
                connexionWith = listOf(PointModel(879,51)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 881 ,number = 53, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43422970411974, 35.047640316188335),
                connexionWith = listOf(PointModel(882,54)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 882 ,number = 54, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434228814324605, 35.04768054932356),
                connexionWith = listOf(PointModel(871,43), PointModel(881,53), PointModel(883,55)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 883 ,number = 55, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434227257183046, 35.04772949963808),
                connexionWith = listOf(PointModel(882,54)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 884 ,number = 56, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434233485748955, 35.04779018461704),
                connexionWith = listOf(PointModel(885,57)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 885 ,number = 57, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43422614493905, 35.04788037389517),
                connexionWith = listOf(PointModel(884,56), PointModel(886,58)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 886 ,number = 58, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434221028616406, 35.04797626286745),
                connexionWith = listOf(PointModel(870,42), PointModel(885,57)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 887 ,number = 59, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43421635719091, 35.04804365336895),
                connexionWith = listOf(PointModel(888,60)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 888 ,number = 60, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43421524494669, 35.04811238497496),
                connexionWith = listOf(PointModel(869,41), PointModel(887,59), PointModel(889,61)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 889 ,number = 61, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434212130662736, 35.04816468805075),
                connexionWith = listOf(PointModel(888,60)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 890 ,number = 62, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434204344951965, 35.04753939807415),
                connexionWith = listOf(PointModel(872,44), PointModel(891,63), PointModel(929,101)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 891 ,number = 63, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43415451637489, 35.0475350394845),
                connexionWith = listOf(PointModel(890,62)),
                connexionFloor = listOf(FloorModel(0, PointModel(716, 45)), FloorModel(1, PointModel(500, 38)), FloorModel(3, PointModel(1127, 45)), FloorModel(4, PointModel(1356, 48)), FloorModel(5, PointModel(1613, 54))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 892 ,number = 64, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43416764087093, 35.04758533090353),
                connexionWith = listOf(PointModel(891,63), PointModel(893,65), PointModel(894,66)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 893 ,number = 65, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434164971482176, 35.04764802753925),
                connexionWith = listOf(PointModel(892,64)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 894 ,number = 66, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43411291837358, 35.0475799664855),
                connexionWith = listOf(PointModel(892,64), PointModel(895,67), PointModel(896,68)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 895 ,number = 67, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43411336327216, 35.04750519990921),
                connexionWith = listOf(PointModel(894,66)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 896 ,number = 68, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434085334653396, 35.047580637037754),
                connexionWith = listOf(PointModel(894,66), PointModel(897,69), PointModel(898,70)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 897 ,number = 69, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43408555710281, 35.04749748855829),
                connexionWith = listOf(PointModel(896,68)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 898 ,number = 70, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43404863048636, 35.04757594317198),
                connexionWith = listOf(PointModel(896,68), PointModel(899,71), PointModel(918,90), PointModel(919,91)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 899 ,number = 71, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4340021385034, 35.047570914030075),
                connexionWith = listOf(PointModel(898,70), PointModel(900,72), PointModel(917,89), PointModel(920,92)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 900 ,number = 72, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433886242035335, 35.04755951464176),
                connexionWith = listOf(PointModel(899,71), PointModel(901,73), PointModel(916,88), PointModel(921,93)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 901 ,number = 73, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433842196859125, 35.047554820775986),
                connexionWith = listOf(PointModel(900,72), PointModel(902,74), PointModel(915,87), PointModel(922,94)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 902 ,number = 74, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43381416809077, 35.04755314439535),
                connexionWith = listOf(PointModel(901,73), PointModel(903,75), PointModel(914,86)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 903 ,number = 75, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4337928128283, 35.047551803290844),
                connexionWith = listOf(PointModel(902,74), PointModel(904,76), PointModel(923,95)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 904 ,number = 76, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433760779917755, 35.04754811525345),
                connexionWith = listOf(PointModel(903,75), PointModel(905,77), PointModel(924,96)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 905 ,number = 77, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433735198064994, 35.04754476249218),
                connexionWith = listOf(PointModel(904,76), PointModel(906,78), PointModel(925,97)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 906 ,number = 78, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43370338756924, 35.04754073917866),
                connexionWith = listOf(PointModel(905,77), PointModel(907,79), PointModel(913,85), PointModel(926,98)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 907 ,number = 79, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433677360785154, 35.04754174500704),
                connexionWith = listOf(PointModel(906,78), PointModel(908,80), PointModel(912,84), PointModel(927,99)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 908 ,number = 80, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43362864394837, 35.04753638058901),
                connexionWith = listOf(PointModel(907,79), PointModel(909,81), PointModel(911,83), PointModel(928,100)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 909 ,number = 81, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43359549867653, 35.047531351447105),
                connexionWith = listOf(PointModel(908,80), PointModel(910,82)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 910 ,number = 82, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43359060474195, 35.04762925207615),
                connexionWith = listOf(PointModel(909,81)),
                connexionFloor = listOf(FloorModel(0, PointModel(729, 58)), FloorModel(1, PointModel(533, 71)), FloorModel(3, PointModel(1154, 72)), FloorModel(4, PointModel(1388, 80)), FloorModel(5, PointModel(1629, 70))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 911 ,number = 83, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43362463982272, 35.04760477691889),
                connexionWith = listOf(PointModel(908,80)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 912 ,number = 84, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43367469137065, 35.04760880023241),
                connexionWith = listOf(PointModel(907,79)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 913 ,number = 85, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43370138550938, 35.047612488269806),
                connexionWith = listOf(PointModel(906,78), PointModel(914,86)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 914 ,number = 86, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433811276232824, 35.04761952906847),
                connexionWith = listOf(PointModel(902,74), PointModel(913,85)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 915 ,number = 87, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433843754012464, 35.04762288182974),
                connexionWith = listOf(PointModel(901,73)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 916 ,number = 88, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433884462432985, 35.04762556403875),
                connexionWith = listOf(PointModel(900,72), PointModel(917,89)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 917 ,number = 89, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43399991400557, 35.047635957598686),
                connexionWith = listOf(PointModel(899,71), PointModel(916,88)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 918 ,number = 90, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43404418149461, 35.04764266312122),
                connexionWith = listOf(PointModel(898,70)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 919 ,number = 91, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434052412129034, 35.04750318825245),
                connexionWith = listOf(PointModel(898,70)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 920 ,number = 92, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43400614259931, 35.047497153282166),
                connexionWith = listOf(PointModel(899,71), PointModel(921,93)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 921 ,number = 93, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433891135941444, 35.04748709499836),
                connexionWith = listOf(PointModel(900,72), PointModel(920,92)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 922 ,number = 94, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43384108460671, 35.047484412789345),
                connexionWith = listOf(PointModel(901,73)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 923 ,number = 95, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43379459243386, 35.04748072475195),
                connexionWith = listOf(PointModel(903,75), PointModel(924,96)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 924 ,number = 96, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433765228934334, 35.04747938364744),
                connexionWith = listOf(PointModel(904,76), PointModel(923,95)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 925 ,number = 97, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43373564296689, 35.04749648272991),
                connexionWith = listOf(PointModel(905,77), PointModel(926,98)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 926 ,number = 98, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43370405492249, 35.047495141625404),
                connexionWith = listOf(PointModel(906,78), PointModel(925,97)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 927 ,number = 99, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43367647098032, 35.04747066646814),
                connexionWith = listOf(PointModel(907,79)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 928 ,number = 100, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43362842149694, 35.04747200757265),
                connexionWith = listOf(PointModel(908,80)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 929 ,number = 101, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43420968372518, 35.047456584870815),
                connexionWith = listOf(PointModel(890,62), PointModel(930,102), PointModel(959,131)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 930 ,number = 102, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43421168576499, 35.04736237227917),
                connexionWith = listOf(PointModel(929,101), PointModel(931,103), PointModel(957,129)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 931 ,number = 103, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434212130662736, 35.04731845110655),
                connexionWith = listOf(PointModel(930,102), PointModel(932,104), PointModel(956,128)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 932 ,number = 104, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43421947147462, 35.04722557961941),
                connexionWith = listOf(PointModel(931,103), PointModel(933,105), PointModel(954,126)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 933 ,number = 105, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4342234755534, 35.047123320400715),
                connexionWith = listOf(PointModel(932,104), PointModel(950,122), PointModel(952,124)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 934 ,number = 106, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43422747963186, 35.04700228571892),
                connexionWith = listOf(PointModel(950,122), PointModel(935,107), PointModel(947,119)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 935 ,number = 107, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43422859187582, 35.04695735871792),
                connexionWith = listOf(PointModel(934,106), PointModel(936,108), PointModel(946,118)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 936 ,number = 108, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43423170615876, 35.046915113925934),
                connexionWith = listOf(PointModel(935,107), PointModel(937,109), PointModel(939,111), PointModel(960,132)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 937 ,number = 109, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43423281840263, 35.04686113446951),
                connexionWith = listOf(PointModel(936,108), PointModel(938,110), PointModel(984,156)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 938 ,number = 110, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43418343475146, 35.046856105327606),
                connexionWith = listOf(PointModel(937,109)),
                connexionFloor = listOf(FloorModel(0, PointModel(747, 76)), FloorModel(1, PointModel(561, 99)), FloorModel(3, PointModel(1185, 103)), FloorModel(4, PointModel(1415, 107)), FloorModel(5, PointModel(1659, 100))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 939 ,number = 111, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43429109994724, 35.04691544920206),
                connexionWith = listOf(PointModel(936,108), PointModel(940,112), PointModel(942,114)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 940 ,number = 112, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43429221218978, 35.04686113446951),
                connexionWith = listOf(PointModel(939,111), PointModel(941,113)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 941 ,number = 113, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43437918948315, 35.04688963294029),
                connexionWith = listOf(PointModel(940,112), PointModel(942,114), PointModel(944,116)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 942 ,number = 114, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43437918948315, 35.04693120718002),
                connexionWith = listOf(PointModel(939,111), PointModel(941,113), PointModel(943,115)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 943 ,number = 115, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43442946273569, 35.04693657159805),
                connexionWith = listOf(PointModel(942,114)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 944 ,number = 116, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43438430578987, 35.04687085747719),
                connexionWith = listOf(PointModel(941,113), PointModel(945,117)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 945 ,number = 117, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43442345664175, 35.04687488079071),
                connexionWith = listOf(PointModel(944,116)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 946 ,number = 118, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43425751021021, 35.046962052583694),
                connexionWith = listOf(PointModel(935,107), PointModel(947,119)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 947 ,number = 119, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43425728776158, 35.04700563848019),
                connexionWith = listOf(PointModel(934,106), PointModel(946,118), PointModel(948,120)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 948 ,number = 120, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434256842864215, 35.04703648388386),
                connexionWith = listOf(PointModel(947,119), PointModel(949,121)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 949 ,number = 121, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43427708568878, 35.04704017192125),
                connexionWith = listOf(PointModel(948,120)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 950 ,number = 122, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434225700041466, 35.04706531763077),
                connexionWith = listOf(PointModel(933,105), PointModel(934,106), PointModel(951,123)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 951 ,number = 123, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43426929998798, 35.04707135260105),
                connexionWith = listOf(PointModel(950,122)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 952 ,number = 124, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43426462856694, 35.047130696475506),
                connexionWith = listOf(PointModel(933,105)),
                connexionFloor = listOf(FloorModel(1, PointModel(584, 122)), FloorModel(2, PointModel(973, 145)), FloorModel(3, PointModel(1206, 124)), FloorModel(4, PointModel(1441, 133)), FloorModel(5, PointModel(1683, 124))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 953 ,number = 125, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43425261633939, 35.047179982066154),
                connexionWith = listOf(PointModel(954,126)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 954 ,number = 126, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4342510591986, 35.04722993820906),
                connexionWith = listOf(PointModel(932,104), PointModel(953,125), PointModel(955,127)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 955 ,number = 127, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434250169403825, 35.047272853553295),
                connexionWith = listOf(PointModel(954,126)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 956 ,number = 128, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43425617551822, 35.047322139143944),
                connexionWith = listOf(PointModel(931,103)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 957 ,number = 129, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43424705512198, 35.04736639559269),
                connexionWith = listOf(PointModel(930,102), PointModel(958,130)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 958 ,number = 130, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43424661022456, 35.047412663698196),
                connexionWith = listOf(PointModel(957,129)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 959 ,number = 131, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4342510591986, 35.04745692014694),
                connexionWith = listOf(PointModel(929,101)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 960 ,number = 132, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43414183677381, 35.04690673202276),
                connexionWith = listOf(PointModel(936,108), PointModel(961,133), PointModel(977,149), PointModel(978,150)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 961 ,number = 133, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43407576932758, 35.04689935594797),
                connexionWith = listOf(PointModel(960,132), PointModel(962,134), PointModel(976,148), PointModel(979,151)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 962 ,number = 134, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434040622300955, 35.04689533263445),
                connexionWith = listOf(PointModel(961,133), PointModel(963,135), PointModel(975,147)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 963 ,number = 135, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434024161026954, 35.04689533263445),
                connexionWith = listOf(PointModel(962,134), PointModel(964,136), PointModel(980,152)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 964 ,number = 136, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43397677922204, 35.04688695073128),
                connexionWith = listOf(PointModel(963,135), PointModel(965,137), PointModel(981,153)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 965 ,number = 137, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433908264609094, 35.04688326269388),
                connexionWith = listOf(PointModel(964,136), PointModel(966,138), PointModel(974,146), PointModel(982,154)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 966 ,number = 138, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43386155004733, 35.046878568828106),
                connexionWith = listOf(PointModel(965,137), PointModel(967,139), PointModel(973,145), PointModel(983,155)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 967 ,number = 139, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43379236792689, 35.046872198581696),
                connexionWith = listOf(PointModel(966,138), PointModel(968,140), PointModel(972,144), PointModel(984,156)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 968 ,number = 140, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43370449982466, 35.04686247557402),
                connexionWith = listOf(PointModel(967,139), PointModel(969,141), PointModel(971,143), PointModel(985,157)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 969 ,number = 141, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43365177889036, 35.046858452260494),
                connexionWith = listOf(PointModel(968,140), PointModel(970,142), PointModel(986,158)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 970 ,number = 142, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43364955437718, 35.04692316055298),
                connexionWith = listOf(PointModel(969,141)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 971 ,number = 143, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433698493645046, 35.04692818969488),
                connexionWith = listOf(PointModel(968,140), PointModel(972,144)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 972 ,number = 144, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43379592713796, 35.046935230493546),
                connexionWith = listOf(PointModel(967,139), PointModel(971,143)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 973 ,number = 145, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433856878588784, 35.046990886330605),
                connexionWith = listOf(PointModel(966,138)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 974 ,number = 146, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433903815605085, 35.04695702344179),
                connexionWith = listOf(PointModel(965,137)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 975 ,number = 147, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4340386202544, 35.04696473479271),
                connexionWith = listOf(PointModel(962,134)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 976 ,number = 148, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434075546878105, 35.04696775227785),
                connexionWith = listOf(PointModel(961,133)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 977 ,number = 149, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434142281672166, 35.04697144031525),
                connexionWith = listOf(PointModel(960,132)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 978 ,number = 150, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434142281672166, 35.04683464765549),
                connexionWith = listOf(PointModel(960,132)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 979 ,number = 151, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43407777137266, 35.04682928323746),
                connexionWith = listOf(PointModel(961,133)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 980 ,number = 152, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434030167168096, 35.04682391881943),
                connexionWith = listOf(PointModel(963,135), PointModel(981,153)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 981 ,number = 153, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43397944862067, 35.046820901334286),
                connexionWith = listOf(PointModel(964,136), PointModel(980,152), PointModel(982,154)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 982 ,number = 154, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43390893195969, 35.04681218415499),
                connexionWith = listOf(PointModel(965,137), PointModel(981,153)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 983 ,number = 155, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43386421945201, 35.04680950194597),
                connexionWith = listOf(PointModel(966,138)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 984 ,number = 156, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43379192302551, 35.046803802251816),
                connexionWith = listOf(PointModel(967,139)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 985 ,number = 157, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433707169237586, 35.046792067587376),
                connexionWith = listOf(PointModel(968,140)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 986 ,number = 158, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433649999279815, 35.046787708997726),
                connexionWith = listOf(PointModel(969,141)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 987 ,number = 159, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434238824519085, 35.04677463322878),
                connexionWith = listOf(PointModel(937,109), PointModel(986,158), PointModel(988,160), PointModel(1010,182)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 988 ,number = 160, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43424416328869, 35.04663247615099),
                connexionWith = listOf(PointModel(987,159), PointModel(989,161), PointModel(1009,181)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 989 ,number = 161, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43424972450641, 35.04654161632061),
                connexionWith = listOf(PointModel(988,160), PointModel(990,162), PointModel(1008,180)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 990 ,number = 162, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43425039185251, 35.04649870097637),
                connexionWith = listOf(PointModel(989,161), PointModel(991,163), PointModel(1007,179)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 991 ,number = 163, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43425306123676, 35.046456791460514),
                connexionWith = listOf(PointModel(990,162), PointModel(992,164), PointModel(1006,178)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 992 ,number = 164, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43425306123676, 35.04641119390726),
                connexionWith = listOf(PointModel(991,163), PointModel(993,165), PointModel(1004,176)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 993 ,number = 165, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43425906735083, 35.046281442046165),
                connexionWith = listOf(PointModel(992,164), PointModel(994,166), PointModel(1003,175)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 994 ,number = 166, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434260624491415, 35.04623617976904),
                connexionWith = listOf(PointModel(993,165), PointModel(995,167), PointModel(997,169), PointModel(1011,183)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 995 ,number = 167, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434259734696795, 35.04618689417839),
                connexionWith = listOf(PointModel(994,166), PointModel(996,168), PointModel(1047,219)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 996 ,number = 168, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43421035107181, 35.04618287086487),
                connexionWith = listOf(PointModel(995,167)),
                connexionFloor = listOf(FloorModel(0, PointModel(768, 97)), FloorModel(1, PointModel(610, 148)), FloorModel(3, PointModel(1232, 150)), FloorModel(4, PointModel(1473, 165)), FloorModel(5, PointModel(1720, 161))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 997 ,number = 169, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434288653013496, 35.04623752087355),
                connexionWith = listOf(PointModel(994,166), PointModel(998,170), PointModel(1000,172)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 998 ,number = 170, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43429265708681, 35.04616878926754),
                connexionWith = listOf(PointModel(997,169), PointModel(999,171)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 999 ,number = 171, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434350716114494, 35.04617180675268),
                connexionWith = listOf(PointModel(998,170)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1000 ,number = 172, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43436940176448, 35.04624389111996),
                connexionWith = listOf(PointModel(997,169), PointModel(1001,173)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1001 ,number = 173, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43443546882892, 35.04625026136637),
                connexionWith = listOf(PointModel(1000,172), PointModel(1002,174)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1002 ,number = 174, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43443546882892, 35.04619024693966),
                connexionWith = listOf(PointModel(1001,173)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1003 ,number = 175, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434301110129454, 35.046285800635815),
                connexionWith = listOf(PointModel(993,165)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1004 ,number = 176, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434281979557255, 35.046413876116276),
                connexionWith = listOf(PointModel(992,164), PointModel(1005,177)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1005 ,number = 177, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434283314248574, 35.04635252058506),
                connexionWith = listOf(PointModel(1004,176)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1006 ,number = 178, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43429043260168, 35.04646047949791),
                connexionWith = listOf(PointModel(991,163)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1007 ,number = 179, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434288653013496, 35.04650607705116),
                connexionWith = listOf(PointModel(990,162)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1008 ,number = 180, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43428798566791, 35.04654932767153),
                connexionWith = listOf(PointModel(989,161)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1009 ,number = 181, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43428375914566, 35.04663549363613),
                connexionWith = listOf(PointModel(988,160)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1010 ,number = 182, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43427508365156, 35.04677664488554),
                connexionWith = listOf(PointModel(987,159)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1011 ,number = 183, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43422125106522, 35.04623617976904),
                connexionWith = listOf(PointModel(994,166), PointModel(1012,184), PointModel(1036,208)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1012 ,number = 184, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43417587148535, 35.04622980952263),
                connexionWith = listOf(PointModel(1011,183), PointModel(1013,185), PointModel(1037,209)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1013 ,number = 185, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43416808576903, 35.046234503388405),
                connexionWith = listOf(PointModel(1012,184), PointModel(1014,186), PointModel(1035,207)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1014 ,number = 186, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43414205922301, 35.04622410982847),
                connexionWith = listOf(PointModel(1013,185), PointModel(1015,187), PointModel(1038,210)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1015 ,number = 187, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43410335305295, 35.04622042179108),
                connexionWith = listOf(PointModel(1014,186), PointModel(1016,188), PointModel(1033,205), PointModel(1039,211)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1016 ,number = 188, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434061310110685, 35.046216398477554),
                connexionWith = listOf(PointModel(1015,187), PointModel(1017,189), PointModel(1032,204), PointModel(1040,212)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1017 ,number = 189, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43394318927726, 35.046206675469875),
                connexionWith = listOf(PointModel(1016,188), PointModel(1018,190), PointModel(1031,203), PointModel(1041,213)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1018 ,number = 190, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43390136865269, 35.04620499908924),
                connexionWith = listOf(PointModel(1017,189), PointModel(1019,191), PointModel(1030,202), PointModel(1042,214)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1019 ,number = 191, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43386911336023, 35.046201311051846),
                connexionWith = listOf(PointModel(1018,190), PointModel(1020,192), PointModel(1029,201)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1020 ,number = 192, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43384931527403, 35.04619996994734),
                connexionWith = listOf(PointModel(1019,191), PointModel(1021,193), PointModel(1043,215)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1021 ,number = 193, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433818617102645, 35.046195946633816),
                connexionWith = listOf(PointModel(1020,192), PointModel(1022,194), PointModel(1044,216)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1022 ,number = 194, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4337583329585, 35.04619091749191),
                connexionWith = listOf(PointModel(1021,193), PointModel(1023,195), PointModel(1028,200)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1023 ,number = 195, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43373430826119, 35.046187564730644),
                connexionWith = listOf(PointModel(1022,194), PointModel(1024,196), PointModel(1027,199), PointModel(1045,217)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1024 ,number = 196, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433687148637134, 35.04618354141712),
                connexionWith = listOf(PointModel(1023,195), PointModel(1025,197), PointModel(1046,218)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1025 ,number = 197, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43365489320869, 35.04618052393198),
                connexionWith = listOf(PointModel(1024,196), PointModel(1026,198)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1026 ,number = 198, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433646884961206, 35.04627272486687),
                connexionWith = listOf(PointModel(1025,197)),
                connexionFloor = listOf(FloorModel(0, PointModel(783, 112)), FloorModel(1, PointModel(648, 186)), FloorModel(3, PointModel(1259, 177)), FloorModel(4, PointModel(1507, 199)), FloorModel(5, PointModel(1745, 186))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1027 ,number = 199, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4337320837516, 35.04625964909792),
                connexionWith = listOf(PointModel(1023,195)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1028 ,number = 200, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43375900031105, 35.046262331306934),
                connexionWith = listOf(PointModel(1022,194)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1029 ,number = 201, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43386688885655, 35.04627037793398),
                connexionWith = listOf(PointModel(1019,191)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1030 ,number = 202, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433899589050874, 35.0462744012475),
                connexionWith = listOf(PointModel(1018,190)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1031 ,number = 203, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43394229947709, 35.04628010094166),
                connexionWith = listOf(PointModel(1017,189), PointModel(1032,204)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1032 ,number = 204, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43405552642278, 35.0462918356061),
                connexionWith = listOf(PointModel(1016,188), PointModel(1031,203)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1033 ,number = 205, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434100906110174, 35.04629451781511),
                connexionWith = listOf(PointModel(1015,187)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1034 ,number = 206, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43414005718044, 35.04632133990526),
                connexionWith = listOf(PointModel(1035,207)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1035 ,number = 207, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43416586127843, 35.04632402211428),
                connexionWith = listOf(PointModel(1013,185), PointModel(1034,206), PointModel(1036,208)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1036 ,number = 208, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43421791433278, 35.046323016285896),
                connexionWith = listOf(PointModel(1011,183), PointModel(1035,207)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1037 ,number = 209, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43417831842451, 35.04614431411028),
                connexionWith = listOf(PointModel(1012,184)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1038 ,number = 210, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4341438388163, 35.046143643558025),
                connexionWith = listOf(PointModel(1014,186)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1039 ,number = 211, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43410624489425, 35.0461657717824),
                connexionWith = listOf(PointModel(1015,187)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1040 ,number = 212, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434060420312605, 35.046160742640495),
                connexionWith = listOf(PointModel(1016,188), PointModel(1041,213)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1041 ,number = 213, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43394474642749, 35.0461483374238),
                connexionWith = listOf(PointModel(1017,189), PointModel(1040,212)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1042 ,number = 214, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43389691964805, 35.04614531993866),
                connexionWith = listOf(PointModel(1018,190)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1043 ,number = 215, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43384998262537, 35.04615470767021),
                connexionWith = listOf(PointModel(1020,192), PointModel(1044,216)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1044 ,number = 216, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43382150896016, 35.04615269601345),
                connexionWith = listOf(PointModel(1021,193), PointModel(1043,215)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1045 ,number = 217, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43373475316308, 35.04611346870661),
                connexionWith = listOf(PointModel(1023,195)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1046 ,number = 218, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.433688928246376, 35.04611447453499),
                connexionWith = listOf(PointModel(1024,196)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1047 ,number = 219, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43426707550183, 35.04608999937773),
                connexionWith = listOf(PointModel(995,167), PointModel(1048,220), PointModel(1082,254)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1048 ,number = 220, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434268187744905, 35.04605010151863),
                connexionWith = listOf(PointModel(1047,219), PointModel(1049,221), PointModel(1081,253)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1049 ,number = 221, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434271969371245, 35.04596594721079),
                connexionWith = listOf(PointModel(1048,220), PointModel(1050,222), PointModel(1079,251)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1050 ,number = 222, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4342768632402, 35.045863687992096),
                connexionWith = listOf(PointModel(1049,221), PointModel(1051,223), PointModel(1077,249)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1051 ,number = 223, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434280422417324, 35.04577785730362),
                connexionWith = listOf(PointModel(1050,222), PointModel(1052,224), PointModel(1076,248)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1052 ,number = 224, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434282202005804, 35.045731253921986),
                connexionWith = listOf(PointModel(1051,223), PointModel(1053,225), PointModel(1075,247)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1053 ,number = 225, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43428464893985, 35.04568900913),
                connexionWith = listOf(PointModel(1052,224), PointModel(1054,226), PointModel(1074,246)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1054 ,number = 226, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434285093836934, 35.04564609378576),
                connexionWith = listOf(PointModel(1053,225), PointModel(1055,227), PointModel(1073,245)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1055 ,number = 227, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43428709587377, 35.04560116678476),
                connexionWith = listOf(PointModel(1054,226), PointModel(1056,228), PointModel(1072,244)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1056 ,number = 228, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434288653013496, 35.045557245612144),
                connexionWith = listOf(PointModel(1055,227), PointModel(1057,229), PointModel(1064,236), PointModel(1065,237)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1057 ,number = 229, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43425906735083, 35.045558251440525),
                connexionWith = listOf(PointModel(1056,228), PointModel(1058,230), PointModel(1059,231)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1058 ,number = 230, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43425306123676, 35.045615918934345),
                connexionWith = listOf(PointModel(1057,229)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1059 ,number = 231, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43419700413787, 35.045547522604465),
                connexionWith = listOf(PointModel(1057,229), PointModel(1060,232), PointModel(1062,234)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1060 ,number = 232, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43416741842187, 35.04554517567158),
                connexionWith = listOf(PointModel(1059,231), PointModel(1061,233)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1061 ,number = 233, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434169198014274, 35.04547577351332),
                connexionWith = listOf(PointModel(1060,232)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1062 ,number = 234, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43419945107601, 35.045478120446205),
                connexionWith = listOf(PointModel(1059,231)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1063 ,number = 235, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43424638777586, 35.045502595603466),
                connexionWith = listOf(PointModel(1064,236)),
                connexionFloor = listOf(FloorModel(0, PointModel(808, 137)), FloorModel(1, PointModel(652, 190)), FloorModel(3, PointModel(1292, 210)), FloorModel(4, PointModel(1537, 229)), FloorModel(5, PointModel(1769, 210))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1064 ,number = 236, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43429087749871, 35.04550728946924),
                connexionWith = listOf(PointModel(1063,235), PointModel(1065,237)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1065 ,number = 237, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43434671204576, 35.045562610030174),
                connexionWith = listOf(PointModel(1056,228), PointModel(1066,238), PointModel(1069,241)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1066 ,number = 238, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43435004876972, 35.04552472382784),
                connexionWith = listOf(PointModel(1065,237), PointModel(1067,239), PointModel(1068,240)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1067 ,number = 239, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43432113048798, 35.04552137106657),
                connexionWith = listOf(PointModel(1066,238)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1068 ,number = 240, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43438163641252, 35.045527406036854),
                connexionWith = listOf(PointModel(1066,238)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1069 ,number = 241, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434406550595774, 35.04556529223919),
                connexionWith = listOf(PointModel(1065,237), PointModel(1070,242), PointModel(1071,243)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1070 ,number = 242, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434447481013216, 35.04556931555271),
                connexionWith = listOf(PointModel(1069,241)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1071 ,number = 243, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4344067730438, 35.0455129891634),
                connexionWith = listOf(PointModel(1069,241)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1072 ,number = 244, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43431712641691, 35.04560586065054),
                connexionWith = listOf(PointModel(1055,227), PointModel(1073,245)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1073 ,number = 245, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.4343162366233, 35.0456477701664),
                connexionWith = listOf(PointModel(1054,226), PointModel(1072,244), PointModel(1074,246)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1074 ,number = 246, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43431556927807, 35.04569102078676),
                connexionWith = listOf(PointModel(1053,225), PointModel(1073,245)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1075 ,number = 247, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434315791726476, 35.045734606683254),
                connexionWith = listOf(PointModel(1052,224)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1076 ,number = 248, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43431912845247, 35.04578221589327),
                connexionWith = listOf(PointModel(1051,223)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1077 ,number = 249, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434314901932844, 35.04586637020111),
                connexionWith = listOf(PointModel(1050,222)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1078 ,number = 250, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434304446856416, 35.04591163247824),
                connexionWith = listOf(PointModel(1079,251)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1079 ,number = 251, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43430489175335, 35.045967288315296),
                connexionWith = listOf(PointModel(1049,221), PointModel(1078,250)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1080 ,number = 252, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434301777474865, 35.04601489752531),
                connexionWith = listOf(PointModel(1081,253)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1081 ,number = 253, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.434300220335544, 35.04605244845152),
                connexionWith = listOf(PointModel(1048,220), PointModel(1080,252)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1082 ,number = 254, name = null, description = null, locationIndex = OLD, floorIndex = 2,
                location = LatLng(48.43429821829922, 35.046092346310616),
                connexionWith = listOf(PointModel(1047,219)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
        )
    }
    val navGraphOld3: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 1083 ,number = 1, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434127600025, 35.0483500957489),
                connexionWith = listOf(PointModel(1084,2)),
                connexionFloor = listOf(FloorModel(0, PointModel(679, 8)), FloorModel(1, PointModel(467, 5)), FloorModel(2, PointModel(829, 1)),  FloorModel(4, PointModel(1309, 1)), FloorModel(5, PointModel(1560, 1))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1084 ,number = 2, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43416986536143, 35.04835344851017),
                connexionWith = listOf(PointModel(1083,1), PointModel(1085,3), PointModel(1115,33), PointModel(1117,35)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1085 ,number = 3, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43416630617656, 35.04839804023504),
                connexionWith = listOf(PointModel(1084,2), PointModel(1086,4), PointModel(1107,25)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1086 ,number = 4, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434109359184724, 35.04839435219765),
                connexionWith = listOf(PointModel(1085,3), PointModel(1087,5), PointModel(1105,23)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1087 ,number = 5, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434074212181336, 35.04839066416025),
                connexionWith = listOf(PointModel(1086,4), PointModel(1088,6), PointModel(1104,22), PointModel(1109,27)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1088 ,number = 6, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434047963137644, 35.048390328884125),
                connexionWith = listOf(PointModel(1087,5), PointModel(1089,7), PointModel(1103,21)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1089 ,number = 7, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43403506106033, 35.04838865250349),
                connexionWith = listOf(PointModel(1088,6), PointModel(1090,8), PointModel(1110,28)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1090 ,number = 8, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434021491630666, 35.048384964466095),
                connexionWith = listOf(PointModel(1089,7), PointModel(1091,9), PointModel(1102,20)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1091 ,number = 9, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433991016013145, 35.04838362336159),
                connexionWith = listOf(PointModel(1090,8), PointModel(1092,10), PointModel(1101,19), PointModel(1111,29)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1092 ,number = 10, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433933179024514, 35.04837892949581),
                connexionWith = listOf(PointModel(1091,9), PointModel(1093,11), PointModel(1112,30)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1093 ,number = 11, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43389914415044, 35.04837557673454),
                connexionWith = listOf(PointModel(1092,10), PointModel(1094,12), PointModel(1100,18)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1094 ,number = 12, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433871782764534, 35.048373229801655),
                connexionWith = listOf(PointModel(1093,11), PointModel(1095,13), PointModel(1099,17), PointModel(1113,31)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1095 ,number = 13, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433841974408665, 35.04836853593588),
                connexionWith = listOf(PointModel(1094,12), PointModel(1096,14), PointModel(1098,16)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1096 ,number = 14, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43378324744742, 35.04836484789848),
                connexionWith = listOf(PointModel(1095,13), PointModel(1097,15), PointModel(1114,32)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1097 ,number = 15, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43377635147402, 35.048458725214005),
                connexionWith = listOf(PointModel(1096,14)),
                connexionFloor = listOf(FloorModel(0, PointModel(688, 17)), FloorModel(1, PointModel(483, 21)), FloorModel(2, PointModel(846, 18)),  FloorModel(4, PointModel(1324, 16)), FloorModel(5, PointModel(1579, 20))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1098 ,number = 16, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43383730294831, 35.04845470190048),
                connexionWith = listOf(PointModel(1095,13)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1099 ,number = 17, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43386466435276, 35.048457719385624),
                connexionWith = listOf(PointModel(1094,12)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1100 ,number = 18, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43389936660064, 35.048461742699146),
                connexionWith = listOf(PointModel(1093,11)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1101 ,number = 19, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43398278536878, 35.04847079515457),
                connexionWith = listOf(PointModel(1091,9)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1102 ,number = 20, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43401459568963, 35.048459731042385),
                connexionWith = listOf(PointModel(1090,8)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1103 ,number = 21, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43404573864177, 35.04845269024372),
                connexionWith = listOf(PointModel(1088,6)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1104 ,number = 22, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43407043054029, 35.04843559116125),
                connexionWith = listOf(PointModel(1087,5), PointModel(1105,23)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1105 ,number = 23, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43410535509693, 35.04843927919865),
                connexionWith = listOf(PointModel(1086,4), PointModel(1104,22)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1106 ,number = 24, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43413560819669, 35.04843391478062),
                connexionWith = listOf(PointModel(1107,25)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1107 ,number = 25, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43416452658405, 35.04843592643738),
                connexionWith = listOf(PointModel(1085,3), PointModel(1106,24), PointModel(1108,26)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1108 ,number = 26, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434207904134176, 35.04845838993788),
                connexionWith = listOf(PointModel(1107,25)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1109 ,number = 27, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43407643667594, 35.0483276322484),
                connexionWith = listOf(PointModel(1087,5)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1110 ,number = 28, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434037508006284, 35.04832562059164),
                connexionWith = listOf(PointModel(1089,7)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1111 ,number = 29, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43399613235898, 35.04832025617361),
                connexionWith = listOf(PointModel(1091,9)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1112 ,number = 30, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433933179024514, 35.04831589758396),
                connexionWith = listOf(PointModel(1092,10)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1113 ,number = 31, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43387511951969, 35.04831187427044),
                connexionWith = listOf(PointModel(1094,12), PointModel(1114,32)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1114 ,number = 32, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43378458215182, 35.04830181598663),
                connexionWith = listOf(PointModel(1096,14), PointModel(1113,31)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1115 ,number = 33, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43428709587377, 35.048364512622356),
                connexionWith = listOf(PointModel(1084,2), PointModel(1116,34)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1116 ,number = 34, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43428954280758, 35.04823476076126),
                connexionWith = listOf(PointModel(1115,33), PointModel(1117,35)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1117 ,number = 35, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43417609393436, 35.04822302609682),
                connexionWith = listOf(PointModel(1084,2), PointModel(1118,36)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1118 ,number = 36, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43417653883239, 35.048174411058426),
                connexionWith = listOf(PointModel(1117,35), PointModel(1119,37), PointModel(1141,59)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1119 ,number = 37, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43418210005751, 35.048088915646076),
                connexionWith = listOf(PointModel(1118,36), PointModel(1120,38), PointModel(1140,58)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1120 ,number = 38, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43418743883307, 35.04799772053957),
                connexionWith = listOf(PointModel(1119,37), PointModel(1121,39), PointModel(1139,57)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1121 ,number = 39, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434190108220655, 35.0479045137763),
                connexionWith = listOf(PointModel(1120,38), PointModel(1122,40), PointModel(1138,56)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1122 ,number = 40, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434194557199625, 35.04781298339367),
                connexionWith = listOf(PointModel(1121,39), PointModel(1123,41), PointModel(1137,55)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1123 ,number = 41, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43419633679109, 35.047769732773304),
                connexionWith = listOf(PointModel(1122,40), PointModel(1124,42), PointModel(1136,54)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1124 ,number = 42, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43420078576953, 35.047679878771305),
                connexionWith = listOf(PointModel(1123,41), PointModel(1125,43), PointModel(1133,51)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1125 ,number = 43, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43420323270749, 35.04759170114994),
                connexionWith = listOf(PointModel(1124,42), PointModel(1126,44), PointModel(1128,46), PointModel(1142,60)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1126 ,number = 44, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43420301025858, 35.04754576832056),
                connexionWith = listOf(PointModel(1125,43), PointModel(1127,45), PointModel(1171,89)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1127 ,number = 45, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43415451637489, 35.047536715865135),
                connexionWith = listOf(PointModel(1126,44)),
                connexionFloor = listOf(FloorModel(0, PointModel(716, 45)), FloorModel(1, PointModel(500, 38)), FloorModel(2, PointModel(891, 63)),  FloorModel(4, PointModel(1356, 48)), FloorModel(5, PointModel(1613, 54))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1128 ,number = 46, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43423304085141, 35.04759203642607),
                connexionWith = listOf(PointModel(1125,43), PointModel(1129,47), PointModel(1130,48)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1129 ,number = 47, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43423793472411, 35.0475263223052),
                connexionWith = listOf(PointModel(1128,46), PointModel(1132,50)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1130 ,number = 48, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43428019996877, 35.04759404808283),
                connexionWith = listOf(PointModel(1128,46), PointModel(1131,49)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1131 ,number = 49, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43433025087092, 35.04760108888149),
                connexionWith = listOf(PointModel(1130,48)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1132 ,number = 50, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43431846110732, 35.04753101617098),
                connexionWith = listOf(PointModel(1129,47)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1133 ,number = 51, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43422903677339, 35.04768256098032),
                connexionWith = listOf(PointModel(1124,42), PointModel(1134,52), PointModel(1135,53)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1134 ,number = 52, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43423081636365, 35.047635957598686),
                connexionWith = listOf(PointModel(1133,51)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1135 ,number = 53, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43422681228546, 35.04772447049618),
                connexionWith = listOf(PointModel(1133,51)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1136 ,number = 54, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43424104900649, 35.047770738601685),
                connexionWith = listOf(PointModel(1123,41)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1137 ,number = 55, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43423504289031, 35.047815665602684),
                connexionWith = listOf(PointModel(1122,40)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1138 ,number = 56, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434236822480344, 35.04790686070919),
                connexionWith = listOf(PointModel(1121,39)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1139 ,number = 57, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43422747963186, 35.048001408576965),
                connexionWith = listOf(PointModel(1120,38)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1140 ,number = 58, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43422970411974, 35.04809394478798),
                connexionWith = listOf(PointModel(1119,37)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1141 ,number = 59, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434228814324605, 35.048177763819695),
                connexionWith = listOf(PointModel(1118,36)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1142 ,number = 60, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434169420463334, 35.04758767783642),
                connexionWith = listOf(PointModel(1125,43), PointModel(1143,61), PointModel(1161,79)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1143 ,number = 61, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434112028576386, 35.047580637037754),
                connexionWith = listOf(PointModel(1142,60), PointModel(1144,62), PointModel(1160,78), PointModel(1162,80)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1144 ,number = 62, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434083332608594, 35.047578290104866),
                connexionWith = listOf(PointModel(1143,61), PointModel(1145,63), PointModel(1163,81)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1145 ,number = 63, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.4340492978351, 35.047575272619724),
                connexionWith = listOf(PointModel(1144,62), PointModel(1146,64), PointModel(1159,77)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1146 ,number = 64, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43401993448277, 35.04757594317198),
                connexionWith = listOf(PointModel(1145,63), PointModel(1147,65), PointModel(1158,76)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1147 ,number = 65, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43400391810163, 35.04757024347782),
                connexionWith = listOf(PointModel(1146,64), PointModel(1148,66), PointModel(1165,83)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1148 ,number = 66, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43390025640158, 35.047561191022396),
                connexionWith = listOf(PointModel(1147,65), PointModel(1149,67), PointModel(1166,84)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1149 ,number = 67, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43387778892367, 35.04756052047014),
                connexionWith = listOf(PointModel(1148,66), PointModel(1150,68), PointModel(1167,85), PointModel(1308,226)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1150 ,number = 68, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.4338366355968, 35.047555826604366),
                connexionWith = listOf(PointModel(1149,67), PointModel(1151,69), PointModel(1157,75)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1151 ,number = 69, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433785694405486, 35.04755113273859),
                connexionWith = listOf(PointModel(1150,68), PointModel(1152,70), PointModel(1156,74)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1152 ,number = 70, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43376456158185, 35.0475487858057),
                connexionWith = listOf(PointModel(1151,69), PointModel(1153,71), PointModel(1168,86)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1153 ,number = 71, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43367958529713, 35.04754241555929),
                connexionWith = listOf(PointModel(1152,70), PointModel(1307,225), PointModel(1155,73), PointModel(1170,88)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1154 ,number = 72, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433592161903, 35.047628581523895),
                connexionWith = listOf(PointModel(1307,225)),
                connexionFloor = listOf(FloorModel(0, PointModel(729, 58)), FloorModel(1, PointModel(533, 71)), FloorModel(2, PointModel(910, 82)),  FloorModel(4, PointModel(1388, 80)), FloorModel(5, PointModel(1629, 70))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1155 ,number = 73, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43367691588273, 35.04761517047882),
                connexionWith = listOf(PointModel(1153,71)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1156 ,number = 74, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43378524950403, 35.04762288182974),
                connexionWith = listOf(PointModel(1151,69)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1157 ,number = 75, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433831519234914, 35.047628581523895),
                connexionWith = listOf(PointModel(1150,68)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1158 ,number = 76, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43401459568963, 35.0476423278451),
                connexionWith = listOf(PointModel(1146,64), PointModel(1308,226)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1159 ,number = 77, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43404440394421, 35.04764400422573),
                connexionWith = listOf(PointModel(1145,63)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1160 ,number = 78, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43410869183677, 35.04764433950186),
                connexionWith = listOf(PointModel(1143,61)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1161 ,number = 79, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434167195972805, 35.04765138030052),
                connexionWith = listOf(PointModel(1142,60)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1162 ,number = 80, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43411425306933, 35.047497153282166),
                connexionWith = listOf(PointModel(1143,61)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1163 ,number = 81, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43408488975456, 35.047496147453785),
                connexionWith = listOf(PointModel(1144,62)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1164 ,number = 82, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43405641622097, 35.047485418617725),
                connexionWith = listOf(PointModel(1165,83)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1165 ,number = 83, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434006809948606, 35.0474850833416),
                connexionWith = listOf(PointModel(1147,65), PointModel(1164,82)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1166 ,number = 84, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43390692990795, 35.04749916493893),
                connexionWith = listOf(PointModel(1148,66)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1167 ,number = 85, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43387623177137, 35.04749581217766),
                connexionWith = listOf(PointModel(1149,67)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1168 ,number = 86, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433769900401295, 35.04748575389385),
                connexionWith = listOf(PointModel(1152,70), PointModel(1169,87)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1169 ,number = 87, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433709838650415, 35.04747971892357),
                connexionWith = listOf(PointModel(1168,86)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1170 ,number = 88, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43367647098032, 35.04747301340103),
                connexionWith = listOf(PointModel(1153,71)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1171 ,number = 89, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434211908213875, 35.047408640384674),
                connexionWith = listOf(PointModel(1126,44), PointModel(1172,90), PointModel(1191,109)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),

            NavModel(
                id = 1172 ,number = 90, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434215689844386, 35.04731811583042),
                connexionWith = listOf(PointModel(1171,89), PointModel(1173,91), PointModel(1190,108)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1173 ,number = 91, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43421835923045, 35.047226920723915),
                connexionWith = listOf(PointModel(1172,90), PointModel(1174,92), PointModel(1188,106)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1174 ,number = 92, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434227257183046, 35.0470532476902),
                connexionWith = listOf(PointModel(1173,91), PointModel(1175,93), PointModel(1187,105)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1175 ,number = 93, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43422992656855, 35.047008991241455),
                connexionWith = listOf(PointModel(1174,92), PointModel(1176,94), PointModel(1186,104)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1176 ,number = 94, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43423170615876, 35.0469134375453),
                connexionWith = listOf(PointModel(1175,93), PointModel(1177,95), PointModel(1184,102), PointModel(1192,110)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1177 ,number = 95, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.4342668530532, 35.046917125582695),
                connexionWith = listOf(PointModel(1176,94), PointModel(1178,96), PointModel(1180,98)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1178 ,number = 96, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43433025087092, 35.046921484172344),
                connexionWith = listOf(PointModel(1177,95), PointModel(1179,97)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1179 ,number = 97, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434426126016945, 35.04692953079939),
                connexionWith = listOf(PointModel(1178,96)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1180 ,number = 98, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43427085712825, 35.04687789827585),
                connexionWith = listOf(PointModel(1177,95), PointModel(1181,99), PointModel(1183,101)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1181 ,number = 99, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43427174692264, 35.04681654274464),
                connexionWith = listOf(PointModel(1180,98), PointModel(1182,100)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1182 ,number = 100, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434327803939084, 35.04682056605816),
                connexionWith = listOf(PointModel(1181,99), PointModel(1183,101)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1183 ,number = 101, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434325134558755, 35.04688058048487),
                connexionWith = listOf(PointModel(1180,98), PointModel(1182,100)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1184 ,number = 102, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43423504289031, 35.04686415195465),
                connexionWith = listOf(PointModel(1176,94), PointModel(1185,103), PointModel(1224,142)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1185 ,number = 103, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434193000057, 35.04686214029789),
                connexionWith = listOf(PointModel(1184,102)),
                connexionFloor = listOf(FloorModel(0, PointModel(747, 76)), FloorModel(1, PointModel(561, 99)), FloorModel(2, PointModel(938, 110)),  FloorModel(4, PointModel(1415, 107)), FloorModel(5, PointModel(1659, 100))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1186 ,number = 104, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43426485101558, 35.04701133817434),
                connexionWith = listOf(PointModel(1175,93)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1187 ,number = 105, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43426640815596, 35.04705794155598),
                connexionWith = listOf(PointModel(1174,92)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1188 ,number = 106, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43425795510755, 35.0472292676568),
                connexionWith = listOf(PointModel(1173,91)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1189 ,number = 107, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434245053083565, 35.04727452993393),
                connexionWith = listOf(PointModel(1190,108)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1190 ,number = 108, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43424616532715, 35.04732012748718),
                connexionWith = listOf(PointModel(1172,90), PointModel(1189,107), PointModel(1191,109)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1191 ,number = 109, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43423971431407, 35.047408640384674),
                connexionWith = listOf(PointModel(1171,89), PointModel(1190,108)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1192 ,number = 110, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43414027962961, 35.04690706729889),
                connexionWith = listOf(PointModel(1176,94), PointModel(1193,111), PointModel(1211,129), PointModel(1212,130)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1193 ,number = 111, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43407376728239, 35.04690270870924),
                connexionWith = listOf(PointModel(1192,110), PointModel(1194,112), PointModel(1210,128), PointModel(1216,134)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1194 ,number = 112, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434044848843406, 35.04689868539572),
                connexionWith = listOf(PointModel(1193,111), PointModel(1195,113), PointModel(1208,126)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1195 ,number = 113, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43402972226877, 35.04689533263445),
                connexionWith = listOf(PointModel(1194,112), PointModel(1196,114), PointModel(1217,135)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1196 ,number = 114, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43397499962287, 35.046889297664165),
                connexionWith = listOf(PointModel(1195,113), PointModel(1209,127), PointModel(1218,136)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1197 ,number = 115, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43390448295571, 35.04688527435064),
                connexionWith = listOf(PointModel(1209,127), PointModel(1198,116), PointModel(1207,125)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1198 ,number = 116, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433860660245735, 35.0468772277236),
                connexionWith = listOf(PointModel(1197,115), PointModel(1199,117), PointModel(1206,124), PointModel(1220,138)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1199 ,number = 117, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433795037335244, 35.04687387496233),
                connexionWith = listOf(PointModel(1198,116), PointModel(1200,118), PointModel(1205,123), PointModel(1221,139)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1200 ,number = 118, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433734085810215, 35.04686649888754),
                connexionWith = listOf(PointModel(1199,117), PointModel(1201,119), PointModel(1222,140)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1201 ,number = 119, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43370338756924, 35.04686247557402),
                connexionWith = listOf(PointModel(1200,118), PointModel(1202,120), PointModel(1204,122)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1202 ,number = 120, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43365266869562, 35.046861469745636),
                connexionWith = listOf(PointModel(1201,119), PointModel(1203,121), PointModel(1223,141)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1203 ,number = 121, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43365044418247, 35.04692517220974),
                connexionWith = listOf(PointModel(1202,120)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1204 ,number = 122, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433698938547245, 35.04692751914263),
                connexionWith = listOf(PointModel(1201,119)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1205 ,number = 123, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433792590377585, 35.04693288356066),
                connexionWith = listOf(PointModel(1199,117)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1206 ,number = 124, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43385665613835, 35.04698820412159),
                connexionWith = listOf(PointModel(1198,116)),
                connexionFloor = listOf(FloorModel(1, PointModel(584, 122)), FloorModel(2, PointModel(973, 145)), FloorModel(3, PointModel(1206, 124)),  FloorModel(5, PointModel(1683, 124))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1207 ,number = 125, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43390248090378, 35.046953335404396),
                connexionWith = listOf(PointModel(1197,115), PointModel(1208,126)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1208 ,number = 126, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43404039985133, 35.04696272313595),
                connexionWith = listOf(PointModel(1194,112), PointModel(1207,125)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1209 ,number = 127, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43391271361275, 35.04688527435064),
                connexionWith = listOf(PointModel(1196,114), PointModel(1197,115), PointModel(1219,137)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1210 ,number = 128, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434072655035045, 35.046978145837784),
                connexionWith = listOf(PointModel(1193,111)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1211 ,number = 129, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434137610239425, 35.0469808280468),
                connexionWith = listOf(PointModel(1192,110)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1212 ,number = 130, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434143171468826, 35.0468685105443),
                connexionWith = listOf(PointModel(1192,110),  PointModel(1214,132)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1213 ,number = 131, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43411047143126, 35.04686415195465),
                connexionWith = listOf(PointModel(1214,132)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1214 ,number = 132, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43413138166179, 35.04686448723078),
                connexionWith = listOf(PointModel(1212,130), PointModel(1213,131), PointModel(1215,133)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1215 ,number = 133, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43413093676336, 35.046818889677525),
                connexionWith = listOf(PointModel(1214,132)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1216 ,number = 134, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434078216271544, 35.04683095961809),
                connexionWith = listOf(PointModel(1193,111)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1217 ,number = 135, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43403083451707, 35.04682693630457),
                connexionWith = listOf(PointModel(1195,113)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1218 ,number = 136, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433978113921384, 35.04682391881943),
                connexionWith = listOf(PointModel(1196,114), PointModel(1219,137)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1219 ,number = 137, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43391382586361, 35.04681654274464),
                connexionWith = listOf(PointModel(1209,127), PointModel(1218,136)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1220 ,number = 138, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43386332965047, 35.04680849611759),
                connexionWith = listOf(PointModel(1198,116)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1221 ,number = 139, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433794147532474, 35.04680749028921),
                connexionWith = listOf(PointModel(1199,117)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1222 ,number = 140, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43373675522162, 35.046803802251816),
                connexionWith = listOf(PointModel(1200,118)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1223 ,number = 141, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43364910947453, 35.04679709672928),
                connexionWith = listOf( PointModel(1202,120)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1224 ,number = 142, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43424327349381, 35.046716295182705),
                connexionWith = listOf(PointModel(1184,102), PointModel(1225,143), PointModel(1245,163)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1225 ,number = 143, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43424327349381, 35.04662610590458),
                connexionWith = listOf(PointModel(1224,142), PointModel(1226,144), PointModel(1244,162)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1226 ,number = 144, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43424616532715, 35.04654262214899),
                connexionWith = listOf(PointModel(1225,143), PointModel(1227,145), PointModel(1241,159)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1227 ,number = 145, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43425194899335, 35.04645310342312),
                connexionWith = listOf(PointModel(1226,144), PointModel(1228,146), PointModel(1240,158)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1228 ,number = 146, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434256842864215, 35.04636660218239),
                connexionWith = listOf(PointModel(1227,145), PointModel(1229,147), PointModel(1239,157)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1229 ,number = 147, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434261069388704, 35.04628378897905),
                connexionWith = listOf(PointModel(1228,146), PointModel(1230,148), PointModel(1238,156)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1230 ,number = 148, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43425995714545, 35.04623584449291),
                connexionWith = listOf(PointModel(1229,147), PointModel(1231,149), PointModel(1233,151), PointModel(1246,164)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1231 ,number = 149, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43426151428599, 35.04619427025318),
                connexionWith = listOf(PointModel(1230,148), PointModel(1232,150), PointModel(1277,195)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1232 ,number = 150, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43421302045815, 35.0461882352829),
                connexionWith = listOf(PointModel(1231,149)),
                connexionFloor = listOf(FloorModel(0, PointModel(768, 97)), FloorModel(1, PointModel(610, 148)), FloorModel(2, PointModel(996, 168)),  FloorModel(4, PointModel(1473, 165)), FloorModel(5, PointModel(1720, 161))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1233 ,number = 151, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43440810773184, 35.04625093191862),
                connexionWith = listOf(PointModel(1230,148), PointModel(1234,152), PointModel(1236,154)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1234 ,number = 152, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.4344637197023, 35.046256966888905),
                connexionWith = listOf(PointModel(1233,151), PointModel(1235,153)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1235 ,number = 153, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434465054388845, 35.04618052393198),
                connexionWith = listOf(PointModel(1234,152)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1236 ,number = 154, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43441033221181, 35.046179853379726),
                connexionWith = listOf(PointModel(1233,151), PointModel(1237,155)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1237 ,number = 155, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43432379986852, 35.046168118715286),
                connexionWith = listOf(PointModel(1236,154), PointModel(1278,196)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1238 ,number = 156, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434314901932844, 35.04628848284483),
                connexionWith = listOf(PointModel(1229,147), PointModel(1239,157)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1239 ,number = 157, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43430711623785, 35.04636626690626),
                connexionWith = listOf(PointModel(1228,146), PointModel(1238,156)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1240 ,number = 158, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434302667268724, 35.04645612090826),
                connexionWith = listOf(PointModel(1227,145)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1241 ,number = 159, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43427708568878, 35.0465439632535),
                connexionWith = listOf(PointModel(1226,144), PointModel(1242,160), PointModel(1243,161)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1242 ,number = 160, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43430667134094, 35.04654597491026),
                connexionWith = listOf(PointModel(1241,159)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1243 ,number = 161, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434278197931675, 35.04649233072996),
                connexionWith = listOf(PointModel(1241,159)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1244 ,number = 162, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43429154484427, 35.04663113504648),
                connexionWith = listOf(PointModel(1225,143)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1245 ,number = 163, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43428531628549, 35.046718306839466),
                connexionWith = listOf(PointModel(1224,142)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1246 ,number = 164, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434226367387865, 35.04623584449291),
                connexionWith = listOf(PointModel(1230,148), PointModel(1247,165), PointModel(1266,184)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1247 ,number = 165, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434171422504754, 35.0462294742465),
                connexionWith = listOf(PointModel(1246,164), PointModel(1248,166), PointModel(1267,185)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1248 ,number = 166, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434140724527964, 35.04622846841812),
                connexionWith = listOf(PointModel(1247,165), PointModel(1249,167), PointModel(1268,186)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1249 ,number = 167, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434102908154266, 35.04622511565685),
                connexionWith = listOf(PointModel(1248,166), PointModel(1250,168), PointModel(1265,183), PointModel(1269,187)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1250 ,number = 168, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43407287748451, 35.04622109234333),
                connexionWith = listOf(PointModel(1249,167), PointModel(1251,169), PointModel(1264,182), PointModel(1270,188)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1251 ,number = 169, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43401882223425, 35.04621438682079),
                connexionWith = listOf(PointModel(1250,168), PointModel(1252,170), PointModel(1271,189)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1252 ,number = 170, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43394229947709, 35.04620835185051),
                connexionWith = listOf(PointModel(1251,169), PointModel(1253,171), PointModel(1263,181)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1253 ,number = 171, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433904038055296, 35.04620332270861),
                connexionWith = listOf(PointModel(1252,170), PointModel(1254,172), PointModel(1272,190)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1254 ,number = 172, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43384597851717, 35.046199299395084),
                connexionWith = listOf(PointModel(1253,171), PointModel(1255,173), PointModel(1262,180), PointModel(1273,191)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1255 ,number = 173, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43382239876244, 35.046196952462196),
                connexionWith = listOf(PointModel(1254,172), PointModel(1256,174), PointModel(1274,192)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1256 ,number = 174, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433760112565245, 35.04619158804417),
                connexionWith = listOf(PointModel(1255,173), PointModel(1257,175), PointModel(1261,179)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1257 ,number = 175, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43373497561402, 35.046187564730644),
                connexionWith = listOf(PointModel(1256,174), PointModel(1258,176), PointModel(1260,178), PointModel(1275,193)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1258 ,number = 176, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43364977682849, 35.046181194484234),
                connexionWith = listOf(PointModel(1257,175), PointModel(1259,177), PointModel(1276,194)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1259 ,number = 177, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43364732986388, 35.04627373069525),
                connexionWith = listOf(PointModel(1258,176)),
                connexionFloor = listOf(FloorModel(0, PointModel(783, 112)), FloorModel(1, PointModel(648, 186)), FloorModel(2, PointModel(1026, 198)),  FloorModel(4, PointModel(1507, 199)), FloorModel(5, PointModel(1745, 186))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1260 ,number = 178, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43373230620257, 35.04626099020243),
                connexionWith = listOf(PointModel(1257,175)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1261 ,number = 179, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433760112565245, 35.04626166075468),
                connexionWith = listOf(PointModel(1256,174)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1262 ,number = 180, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433842196859125, 35.046264342963696),
                connexionWith = listOf(PointModel(1254,172)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1263 ,number = 181, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43394096477681, 35.046270713210106),
                connexionWith = listOf(PointModel(1252,170), PointModel(1264,182)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1264 ,number = 182, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43407065298976, 35.04627909511328),
                connexionWith = listOf(PointModel(1250,168), PointModel(1263,181)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1265 ,number = 183, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434104242850296, 35.046285800635815),
                connexionWith = listOf(PointModel(1249,167)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1266 ,number = 184, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.4342221408605, 35.04629921168089),
                connexionWith = listOf(PointModel(1246,164)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1267 ,number = 185, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43417275719895, 35.04615034908056),
                connexionWith = listOf(PointModel(1247,165)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1268 ,number = 186, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.4341427265705, 35.046148002147675),
                connexionWith = listOf(PointModel(1248,166)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1269 ,number = 187, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434105577546276, 35.04615604877472),
                connexionWith = listOf(PointModel(1249,167)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1270 ,number = 188, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434076214226465, 35.046155378222466),
                connexionWith = listOf(PointModel(1250,168)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1271 ,number = 189, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43401815488512, 35.046149007976055),
                connexionWith = listOf(PointModel(1251,169)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1272 ,number = 190, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43390715235813, 35.04614666104317),
                connexionWith = listOf(PointModel(1253,171)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1273 ,number = 191, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43384976017493, 35.04612922668457),
                connexionWith = listOf(PointModel(1254,172)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1274 ,number = 192, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43382128650959, 35.04612822085619),
                connexionWith = listOf(PointModel(1255,173)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1275 ,number = 193, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43373252865352, 35.046121180057526),
                connexionWith = listOf(PointModel(1256,174)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1276 ,number = 194, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43365111153643, 35.04611447453499),
                connexionWith = listOf(PointModel(1258,176)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1277 ,number = 195, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43426707550183, 35.04609972238541),
                connexionWith = listOf(PointModel(1231,149), PointModel(1278,196), PointModel(1279,197)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1278 ,number = 196, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434325134558755, 35.04610575735569),
                connexionWith = listOf(PointModel(1237,155), PointModel(1277,195)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1279 ,number = 197, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43426885509077, 35.046057142317295),
                connexionWith = listOf(PointModel(1278,196), PointModel(1280,198), PointModel(1306,224)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1280 ,number = 198, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43427285916564, 35.04595421254635),
                connexionWith = listOf(PointModel(1279,197), PointModel(1281,199), PointModel(1305,223)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1281 ,number = 199, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43427730813736, 35.04586469382048),
                connexionWith = listOf(PointModel(1280,198), PointModel(1282,200), PointModel(1304,222)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1282 ,number = 200, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434283314248574, 35.04573326557875),
                connexionWith = listOf(PointModel(1281,199), PointModel(1283,201), PointModel(1303,221)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1283 ,number = 201, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43428531628549, 35.045645758509636),
                connexionWith = listOf(PointModel(1282,200), PointModel(1284,202), PointModel(1301,219)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1284 ,number = 202, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434289987704645, 35.045564621686935),
                connexionWith = listOf(PointModel(1283,201), PointModel(1285,203), PointModel(1291,209), PointModel(1294,212)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1285 ,number = 203, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43425728776158, 35.04556227475405),
                connexionWith = listOf(PointModel(1284,202), PointModel(1286,204), PointModel(1287,205)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1286 ,number = 204, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434252838788105, 35.045615918934345),
                connexionWith = listOf(PointModel(1285,203)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1287 ,number = 205, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43420078576953, 35.045558251440525),
                connexionWith = listOf(PointModel(1285,203), PointModel(1288,206), PointModel(1290,208)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1288 ,number = 206, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43417075515761, 35.04555456340313),
                connexionWith = listOf(PointModel(1287,205), PointModel(1289,207)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1289 ,number = 207, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43416563882936, 35.04561558365822),
                connexionWith = listOf(PointModel(1288,206)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1290 ,number = 208, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43420212046296, 35.04549387842417),
                connexionWith = listOf(PointModel(1287,205)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1291 ,number = 209, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434286206079626, 35.045513324439526),
                connexionWith = listOf(PointModel(1284,202), PointModel(1292,210), PointModel(1293,211)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1292 ,number = 210, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43424838981422, 35.04550963640213),
                connexionWith = listOf(PointModel(1291,209)),
                connexionFloor = listOf(FloorModel(0, PointModel(808, 137)), FloorModel(1, PointModel(652, 190)), FloorModel(2, PointModel(1063, 235)),  FloorModel(4, PointModel(1537, 229)), FloorModel(5, PointModel(1769, 210))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1293 ,number = 211, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.4343164590717, 35.04550024867058),
                connexionWith = listOf(PointModel(1291,209)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1294 ,number = 212, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43432268762664, 35.045558251440525),
                connexionWith = listOf(PointModel(1284,202), PointModel(1295,213), PointModel(1296,214)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1295 ,number = 213, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43432424476527, 35.04552975296974),
                connexionWith = listOf(PointModel(1294,212)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1296 ,number = 214, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43434893652843, 35.04556629806757),
                connexionWith = listOf(PointModel(1294,212), PointModel(1297,215), PointModel(1298,216)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1297 ,number = 215, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434350938562744, 35.04549153149128),
                connexionWith = listOf(PointModel(1296,214)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1298 ,number = 216, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43443502393313, 35.04557400941849),
                connexionWith = listOf(PointModel(1296,214), PointModel(1299,217)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1299 ,number = 217, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.4344368035162, 35.04550125449896),
                connexionWith = listOf(PointModel(1298,216)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1300 ,number = 218, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43432046314283, 35.04560921341181),
                connexionWith = listOf(PointModel(1301,219)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1301 ,number = 219, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43431712641691, 35.045649111270905),
                connexionWith = listOf(PointModel(1283,201), PointModel(1300,218), PointModel(1302,220)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1302 ,number = 220, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.4343160141749, 35.045698061585426),
                connexionWith = listOf(PointModel(1301,219)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1303 ,number = 221, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43431512438124, 35.045739971101284),
                connexionWith = listOf(PointModel(1282,200), PointModel(1304,222)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1304 ,number = 222, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.434308450928484, 35.04587072879076),
                connexionWith = listOf(PointModel(1281,199), PointModel(1303,221), PointModel(1305,223)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1305 ,number = 223, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43430489175335, 35.04595521837473),
                connexionWith = listOf(PointModel(1280,198), PointModel(1304,222)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1306 ,number = 224, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43431757131371, 35.0460621714592),
                connexionWith = listOf(PointModel(1279,197)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1307 ,number = 225, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.433594163967136, 35.04753202199936),
                connexionWith = listOf(PointModel(1153,71), PointModel(1154,72)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1308 ,number = 226, name = null, description = null, locationIndex = OLD, floorIndex = 3,
                location = LatLng(48.43387600932103, 35.047629587352276),
                connexionWith = listOf(PointModel(1149,67), PointModel(1158,76)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
        )
    }
    val navGraphOld4: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 1309 ,number = 1, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43412693267727, 35.04834942519665),
                connexionWith = listOf(PointModel(1310,2)),
                connexionFloor = listOf(FloorModel(0, PointModel(679, 8)), FloorModel(1, PointModel(467, 5)), FloorModel(2, PointModel(829, 1)), FloorModel(3, PointModel(1083, 1)),  FloorModel(5, PointModel(1560, 1))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1310 ,number = 2, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43416986536143, 35.04835478961468),
                connexionWith = listOf(PointModel(1309,1), PointModel(1311,3), PointModel(1341,33), PointModel(1343,35)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1311 ,number = 3, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43416741842187, 35.04839971661568),
                connexionWith = listOf(PointModel(1310,2), PointModel(1312,4), PointModel(1313,5)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1312 ,number = 4, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4341992286271, 35.04840474575758),
                connexionWith = listOf(PointModel(1311,3), PointModel(1335,27)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1313 ,number = 5, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43413494084909, 35.04839736968279),
                connexionWith = listOf(PointModel(1311,3), PointModel(1314,6), PointModel(1334,26)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1314 ,number = 6, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434105577546276, 35.048394687473774),
                connexionWith = listOf(PointModel(1313,5), PointModel(1315,7), PointModel(1333,25)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1315 ,number = 7, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43407532442863, 35.04839200526476),
                connexionWith = listOf(PointModel(1314,6), PointModel(1316,8), PointModel(1332,24), PointModel(1336,28)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1316 ,number = 8, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434048185587216, 35.048389323055744),
                connexionWith = listOf(PointModel(1315,7), PointModel(1317,9), PointModel(1331,23)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1317 ,number = 9, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433990126213814, 35.048384964466095),
                connexionWith = listOf(PointModel(1316,8), PointModel(1318,10), PointModel(1330,22)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1318 ,number = 10, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43392739532203, 35.048377588391304),
                connexionWith = listOf(PointModel(1317,9), PointModel(1319,11), PointModel(1337,29)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1319 ,number = 11, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43389914415044, 35.04837725311518),
                connexionWith = listOf(PointModel(1318,10), PointModel(1320,12), PointModel(1329,21)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1320 ,number = 12, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43387067051275, 35.048373229801655),
                connexionWith = listOf(PointModel(1319,11), PointModel(1321,13), PointModel(1328,20), PointModel(1338,30)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1321 ,number = 13, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43384152950769, 35.048372223973274),
                connexionWith = listOf(PointModel(1320,12), PointModel(1322,14), PointModel(1325,17), PointModel(1339,31)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1322 ,number = 14, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433811276232824, 35.048367865383625),
                connexionWith = listOf(PointModel(1321,13), PointModel(1323,15), PointModel(1327,19)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1323 ,number = 15, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43378057803846, 35.04836652427912),
                connexionWith = listOf(PointModel(1322,14), PointModel(1324,16), PointModel(1340,32)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1324 ,number = 16, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43377412696627, 35.04845503717661),
                connexionWith = listOf(PointModel(1323,15)),
                connexionFloor = listOf(FloorModel(0, PointModel(688, 17)), FloorModel(1, PointModel(483, 21)), FloorModel(2, PointModel(846, 18)), FloorModel(3, PointModel(1097, 15)),  FloorModel(5, PointModel(1579, 20))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1325 ,number = 17, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43383886010181, 35.04842922091484),
                connexionWith = listOf(PointModel(1321,13), PointModel(1326,18)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1326 ,number = 18, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433810386430366, 35.04843022674322),
                connexionWith = listOf(PointModel(1325,17)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1327 ,number = 19, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43380971907849, 35.04840776324272),
                connexionWith = listOf(PointModel(1322,14)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1328 ,number = 20, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43386355210086, 35.048430897295475),
                connexionWith = listOf(PointModel(1320,12)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1329 ,number = 21, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43389491759584, 35.0484312325716),
                connexionWith = listOf(PointModel(1319,11)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1330 ,number = 22, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433983675168236, 35.048444643616676),
                connexionWith = listOf(PointModel(1317,9)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1331 ,number = 23, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434045961091364, 35.04843324422836),
                connexionWith = listOf(PointModel(1316,8), PointModel(1332,24)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1332 ,number = 24, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434070208090795, 35.048434250056744),
                connexionWith = listOf(PointModel(1315,7), PointModel(1331,23)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1333 ,number = 25, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434104242850296, 35.048459731042385),
                connexionWith = listOf(PointModel(1313,5)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1334 ,number = 26, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4341347183999, 35.04846207797527),
                connexionWith = listOf(PointModel(1314,6)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1335 ,number = 27, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43419277760806, 35.04846576601267),
                connexionWith = listOf(PointModel(1312,4)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1336 ,number = 28, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43407777137266, 35.04832562059164),
                connexionWith = listOf(PointModel(1315,7)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1337 ,number = 29, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433930954523625, 35.04831422120333),
                connexionWith = listOf(PointModel(1318,10)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1338 ,number = 30, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43387222766523, 35.04830952733755),
                connexionWith = listOf(PointModel(1320,12)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1339 ,number = 31, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43383774784932, 35.048304833471775),
                connexionWith = listOf(PointModel(1321,13), PointModel(1340,32)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1340 ,number = 32, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43378391479962, 35.048298463225365),
                connexionWith = listOf(PointModel(1323,15), PointModel(1339,31)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1341 ,number = 33, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43427997752021, 35.04836317151785),
                connexionWith = listOf(PointModel(1310,2), PointModel(1342,34)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1342 ,number = 34, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434282202005804, 35.04823341965675),
                connexionWith = listOf(PointModel(1341,33), PointModel(1343,35)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1343 ,number = 35, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43417498168925, 35.04821967333555),
                connexionWith = listOf(PointModel(1310,2), PointModel(1342,34), PointModel(1344,36)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1344 ,number = 36, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434178540873496, 35.04816770553589),
                connexionWith = listOf(PointModel(1343,35), PointModel(1345,37), PointModel(1373,65)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1345 ,number = 37, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434179208220534, 35.04814222455025),
                connexionWith = listOf(PointModel(1344,36), PointModel(1346,38), PointModel(1372,64)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1346 ,number = 38, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43418098781255, 35.048087909817696),
                connexionWith = listOf(PointModel(1345,37), PointModel(1347,39), PointModel(1371,63)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1347 ,number = 39, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43418543679232, 35.0480305776),
                connexionWith = listOf(PointModel(1346,38), PointModel(1348,40), PointModel(1370,62)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1348 ,number = 40, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43418855107792, 35.0479631870985),
                connexionWith = listOf(PointModel(1347,39), PointModel(1349,41), PointModel(1369,61)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1349 ,number = 41, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434191442914376, 35.04789747297764),
                connexionWith = listOf(PointModel(1348,40), PointModel(1350,42), PointModel(1368,60)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1350 ,number = 42, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434190775567515, 35.04784919321537),
                connexionWith = listOf(PointModel(1349,41), PointModel(1351,43), PointModel(1367,59)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1351 ,number = 43, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43419566944431, 35.0477784499526),
                connexionWith = listOf(PointModel(1350,42), PointModel(1352,44), PointModel(1366,58)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1352 ,number = 44, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434197449035715, 35.047724805772305),
                connexionWith = listOf(PointModel(1351,43), PointModel(1353,45), PointModel(1365,57)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1353 ,number = 45, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43420189801405, 35.04763964563608),
                connexionWith = listOf(PointModel(1352,44), PointModel(1354,46), PointModel(1364,56)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1354 ,number = 46, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43420145311626, 35.047589018940926),
                connexionWith = listOf(PointModel(1353,45), PointModel(1355,47), PointModel(1357,49), PointModel(1374,66)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1355 ,number = 47, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43420478984976, 35.04754610359669),
                connexionWith = listOf(PointModel(1354,46), PointModel(1356,48), PointModel(1407,99)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1356 ,number = 48, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43416096739879, 35.047541074454784),
                connexionWith = listOf(PointModel(1355,47)),
                connexionFloor = listOf(FloorModel(0, PointModel(716, 45)), FloorModel(1, PointModel(500, 38)), FloorModel(2, PointModel(891, 63)), FloorModel(3, PointModel(1127, 45)),  FloorModel(5, PointModel(1613, 54))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1357 ,number = 49, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43423393064649, 35.047593377530575),
                connexionWith = listOf(PointModel(1354,46), PointModel(1358,50), PointModel(1359,51)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1358 ,number = 50, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434236822480344, 35.04753638058901),
                connexionWith = listOf(PointModel(1357,49)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1359 ,number = 51, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43432424476527, 35.04760209470987),
                connexionWith = listOf(PointModel(1357,49), PointModel(1360,52), PointModel(1361,53)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1360 ,number = 52, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434325357007104, 35.04753906279802),
                connexionWith = listOf(PointModel(1359,51)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1361 ,number = 53, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43438119151627, 35.04760544747114),
                connexionWith = listOf(PointModel(1359,51), PointModel(1362,54), PointModel(1363,55)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1362 ,number = 54, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43438452823799, 35.04754241555929),
                connexionWith = listOf(PointModel(1361,53)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1363 ,number = 55, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43440966486783, 35.04760913550854),
                connexionWith = listOf(PointModel(1361,53)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1364 ,number = 56, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43425150409596, 35.04764199256897),
                connexionWith = listOf(PointModel(1353,45)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1365 ,number = 57, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43424527553227, 35.047729164361954),
                connexionWith = listOf(PointModel(1352,44)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1366 ,number = 58, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43424082655778, 35.047778114676476),
                connexionWith = listOf(PointModel(1351,43)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1367 ,number = 59, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434234820441525, 35.04785120487213),
                connexionWith = listOf(PointModel(1350,42)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1368 ,number = 60, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43423526533906, 35.047899819910526),
                connexionWith = listOf(PointModel(1349,41)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1369 ,number = 61, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43423459799276, 35.04796218127012),
                connexionWith = listOf(PointModel(1348,40), PointModel(1370,62)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1370 ,number = 62, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43422970411974, 35.04803527146578),
                connexionWith = listOf(PointModel(1347,39), PointModel(1369,61)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1371 ,number = 63, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43421146331613, 35.04809360951185),
                connexionWith = listOf(PointModel(1346,38)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1372 ,number = 64, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434211908213875, 35.04814591258764),
                connexionWith = listOf(PointModel(1345,37)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1373 ,number = 65, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43421035107181, 35.048166029155254),
                connexionWith = listOf(PointModel(1344,36)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1374 ,number = 66, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4341687531162, 35.04758767783642),
                connexionWith = listOf(PointModel(1354,46), PointModel(1375,67), PointModel(1397,89)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1375 ,number = 67, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434113585721455, 35.047580637037754),
                connexionWith = listOf(PointModel(1374,66), PointModel(1376,68), PointModel(1396,88), PointModel(1559,251)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1376 ,number = 68, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4340842224063, 35.04757929593325),
                connexionWith = listOf(PointModel(1375,67), PointModel(1377,69), PointModel(1398,90)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1377 ,number = 69, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434047963137644, 35.04757694900036),
                connexionWith = listOf(PointModel(1376,68), PointModel(1378,70), PointModel(1395,87), PointModel(1399,91)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1378 ,number = 70, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43401904468395, 35.047574266791344),
                connexionWith = listOf(PointModel(1377,69), PointModel(1379,71), PointModel(1394,86), PointModel(1400,92)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1379 ,number = 71, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4339015911029, 35.04756387323141),
                connexionWith = listOf(PointModel(1378,70), PointModel(1380,72), PointModel(1402,94)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1380 ,number = 72, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43387823382431, 35.047560185194016),
                connexionWith = listOf(PointModel(1379,71), PointModel(1381,73), PointModel(1393,85), PointModel(1403,95)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1381 ,number = 73, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4338475356704, 35.04755616188049),
                connexionWith = listOf(PointModel(1380,72), PointModel(1382,74), PointModel(1404,96)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1382 ,number = 74, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43383596824528, 35.047555826604366),
                connexionWith = listOf(PointModel(1381,73), PointModel(1383,75), PointModel(1392,84)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1383 ,number = 75, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43378769646199, 35.04755146801472),
                connexionWith = listOf(PointModel(1382,74), PointModel(1384,76), PointModel(1391,83)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1384 ,number = 76, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43370449982466, 35.04754174500704),
                connexionWith = listOf(PointModel(1383,75), PointModel(1385,77), PointModel(1405,97)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1385 ,number = 77, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43367891794355, 35.04754140973091),
                connexionWith = listOf(PointModel(1384,76), PointModel(1386,78), PointModel(1390,82), PointModel(1406,98)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1386 ,number = 78, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43362775414268, 35.047535710036755),
                connexionWith = listOf(PointModel(1385,77), PointModel(1387,79), PointModel(1389,81)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1387 ,number = 79, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43359305170928, 35.04753403365612),
                connexionWith = listOf(PointModel(1386,78), PointModel(1388,80)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1388 ,number = 80, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43358704551649, 35.047620199620724),
                connexionWith = listOf(PointModel(1387,79)),
                connexionFloor = listOf(FloorModel(0, PointModel(729, 58)), FloorModel(1, PointModel(533, 71)), FloorModel(2, PointModel(910, 82)), FloorModel(3, PointModel(1154, 72)),  FloorModel(5, PointModel(1629, 70))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1389 ,number = 81, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43362219285689, 35.047624222934246),
                connexionWith = listOf(PointModel(1386,78)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1390 ,number = 82, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43367469137065, 35.04761181771755),
                connexionWith = listOf(PointModel(1385,77)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1391 ,number = 83, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43378124539071, 35.047614835202694),
                connexionWith = listOf(PointModel(1383,75)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1392 ,number = 84, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433833521289614, 35.04761952906847),
                connexionWith = listOf(PointModel(1382,74)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1393 ,number = 85, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433872450115565, 35.04762355238199),
                connexionWith = listOf(PointModel(1380,72), PointModel(1394,86)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1394 ,number = 86, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43401259364204, 35.04763662815094),
                connexionWith = listOf(PointModel(1378,70), PointModel(1393,85)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1395 ,number = 87, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43404685088971, 35.04764400422573),
                connexionWith = listOf(PointModel(1377,69)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1396 ,number = 88, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434105577546276, 35.04764836281538),
                connexionWith = listOf(PointModel(1375,67), PointModel(1397,89)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1397 ,number = 89, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434169198014274, 35.04765573889017),
                connexionWith = listOf(PointModel(1374,66), PointModel(1396,88)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1398 ,number = 90, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434085779552206, 35.04749648272991),
                connexionWith = listOf(PointModel(1376,68)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1399 ,number = 91, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43405063253253, 35.04749547690153),
                connexionWith = listOf(PointModel(1377,69)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1400 ,number = 92, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43402060183187, 35.04752330482006),
                connexionWith = listOf(PointModel(1378,70), PointModel(1401,93)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1401 ,number = 93, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4339661016261, 35.04752196371555),
                connexionWith = listOf(PointModel(1400,92)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1402 ,number = 94, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43390515030633, 35.047489777207375),
                connexionWith = listOf(PointModel(1379,71)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1403 ,number = 95, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433878011374, 35.04748743027449),
                connexionWith = listOf(PointModel(1380,72)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1404 ,number = 96, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43384976017493, 35.04748675972223),
                connexionWith = listOf(PointModel(1381,73)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1405 ,number = 97, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433708726395075, 35.0474763661623),
                connexionWith = listOf(PointModel(1384,76)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1406 ,number = 98, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43367669343152, 35.04747301340103),
                connexionWith = listOf(PointModel(1385,77)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1407 ,number = 99, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43421035107181, 35.047409646213055),
                connexionWith = listOf(PointModel(1355,47), PointModel(1408,100), PointModel(1430,122)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1408 ,number = 100, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43421524494669, 35.04731275141239),
                connexionWith = listOf(PointModel(1407,99), PointModel(1409,101), PointModel(1428,120)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1409 ,number = 101, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43421924902579, 35.047226920723915),
                connexionWith = listOf(PointModel(1408,100), PointModel(1410,102), PointModel(1427,119)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1410 ,number = 102, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434222808206954, 35.04714645445347),
                connexionWith = listOf(PointModel(1409,101), PointModel(1411,103), PointModel(1426,118)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1411 ,number = 103, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43422503269506, 35.047047547996044),
                connexionWith = listOf(PointModel(1410,102), PointModel(1412,104), PointModel(1424,116)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1412 ,number = 104, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43422992656855, 35.04696272313595),
                connexionWith = listOf(PointModel(1411,103), PointModel(1413,105), PointModel(1422,114)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1413 ,number = 105, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43423237350509, 35.0469134375453),
                connexionWith = listOf(PointModel(1412,104), PointModel(1414,106), PointModel(1416,108), PointModel(1432,124)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1414 ,number = 106, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43423081636365, 35.046867839992046),
                connexionWith = listOf(PointModel(1413,105), PointModel(1415,107), PointModel(1463,155)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1415 ,number = 107, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43418788373102, 35.04686281085014),
                connexionWith = listOf(PointModel(1414,106)),
                connexionFloor = listOf(FloorModel(0, PointModel(747, 76)), FloorModel(1, PointModel(561, 99)), FloorModel(2, PointModel(938, 110)), FloorModel(3, PointModel(1185, 103)),  FloorModel(5, PointModel(1659, 100))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1416 ,number = 108, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43426663060457, 35.04691679030657),
                connexionWith = listOf(PointModel(1413,105), PointModel(1417,109), PointModel(1419,111)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1417 ,number = 109, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43426841019354, 35.046850740909576),
                connexionWith = listOf(PointModel(1416,108), PointModel(1418,110)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1418 ,number = 110, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43434849163191, 35.04685644060373),
                connexionWith = listOf(PointModel(1417,109)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1419 ,number = 111, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43431467948444, 35.04691880196333),
                connexionWith = listOf(PointModel(1416,108), PointModel(1420,112)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1420 ,number = 112, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43437251603879, 35.04692483693361),
                connexionWith = listOf(PointModel(1419,111), PointModel(1421,113)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1421 ,number = 113, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434423011745885, 35.04693053662777),
                connexionWith = listOf(PointModel(1420,112)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1422 ,number = 114, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434269077539376, 35.04696674644947),
                connexionWith = listOf(PointModel(1412,104)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1423 ,number = 115, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43426284897785, 35.04700865596533),
                connexionWith = listOf(PointModel(1424,116)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1424 ,number = 116, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434259734696795, 35.04705123603344),
                connexionWith = listOf(PointModel(1411,103), PointModel(1423,115), PointModel(1425,117)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1425 ,number = 117, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434260179594105, 35.04709381610155),
                connexionWith = listOf(PointModel(1424,116)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1426 ,number = 118, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43426218163191, 35.04714712500572),
                connexionWith = listOf(PointModel(1410,102),),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1427 ,number = 119, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43426307142648, 35.04722859710455),
                connexionWith = listOf(PointModel(1409,101)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1428 ,number = 120, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43425862245351, 35.047316774725914),
                connexionWith = listOf(PointModel(1408,100)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1429 ,number = 121, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43424171635271, 35.047365725040436),
                connexionWith = listOf(PointModel(1430,122)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1430 ,number = 122, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4342399367628, 35.04741098731756),
                connexionWith = listOf(PointModel(1407,99), PointModel(1429,121), PointModel(1431,123)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1431 ,number = 123, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4342370449291, 35.04745054990053),
                connexionWith = listOf(PointModel(1430,122)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1432 ,number = 124, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434197449035715, 35.04691142588854),
                connexionWith = listOf(PointModel(1413,105), PointModel(1433,125), PointModel(1452,144)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1433 ,number = 125, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43414361636716, 35.046907402575016),
                connexionWith = listOf(PointModel(1432,124), PointModel(1434,126), PointModel(1453,145)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1434 ,number = 126, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43407599177702, 35.04690237343311),
                connexionWith = listOf(PointModel(1433,125), PointModel(1435,127), PointModel(1451,143), PointModel(1455,147)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1435 ,number = 127, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43404840803679, 35.04689935594797),
                connexionWith = listOf(PointModel(1434,126), PointModel(1436,128), PointModel(1450,142)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1436 ,number = 128, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43403572840925, 35.04689767956734),
                connexionWith = listOf(PointModel(1435,127), PointModel(1437,129), PointModel(1456,148)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1437 ,number = 129, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43398211801917, 35.04688996821642),
                connexionWith = listOf(PointModel(1436,128), PointModel(1438,130), PointModel(1457,149)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1438 ,number = 130, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43391716261602, 35.04688359797001),
                connexionWith = listOf(PointModel(1437,129), PointModel(1439,131), PointModel(1458,150)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1439 ,number = 131, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43390648500753, 35.04688359797001),
                connexionWith = listOf(PointModel(1438,130), PointModel(1440,132), PointModel(1449,141)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1440 ,number = 132, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43385198467937, 35.04687890410423),
                connexionWith = listOf(PointModel(1439,131), PointModel(1441,133), PointModel(1442,134), PointModel(1459,151)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1441 ,number = 133, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4338457560667, 35.04698183387518),
                connexionWith = listOf(PointModel(1440,132)),
                connexionFloor = listOf(FloorModel(1, PointModel(584, 122)), FloorModel(2, PointModel(973, 145)), FloorModel(3, PointModel(1206, 124)),  FloorModel(5, PointModel(1683, 124))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1442 ,number = 134, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433803490460654, 35.04687622189522),
                connexionWith = listOf(PointModel(1440,132), PointModel(1443,135), PointModel(1452,144), PointModel(1460,152)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1443 ,number = 135, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43374098178936, 35.04686817526817),
                connexionWith = listOf(PointModel(1442,134), PointModel(1444,136), PointModel(1461,153)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1444 ,number = 136, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43371006110146, 35.04686549305916),
                connexionWith = listOf(PointModel(1443,135), PointModel(1445,137), PointModel(1447,139)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1445 ,number = 137, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433659342234506, 35.0468634814024),
                connexionWith = listOf(PointModel(1444,136), PointModel(1446,138), PointModel(1462,154)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1446 ,number = 138, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433655783013904, 35.04693556576967),
                connexionWith = listOf(PointModel(1445,137)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1447 ,number = 139, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433705167177905, 35.046937577426434),
                connexionWith = listOf(PointModel(1444,136), PointModel(1448,140)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1448 ,number = 140, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43379993125013, 35.046944953501225),
                connexionWith = listOf(PointModel(1442,134), PointModel(1447,139)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1449 ,number = 141, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433905817656935, 35.04694897681475),
                connexionWith = listOf(PointModel(1439,131), PointModel(1450,142)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1450 ,number = 142, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43404195699859, 35.04696473479271),
                connexionWith = listOf(PointModel(1435,127), PointModel(1449,141)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1451 ,number = 143, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43407532442863, 35.046970434486866),
                connexionWith = listOf(PointModel(1434,126)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1452 ,number = 144, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43419233271017, 35.04697848111391),
                connexionWith = listOf(PointModel(1432,124)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1453 ,number = 145, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43414606330787, 35.04687052220106),
                connexionWith = listOf(PointModel(1433,125), PointModel(1454,146)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1454 ,number = 146, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43411847960567, 35.046863816678524),
                connexionWith = listOf(PointModel(1453,145)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1455 ,number = 147, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4340799958671, 35.046839006245136),
                connexionWith = listOf(PointModel(1434,126)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1456 ,number = 148, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43403572840925, 35.0468323007226),
                connexionWith = listOf(PointModel(1436,128)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1457 ,number = 149, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43398412006794, 35.04682928323746),
                connexionWith = listOf(PointModel(1437,129), PointModel(1458,150)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1458 ,number = 150, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43392005446791, 35.04682023078203),
                connexionWith = listOf(PointModel(1438,130), PointModel(1457,149)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1459 ,number = 151, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433853541832406, 35.04681587219238),
                connexionWith = listOf(PointModel(1440,132)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1460 ,number = 152, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433805714967114, 35.046814531087875),
                connexionWith = listOf(PointModel(1442,134)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1461 ,number = 153, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433741204240285, 35.046807155013084),
                connexionWith = listOf(PointModel(1443,135)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1462 ,number = 154, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4336553381113, 35.04680044949055),
                connexionWith = listOf(PointModel(1445,137)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1463 ,number = 155, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43424038166029, 35.04677027463913),
                connexionWith = listOf(PointModel(1414,106), PointModel(1464,156), PointModel(1490,182)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1464 ,number = 156, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434242161250175, 35.04671964794397),
                connexionWith = listOf(PointModel(1463,155), PointModel(1465,157), PointModel(1489,181)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1465 ,number = 157, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43424460818613, 35.04662811756134),
                connexionWith = listOf(PointModel(1464,156), PointModel(1466,158), PointModel(1488,180)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1466 ,number = 158, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434246832673274, 35.04658553749323),
                connexionWith = listOf(PointModel(1465,157), PointModel(1467,159), PointModel(1487,179)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1467 ,number = 159, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43424861226293, 35.046539939939976),
                connexionWith = listOf(PointModel(1466,158), PointModel(1468,160), PointModel(1486,178)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1468 ,number = 160, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4342510591986, 35.04644639790058),
                connexionWith = listOf(PointModel(1467,159), PointModel(1469,161), PointModel(1485,177)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1469 ,number = 161, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43425506327487, 35.046364925801754),
                connexionWith = listOf(PointModel(1468,160), PointModel(1470,162), PointModel(1483,175)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1470 ,number = 162, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43425862245351, 35.046285800635815),
                connexionWith = listOf(PointModel(1469,161), PointModel(1471,163), PointModel(1482,174)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1471 ,number = 163, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43426129183736, 35.046236515045166),
                connexionWith = listOf(PointModel(1470,162), PointModel(1472,164), PointModel(1474,166), PointModel(1491,183)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1472 ,number = 164, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43426129183736, 35.046192929148674),
                connexionWith = listOf(PointModel(1471,163), PointModel(1473,165), PointModel(1528,220)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1473 ,number = 165, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434207459236404, 35.046185217797756),
                connexionWith = listOf(PointModel(1472,164)),
                connexionFloor = listOf(FloorModel(0, PointModel(768, 97)), FloorModel(1, PointModel(610, 148)), FloorModel(2, PointModel(996, 168)), FloorModel(3, PointModel(1232, 150)),  FloorModel(5, PointModel(1720, 161))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1474 ,number = 166, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43429465912334, 35.04624355584383),
                connexionWith = listOf(PointModel(1471,163), PointModel(1475,167), PointModel(1477,169)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1475 ,number = 167, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43429399177786, 35.0461708009243),
                connexionWith = listOf(PointModel(1474,166), PointModel(1476,168)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1476 ,number = 168, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43435694466526, 35.04617415368557),
                connexionWith = listOf(PointModel(1475,167), PointModel(1477,169)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1477 ,number = 169, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43435271814876, 35.046249590814114),
                connexionWith = listOf(PointModel(1474,166), PointModel(1476,168), PointModel(1478,170)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1478 ,number = 170, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43439609553823, 35.046251937747),
                connexionWith = listOf(PointModel(1477,169), PointModel(1479,171)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1479 ,number = 171, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43445215241746, 35.046255961060524),
                connexionWith = listOf(PointModel(1478,170), PointModel(1480,172)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1480 ,number = 172, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43445637892569, 35.04617851227522),
                connexionWith = listOf(PointModel(1479,171), PointModel(1481,173)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1481 ,number = 173, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43448774405471, 35.046177841722965),
                connexionWith = listOf(PointModel(1480,172)),
                connexionFloor = listOf(FloorModel(3, PointModel(373, 56))), connectedLocIndex = NEW, locked = false
            ),
            NavModel(
                id = 1482 ,number = 174, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434290210153144, 35.0462881475687),
                connexionWith = listOf(PointModel(1470,162), PointModel(1483,175)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1483 ,number = 175, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43428464893985, 35.04636660218239),
                connexionWith = listOf(PointModel(1469,161), PointModel(1482,174), PointModel(1484,176)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1484 ,number = 176, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43428108976303, 35.046396777033806),
                connexionWith = listOf(PointModel(1483,175)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1485 ,number = 177, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434298663196195, 35.04644673317671),
                connexionWith = listOf(PointModel(1468,160)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1486 ,number = 178, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43429376932935, 35.046545304358006),
                connexionWith = listOf(PointModel(1467,159)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1487 ,number = 179, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43429154484427, 35.04658989608288),
                connexionWith = listOf(PointModel(1466,158)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1488 ,number = 180, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43428976525612, 35.046629793941975),
                connexionWith = listOf(PointModel(1465,157)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1489 ,number = 181, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434284426491296, 35.04672233015299),
                connexionWith = listOf(PointModel(1464,156)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1490 ,number = 182, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43428353669711, 35.04677262157202),
                connexionWith = listOf(PointModel(1463,155)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1491 ,number = 183, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434230371466086, 35.04623617976904),
                connexionWith = listOf(PointModel(1471,163), PointModel(1492,184), PointModel(1517,209)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1492 ,number = 184, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43417008781047, 35.04623081535101),
                connexionWith = listOf(PointModel(1491,183), PointModel(1493,185), PointModel(1516,208), PointModel(1518,210)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1493 ,number = 185, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4341393898329, 35.04622779786587),
                connexionWith = listOf(PointModel(1492,184), PointModel(1494,186), PointModel(1519,211)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1494 ,number = 186, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43410446529961, 35.04622545093298),
                connexionWith = listOf(PointModel(1493,185), PointModel(1495,187), PointModel(1515,207), PointModel(1519,211)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1495 ,number = 187, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4340722101361, 35.04622142761946),
                connexionWith = listOf(PointModel(1494,186), PointModel(1496,188), PointModel(1514,206), PointModel(1521,213)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1496 ,number = 188, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433936738225704, 35.04620935767889),
                connexionWith = listOf(PointModel(1495,187), PointModel(1497,189), PointModel(1513,205), PointModel(1522,214)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1497 ,number = 189, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43390626255735, 35.046204663813114),
                connexionWith = listOf(PointModel(1496,188), PointModel(1498,190), PointModel(1523,215)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1498 ,number = 190, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433877566473356, 35.04620332270861),
                connexionWith = listOf(PointModel(1497,189), PointModel(1499,191), PointModel(1524,216)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1499 ,number = 191, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43384842547223, 35.046201311051846),
                connexionWith = listOf(PointModel(1498,190), PointModel(1500,192), PointModel(1512,204), PointModel(1525,217)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1500 ,number = 192, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433823288564724, 35.04619996994734),
                connexionWith = listOf(PointModel(1499,191), PointModel(1501,193), PointModel(1526,218)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1501 ,number = 193, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43379592713796, 35.04619762301445),
                connexionWith = listOf(PointModel(1500,192), PointModel(1502,194), PointModel(1511,203)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1502 ,number = 194, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43376055746691, 35.04619359970093),
                connexionWith = listOf(PointModel(1501,193), PointModel(1503,195), PointModel(1510,202)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1503 ,number = 195, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43373808992727, 35.04619125276804),
                connexionWith = listOf(PointModel(1502,194), PointModel(1504,196), PointModel(1509,201)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1504 ,number = 196, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43373275110449, 35.0461882352829),
                connexionWith = listOf(PointModel(1503,195), PointModel(1505,197), PointModel(1527,219)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1505 ,number = 197, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43371028355251, 35.04618790000677),
                connexionWith = listOf(PointModel(1504,196), PointModel(1506,198), PointModel(1508,200)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1506 ,number = 198, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4336508890851, 35.046182200312614),
                connexionWith = listOf(PointModel(1505,197), PointModel(1507,199)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1507 ,number = 199, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4336446604478, 35.046276077628136),
                connexionWith = listOf(PointModel(1506,198)),
                connexionFloor = listOf(FloorModel(0, PointModel(783, 112)), FloorModel(1, PointModel(648, 186)), FloorModel(2, PointModel(1026, 198)), FloorModel(3, PointModel(1259, 177)),  FloorModel(5, PointModel(1745, 186))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1508 ,number = 200, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433707614139735, 35.04626099020243),
                connexionWith = listOf(PointModel(1505,197)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1509 ,number = 201, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433735198064994, 35.04626166075468),
                connexionWith = listOf(PointModel(1503,195)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1510 ,number = 202, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43375855540934, 35.0462656840682),
                connexionWith = listOf(PointModel(1502,194)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1511 ,number = 203, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.4337954822366, 35.04626736044884),
                connexionWith = listOf(PointModel(1501,193)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1512 ,number = 204, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43384597851717, 35.04627238959074),
                connexionWith = listOf(PointModel(1499,191)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1513 ,number = 205, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43393362392467, 35.04628077149391),
                connexionWith = listOf(PointModel(1496,188), PointModel(1514,206)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1514 ,number = 206, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43406954074236, 35.046295523643494),
                connexionWith = listOf(PointModel(1495,187), PointModel(1513,205)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1515 ,number = 207, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43410023876212, 35.04629720002413),
                connexionWith = listOf(PointModel(1494,186)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1516 ,number = 208, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43416652862562, 35.046301893889904),
                connexionWith = listOf(PointModel(1492,184), PointModel(1517,209)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1517 ,number = 209, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434225700041466, 35.04630960524082),
                connexionWith = listOf(PointModel(1491,183), PointModel(1516,208)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1518 ,number = 210, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43417320209703, 35.04615034908056),
                connexionWith = listOf(PointModel(1492,184)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1519 ,number = 211, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434146730655314, 35.04614867269993),
                connexionWith = listOf(PointModel(1493,185)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1520 ,number = 212, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43410958163402, 35.04614431411028),
                connexionWith = listOf(PointModel(1494,186)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1521 ,number = 213, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43407910606932, 35.0461433082819),
                connexionWith = listOf(PointModel(1495,187), PointModel(1522,214)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1522 ,number = 214, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43393696067579, 35.04613324999809),
                connexionWith = listOf(PointModel(1496,188), PointModel(1521,213)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1523 ,number = 215, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43390604010714, 35.04613224416971),
                connexionWith = listOf(PointModel(1497,189)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1524 ,number = 216, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43388068077782, 35.04613123834133),
                connexionWith = listOf(PointModel(1498,190)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1525 ,number = 217, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.433853096931536, 35.04612889140844),
                connexionWith = listOf(PointModel(1499,191)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1526 ,number = 218, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43382484571865, 35.046125538647175),
                connexionWith = listOf(PointModel(1500,192)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1527 ,number = 219, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43373453071214, 35.04611514508724),
                connexionWith = listOf(PointModel(1504,196)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1528 ,number = 220, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434268187744905, 35.04605881869793),
                connexionWith = listOf(PointModel(1472,164), PointModel(1529,221), PointModel(1558,250)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1529 ,number = 221, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43426974488519, 35.04601188004017),
                connexionWith = listOf(PointModel(1528,220), PointModel(1530,222), PointModel(1557,249)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1530 ,number = 222, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43427174692264, 35.045964270830154),
                connexionWith = listOf(PointModel(1529,221), PointModel(1531,223), PointModel(1556,248)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1531 ,number = 223, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43427730813736, 35.04586536437273),
                connexionWith = listOf(PointModel(1530,222), PointModel(1532,224), PointModel(1555,247)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1532 ,number = 224, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434278642828815, 35.04579160362482),
                connexionWith = listOf(PointModel(1531,223), PointModel(1533,225), PointModel(1554,246)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1533 ,number = 225, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434283314248574, 35.04573594778776),
                connexionWith = listOf(PointModel(1532,224), PointModel(1534,226), PointModel(1553,245)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1534 ,number = 226, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43428553873402, 35.04568934440613),
                connexionWith = listOf(PointModel(1533,225), PointModel(1535,227), PointModel(1552,244)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1535 ,number = 227, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43428820811644, 35.045561604201794),
                connexionWith = listOf(PointModel(1534,226), PointModel(1536,228), PointModel(1540,232), PointModel(1548,240)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1536 ,number = 228, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434288653013496, 35.045514330267906),
                connexionWith = listOf(PointModel(1535,227), PointModel(1537,229), PointModel(1538,230)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1537 ,number = 229, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43424060410902, 35.045505948364735),
                connexionWith = listOf(PointModel(1536,228)),
                connexionFloor = listOf(FloorModel(0, PointModel(808, 137)), FloorModel(1, PointModel(652, 190)), FloorModel(2, PointModel(1063, 235)), FloorModel(3, PointModel(1292, 210)), FloorModel(5, PointModel(1769, 210))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1538 ,number = 230, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43429043260168, 35.045460015535355),
                connexionWith = listOf(PointModel(1536,228), PointModel(1539,231)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1539 ,number = 231, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434323132523396, 35.045462027192116),
                connexionWith = listOf(PointModel(1538,230)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1540 ,number = 232, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43432446721365, 35.0455629453063),
                connexionWith = listOf(PointModel(1535,227), PointModel(1541,233), PointModel(1542,234)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1541 ,number = 233, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434324912110405, 35.045508965849876),
                connexionWith = listOf(PointModel(1540,232)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1542 ,number = 234, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43435316304524, 35.04556629806757),
                connexionWith = listOf(PointModel(1540,232), PointModel(1543,235), PointModel(1544,236)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1543 ,number = 235, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434355387527646, 35.045502595603466),
                connexionWith = listOf(PointModel(1542,234)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1544 ,number = 236, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434380301723785, 35.04556965082884),
                connexionWith = listOf(PointModel(1542,234), PointModel(1545,237), PointModel(1546,238)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1545 ,number = 237, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43438096906815, 35.045505948364735),
                connexionWith = listOf(PointModel(1544,236)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1546 ,number = 238, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434440807577836, 35.04557300359011),
                connexionWith = listOf(PointModel(1544,236), PointModel(1547,239)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1547 ,number = 239, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43444547898269, 35.04550728946924),
                connexionWith = listOf(PointModel(1546,238)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1548 ,number = 240, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434259289799485, 35.0455579161644),
                connexionWith = listOf(PointModel(1535,227), PointModel(1549,241), PointModel(1550,242)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1549 ,number = 241, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43425617551822, 35.045625641942024),
                connexionWith = listOf(PointModel(1548,240)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1550 ,number = 242, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434202342911874, 35.04555255174637),
                connexionWith = listOf(PointModel(1548,240), PointModel(1551,243)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1551 ,number = 243, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43420323270749, 35.045487843453884),
                connexionWith = listOf(PointModel(1550,242)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1552 ,number = 244, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43433069576762, 35.045695044100285),
                connexionWith = listOf(PointModel(1534,226)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1553 ,number = 245, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43432691414566, 35.045736618340015),
                connexionWith = listOf(PointModel(1533,225)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1554 ,number = 246, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43432224272989, 35.0457962974906),
                connexionWith = listOf(PointModel(1532,224)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1555 ,number = 247, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43431957334927, 35.045868046581745),
                connexionWith = listOf(PointModel(1531,223)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1556 ,number = 248, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.434314901932844, 35.045968629419804),
                connexionWith = listOf(PointModel(1530,222)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1557 ,number = 249, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43431690396851, 35.046013221144676),
                connexionWith = listOf(PointModel(1529,221)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1558 ,number = 250, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43431112030971, 35.046062506735325),
                connexionWith = listOf(PointModel(1528,220)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1559 ,number = 251, name = null, description = null, locationIndex = OLD, floorIndex = 4,
                location = LatLng(48.43411581021435, 35.047498159110546),
                connexionWith = listOf(PointModel(1375,67)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
        )
    }
    val navGraphOld5: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 1560 ,number = 1, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43412470818491, 35.0483500957489),
                connexionWith = listOf(PointModel(1561,2)),
                connexionFloor = listOf(FloorModel(0, PointModel(679, 8)), FloorModel(1, PointModel(467, 5)), FloorModel(2, PointModel(829, 1)), FloorModel(3, PointModel(1083, 1)), FloorModel(4, PointModel(1309, 1))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1561 ,number = 2, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43416986536143, 35.0483537837863),
                connexionWith = listOf(PointModel(1560,1), PointModel(1562,3), PointModel(1567,8), PointModel(1588,29)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1562 ,number = 3, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43416830821807, 35.04839938133955),
                connexionWith = listOf(PointModel(1561,2), PointModel(1563,4), PointModel(1568,9)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1563 ,number = 4, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434197226586804, 35.048402063548565),
                connexionWith = listOf(PointModel(1562,3), PointModel(1564,5), PointModel(1590,31)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1564 ,number = 5, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43422547759268, 35.048404075205326),
                connexionWith = listOf(PointModel(1563,4), PointModel(1565,6), PointModel(1591,32)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1565 ,number = 6, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43429087749871, 35.04836283624172),
                connexionWith = listOf(PointModel(1588,29), PointModel(1566,7)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1566 ,number = 7, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43429532646885, 35.04823341965675),
                connexionWith = listOf(PointModel(1565,6), PointModel(1567,8)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1567 ,number = 8, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43417631638338, 35.048219338059425),
                connexionWith = listOf(PointModel(1561,2), PointModel(1566,7), PointModel(1597,38)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1568 ,number = 9, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43413427350149, 35.04839904606342),
                connexionWith = listOf(PointModel(1562,3), PointModel(1569,10), PointModel(1587,28)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1569 ,number = 10, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434107802039506, 35.04839535802603),
                connexionWith = listOf(PointModel(1568,9), PointModel(1570,11), PointModel(1586,27)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1570 ,number = 11, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43408266526031, 35.048389993608),
                connexionWith = listOf(PointModel(1569,10), PointModel(1571,12), PointModel(1585,26), PointModel(1592,33)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1571 ,number = 12, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43402060183187, 35.04838462918997),
                connexionWith = listOf(PointModel(1570,11), PointModel(1572,13), PointModel(1584,25), PointModel(1593,34)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1572 ,number = 13, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4339876792656, 35.04838328808546),
                connexionWith = listOf(PointModel(1571,12), PointModel(1573,14), PointModel(1583,24)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1573 ,number = 14, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43395965057747, 35.0483762472868),
                connexionWith = listOf(PointModel(1572,13), PointModel(1574,15), PointModel(1582,23), PointModel(1594,35)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1574 ,number = 15, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43390047885178, 35.04837155342102),
                connexionWith = listOf(PointModel(1573,14), PointModel(1575,16), PointModel(1595,36)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1575 ,number = 16, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43387356236732, 35.0483725592494),
                connexionWith = listOf(PointModel(1574,15), PointModel(1576,17), PointModel(1581,22)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1576 ,number = 17, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433841974408665, 35.04837054759264),
                connexionWith = listOf(PointModel(1575,16), PointModel(1577,18), PointModel(1580,21)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1577 ,number = 18, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43381283338713, 35.0483638420701),
                connexionWith = listOf(PointModel(1576,17), PointModel(1578,19), PointModel(1596,37)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1578 ,number = 19, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43378013313698, 35.04836183041334),
                connexionWith = listOf(PointModel(1577,18), PointModel(1579,20)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1579 ,number = 20, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43377457186783, 35.048461742699146),
                connexionWith = listOf(PointModel(1578,19)),
                connexionFloor = listOf(FloorModel(0, PointModel(688, 17)), FloorModel(1, PointModel(483, 21)), FloorModel(2, PointModel(846, 18)), FloorModel(3, PointModel(1097, 15)), FloorModel(4, PointModel(1324, 16))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1580 ,number = 21, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43383530089374, 35.04844665527344),
                connexionWith = listOf(PointModel(1576,17)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1581 ,number = 22, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43386978071131, 35.048445984721184),
                connexionWith = listOf(PointModel(1575,16)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1582 ,number = 23, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43395253217803, 35.04844933748245),
                connexionWith = listOf(PointModel(1573,14)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1583 ,number = 24, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43398456496767, 35.04845101386309),
                connexionWith = listOf(PointModel(1572,13)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1584 ,number = 25, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43401437323988, 35.04845101386309),
                connexionWith = listOf(PointModel(1571,12),  PointModel(1585,26)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1585 ,number = 26, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434077548923206, 35.04845906049013),
                connexionWith = listOf(PointModel(1570,11), PointModel(1584,25)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1586 ,number = 27, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4341031306036, 35.048460736870766),
                connexionWith = listOf(PointModel(1569,10)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1587 ,number = 28, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43413227145866, 35.04846476018429),
                connexionWith = listOf(PointModel(1568,9)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1588 ,number = 29, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43423237350509, 35.0483588129282),
                connexionWith = listOf(PointModel(1561,2), PointModel(1565,6)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1589 ,number = 30, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43417008781047, 35.048443637788296),
                connexionWith = listOf(PointModel(1590,31)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1590 ,number = 31, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43419544699537, 35.04844631999731),
                connexionWith = listOf(PointModel(1563,4), PointModel(1589,30)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1591 ,number = 32, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434226589836676, 35.048449002206326),
                connexionWith = listOf(PointModel(1564,5)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1592 ,number = 33, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434085112203974, 35.048323944211006),
                connexionWith = listOf(PointModel(1570,11)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1593 ,number = 34, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434025050825696, 35.04832059144974),
                connexionWith = listOf(PointModel(1571,12)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1594 ,number = 35, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4339645444765, 35.048316568136215),
                connexionWith = listOf(PointModel(1573,14)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1595 ,number = 36, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433902036003346, 35.0483088567853),
                connexionWith = listOf(PointModel(1574,15)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1596 ,number = 37, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43381350073895, 35.04829913377762),
                connexionWith = listOf(PointModel(1577,18)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1597 ,number = 38, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43417742862846, 35.04818111658096),
                connexionWith = listOf(PointModel(1567,8), PointModel(1598,39), PointModel(1610,51)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1598 ,number = 39, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43418210005751, 35.04808858036995),
                connexionWith = listOf(PointModel(1597,38), PointModel(1599,40), PointModel(1609,50)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1599 ,number = 40, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434190330669615, 35.0479494407773),
                connexionWith = listOf(PointModel(1598,39), PointModel(1600,41), PointModel(1608,49)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1600 ,number = 41, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43419233271017, 35.04785858094692),
                connexionWith = listOf(PointModel(1599,40), PointModel(1601,42), PointModel(1607,48)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1601 ,number = 42, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434197226586804, 35.04779018461704),
                connexionWith = listOf(PointModel(1600,41), PointModel(1602,43), PointModel(1606,47)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1602 ,number = 43, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43420123066735, 35.047730170190334),
                connexionWith = listOf(PointModel(1601,42), PointModel(1603,44), PointModel(1605,46)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1603 ,number = 44, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43420501229865, 35.04763662815094),
                connexionWith = listOf(PointModel(1602,43), PointModel(1604,45)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1604 ,number = 45, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434245720429736, 35.04763796925545),
                connexionWith = listOf(PointModel(1603,44), PointModel(1605,46)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1605 ,number = 46, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434238824519085, 35.047731176018715),
                connexionWith = listOf(PointModel(1602,43), PointModel(1604,45)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1606 ,number = 47, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43423459799276, 35.04779186099768),
                connexionWith = listOf(PointModel(1601,42)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1607 ,number = 48, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43423215105633, 35.04786092787981),
                connexionWith = listOf(PointModel(1600,41), PointModel(1608,49)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1608 ,number = 49, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43422814697823, 35.047953464090824),
                connexionWith = listOf(PointModel(1599,40), PointModel(1607,48)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1609 ,number = 50, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43422414289983, 35.04809059202671),
                connexionWith = listOf(PointModel(1598,39)),
                connexionFloor = listOf(FloorModel(0, PointModel(716, 45)), FloorModel(1, PointModel(500, 38)), FloorModel(2, PointModel(891, 63)), FloorModel(3, PointModel(1127, 45)), FloorModel(4, PointModel(1356, 48))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1610 ,number = 51, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43421813678164, 35.048183128237724),
                connexionWith = listOf(PointModel(1597,38)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1611 ,number = 52, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43420278780967, 35.04759170114994),
                connexionWith = listOf(PointModel(1610,51), PointModel(1612,53), PointModel(1616,57), PointModel(1617,58)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1612 ,number = 53, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43420478984976, 35.04754777997732),
                connexionWith = listOf(PointModel(1611,52), PointModel(1613,54), PointModel(1614,55)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1613 ,number = 54, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43415963270425, 35.047542080283165),
                connexionWith = listOf(PointModel(1612,53)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1614 ,number = 55, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43420834903192, 35.0474938005209),
                connexionWith = listOf(PointModel(1612,53), PointModel(1615,56), PointModel(1646,87)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1615 ,number = 56, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434301777474865, 35.04750084131956),
                connexionWith = listOf(PointModel(1614,55), PointModel(1616,57)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1616 ,number = 57, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434293324432346, 35.04760377109051),
                connexionWith = listOf(PointModel(1611,52), PointModel(1615,56)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1617 ,number = 58, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43417120005569, 35.04758633673191),
                connexionWith = listOf(PointModel(1611,52), PointModel(1618,59), PointModel(1637,78)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1618 ,number = 59, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43411447551862, 35.047578290104866),
                connexionWith = listOf(PointModel(1617,58), PointModel(1619,60), PointModel(1638,79)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1619 ,number = 60, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43408666934988, 35.04757594317198),
                connexionWith = listOf(PointModel(1618,59), PointModel(1620,61), PointModel(1636,77), PointModel(1639,80)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1620 ,number = 61, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434049742734246, 35.047576278448105),
                connexionWith = listOf(PointModel(1619,60), PointModel(1621,62), PointModel(1635,76), PointModel(1640,81)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1621 ,number = 62, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43402015693247, 35.04757326096296),
                connexionWith = listOf(PointModel(1620,61), PointModel(1622,63), PointModel(1634,75), PointModel(1641,82)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1622 ,number = 63, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43387890117526, 35.047561191022396),
                connexionWith = listOf(PointModel(1621,62), PointModel(1623,64), PointModel(1633,74), PointModel(1642,83)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1623 ,number = 64, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43385153977847, 35.04755515605211),
                connexionWith = listOf(PointModel(1622,63), PointModel(1624,65), PointModel(1643,84)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1624 ,number = 65, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433836858047314, 35.04755649715662),
                connexionWith = listOf(PointModel(1623,64), PointModel(1625,66), PointModel(1632,73)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1625 ,number = 66, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43376700854083, 35.0475487858057),
                connexionWith = listOf(PointModel(1624,65), PointModel(1626,67), PointModel(1644,85)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1626 ,number = 67, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433708726395075, 35.04754476249218),
                connexionWith = listOf(PointModel(1625,66), PointModel(1627,68), PointModel(1631,72)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1627 ,number = 68, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433678695492354, 35.04754174500704),
                connexionWith = listOf(PointModel(1626,67), PointModel(1628,69), PointModel(1630,71), PointModel(1645,86)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1628 ,number = 69, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433597723192094, 35.047534704208374),
                connexionWith = listOf(PointModel(1627,68), PointModel(1629,70)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1629 ,number = 70, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43359060474195, 35.04762824624777),
                connexionWith = listOf(PointModel(1628,69)),
                connexionFloor = listOf(FloorModel(0, PointModel(729, 58)), FloorModel(1, PointModel(533, 71)), FloorModel(2, PointModel(910, 82)), FloorModel(3, PointModel(1154, 72)), FloorModel(4, PointModel(1388, 80))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1630 ,number = 71, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43367491382185, 35.04760812968016),
                connexionWith = listOf(PointModel(1627,68)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1631 ,number = 72, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43370205286267, 35.04761014133692),
                connexionWith = listOf(PointModel(1626,67), PointModel(1632,73)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1632 ,number = 73, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43383418864118, 35.0476248934865),
                connexionWith = listOf(PointModel(1624,65), PointModel(1631,72)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1633 ,number = 74, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4338764542217, 35.047629587352276),
                connexionWith = listOf(PointModel(1622,63), PointModel(1634,75)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1634 ,number = 75, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434013260991236, 35.04763897508383),
                connexionWith = listOf(PointModel(1621,62), PointModel(1633,74)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1635 ,number = 76, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43404685088971, 35.047644674777985),
                connexionWith = listOf(PointModel(1620,61)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1636 ,number = 77, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43408355505802, 35.04764702171087),
                connexionWith = listOf(PointModel(1619,60), PointModel(1637,78)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1637 ,number = 78, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4341654163803, 35.04765272140503),
                connexionWith = listOf(PointModel(1617,58), PointModel(1636,77)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1638 ,number = 79, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434116700011465, 35.04751995205879),
                connexionWith = listOf(PointModel(1618,59)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1639 ,number = 80, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434086446900466, 35.047514252364635),
                connexionWith = listOf(PointModel(1619,60)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1640 ,number = 81, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434053969275936, 35.04748709499836),
                connexionWith = listOf(PointModel(1620,61), PointModel(1641,82)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1641 ,number = 82, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434023938577255, 35.04748206585646),
                connexionWith = listOf(PointModel(1621,62), PointModel(1640,81)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1642 ,number = 83, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433880013426865, 35.04749480634928),
                connexionWith = listOf(PointModel(1622,63)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1643 ,number = 84, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43385153977847, 35.04749447107315),
                connexionWith = listOf(PointModel(1623,64)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1644 ,number = 85, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43376967795051, 35.047480054199696),
                connexionWith = listOf(PointModel(1625,66)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1645 ,number = 86, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433678250589956, 35.04747066646814),
                connexionWith = listOf(PointModel(1627,68)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1646 ,number = 87, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43420879392969, 35.0474451854825),
                connexionWith = listOf(PointModel(1614,55), PointModel(1647,88), PointModel(1667,108)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1647 ,number = 88, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43421168576499, 35.0473590195179),
                connexionWith = listOf(PointModel(1646,87), PointModel(1648,89), PointModel(1666,107)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1648 ,number = 89, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434215467395525, 35.047308057546616),
                connexionWith = listOf(PointModel(1647,88), PointModel(1649,90), PointModel(1665,106)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1649 ,number = 90, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43421924902579, 35.04723094403744),
                connexionWith = listOf(PointModel(1648,89), PointModel(1650,91), PointModel(1664,105)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1650 ,number = 91, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43422303065576, 35.04715148359537),
                connexionWith = listOf(PointModel(1649,90), PointModel(1651,92), PointModel(1663,104)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1651 ,number = 92, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434226589836676, 35.04709180444479),
                connexionWith = listOf(PointModel(1650,91), PointModel(1652,93), PointModel(1662,103)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1652 ,number = 93, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43422992656855, 35.0470083206892),
                connexionWith = listOf(PointModel(1651,92), PointModel(1653,94), PointModel(1661,102)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1653 ,number = 94, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43422992656855, 35.0469771400094),
                connexionWith = listOf(PointModel(1652,93), PointModel(1654,95), PointModel(1689,130)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1654 ,number = 95, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43422992656855, 35.04696372896433),
                connexionWith = listOf(PointModel(1653,94), PointModel(1655,96), PointModel(1660,101)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1655 ,number = 96, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43423081636365, 35.04691880196333),
                connexionWith = listOf(PointModel(1654,95), PointModel(1656,97), PointModel(1658,99), PointModel(1668,109)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1656 ,number = 97, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43433314269932, 35.04692953079939),
                connexionWith = listOf(PointModel(1655,96), PointModel(1657,98)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1657 ,number = 98, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43433425494098, 35.046826265752316),
                connexionWith = listOf(PointModel(1656,97), PointModel(1658,99)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1658 ,number = 99, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43423593268534, 35.04681721329689),
                connexionWith = listOf(PointModel(1655,96), PointModel(1659,100), PointModel(1706,147)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1659 ,number = 100, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43418454699639, 35.04681285470724),
                connexionWith = listOf(PointModel(1658,99)),
                connexionFloor = listOf(FloorModel(0, PointModel(747, 76)), FloorModel(1, PointModel(561, 99)), FloorModel(2, PointModel(938, 110)), FloorModel(3, PointModel(1185, 103)), FloorModel(4, PointModel(1415, 107))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1660 ,number = 101, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434275973445885, 35.04696540534496),
                connexionWith = listOf(PointModel(1654,95)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1661 ,number = 102, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43426952243659, 35.04701167345047),
                connexionWith = listOf(PointModel(1652,93)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1662 ,number = 103, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43426729795046, 35.04709616303444),
                connexionWith = listOf(PointModel(1651,92)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1663 ,number = 104, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43426707550183, 35.04715718328953),
                connexionWith = listOf(PointModel(1650,91)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1664 ,number = 105, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4342637387724, 35.04723161458969),
                connexionWith = listOf(PointModel(1649,90)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1665 ,number = 106, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43426084694005, 35.04730939865112),
                connexionWith = listOf(PointModel(1648,89)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1666 ,number = 107, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43426151428599, 35.04736103117466),
                connexionWith = listOf(PointModel(1647,88)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1667 ,number = 108, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4342537285828, 35.04744853824377),
                connexionWith = listOf(PointModel(1646,87)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1668 ,number = 109, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434144061265464, 35.046906396746635),
                connexionWith = listOf(PointModel(1655,96), PointModel(1669,110), PointModel(1688,129), PointModel(1690,131)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1669 ,number = 110, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43407777137266, 35.04690170288086),
                connexionWith = listOf(PointModel(1668,109), PointModel(1670,111), PointModel(1686,127), PointModel(1691,132)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1670 ,number = 111, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43404729578887, 35.0468960031867),
                connexionWith = listOf(PointModel(1669,110), PointModel(1671,112), PointModel(1685,126)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1671 ,number = 112, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43403127941636, 35.04689432680607),
                connexionWith = listOf(PointModel(1670,111), PointModel(1672,113), PointModel(1692,133)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1672 ,number = 113, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43398345271836, 35.04688896238804),
                connexionWith = listOf(PointModel(1671,112), PointModel(1673,114), PointModel(1693,134)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1673 ,number = 114, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43391938711749, 35.04688326269388),
                connexionWith = listOf(PointModel(1672,113), PointModel(1674,115), PointModel(1694,135)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1674 ,number = 115, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433908264609094, 35.04688326269388),
                connexionWith = listOf(PointModel(1673,114), PointModel(1675,116), PointModel(1684,125)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1675 ,number = 116, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433853096931536, 35.046875551342964),
                connexionWith = listOf(PointModel(1674,115), PointModel(1676,117), PointModel(1683,124), PointModel(1695,136)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1676 ,number = 117, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43380504761519, 35.046872198581696),
                connexionWith = listOf(PointModel(1675,116), PointModel(1682,123), PointModel(1699,140)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1677 ,number = 118, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43373964708379, 35.0468685105443),
                connexionWith = listOf(PointModel(1699,140), PointModel(1678,119), PointModel(1704,145)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1678 ,number = 119, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433709838650415, 35.04686415195465),
                connexionWith = listOf(PointModel(1677,118), PointModel(1679,120), PointModel(1681,122)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1679 ,number = 120, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43365645036776, 35.046859793365),
                connexionWith = listOf(PointModel(1678,119), PointModel(1680,121), PointModel(1705,146)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1680 ,number = 121, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43365244624432, 35.04693187773228),
                connexionWith = listOf(PointModel(1679,120)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1681 ,number = 122, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433707169237586, 35.04693657159805),
                connexionWith = listOf(PointModel(1678,119), PointModel(1682,123)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1682 ,number = 123, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43380260065804, 35.04694897681475),
                connexionWith = listOf(PointModel(1676,117), PointModel(1681,122)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1683 ,number = 124, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43384264176007, 35.04699021577835),
                connexionWith = listOf(PointModel(1675,116)),
                connexionFloor = listOf(FloorModel(1, PointModel(584, 122)), FloorModel(2, PointModel(973, 145)), FloorModel(3, PointModel(1206, 124)), FloorModel(4, PointModel(1441, 133))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1684 ,number = 125, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433908264609094, 35.046957693994045),
                connexionWith = listOf(PointModel(1674,115), PointModel(1685,126)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1685 ,number = 126, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43404440394421, 35.04696775227785),
                connexionWith = listOf(PointModel(1670,111), PointModel(1684,125)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1686 ,number = 127, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43407576932758, 35.04696607589722),
                connexionWith = listOf(PointModel(1669,110)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1687 ,number = 128, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43410958163402, 35.04694662988186),
                connexionWith = listOf(PointModel(1688,129)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1688 ,number = 129, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43414027962961, 35.046947970986366),
                connexionWith = listOf(PointModel(1668,109), PointModel(1687,128), PointModel(1689,130)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1689 ,number = 130, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434139167383734, 35.046962052583694),
                connexionWith = listOf(PointModel(1653,94), PointModel(1688,129)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1690 ,number = 131, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43414183677381, 35.046841353178024),
                connexionWith = listOf(PointModel(1668,109)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1691 ,number = 132, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43407777137266, 35.04683431237936),
                connexionWith = listOf(PointModel(1669,110)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1692 ,number = 133, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434034393711414, 35.04683095961809),
                connexionWith = listOf(PointModel(1671,112)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1693 ,number = 134, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43398879151481, 35.04682559520006),
                connexionWith = listOf(PointModel(1672,113)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1694 ,number = 135, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43392250141941, 35.04681922495365),
                connexionWith = listOf(PointModel(1673,114)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1695 ,number = 136, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43385220712979, 35.04683565348387),
                connexionWith = listOf(PointModel(1675,116), PointModel(1696,137), PointModel(1698,139)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1696 ,number = 137, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43385242958025, 35.04679374396801),
                connexionWith = listOf(PointModel(1695,136), PointModel(1697,138)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1697 ,number = 138, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43381817220149, 35.04678837954998),
                connexionWith = listOf(PointModel(1696,137)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1698 ,number = 139, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43381883955323, 35.04683297127485),
                connexionWith = listOf(PointModel(1695,136)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1699 ,number = 140, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4337772412771, 35.046870186924934),
                connexionWith = listOf(PointModel(1676,117), PointModel(1677,118), PointModel(1700,141)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1700 ,number = 141, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43377879843242, 35.04683297127485),
                connexionWith = listOf(PointModel(1699,140), PointModel(1701,142)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1701 ,number = 142, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43377879843242, 35.046795420348644),
                connexionWith = listOf(PointModel(1700,141), PointModel(1702,143)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1702 ,number = 143, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4337928128283, 35.046797432005405),
                connexionWith = listOf(PointModel(1701,142), PointModel(1703,144)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1703 ,number = 144, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433793035278995, 35.046835988759995),
                connexionWith = listOf(PointModel(1702,143)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1704 ,number = 145, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43374253894581, 35.04679776728153),
                connexionWith = listOf(PointModel(1677,118)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1705 ,number = 146, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43365645036776, 35.046795420348644),
                connexionWith = listOf(PointModel(1679,120)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1706 ,number = 147, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434238824519085, 35.04676625132561),
                connexionWith = listOf(PointModel(1658,99), PointModel(1707,148), PointModel(1728,169)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1707 ,number = 148, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43424038166029, 35.0467149540782),
                connexionWith = listOf(PointModel(1706,147), PointModel(1708,149), PointModel(1727,168)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1708 ,number = 149, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43424438573742, 35.04662577062845),
                connexionWith = listOf(PointModel(1707,148), PointModel(1709,150), PointModel(1726,167)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1709 ,number = 150, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43424838981422, 35.04656106233597),
                connexionWith = listOf(PointModel(1708,149), PointModel(1710,151), PointModel(1725,166)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1710 ,number = 151, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43425350613412, 35.04649970680475),
                connexionWith = listOf(PointModel(1709,150), PointModel(1711,152), PointModel(1724,165)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1711 ,number = 152, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4342537285828, 35.046460814774036),
                connexionWith = listOf(PointModel(1710,151), PointModel(1712,153), PointModel(1723,164)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1712 ,number = 153, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434256842864215, 35.0463642552495),
                connexionWith = listOf(PointModel(1711,152), PointModel(1713,154), PointModel(1722,163)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1713 ,number = 154, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43425773265889, 35.04630893468857),
                connexionWith = listOf(PointModel(1712,153), PointModel(1714,155), PointModel(1729,170)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1714 ,number = 155, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43425884490217, 35.04628412425518),
                connexionWith = listOf(PointModel(1713,154), PointModel(1715,156), PointModel(1721,162)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1715 ,number = 156, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43426173673465, 35.0462432205677),
                connexionWith = listOf(PointModel(1714,155), PointModel(1716,157), PointModel(1719,160), PointModel(1730,171)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1716 ,number = 157, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43426262652922, 35.04619561135769),
                connexionWith = listOf(PointModel(1715,156), PointModel(1717,158), PointModel(1720,161)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1717 ,number = 158, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43426529591284, 35.046137273311615),
                connexionWith = listOf(PointModel(1716,157), PointModel(1718,159), PointModel(1760,201)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1718 ,number = 159, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43437652010551, 35.04615068435669),
                connexionWith = listOf(PointModel(1717,158), PointModel(1719,160)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1719 ,number = 160, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43436673238633, 35.046252608299255),
                connexionWith = listOf(PointModel(1715,156), PointModel(1718,159)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1720 ,number = 161, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43420857148081, 35.046190582215786),
                connexionWith = listOf(PointModel(1716,157)),
                connexionFloor = listOf(FloorModel(0, PointModel(768, 97)), FloorModel(1, PointModel(610, 148)), FloorModel(2, PointModel(996, 168)), FloorModel(3, PointModel(1232, 150)), FloorModel(4, PointModel(1473, 165))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1721 ,number = 162, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4343068937894, 35.0462881475687),
                connexionWith = listOf(PointModel(1714,155), PointModel(1722,163)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1722 ,number = 163, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434303557062584, 35.04636827856302),
                connexionWith = listOf(PointModel(1712,153), PointModel(1721,162)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1723 ,number = 164, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43429577136583, 35.046463161706924),
                connexionWith = listOf(PointModel(1711,152), PointModel(1724,165)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1724 ,number = 165, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43429510402035, 35.04650339484215),
                connexionWith = listOf(PointModel(1710,151), PointModel(1723,164)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1725 ,number = 166, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43428976525612, 35.046562403440475),
                connexionWith = listOf(PointModel(1709,150)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1726 ,number = 167, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43428687342524, 35.04662811756134),
                connexionWith = listOf(PointModel(1708,149)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1727 ,number = 168, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43428531628549, 35.04671797156334),
                connexionWith = listOf(PointModel(1707,148)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1728 ,number = 169, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43428464893985, 35.046767592430115),
                connexionWith = listOf(PointModel(1706,147)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1729 ,number = 170, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434226367387865, 35.04630524665117),
                connexionWith = listOf(PointModel(1713,154)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1730 ,number = 171, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43417097760665, 35.04623282700777),
                connexionWith = listOf(PointModel(1715,156), PointModel(1731,172), PointModel(1732,173), PointModel(1733,174)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1731 ,number = 172, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43416808576903, 35.046292170882225),
                connexionWith = listOf(PointModel(1730,171)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1732 ,number = 173, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434171867402824, 35.046168118715286),
                connexionWith = listOf(PointModel(1730,171), PointModel(1734,175)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1733 ,number = 174, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43414205922301, 35.04622746258974),
                connexionWith = listOf(PointModel(1730,171), PointModel(1734,175), PointModel(1735,176)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1734 ,number = 175, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43414339391799, 35.04616543650627),
                connexionWith = listOf(PointModel(1732,173), PointModel(1733,174)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1735 ,number = 176, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43410624489425, 35.04622343927622),
                connexionWith = listOf(PointModel(1734,175), PointModel(1736,177), PointModel(1751,192), PointModel(1752,193)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1736 ,number = 177, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4340744346308, 35.04622008651495),
                connexionWith = listOf(PointModel(1735,176), PointModel(1737,178), PointModel(1750,191), PointModel(1753,194)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1737 ,number = 178, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43393540352527, 35.04620801657438),
                connexionWith = listOf(PointModel(1736,177), PointModel(1738,179), PointModel(1749,190), PointModel(1754,195)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1738 ,number = 179, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43390515030633, 35.046205669641495),
                connexionWith = listOf(PointModel(1737,178), PointModel(1739,180), PointModel(1748,189), PointModel(1755,196)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1739 ,number = 180, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43384286421056, 35.046200305223465),
                connexionWith = listOf(PointModel(1738,179), PointModel(1740,181), PointModel(1756,197)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1740 ,number = 181, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43382061915787, 35.04619527608156),
                connexionWith = listOf(PointModel(1739,180), PointModel(1741,182), PointModel(1757,198)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1741 ,number = 182, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433760779917755, 35.04619192332029),
                connexionWith = listOf(PointModel(1740,181), PointModel(1742,183), PointModel(1747,188)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1742 ,number = 183, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43373986953473, 35.04619024693966),
                connexionWith = listOf(PointModel(1741,182), PointModel(1743,184), PointModel(1746,187), PointModel(1758,199)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1743 ,number = 184, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4337113958078, 35.046186558902264),
                connexionWith = listOf(PointModel(1742,183), PointModel(1744,185), PointModel(1759,200)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1744 ,number = 185, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43365422585479, 35.04618052393198),
                connexionWith = listOf(PointModel(1743,184), PointModel(1745,186)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1745 ,number = 186, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4336462176072, 35.04627004265785),
                connexionWith = listOf(PointModel(1744,185)),
                connexionFloor = listOf(FloorModel(0, PointModel(783, 112)), FloorModel(1, PointModel(648, 186)), FloorModel(2, PointModel(1026, 198)), FloorModel(3, PointModel(1259, 177)), FloorModel(4, PointModel(1507, 199))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1746 ,number = 187, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433734085810215, 35.04626702517271),
                connexionWith = listOf(PointModel(1742,183)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1747 ,number = 188, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4337598901144, 35.04626803100109),
                connexionWith = listOf(PointModel(1741,182)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1748 ,number = 189, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.433899589050874, 35.04628278315067),
                connexionWith = listOf(PointModel(1738,179)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1749 ,number = 190, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43393340147459, 35.04628445953131),
                connexionWith = listOf(PointModel(1737,178)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1750 ,number = 191, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43407043054029, 35.04629485309124),
                connexionWith = listOf(PointModel(1736,177)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1751 ,number = 192, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43410112855952, 35.046298541128635),
                connexionWith = listOf(PointModel(1735,176)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1752 ,number = 193, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43410335305295, 35.04615504294634),
                connexionWith = listOf(PointModel(1735,176)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1753 ,number = 194, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434075546878105, 35.0461570546031),
                connexionWith = listOf(PointModel(1736,177), PointModel(1754,195)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1754 ,number = 195, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43393273412435, 35.046143643558025),
                connexionWith = listOf(PointModel(1737,178), PointModel(1753,194)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1755 ,number = 196, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43390781970873, 35.04614196717739),
                connexionWith = listOf(PointModel(1738,179)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1756 ,number = 197, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.4338475356704, 35.04613559693098),
                connexionWith = listOf(PointModel(1739,180)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1757 ,number = 198, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43382284366359, 35.04612922668457),
                connexionWith = listOf(PointModel(1740,181), PointModel(1758,199)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1758 ,number = 199, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43374098178936, 35.04611782729626),
                connexionWith = listOf(PointModel(1742,183), PointModel(1757,198)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1759 ,number = 200, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43371473257349, 35.046116821467876),
                connexionWith = listOf(PointModel(1743,184)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1760 ,number = 201, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43426707550183, 35.04610072821379),
                connexionWith = listOf(PointModel(1717,158), PointModel(1761,202), PointModel(1779,220)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1761 ,number = 202, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434268187744905, 35.04605647176504),
                connexionWith = listOf(PointModel(1760,201), PointModel(1762,203), PointModel(1778,219)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1762 ,number = 203, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434273971408615, 35.045947171747684),
                connexionWith = listOf(PointModel(1761,202), PointModel(1763,204), PointModel(1777,218)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1763 ,number = 204, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434275973445885, 35.0458737462759),
                connexionWith = listOf(PointModel(1762,203), PointModel(1764,205), PointModel(1776,217)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1764 ,number = 205, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43428909791053, 35.045690685510635),
                connexionWith = listOf(PointModel(1763,204), PointModel(1765,206), PointModel(1775,216)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1765 ,number = 206, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43428843056497, 35.04564676433802),
                connexionWith = listOf(PointModel(1764,205), PointModel(1766,207), PointModel(1774,215)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1766 ,number = 207, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43428776321938, 35.0456303358078),
                connexionWith = listOf(PointModel(1765,206), PointModel(1767,208), PointModel(1782,223)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1767 ,number = 208, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43428887546202, 35.04555556923151),
                connexionWith = listOf(PointModel(1766,207), PointModel(1768,209), PointModel(1773,214), PointModel(1780,221)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1768 ,number = 209, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43429109994724, 35.04551399499178),
                connexionWith = listOf(PointModel(1767,208), PointModel(1769,210), PointModel(1770,211)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1769 ,number = 210, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43424349594252, 35.04550963640213),
                connexionWith = listOf(PointModel(1768,209)),
                connexionFloor = listOf(FloorModel(0, PointModel(808, 137)), FloorModel(1, PointModel(652, 190)), FloorModel(2, PointModel(1063, 235)), FloorModel(3, PointModel(1292, 210)), FloorModel(4, PointModel(1537, 229))), connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1770 ,number = 211, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43429443667486, 35.04547409713268),
                connexionWith = listOf(PointModel(1768,209), PointModel(1771,212), PointModel(1772,213)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1771 ,number = 212, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434294881571844, 35.04543989896774),
                connexionWith = listOf(PointModel(1770,211)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1772 ,number = 213, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434355832424096, 35.045480132102966),
                connexionWith = listOf(PointModel(1770,211), PointModel(1773,214)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1773 ,number = 214, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434343375321575, 35.04555992782116),
                connexionWith = listOf(PointModel(1767,208), PointModel(1772,213), PointModel(1774,215)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1774 ,number = 215, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43434003859715, 35.045649111270905),
                connexionWith = listOf(PointModel(1765,206), PointModel(1773,214)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1775 ,number = 216, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434336701872525, 35.04569202661514),
                connexionWith = listOf(PointModel(1764,205), PointModel(1776,217)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1776 ,number = 217, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43432424476527, 35.04587911069393),
                connexionWith = listOf(PointModel(1763,204), PointModel(1775,216)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1777 ,number = 218, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434320240694454, 35.04594549536705),
                connexionWith = listOf(PointModel(1762,203)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1778 ,number = 219, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434313567242356, 35.0460584834218),
                connexionWith = listOf(PointModel(1761,202)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1779 ,number = 220, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43431401213918, 35.0461034104228),
                connexionWith = listOf(PointModel(1760,201)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1780 ,number = 221, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43420078576953, 35.04554953426123),
                connexionWith = listOf(PointModel(1767,208), PointModel(1781,222)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1781 ,number = 222, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.434202565360756, 35.04548415541649),
                connexionWith = listOf(PointModel(1780,221)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
            NavModel(
                id = 1782 ,number = 223, name = null, description = null, locationIndex = OLD, floorIndex = 5,
                location = LatLng(48.43424260614761, 35.04562396556139),
                connexionWith = listOf(PointModel(1766,207)),
                connexionFloor = null, connectedLocIndex = OLD, locked = false
            ),
        )
    }
}