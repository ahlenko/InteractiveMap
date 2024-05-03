package com.example.interactivemap.logic.model.navigation.graph
import com.example.interactivemap.logic.model.navigation.models.FloorModel
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.logic.model.navigation.models.NavObjects.NEW
import com.example.interactivemap.logic.model.navigation.models.NavObjects.OLD
import com.example.interactivemap.logic.model.navigation.models.NavObjects.SK
import com.example.interactivemap.logic.model.navigation.models.NavObjects.YARD
import com.google.android.gms.maps.model.LatLng
object NavGraphYard {
    val navGraphYard: List<NavModel> by lazy { // Подвір'я
        listOf(
            NavModel(
                id = 1, name = "",
                location = LatLng(48.437740714418595, 35.04952121526003),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(2, 136, 37),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 2, name = "",
                location = LatLng(48.4376844387341, 35.04948567599058),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(1, 3, 133, 132),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 3, name = "",
                location = LatLng(48.43737347552741, 35.04930395632982),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(2, 4, 5),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 4, name = "",
                location = LatLng(48.43725803162071, 35.049499087035656),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(3),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 5, name = "",
                location = LatLng(48.437136359242416, 35.04917185753584),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(3, 7),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 6, name = "",
                location = LatLng(48.437055170016194, 35.0493274256587),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(5),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 7, name = "",
                location = LatLng(48.43696575049908, 35.049071945250034),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(5, 8, 10),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 8, name = "",
                location = LatLng(48.43706006361707, 35.04880204796791),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(7, 9),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 9, name = "",
                location = LatLng(48.43690813933377, 35.04867196083069),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(8, 10, 129),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 10, name = "",
                location = LatLng(48.43678579880473, 35.0489716976881),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(9, 11, 13),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 11, name = "",
                location = LatLng(48.43689501554569, 35.049035400152206),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(7, 10, 12),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 12, name = "",
                location = LatLng(48.43684518960745, 35.04912659525871),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(11),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 13, name = "",
                location = LatLng(48.4366790286477, 35.04890028387308),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(10, 14, 15),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 14, name = "",
                location = LatLng(48.43664766487144, 35.04896733909845),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(13),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 15, name = "",
                location = LatLng(48.43650396959222, 35.04880405962467),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(13, 16),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 16, name = "",
                location = LatLng(48.43643746033931, 35.04890598356724),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(15),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 17, name = "",
                location = LatLng(48.43644302131696, 35.04876382648945),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(15, 18, 126 ),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 18, name = "",
                location = LatLng(48.43634692753739, 35.04872225224972),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(17, 19),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 19, name = "",
                location = LatLng(48.43620590068922, 35.04896432161331),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(18, 20, 21),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 20, name = "",
                location = LatLng(48.436053306529246, 35.04878059029579),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(19),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 21, name = "",
                location = LatLng(48.4361712000167, 35.049019642174244),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(19, 22, 28),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 22, name = "",
                location = LatLng(48.43601259984645, 35.04930831491947),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(21, 23, 24),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 23, name = "",
                location = LatLng(48.43589715284733, 35.04916850477457),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(22),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 24, name = "",
                location = LatLng(48.43586111731411, 35.0495745241642),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(22, 25, 27),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 25, name = "",
                location = LatLng(48.43584843813895, 35.04958391189575),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(24, 26, 63),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 26, name = "",
                location = LatLng(48.43571564027199, 35.04941962659359),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(25),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 27, name = "",
                location = LatLng(48.43613227295204, 35.04992052912712),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(24, 28, 31),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 28, name = "",
                location = LatLng(48.43647082619613, 35.04934519529343),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(21, 27, 156),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 156, name = "",
                location = LatLng(48.436566029987134, 35.04944175481796),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(28, 29),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 29, name = "",
                location = LatLng(48.43678535392956, 35.04961274564266),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(156, 30, 36),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 30, name = "",
                location = LatLng(48.43669015054952, 35.04979144781828),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(29, 31, 35),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 31, name = "",
                location = LatLng(48.43635649243564, 35.05036644637585),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(30, 32, 27),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 32, name = "",
                location = LatLng(48.43648328277706, 35.05061522126198),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(31, 33),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 33, name = "",
                location = LatLng(48.436728187435385, 35.05018673837185),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(32, 34),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 34, name = "",
                location = LatLng(48.43676933842014, 35.05023267120123),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(33),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 35, name = "",
                location = LatLng(48.436852085164325, 35.04997719079256),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(33, 36, 30),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 36, name = "",
                location = LatLng(48.436972201166014, 35.04975859075785),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(35, 37, 29),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 37, name = "",
                location = LatLng(48.43742330094752, 35.05010761320591),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(36, 38, 1),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 38, name = "",
                location = LatLng(48.43641432666572, 35.051858089864254),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(37, 39, 60),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 39, name = "",
                location = LatLng(48.43617142245699, 35.051462799310684),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(38, 40, 41),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 40, name = "",
                location = LatLng(48.43629732350137, 35.05122374743223),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(39),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 41, name = "",
                location = LatLng(48.43602349945323, 35.05121637135744),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(39, 42, 43),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 43, name = "",
                location = LatLng(48.43584843813895, 35.05093943327665),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(44, 41, 45),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 44, name = "",
                location = LatLng(48.43602127504386, 35.05060415714979),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(43),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 45, name = "",
                location = LatLng(48.435665813177096, 35.05063232034445),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(44, 46, 47),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 46, name = "",
                location = LatLng(48.43587691066824, 35.05026251077652),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(45),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 47, name = "",
                location = LatLng(48.43555948555224, 35.05047507584095),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(45, 48, 50),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 48, name = "",
                location = LatLng(48.43552033557575, 35.05031079053879),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(47, 49, 61),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 49, name = "",
                location = LatLng(48.435440255984396, 35.050302408635616),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(48),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 50, name = "",
                location = LatLng(48.43538798173863, 35.05065981298685),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(47, 51, 53),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 51, name = "",
                location = LatLng(48.43532369546476, 35.050843209028244),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(50, 52),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 52, name = "",
                location = LatLng(48.43528521263906, 35.051083602011204),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(51, 53, 54),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 53, name = "",
                location = LatLng(48.434873911716096, 35.050608180463314),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(52, 77, 50),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 54, name = "",
                location = LatLng(48.435489638414005, 35.05133103579283),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(52, 55, 56),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 55, name = "",
                location = LatLng(48.4356155411479, 35.05110874772072),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(54),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 56, name = "",
                location = LatLng(48.435756569634826, 35.05164250731468),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(54, 57, 58),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 57, name = "",
                location = LatLng(48.435840652678934, 35.05149532109499),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(56),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 58, name = "",
                location = LatLng(48.43600103291424, 35.05191709846258),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(56, 59),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 59, name = "",
                location = LatLng(48.436045965982295, 35.05183529108763),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(58),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 60, name = "",
                location = LatLng(48.436233038378106, 35.05218464881182),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(58, 38),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 61, name = "",
                location = LatLng(48.43549408727916, 35.05000468343496),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(48, 62),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 62, name = "",
                location = LatLng(48.43548029579584, 35.049787759780884),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(61, 63, 67),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 63, name = "",
                location = LatLng(48.435583731829375, 35.04977535456419),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(62, 64, 25),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 64, name = "",
                location = LatLng(48.43558484404365, 35.0498266518116),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(63, 65),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 65, name = "",
                location = LatLng(48.43573165611355, 35.0499976426363),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(64, 66),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 66, name = "",
                location = LatLng(48.43576680197039, 35.049940310418606),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(65),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 67, name = "",
                location = LatLng(48.435468283855734, 35.0497367978096),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(62, 71, 68),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 68, name = "",
                location = LatLng(48.43545048838367, 35.049443766474724),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(67, 69, 111),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 69, name = "",
                location = LatLng(48.43542001362328, 35.04944980144501),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(68, 70),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 70, name = "",
                location = LatLng(48.43536707202528, 35.04958726465702),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(69, 71),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 71, name = "",
                location = LatLng(48.43529588995781, 35.049727745354176),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(70, 72, 67),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 72, name = "",
                location = LatLng(48.434855226251656, 35.04970125854015),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(71, 73, 74),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 73, name = "",
                location = LatLng(48.43485366912934, 35.049864538013935),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(72),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 74, name = "",
                location = LatLng(48.43478382102072, 35.049664713442326),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(72, 75),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 75, name = "",
                location = LatLng(48.43439097923268, 35.049631521105766),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(74, 76, 83),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 76, name = "",
                location = LatLng(48.434385862926625, 35.049980878829956),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(75, 77),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 77, name = "",
                location = LatLng(48.43436384055983, 35.05001373589039),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(76, 78, 53),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 78, name = "",
                location = LatLng(48.434166973523745, 35.04978708922863),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(77, 79, 93),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 79, name = "",
                location = LatLng(48.434157408213295, 35.04947494715452),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(78, 80, 84),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 80, name = "",
                location = LatLng(48.434173869444116, 35.04948031157255),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(79, 81),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 81, name = "",
                location = LatLng(48.43418454699639, 35.0495346263051),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(80, 82),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 82, name = "",
                location = LatLng(48.43420278780967, 35.049585588276386),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(81, 83),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 83, name = "",
                location = LatLng(48.43423170615876, 35.04961408674717),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(82, 84, 75),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 84, name = "",
                location = LatLng(48.43412982451726, 35.04920169711113),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(79, 85),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 85, name = "",
                location = LatLng(48.43414606330787, 35.04890598356724),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(84, 86),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 86, name = "",
                location = LatLng(48.434197893933586, 35.048652179539204),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(85, 87, 94),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 87, name = "",
                location = LatLng(48.43358704551649, 35.0485797598958),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(86, 88, 151),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 88, name = "",
                location = LatLng(48.433535659171305, 35.04884999245405),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(87, 89),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 89, name = "",
                location = LatLng(48.43352542638639, 35.049032382667065),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(88, 90),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 90, name = "",
                location = LatLng(48.43358504345207, 35.04920370876789),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(89, 91),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 91, name = "",
                location = LatLng(48.43368759353945, 35.04930529743433),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(90, 92),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 92, name = "",
                location = LatLng(48.433735420515944, 35.04934083670378),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(91, 93),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 93, name = "",
                location = LatLng(48.433969660825, 35.0495745241642),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(92, 94, 78),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 94, name = "",
                location = LatLng(48.43426485101558, 35.04854992032051),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(86, 95),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 95, name = "",
                location = LatLng(48.43437318338326, 35.048511028289795),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(94, 96),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 96, name = "",
                location = LatLng(48.43445081773056, 35.04851873964071),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(95, 97),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 97, name = "",
                location = LatLng(48.43445949319469, 35.04844833165407),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(96, 152, 111),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 98, name = "",
                location = LatLng(48.43447995838618, 35.04814490675926),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(152, 99, 110),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 99, name = "",
                location = LatLng(48.434384973134186, 35.04813048988581),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(98, 100),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 100, name = "",
                location = LatLng(48.43439676288239, 35.048044323921204),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(99, 101, 105),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 101, name = "",
                location = LatLng(48.43441678320324, 35.04745189100504),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(100, 102, 116, 104),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 102, name = "",
                location = LatLng(48.43412604288034, 35.04741299897432),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(101, 103),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 103, name = "",
                location = LatLng(48.43413204900944, 35.047077387571335),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(102, 148),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 104, name = "",
                location = LatLng(48.434877693297345, 35.04771675914526),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(101, 105),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 105, name = "",
                location = LatLng(48.434937086330656, 35.04775866866112),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(104, 106, 100),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 106, name = "",
                location = LatLng(48.43498402234907, 35.04777979105711),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(105, 107),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 107, name = "",
                location = LatLng(48.43532503012871, 35.047961845993996),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(106, 108, 112),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 108, name = "",
                location = LatLng(48.435331703447964, 35.047990679740906),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(107, 109, 124),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 109, name = "",
                location = LatLng(48.43533948898597, 35.04814859479666),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(108, 110, 18),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 110, name = "",
                location = LatLng(48.43534060120558, 35.048209615051746),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(109, 111, 98),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 111, name = "",
                location = LatLng(48.435370853569815, 35.04854656755924),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(110, 112, 68, 97),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 112, name = "",
                location = LatLng(48.43530100617222, 35.0477596744895),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(107, 113),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 113, name = "",
                location = LatLng(48.435256739778175, 35.04762355238199),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(112, 114),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 114, name = "",
                location = LatLng(48.435112373230105, 35.04745088517666),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(113, 115, 106),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 115, name = "",
                location = LatLng(48.43502406252004, 35.04736639559269),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(114, 116, 104),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 116, name = "",
                location = LatLng(48.43444837080453, 35.046843364834785),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(115, 117, 101),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 117, name = "",
                location = LatLng(48.43444770346103, 35.04676893353462),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(116, 118, 146),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 118, name = "",
                location = LatLng(48.43447639922305, 35.04608631134033),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(117, 119, 143),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 119, name = "",
                location = LatLng(48.43447817880467, 35.04601623862982),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(118, 120),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 120, name = "",
                location = LatLng(48.434667926335706, 35.04555556923151),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(119, 137, 154),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 121, name = "",
                location = LatLng(48.43599013330263, 35.046749487519264),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(154, 122, 136),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 122, name = "",
                location = LatLng(48.43586623347162, 35.04707906395197),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(121, 123, 125),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 123, name = "",
                location = LatLng(48.43561376160613, 35.04772111773491),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(122, 124),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 124, name = "",
                location = LatLng(48.435521002905155, 35.047851875424385),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(123, 125, 108),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 125, name = "",
                location = LatLng(48.4364661549775, 35.047574266791344),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(126, 122, 156),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 126, name = "",
                location = LatLng(48.43677022817079, 35.04790786653757),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(125, 126, 17, 135),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 127, name = "",
                location = LatLng(48.43693105034558, 35.04807282239199),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(126, 128, 130),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 128, name = "",
                location = LatLng(48.43696730755669, 35.04839535802603),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(127, 129),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 129, name = "",
                location = LatLng(48.436963303694135, 35.048557966947556),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(128, 130, 9),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 130, name = "",
                location = LatLng(48.437596799796935, 35.048881843686104),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(127, 131),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 131, name = "",
                location = LatLng(48.437674429218454, 35.0490390881896),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(130, 132),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 132, name = "",
                location = LatLng(48.43771001859842, 35.04922717809677),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(131, 2),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 133, name = "",
                location = LatLng(48.43791955056738, 35.04896264523268),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(2, 134),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 134, name = "",
                location = LatLng(48.437943573285665, 35.04883423447609),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(133, 135),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 135, name = "",
                location = LatLng(48.43789775216504, 35.04872627556324),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(134, 126),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 136, name = "",
                location = LatLng(48.438132195716, 35.048705488443375),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(1, 121),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 137, name = "",
                location = LatLng(48.43334857684346, 35.04436366260052),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(120, 138),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 138, name = "",
                location = LatLng(48.433260930426776, 35.04457589238882),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(137, 139),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 139, name = "",
                location = LatLng(48.43327872666573, 35.04488334059715),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(138, 140),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 140, name = "",
                location = LatLng(48.43336815267222, 35.045117028057575),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(139, 141),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 141, name = "",
                location = LatLng(48.433480046185025, 35.04548382014036),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(140, 142),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 142, name = "",
                location = LatLng(48.43352409167517, 35.045814737677574),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(141, 143),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 143, name = "",
                location = LatLng(48.43352787335687, 35.046012215316296),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(142, 144, 118),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 144, name = "",
                location = LatLng(48.43352320186767, 35.04633106291294),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(143, 145, 147),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 145, name = "",
                location = LatLng(48.43400035890512, 35.04637632519007),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(144, 146),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 146, name = "",
                location = LatLng(48.43398523231723, 35.04672937095165),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(145, 147, 117),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 147, name = "",
                location = LatLng(48.43350829758966, 35.04668276757002),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(146, 148, 144),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 148, name = "",
                location = LatLng(48.433497842347265, 35.04701469093561),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(147, 149, 103),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 149, name = "",
                location = LatLng(48.433456688712646, 35.04766143858433),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(148, 150),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 150, name = "",
                location = LatLng(48.43353232239383, 35.04804901778698),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(149, 151, 99),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 151, name = "",
                location = LatLng(48.43359460887028, 35.04846811294556),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(150, 87),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 152, name = "",
                location = LatLng(48.434472172716475, 35.04832595586777),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(97, 98, 153),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 153, name = "",
                location = LatLng(48.43436117118141, 35.04831489175558),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(152),
                connexionFloor = listOf(FloorModel(1, 1)),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 154, name = "",
                location = LatLng(48.4353968794864, 35.0461795181036),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(120, 121),
                connexionFloor = listOf(),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 155, name = "",
                location = LatLng(48.43534794185444, 35.04634749144316),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(154),
                connexionFloor = listOf(FloorModel(1, 1)),
                connectedLocIndex = OLD
            ),
            NavModel(
                id = 156, name = "",
                location = LatLng(48.43641966520671, 35.04768993705511),
                locationIndex = YARD, floorIndex = 1,
                connexionWith = listOf(125),
                connexionFloor = listOf(FloorModel(1, 1)),
                connectedLocIndex = SK
            ),
        )
    }
}