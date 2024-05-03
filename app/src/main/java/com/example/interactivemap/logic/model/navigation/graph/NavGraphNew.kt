package com.example.interactivemap.logic.model.navigation.graph

import com.example.interactivemap.logic.model.navigation.models.FloorModel
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.logic.model.navigation.models.NavObjects.NEW
import com.example.interactivemap.logic.model.navigation.models.NavObjects.OLD
import com.example.interactivemap.logic.model.navigation.models.NavObjects.YARD
import com.google.android.gms.maps.model.LatLng

object NavGraphNew {
    val navGraphNew0: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 214, name = "",
                location = LatLng(48.434254395928846, 35.04826728254557),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(213, 215),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 215, name = "",
                location = LatLng(48.43418877352689, 35.04826191812754),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(214, 216),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 216, name = "",
                location = LatLng(48.43418632658821, 35.04830650985241),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(215, 217),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 217, name = "",
                location = LatLng(48.43418699393515, 35.04833064973354),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(216, 218),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 218, name = "",
                location = LatLng(48.43423593268534, 35.04833534359932),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(217, 219),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 219, name = "",
                location = LatLng(48.434236155134094, 35.04830986261368),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(218, 220),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 220, name = "",
                location = LatLng(48.43418721638411, 35.048357136547565),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(219, 221),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 221, name = "",
                location = LatLng(48.43414094697715, 35.048352777957916),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(220, 222),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 222, name = "",
                location = LatLng(48.43418410209842, 35.048401057720184),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(221, 223),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 223, name = "",
                location = LatLng(48.43421635719091, 35.04840675741434),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(222, 224),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 224, name = "",
                location = LatLng(48.43421279800931, 35.048460736870766),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(223, 225),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 225, name = "",
                location = LatLng(48.43413716534105, 35.04839904606342),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(224, 226),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 226, name = "",
                location = LatLng(48.43409134078728, 35.048392340540886),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(225, 227),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 227, name = "",
                location = LatLng(48.434093120382386, 35.048329308629036),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(226, 228),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 228, name = "",
                location = LatLng(48.43413293880628, 35.04844129085541),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(227, 229),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 229, name = "",
                location = LatLng(48.43411914695348, 35.04843927919865),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(228, 230),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 230, name = "",
                location = LatLng(48.43411692246073, 35.04848085343838),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(229, 231),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 231, name = "",
                location = LatLng(48.434144951062095, 35.04844229668379),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(230, 232),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 232, name = "",
                location = LatLng(48.434174536791204, 35.048444643616676),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(231, 233),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 233, name = "",
                location = LatLng(48.4341438388163, 35.0484848767519),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(232, 234),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 234, name = "",
                location = LatLng(48.4339556464779, 35.04837825894356),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(233, 235),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 235, name = "",
                location = LatLng(48.43395497912796, 35.0484449788928),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(234, 236),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 236, name = "",
                location = LatLng(48.43405552642278, 35.04846040159464),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(235, 237),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 237, name = "",
                location = LatLng(48.433882682830586, 35.048375241458416),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(236, 238),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 238, name = "",
                location = LatLng(48.43384175195818, 35.04836954176426),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(237, 239),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 239, name = "",
                location = LatLng(48.43379726184206, 35.048366859555244),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(238, 240),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 240, name = "",
                location = LatLng(48.43378925361701, 35.04846107214689),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(239, 241),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 241, name = "",
                location = LatLng(48.43380082105276, 35.04829276353121),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(240, 242),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 242, name = "",
                location = LatLng(48.4338366355968, 35.04845604300499),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(241, 243),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 243, name = "",
                location = LatLng(48.43388090322813, 35.04845906049013),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(242, 244),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 244, name = "",
                location = LatLng(48.43388379508211, 35.04829779267311),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(243, 245),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 245, name = "",
                location = LatLng(48.43418877352689, 35.04822537302971),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(244, 246),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 246, name = "",
                location = LatLng(48.434237712275376, 35.048231072723866),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(245, 247),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 247, name = "",
                location = LatLng(48.43419611434215, 35.048104003071785),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(246, 248),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 248, name = "",
                location = LatLng(48.43422125106522, 35.048104003071785),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(247, 249),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 249, name = "",
                location = LatLng(48.434197671484654, 35.04800610244274),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(248, 250),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 250, name = "",
                location = LatLng(48.43420323270749, 35.04796754568815),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(249, 251),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 251, name = "",
                location = LatLng(48.43423170615876, 35.04800442606211),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(250, 252),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 252, name = "",
                location = LatLng(48.43423170615876, 35.04797324538231),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(251, 253),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 253, name = "",
                location = LatLng(48.434215689844386, 35.047662779688835),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(252, 254),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 254, name = "",
                location = LatLng(48.43425217144203, 35.04766512662172),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(253, 255),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 255, name = "",
                location = LatLng(48.43421435515128, 35.04759170114994),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(254, 256),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 256, name = "",
                location = LatLng(48.43425150409596, 35.047594383358955),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(255, 257),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 257, name = "",
                location = LatLng(48.434252838788105, 35.047536715865135),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(256, 258),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 258, name = "",
                location = LatLng(48.434219916372285, 35.0475487858057),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(257, 259),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 259, name = "",
                location = LatLng(48.43417631638338, 35.04754442721605),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(258, 260),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 260, name = "",
                location = LatLng(48.434224587797445, 35.047506876289845),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(259, 261),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 261, name = "",
                location = LatLng(48.434125597981854, 35.047581642866135),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(260, 262),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 262, name = "",
                location = LatLng(48.43412114899685, 35.04764936864376),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(261, 263),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 263, name = "",
                location = LatLng(48.434125597981854, 35.04753302782774),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(262, 264),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 264, name = "",
                location = LatLng(48.43406464685343, 35.04757862538099),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(263, 265),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 265, name = "",
                location = LatLng(48.434067761146416, 35.047514252364635),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(264, 266),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 266, name = "",
                location = LatLng(48.43406108766117, 35.047635957598686),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(265, 267),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 267, name = "",
                location = LatLng(48.433963877126665, 35.047566555440426),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(266, 268),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 268, name = "",
                location = LatLng(48.43394430152743, 35.04756588488817),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(267, 269),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 269, name = "",
                location = LatLng(48.43383174168545, 35.04755213856697),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(268, 270),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 270, name = "",
                location = LatLng(48.433744318553096, 35.0475487858057),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(269, 271),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 271, name = "",
                location = LatLng(48.43368959559982, 35.047535710036755),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(270, 272),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 272, name = "",
                location = LatLng(48.43364844212055, 35.04753604531288),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(271, 273),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 273, name = "",
                location = LatLng(48.43360550899579, 35.047531351447105),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(272, 274),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 274, name = "",
                location = LatLng(48.43360283957752, 35.04762455821037),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(273, 275),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 275, name = "",
                location = LatLng(48.43360550899579, 35.047467313706875),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(274, 276),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 276, name = "",
                location = LatLng(48.43364799721787, 35.04746865481138),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(275, 277),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 277, name = "",
                location = LatLng(48.433643103288354, 35.047586001455784),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(276, 278),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 278, name = "",
                location = LatLng(48.43369004050213, 35.04759036004543),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(277, 279),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 279, name = "",
                location = LatLng(48.43369293236697, 35.04748072475195),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(278, 280),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 280, name = "",
                location = LatLng(48.43374543080765, 35.04748407751322),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(279, 281),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 281, name = "",
                location = LatLng(48.43374253894581, 35.04761215299368),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(280, 282),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 282, name = "",
                location = LatLng(48.43382796002634, 35.04762053489685),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(281, 283),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 283, name = "",
                location = LatLng(48.43383285393807, 35.0474938005209),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(282, 284),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 284, name = "",
                location = LatLng(48.433942077027034, 35.04760477691889),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(283, 285),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 285, name = "",
                location = LatLng(48.433891358391705, 35.04759941250086),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(284, 286),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 286, name = "",
                location = LatLng(48.4339471933778, 35.047473683953285),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(285, 287),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 287, name = "",
                location = LatLng(48.43399123846297, 35.04747737199068),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(286, 288),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 288, name = "",
                location = LatLng(48.43399257316193, 35.04750318825245),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(287, 289),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 289, name = "",
                location = LatLng(48.43395942812749, 35.04764534533024),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(288, 290),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 290, name = "",
                location = LatLng(48.43420478984976, 35.04686549305916),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(289, 291),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 291, name = "",
                location = LatLng(48.43424527553227, 35.046871192753315),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(290, 292),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 292, name = "",
                location = LatLng(48.43425506327487, 35.04686985164881),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(291, 293),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 293, name = "",
                location = LatLng(48.434256397966905, 35.04682257771492),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(292, 294),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 294, name = "",
                location = LatLng(48.43424438573742, 35.04691645503044),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(293, 295),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 295, name = "",
                location = LatLng(48.43421279800931, 35.046912766993046),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(294, 296),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 296, name = "",
                location = LatLng(48.43415696331509, 35.04690673202276),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(295, 297),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 297, name = "",
                location = LatLng(48.43415785311149, 35.04683095961809),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(296, 298),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 298, name = "",
                location = LatLng(48.43413049186493, 35.04690371453762),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(297, 299),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 299, name = "",
                location = LatLng(48.434128044923455, 35.046967417001724),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(298, 300),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 300, name = "",
                location = LatLng(48.434207681685294, 35.04697009921074),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(299, 301),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 301, name = "",
                location = LatLng(48.4342793101745, 35.04691746085882),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(300, 302),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 302, name = "",
                location = LatLng(48.43424371839125, 35.04700195044279),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(301, 303),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 303, name = "",
                location = LatLng(48.43427997752021, 35.04700496792793),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(302, 304),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 304, name = "",
                location = LatLng(48.4342399367628, 35.04708006978035),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(303, 305),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 305, name = "",
                location = LatLng(48.43427953262308, 35.04708308726549),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(304, 306),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 306, name = "",
                location = LatLng(48.434238157172864, 35.04710756242275),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(305, 307),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 307, name = "",
                location = LatLng(48.43427708568878, 35.04711125046015),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(306, 308),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 308, name = "",
                location = LatLng(48.43423237350509, 35.04727754741907),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(307, 309),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 309, name = "",
                location = LatLng(48.43427018978243, 35.047280229628086),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(308, 310),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 310, name = "",
                location = LatLng(48.4342679652963, 35.04732917994261),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(309, 311),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 311, name = "",
                location = LatLng(48.43422970411974, 35.047328509390354),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(310, 312),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 312, name = "",
                location = LatLng(48.43423504289031, 35.04619024693966),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(311, 313),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 313, name = "",
                location = LatLng(48.43427374896001, 35.04619661718607),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(312, 314),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 314, name = "",
                location = LatLng(48.43428754077085, 35.04619661718607),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(313, 315),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 315, name = "",
                location = LatLng(48.43428687342524, 35.04614531993866),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(314, 316),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 316, name = "",
                location = LatLng(48.434272414268456, 35.04623718559742),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(315, 317),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 317, name = "",
                location = LatLng(48.4342370449291, 35.04623617976904),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(316, 318),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 318, name = "",
                location = LatLng(48.43423370819771, 35.04630155861378),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(317, 319),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 319, name = "",
                location = LatLng(48.434259734696795, 35.04659626632929),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(318, 320),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 320, name = "",
                location = LatLng(48.43425484082621, 35.04668477922678),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(319, 321),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 321, name = "",
                location = LatLng(48.434300220335544, 35.046687461435795),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(320, 322),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 322, name = "",
                location = LatLng(48.434117144910026, 35.046315640211105),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(321, 323),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 323, name = "",
                location = LatLng(48.43411914695348, 35.04622410982847),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(322, 324),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 324, name = "",
                location = LatLng(48.434124485735644, 35.04616644233465),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(323, 325),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 325, name = "",
                location = LatLng(48.434086446900466, 35.04622209817171),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(324, 326),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 326, name = "",
                location = LatLng(48.43408266526031, 35.04629150032997),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(325, 327),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 327, name = "",
                location = LatLng(48.43408711424867, 35.04615303128958),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(326, 328),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 328, name = "",
                location = LatLng(48.433972552673914, 35.046211034059525),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(327, 329),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 329, name = "",
                location = LatLng(48.43397099552452, 35.046268701553345),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(328, 330),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 330, name = "",
                location = LatLng(48.433975222072775, 35.04614297300577),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(329, 331),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 331, name = "",
                location = LatLng(48.433918274866755, 35.04620499908924),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(330, 332),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 332, name = "",
                location = LatLng(48.433920944268465, 35.046152360737324),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(331, 333),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 333, name = "",
                location = LatLng(48.43389091349118, 35.04620298743248),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(332, 334),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 334, name = "",
                location = LatLng(48.433891135941444, 35.046160742640495),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(333, 335),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 335, name = "",
                location = LatLng(48.43386622150544, 35.046159736812115),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(334, 336),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 336, name = "",
                location = LatLng(48.43383418864118, 35.04619795829058),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(335, 337),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 337, name = "",
                location = LatLng(48.43366379125997, 35.046181194484234),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(336, 338),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 338, name = "",
                location = LatLng(48.433664681065, 35.04611447453499),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(337, 339),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 339, name = "",
                location = LatLng(48.43365645036776, 35.04627238959074),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(338, 340),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 340, name = "",
                location = LatLng(48.433722295908275, 35.04618555307388),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(339, 341),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 341, name = "",
                location = LatLng(48.433723853065274, 35.04612185060978),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(340, 342),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 342, name = "",
                location = LatLng(48.43371740198589, 35.0462656840682),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(341, 343),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 343, name = "",
                location = LatLng(48.433827515125266, 35.04628445953131),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(342, 344),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 344, name = "",
                location = LatLng(48.43383596824528, 35.04612419754267),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(343, 345),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 345, name = "",
                location = LatLng(48.43391404831377, 35.04630155861378),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(344, 346),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 346, name = "",
                location = LatLng(48.43395475667798, 35.046304911375046),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(345, 347),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 347, name = "",
                location = LatLng(48.43426240408056, 35.04551164805889),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(346, 348),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 348, name = "",
                location = LatLng(48.43430644889249, 35.045514330267906),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(347, 349),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 349, name = "",
                location = LatLng(48.434307338686274, 35.04549991339445),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(348, 350),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 350, name = "",
                location = LatLng(48.43430889582539, 35.04545766860247),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(349, 351),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 351, name = "",
                location = LatLng(48.43434048349375, 35.04545968025923),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(350, 352),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 352, name = "",
                location = LatLng(48.43433781411408, 35.04550091922283),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(351, 353),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 353, name = "",
                location = LatLng(48.43430244482027, 35.04556059837341),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(352, 354),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 354, name = "",
                location = LatLng(48.43433203045765, 35.045564621686935),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(353, 355),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 355, name = "",
                location = LatLng(48.43433069576762, 35.045736618340015),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(354, 356),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 356, name = "",
                location = LatLng(48.43429599381434, 35.045736618340015),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(355, 357),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 357, name = "",
                location = LatLng(48.43429176729277, 35.045841224491596),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(356, 358),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 358, name = "",
                location = LatLng(48.43432135293636, 35.04584055393934),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(357, 359),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 359, name = "",
                location = LatLng(48.43428487138841, 35.04601154476404),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(358, 360),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 360, name = "",
                location = LatLng(48.434315791726476, 35.04601389169693),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(359, 361),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 361, name = "",
                location = LatLng(48.434269967333826, 35.04555758088827),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(360, 362),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 362, name = "",
                location = LatLng(48.43421435515128, 35.0455491989851),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(361, 363),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 363, name = "",
                location = LatLng(48.43418187760853, 35.04554718732834),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(362, 364),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 364, name = "",
                location = LatLng(48.434215689844386, 35.04549019038677),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(363, 365),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 365, name = "",
                location = LatLng(48.43419633679109, 35.04559211432934),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(364, 366),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 366, name = "",
                location = LatLng(48.43426885509077, 35.045598819851875),
                locationIndex = NEW, floorIndex = 0,
                connexionWith = listOf(365, 367),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
        )
    }
    val navGraphNew1: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 618, name = "",
                location = LatLng(48.433968548575386, 35.048383958637714),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(366, 368),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 619, name = "",
                location = LatLng(48.43377368206471, 35.04755079746246),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(367, 369),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1, name = "",
                location = LatLng(48.434423011745885, 35.04830952733755),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(2),
                connexionFloor = listOf(FloorModel(1, 153)),
                connectedLocIndex = YARD
            ),
            NavModel(
                id = 2, name = "",
                location = LatLng(48.4342973285053, 35.04829376935959),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(1, 3),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 3, name = "",
                location = LatLng(48.43429287953531, 35.04836317151785),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(2, 4),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 4, name = "",
                location = LatLng(48.43418855107792, 35.048354119062424),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(3, 5),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 5, name = "",
                location = LatLng(48.43413004696647, 35.04834774881601),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(4, 6),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 6, name = "",
                location = LatLng(48.43418766128203, 35.04826460033655),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(5, 7),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 7, name = "",
                location = LatLng(48.434190775567515, 35.048219338059425),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(6, 8),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 8, name = "",
                location = LatLng(48.43424905716034, 35.04826828837395),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(7, 9),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 9, name = "",
                location = LatLng(48.43418343475146, 35.048402063548565),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(8, 10),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 10, name = "",
                location = LatLng(48.43421457760014, 35.04840541630983),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(9, 11),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 11, name = "",
                location = LatLng(48.43424527553227, 35.04840910434723),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(10, 12),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 12, name = "",
                location = LatLng(48.43415095718896, 35.04839636385441),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(11, 13),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 13, name = "",
                location = LatLng(48.43409156323668, 35.04839066416025),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(12, 14),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 14, name = "",
                location = LatLng(48.43400436300118, 35.04838228225708),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(13, 15),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 15, name = "",
                location = LatLng(48.4339429668272, 35.04837725311518),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(14, 16),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 16, name = "",
                location = LatLng(48.43388401753239, 35.04837021231651),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(15, 17),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 17, name = "",
                location = LatLng(48.43385176222894, 35.048368871212006),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(16, 18),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 18, name = "",
                location = LatLng(48.43382462326808, 35.04836853593588),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(17, 19),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 19, name = "",
                location = LatLng(48.43379370263109, 35.0483675301075),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(18, 20),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 20, name = "",
                location = LatLng(48.4337928128283, 35.04845067858696),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(19, 21),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 21, name = "",
                location = LatLng(48.43382284366359, 35.04841212183237),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(20, 22),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 22, name = "",
                location = LatLng(48.43385198467937, 35.048413798213005),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(21, 23),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 23, name = "",
                location = LatLng(48.433879790976555, 35.04841614514589),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(22, 24),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 24, name = "",
                location = LatLng(48.43391093401134, 35.04841782152653),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(23, 25),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 25, name = "",
                location = LatLng(48.43393896272631, 35.04842285066843),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(24, 26),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 26, name = "",
                location = LatLng(48.43397010572486, 35.048426538705826),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(25, 27),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 27, name = "",
                location = LatLng(48.43408844894514, 35.04843927919865),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(26, 28),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 28, name = "",
                location = LatLng(48.43414895514676, 35.048441626131535),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(27, 29),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 29, name = "",
                location = LatLng(48.434179430669545, 35.04844766110182),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(28, 30),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 30, name = "",
                location = LatLng(48.434214800049, 35.04844833165407),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(29, 31),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 31, name = "",
                location = LatLng(48.434242828596346, 35.04845101386309),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(30, 32),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 32, name = "",
                location = LatLng(48.43409334283175, 35.04832059144974),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(31, 33),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 33, name = "",
                location = LatLng(48.434005475250004, 35.04834037274122),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(32, 34),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 34, name = "",
                location = LatLng(48.43394385662737, 35.048334673047066),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(33, 35),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 35, name = "",
                location = LatLng(48.43388601958503, 35.04832696169615),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(34, 36),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 36, name = "",
                location = LatLng(48.43385554388624, 35.04832427948713),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(35, 37),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 37, name = "",
                location = LatLng(48.43418810617998, 35.047517605125904),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(36, 38),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 38, name = "",
                location = LatLng(48.43418410209842, 35.04758331924677),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(37, 39),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 39, name = "",
                location = LatLng(48.43421279800931, 35.04758935421705),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(38, 40),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 40, name = "",
                location = LatLng(48.43424616532715, 35.04759304225445),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(39, 41),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 41, name = "",
                location = LatLng(48.434124485735644, 35.04758231341839),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(40, 42),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 42, name = "",
                location = LatLng(48.43405819581729, 35.04757259041071),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(41, 43),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 43, name = "",
                location = LatLng(48.43401570793823, 35.04757024347782),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(42, 44),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 44, name = "",
                location = LatLng(48.433976556772166, 35.04756756126881),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(43, 45),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 45, name = "",
                location = LatLng(48.43391760751631, 35.04756420850754),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(44, 46),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 46, name = "",
                location = LatLng(48.43382551307031, 35.04755046218634),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(45, 47),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 47, name = "",
                location = LatLng(48.433797484292725, 35.047548450529575),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(46, 48),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 48, name = "",
                location = LatLng(48.4337320837516, 35.04754342138767),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(47, 49),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 49, name = "",
                location = LatLng(48.43371851424102, 35.04754174500704),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(48, 50),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 50, name = "",
                location = LatLng(48.433691375208994, 35.047540068626404),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(49, 51),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 51, name = "",
                location = LatLng(48.43365778507552, 35.047535710036755),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(50, 52),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 52, name = "",
                location = LatLng(48.43360662125337, 35.04753168672323),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(51, 53),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 53, name = "",
                location = LatLng(48.43360194977139, 35.04762724041939),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(52, 54),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 54, name = "",
                location = LatLng(48.433607066156405, 35.047458596527576),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(53, 55),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 55, name = "",
                location = LatLng(48.43365911978323, 35.04746429622173),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(54, 56),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 56, name = "",
                location = LatLng(48.43365489320869, 35.04761751741171),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(55, 57),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 57, name = "",
                location = LatLng(48.433685813930154, 35.047622211277485),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(56, 58),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 58, name = "",
                location = LatLng(48.433716512181796, 35.047620199620724),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(57, 59),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 59, name = "",
                location = LatLng(48.433758777860184, 35.04759069532156),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(58, 60),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 60, name = "",
                location = LatLng(48.4337914781241, 35.047594383358955),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(59, 61),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 61, name = "",
                location = LatLng(48.43382284366359, 35.04759572446346),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(60, 62),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 62, name = "",
                location = LatLng(48.43385042752627, 35.04759673029184),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(61, 63),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 63, name = "",
                location = LatLng(48.43368870579523, 35.04749212414026),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(62, 64),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 64, name = "",
                location = LatLng(48.43373119394774, 35.04749983549118),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(63, 65),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 65, name = "",
                location = LatLng(48.433773237163145, 35.04750654101372),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(64, 66),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 66, name = "",
                location = LatLng(48.43380082105276, 35.04750955849886),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(65, 67),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 67, name = "",
                location = LatLng(48.43382796002634, 35.0475162640214),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(66, 68),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 68, name = "",
                location = LatLng(48.43385865819208, 35.0475162640214),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(67, 69),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 69, name = "",
                location = LatLng(48.43388512978389, 35.04759572446346),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(68, 70),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 70, name = "",
                location = LatLng(48.433914493214104, 35.04759807139635),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(69, 71),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 71, name = "",
                location = LatLng(48.433918274866755, 35.04752766340971),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(70, 72),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 72, name = "",
                location = LatLng(48.433943634177346, 35.04753168672323),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(71, 73),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 73, name = "",
                location = LatLng(48.43397566697258, 35.047534704208374),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(72, 74),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 74, name = "",
                location = LatLng(48.43397188532418, 35.04761449992657),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(73, 75),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 75, name = "",
                location = LatLng(48.434014150790155, 35.04762053489685),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(74, 76),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 76, name = "",
                location = LatLng(48.4340179324354, 35.04751659929752),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(75, 77),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 77, name = "",
                location = LatLng(48.434054859074145, 35.04762925207615),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(76, 78),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 78, name = "",
                location = LatLng(48.434061310110685, 35.0475162640214),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(77, 79),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 79, name = "",
                location = LatLng(48.43412315104015, 35.04752531647682),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(78, 80),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 80, name = "",
                location = LatLng(48.43418410209842, 35.04762925207615),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(79, 81),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 81, name = "",
                location = LatLng(48.43409578977491, 35.04762288182974),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(80, 82),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 82, name = "",
                location = LatLng(48.43421524494669, 35.047545433044434),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(81, 83),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 83, name = "",
                location = LatLng(48.43421724698628, 35.04749748855829),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(82, 84),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 84, name = "",
                location = LatLng(48.43424638777586, 35.04754912108183),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(83, 85),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 85, name = "",
                location = LatLng(48.43433381004433, 35.047598741948605),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(84, 86),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 86, name = "",
                location = LatLng(48.43424171635271, 35.04768054932356),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(85, 87),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 87, name = "",
                location = LatLng(48.434239491865334, 35.04774760454893),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(86, 88),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 88, name = "",
                location = LatLng(48.43420679188975, 35.047777108848095),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(87, 89),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 89, name = "",
                location = LatLng(48.43424483063486, 35.04778113216162),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(88, 90),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 90, name = "",
                location = LatLng(48.43420323270749, 35.04784818738699),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(89, 91),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 91, name = "",
                location = LatLng(48.43424305104508, 35.04785254597664),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(90, 92),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 92, name = "",
                location = LatLng(48.43419856128035, 35.04790619015694),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(91, 93),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 93, name = "",
                location = LatLng(48.43427352651143, 35.048058070242405),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(92, 94),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 94, name = "",
                location = LatLng(48.4342221408605, 35.04805102944374),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(93, 95),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 95, name = "",
                location = LatLng(48.43422436534864, 35.04799369722605),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(94, 96),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 96, name = "",
                location = LatLng(48.43419522454641, 35.047990679740906),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(95, 97),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 97, name = "",
                location = LatLng(48.434226367387865, 35.047940723598),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(96, 98),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 98, name = "",
                location = LatLng(48.43421791433278, 35.04686817526817),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(97, 99),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 99, name = "",
                location = LatLng(48.434218804128115, 35.046821907162666),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(98, 100),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 100, name = "",
                location = LatLng(48.43424972450641, 35.04682391881943),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(99, 101),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 101, name = "",
                location = LatLng(48.43427463875438, 35.04687421023846),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(100, 102),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 102, name = "",
                location = LatLng(48.4343006652325, 35.0468772277236),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(101, 103),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 103, name = "",
                location = LatLng(48.434302667268724, 35.04683464765549),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(102, 104),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 104, name = "",
                location = LatLng(48.43427419385719, 35.04691410809755),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(103, 105),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 105, name = "",
                location = LatLng(48.43424060410902, 35.04691410809755),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(104, 106),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 106, name = "",
                location = LatLng(48.434234820441525, 35.04708979278803),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(105, 107),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 107, name = "",
                location = LatLng(48.434269077539376, 35.047096498310566),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(106, 108),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 108, name = "",
                location = LatLng(48.43425995714545, 35.04722557961941),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(107, 109),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 109, name = "",
                location = LatLng(48.43422925922217, 35.047224909067154),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(108, 110),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 110, name = "",
                location = LatLng(48.43425751021021, 35.04728391766548),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(109, 111),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 111, name = "",
                location = LatLng(48.43422525514387, 35.04728123545647),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(110, 112),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 112, name = "",
                location = LatLng(48.43425595306954, 35.04731643944979),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(111, 113),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 113, name = "",
                location = LatLng(48.434224587797445, 35.04731375724077),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(112, 114),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 114, name = "",
                location = LatLng(48.43438230375688, 35.04692282527685),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(113, 115),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 115, name = "",
                location = LatLng(48.43421302045815, 35.04690874367952),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(114, 116),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 116, name = "",
                location = LatLng(48.43415117963808, 35.04690505564213),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(115, 117),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 117, name = "",
                location = LatLng(48.43415184698547, 35.04686616361141),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(116, 118),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 118, name = "",
                location = LatLng(48.43414339391799, 35.04686515778303),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(117, 119),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 119, name = "",
                location = LatLng(48.43412426328641, 35.046863816678524),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(118, 120),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 120, name = "",
                location = LatLng(48.43414428371463, 35.04682995378971),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(119, 121),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 121, name = "",
                location = LatLng(48.434209238827435, 35.04699222743511),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(120, 122),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 122, name = "",
                location = LatLng(48.43409111833789, 35.04689868539572),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(121, 123),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 123, name = "",
                location = LatLng(48.434093120382386, 35.046840347349644),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(122, 124),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 124, name = "",
                location = LatLng(48.43408666934988, 35.046967417001724),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(123, 125),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 125, name = "",
                location = LatLng(48.43405530397326, 35.04689734429121),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(124, 126),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 126, name = "",
                location = LatLng(48.43403995495211, 35.046894662082195),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(125, 127),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 127, name = "",
                location = LatLng(48.43405330192727, 35.04695400595665),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(126, 128),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 128, name = "",
                location = LatLng(48.43404418149461, 35.04683632403612),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(127, 129),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 129, name = "",
                location = LatLng(48.43392227896928, 35.04688326269388),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(128, 130),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 130, name = "",
                location = LatLng(48.433913158513114, 35.04688359797001),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(129, 131),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 131, name = "",
                location = LatLng(48.43391293606293, 35.0469446182251),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(130, 132),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 132, name = "",
                location = LatLng(48.43392383612015, 35.046817883849144),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(131, 133),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 133, name = "",
                location = LatLng(48.43386510925353, 35.046876557171345),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(132, 134),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 134, name = "",
                location = LatLng(48.433861105146505, 35.04698686301708),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(133, 135),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 135, name = "",
                location = LatLng(48.433806827220316, 35.04686985164881),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(134, 136),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 136, name = "",
                location = LatLng(48.433808606825366, 35.046810172498226),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(135, 137),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 137, name = "",
                location = LatLng(48.43380438026325, 35.046949312090874),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(136, 138),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 138, name = "",
                location = LatLng(48.4337583329585, 35.04686515778303),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(137, 139),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 139, name = "",
                location = LatLng(48.43376166972111, 35.04680313169956),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(138, 140),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 140, name = "",
                location = LatLng(48.43371628973075, 35.04686214029789),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(139, 141),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 141, name = "",
                location = LatLng(48.433715399926605, 35.04679575562477),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(140, 142),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 142, name = "",
                location = LatLng(48.43371339786723, 35.046935230493546),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(141, 143),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 143, name = "",
                location = LatLng(48.43366290145491, 35.04685711115599),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(142, 144),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 144, name = "",
                location = LatLng(48.43366334635744, 35.046898014843464),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(143, 145),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 145, name = "",
                location = LatLng(48.43363131336527, 35.0468960031867),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(144, 146),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 146, name = "",
                location = LatLng(48.43366112184475, 35.04679810255766),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(145, 147),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),

            // I поверх (4)

            NavModel(
                id = 147, name = "",
                location = LatLng(48.43423860207035, 35.04619192332029),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(146, 148),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 148, name = "",
                location = LatLng(48.4342383796216, 35.04615135490894),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(147, 149),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 149, name = "",
                location = LatLng(48.43427219181985, 35.04615303128958),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(148, 150),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 150, name = "",
                location = LatLng(48.43429955299013, 35.046156384050846),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(149, 151),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 151, name = "",
                location = LatLng(48.434331808009325, 35.046156384050846),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(150, 152),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 152, name = "",
                location = LatLng(48.43427174692264, 35.04619661718607),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(151, 153),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 153, name = "",
                location = LatLng(48.43427018978243, 35.04623584449291),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(152, 154),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 154, name = "",
                location = LatLng(48.434368734419955, 35.046195946633816),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(153, 155),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 155, name = "",
                location = LatLng(48.434367399730874, 35.04623953253031),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(154, 156),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 156, name = "",
                location = LatLng(48.43437563031292, 35.046121180057526),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(155, 157),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 157, name = "",
                location = LatLng(48.43430778358318, 35.046118162572384),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(156, 158),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 158, name = "",
                location = LatLng(48.43426084694005, 35.046464167535305),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(157, 159),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 159, name = "",
                location = LatLng(48.43425417348016, 35.04659492522478),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(158, 160),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 160, name = "",
                location = LatLng(48.434253283685464, 35.04663750529289),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(159, 161),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 161, name = "",
                location = LatLng(48.43428420404275, 35.046596601605415),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(160, 162),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 162, name = "",
                location = LatLng(48.43428487138841, 35.046638175845146),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(161, 163),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 163, name = "",
                location = LatLng(48.434241938801414, 35.0462331622839),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(162, 164),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 164, name = "",
                location = LatLng(48.434238824519085, 35.04628412425518),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(163, 165),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 165, name = "",
                location = LatLng(48.43418076536354, 35.04622779786587),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(164, 166),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 166, name = "",
                location = LatLng(48.43418143271055, 35.04615604877472),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(165, 167),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 167, name = "",
                location = LatLng(48.43415006739243, 35.04622310400009),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(166, 168),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 168, name = "",
                location = LatLng(48.43415251433284, 35.046152360737324),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(167, 169),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 169, name = "",
                location = LatLng(48.434145618409566, 35.04629049450159),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(168, 170),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 170, name = "",
                location = LatLng(48.43411447551862, 35.04622410982847),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(169, 171),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 171, name = "",
                location = LatLng(48.43411758980859, 35.04616744816303),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(170, 172),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 172, name = "",
                location = LatLng(48.43411336327216, 35.04629820585251),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(171, 173),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 173, name = "",
                location = LatLng(48.43408311015918, 35.04621773958206),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(172, 174),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 174, name = "",
                location = LatLng(48.434080885664855, 35.04628010094166),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(173, 175),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 175, name = "",
                location = LatLng(48.43408600200163, 35.04615403711796),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(174, 176),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 176, name = "",
                location = LatLng(48.43403261411427, 35.046213045716286),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(175, 177),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 177, name = "",
                location = LatLng(48.434027720221785, 35.04629451781511),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(176, 178),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 178, name = "",
                location = LatLng(48.43397722412185, 35.04620835185051),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(177, 179),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 179, name = "",
                location = LatLng(48.433979003720914, 35.046142637729645),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(178, 180),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 180, name = "",
                location = LatLng(48.43395208727803, 35.046203657984734),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(179, 181),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 181, name = "",
                location = LatLng(48.433893582894314, 35.04619963467121),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(180, 182),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 182, name = "",
                location = LatLng(48.43394875052793, 35.04624053835869),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(181, 183),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 183, name = "",
                location = LatLng(48.43390804215891, 35.04623718559742),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(182, 184),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 184, name = "",
                location = LatLng(48.433908264609094, 35.04628915339708),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(183, 185),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 185, name = "",
                location = LatLng(48.43394697092777, 35.04628982394934),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(184, 186),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 186, name = "",
                location = LatLng(48.4336924874647, 35.046269707381725),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(185, 187),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 187, name = "",
                location = LatLng(48.433693599720364, 35.04618253558874),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(186, 188),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 188, name = "",
                location = LatLng(48.43369693648722, 35.046132914721966),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(187, 189),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 189, name = "",
                location = LatLng(48.43366112184475, 35.04612922668457),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(188, 190),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 190, name = "",
                location = LatLng(48.43365778507552, 35.046176835894585),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(189, 191),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 191, name = "",
                location = LatLng(48.433655783013904, 35.04627104848623),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(190, 192),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            // I поверх (5)
            NavModel(
                id = 192, name = "",
                location = LatLng(48.43425595306954, 35.045502595603466),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(191, 193),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 193, name = "",
                location = LatLng(48.43425951224814, 35.04545766860247),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(192, 194),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 194, name = "",
                location = LatLng(48.4343055590987, 35.04546269774437),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(193, 195),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 195, name = "",
                location = LatLng(48.43429977543859, 35.0455042719841),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(194, 196),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 196, name = "",
                location = LatLng(48.43433136311262, 35.045506954193115),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(195, 197),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 197, name = "",
                location = LatLng(48.434297995850734, 35.045556239783764),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(196, 198),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 198, name = "",
                location = LatLng(48.43427063467964, 35.04555523395538),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(197, 199),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 199, name = "",
                location = LatLng(48.43420879392969, 35.045548528432846),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(198, 200),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 200, name = "",
                location = LatLng(48.43421235311157, 35.04549220204353),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(199, 201),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 201, name = "",
                location = LatLng(48.43426529591284, 35.04561357200146),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(200, 202),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 202, name = "",
                location = LatLng(48.43439787512265, 35.04556428641081),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(201, 203),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 203, name = "",
                location = LatLng(48.43439832001874, 35.04551500082016),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(202, 204),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 204, name = "",
                location = LatLng(48.43436272831884, 35.045513324439526),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(203, 205),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 205, name = "",
                location = LatLng(48.43429465912334, 35.045651122927666),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(204, 206),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 206, name = "",
                location = LatLng(48.43433469983763, 35.045654475688934),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(205, 207),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 207, name = "",
                location = LatLng(48.43428909791053, 35.04573930054903),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(206, 208),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 208, name = "",
                location = LatLng(48.43431801621051, 35.045742988586426),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(207, 209),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 209, name = "",
                location = LatLng(48.43431779376211, 35.0456977263093),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(208, 210),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 210, name = "",
                location = LatLng(48.43428398159421, 35.045921355485916),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(209, 211),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 211, name = "",
                location = LatLng(48.43431223255182, 35.04592403769493),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(210, 212),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 212, name = "",
                location = LatLng(48.43431156520656, 35.04596661776304),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(211, 213),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 213, name = "",
                location = LatLng(48.43428131221159, 35.045963265001774),
                locationIndex = NEW, floorIndex = 1,
                connexionWith = listOf(212, 214),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
        )
    }
    val navGraphNew2: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 367, name = "",
                location = LatLng(48.43413850003616, 35.04835043102503),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(366, 368),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 368, name = "",
                location = LatLng(48.43418387964943, 35.0483537837863),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(367, 369),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 369, name = "",
                location = LatLng(48.43418032046554, 35.04840072244406),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(368, 370),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 370, name = "",
                location = LatLng(48.434207459236404, 35.048403069376945),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(369, 371),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 371, name = "",
                location = LatLng(48.43412092654761, 35.04839368164539),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(370, 372),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 372, name = "",
                location = LatLng(48.43408911629334, 35.048392340540886),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(371, 373),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 373, name = "",
                location = LatLng(48.43406197745925, 35.04838965833187),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(372, 374),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 374, name = "",
                location = LatLng(48.43403127941636, 35.048385970294476),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(373, 375),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 375, name = "",
                location = LatLng(48.43400124870427, 35.0483812764287),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(374, 376),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 376, name = "",
                location = LatLng(48.43397233022401, 35.048380605876446),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(375, 377),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 377, name = "",
                location = LatLng(48.433944079077406, 35.04837792366743),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(376, 378),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 378, name = "",
                location = LatLng(48.433896474747584, 35.0483725592494),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(377, 379),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 379, name = "",
                location = LatLng(48.433882682830586, 35.048371218144894),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(378, 380),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 380, name = "",
                location = LatLng(48.43384998262537, 35.04836820065975),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(379, 381),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 381, name = "",
                location = LatLng(48.433824400817514, 35.04836484789848),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(380, 382),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 382, name = "",
                location = LatLng(48.433793035278995, 35.04836417734623),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(381, 383),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 383, name = "",
                location = LatLng(48.43378969851844, 35.04845704883337),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(382, 384),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 384, name = "",
                location = LatLng(48.433795037335244, 35.048283375799656),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(383, 385),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 385, name = "",
                location = LatLng(48.43382017425672, 35.04845201969147),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(384, 386),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 386, name = "",
                location = LatLng(48.433845311165776, 35.048451349139214),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(385, 387),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 387, name = "",
                location = LatLng(48.433853541832406, 35.048287734389305),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(386, 388),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 388, name = "",
                location = LatLng(48.4338920257425, 35.04845604300499),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(387, 389),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 389, name = "",
                location = LatLng(48.43388379508211, 35.048299469053745),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(388, 390),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 390, name = "",
                location = LatLng(48.43393896272631, 35.048464089632034),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(389, 391),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 391, name = "",
                location = LatLng(48.43396298732687, 35.048465095460415),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(390, 392),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 392, name = "",
                location = LatLng(48.43394786072786, 35.048292092978954),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(391, 393),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 393, name = "",
                location = LatLng(48.43397477717297, 35.04829376935959),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(392, 394),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 394, name = "",
                location = LatLng(48.4340023609532, 35.04829812794924),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(393, 395),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 395, name = "",
                location = LatLng(48.43399457521029, 35.04846878349781),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(394, 396),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 396, name = "",
                location = LatLng(48.434026163074066, 35.04846811294556),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(395, 397),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 397, name = "",
                location = LatLng(48.434028832470126, 35.04831254482269),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(396, 398),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 398, name = "",
                location = LatLng(48.43406397950489, 35.048311203718185),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(397, 399),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 399, name = "",
                location = LatLng(48.434057306019156, 35.048434250056744),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(398, 400),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 400, name = "",
                location = LatLng(48.434086446900466, 35.04843693226576),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(399, 401),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 401, name = "",
                location = LatLng(48.43409156323668, 35.048321932554245),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(400, 402),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 402, name = "",
                location = LatLng(48.43411492041721, 35.04848085343838),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(401, 403),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 403, name = "",
                location = LatLng(48.434145618409566, 35.04848353564739),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(402, 404),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 404, name = "",
                location = LatLng(48.434174314342165, 35.048488564789295),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(403, 405),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 405, name = "",
                location = LatLng(48.43420723678752, 35.048489570617676),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(404, 406),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 406, name = "",
                location = LatLng(48.43419211026123, 35.04810802638531),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(405, 407),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 407, name = "",
                location = LatLng(48.434225700041466, 35.04811406135559),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(406, 408),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 408, name = "",
                location = LatLng(48.43422414289983, 35.04817005246878),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(407, 409),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 409, name = "",
                location = LatLng(48.43422903677339, 35.048045329749584),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(408, 410),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 410, name = "",
                location = LatLng(48.43419967352495, 35.0479719042778),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(409, 411),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 411, name = "",
                location = LatLng(48.43423393064649, 35.047973580658436),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(410, 412),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 412, name = "",
                location = LatLng(48.434237712275376, 35.04789646714926),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(411, 413),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 413, name = "",
                location = LatLng(48.434242161250175, 35.047800578176975),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(412, 414),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 414, name = "",
                location = LatLng(48.43421413270242, 35.04767686128616),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(413, 415),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 415, name = "",
                location = LatLng(48.434242161250175, 35.04768155515194),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(414, 416),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 416, name = "",
                location = LatLng(48.43423926941658, 35.04774425178766),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(415, 417),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 417, name = "",
                location = LatLng(48.43424260614761, 35.04763629287481),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(416, 418),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 418, name = "",
                location = LatLng(48.43421591229322, 35.047588013112545),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(417, 419),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 419, name = "",
                location = LatLng(48.434218804128115, 35.047537721693516),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(418, 420),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 420, name = "",
                location = LatLng(48.43417631638338, 35.04753336310387),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(419, 421),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 421, name = "",
                location = LatLng(48.43424705512198, 35.0475886836648),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(420, 422),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 422, name = "",
                location = LatLng(48.43424705512198, 35.04754576832056),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(421, 423),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 423, name = "",
                location = LatLng(48.43427775303452, 35.047551803290844),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(422, 424),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 424, name = "",
                location = LatLng(48.43427753058594, 35.04759404808283),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(423, 425),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 425, name = "",
                location = LatLng(48.4343344773893, 35.047557502985),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(424, 426),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 426, name = "",
                location = LatLng(48.43433492228595, 35.04760142415762),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(425, 427),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 427, name = "",
                location = LatLng(48.43442634846486, 35.0475662201643),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(426, 428),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 428, name = "",
                location = LatLng(48.434426570912784, 35.04760812968016),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(427, 429),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 429, name = "",
                location = LatLng(48.43418343475146, 35.04758533090353),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(428, 430),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 430, name = "",
                location = LatLng(48.43412537553261, 35.047580637037754),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(429, 431),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 431, name = "",
                location = LatLng(48.434099571414066, 35.04757795482874),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(430, 432),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 432, name = "",
                location = LatLng(48.43406197745925, 35.0475749373436),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(431, 433),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 433, name = "",
                location = LatLng(48.434016375287406, 35.04756856709719),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(432, 434),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 434, name = "",
                location = LatLng(48.43390136865269, 35.047559179365635),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(433, 435),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 435, name = "",
                location = LatLng(48.43385799084084, 35.04755314439535),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(434, 436),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 436, name = "",
                location = LatLng(48.43382529061975, 35.04755146801472),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(435, 437),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 437, name = "",
                location = LatLng(48.43380771702283, 35.04754979163408),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(436, 438),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 438, name = "",
                location = LatLng(48.43377612902326, 35.04754677414894),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(437, 439),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 439, name = "",
                location = LatLng(48.43375010227642, 35.04754275083542),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(438, 440),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 440, name = "",
                location = LatLng(48.433715622377655, 35.04753973335028),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(439, 441),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 441, name = "",
                location = LatLng(48.43369159766014, 35.04753973335028),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(440, 442),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 442, name = "",
                location = LatLng(48.433644215545094, 35.047532357275486),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(441, 443),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 443, name = "",
                location = LatLng(48.43361018047746, 35.047530345618725),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(442, 444),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 444, name = "",
                location = LatLng(48.43360484164125, 35.04762254655361),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(443, 445),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 445, name = "",
                location = LatLng(48.43363843180973, 35.047621205449104),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(444, 446),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 446, name = "",
                location = LatLng(48.43368670373483, 35.04762388765812),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(445, 447),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 447, name = "",
                location = LatLng(48.4337118407099, 35.04763092845678),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(446, 448),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 448, name = "",
                location = LatLng(48.43382061915787, 35.04763226956129),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(447, 449),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 449, name = "",
                location = LatLng(48.43385509898542, 35.047635957598686),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(448, 450),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 450, name = "",
                location = LatLng(48.43389714209828, 35.04763998091221),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(449, 451),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 451, name = "",
                location = LatLng(48.43401303854151, 35.04764869809151),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(450, 452),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 452, name = "",
                location = LatLng(48.434060420312605, 35.04765473306179),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(451, 453),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 453, name = "",
                location = LatLng(48.434179653118555, 35.047662779688835),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(452, 454),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 454, name = "",
                location = LatLng(48.434127600025, 35.04750117659569),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(453, 455),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 455, name = "",
                location = LatLng(48.43410112855952, 35.0474988296628),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(454, 456),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 456, name = "",
                location = LatLng(48.43406486930292, 35.04749916493893),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(455, 457),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 457, name = "",
                location = LatLng(48.43402104673127, 35.04749480634928),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(456, 458),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 458, name = "",
                location = LatLng(48.43390270335402, 35.04748206585646),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(457, 459),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 459, name = "",
                location = LatLng(48.43385576633668, 35.047480054199696),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(458, 460),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 460, name = "",
                location = LatLng(48.433809941529105, 35.04747737199068),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(459, 461),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 461, name = "",
                location = LatLng(48.433777908629374, 35.04747737199068),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(460, 462),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 462, name = "",
                location = LatLng(48.43375232678522, 35.04747435450554),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(461, 463),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 463, name = "",
                location = LatLng(48.433722295908275, 35.04747066646814),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(462, 464),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 464, name = "",
                location = LatLng(48.4336924874647, 35.04746798425913),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(463, 465),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 465, name = "",
                location = LatLng(48.433644215545094, 35.04746127873659),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(464, 466),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 466, name = "",
                location = LatLng(48.43422236330931, 35.04745490849018),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(465, 467),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 467, name = "",
                location = LatLng(48.43426618570734, 35.047455579042435),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(466, 468),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 468, name = "",
                location = LatLng(48.43422703473426, 35.047360360622406),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(467, 469),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 469, name = "",
                location = LatLng(48.43422703473426, 35.04731643944979),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(468, 470),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 470, name = "",
                location = LatLng(48.43425995714545, 35.047362707555294),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(469, 471),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 471, name = "",
                location = LatLng(48.43426040204276, 35.04741031676531),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(470, 472),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 472, name = "",
                location = LatLng(48.43426284897785, 35.04732180386782),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(471, 473),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 473, name = "",
                location = LatLng(48.43423259595387, 35.04722658544779),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(472, 474),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 474, name = "",
                location = LatLng(48.43426529591284, 35.0472292676568),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(473, 475),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 475, name = "",
                location = LatLng(48.43426440611832, 35.04727452993393),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(474, 476),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 476, name = "",
                location = LatLng(48.43426618570734, 35.047180987894535),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(475, 477),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 477, name = "",
                location = LatLng(48.43423593268534, 35.04712164402008),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(476, 478),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 478, name = "",
                location = LatLng(48.43427508365156, 35.047127678990364),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(477, 479),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 479, name = "",
                location = LatLng(48.43424060410902, 35.04700027406216),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(478, 480),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 480, name = "",
                location = LatLng(48.434272414268456, 35.047003626823425),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(479, 481),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 481, name = "",
                location = LatLng(48.434243940839984, 35.04695601761341),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(480, 482),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 482, name = "",
                location = LatLng(48.43427130202546, 35.04696004092693),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(481, 483),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 483, name = "",
                location = LatLng(48.43427041223104, 35.04703480750322),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(482, 484),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 484, name = "",
                location = LatLng(48.43429955299013, 35.04703648388386),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(483, 485),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 485, name = "",
                location = LatLng(48.43424438573742, 35.04691142588854),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(484, 486),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 486, name = "",
                location = LatLng(48.43424638777586, 35.046860463917255),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(485, 487),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 487, name = "",
                location = LatLng(48.43420145311626, 35.04685912281275),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(486, 488),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 488, name = "",
                location = LatLng(48.434276640791644, 35.04691444337368),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(487, 489),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 489, name = "",
                location = LatLng(48.4343068937894, 35.04691679030657),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(488, 490),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 490, name = "",
                location = LatLng(48.4343055590987, 35.04687990993261),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(489, 491),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 491, name = "",
                location = LatLng(48.43439587309016, 35.046890303492546),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(490, 492),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 492, name = "",
                location = LatLng(48.434394315953746, 35.046928860247135),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(491, 493),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 493, name = "",
                location = LatLng(48.43444303205641, 35.04693288356066),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(492, 494),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 494, name = "",
                location = LatLng(48.434398764914825, 35.046872198581696),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(493, 495),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 495, name = "",
                location = LatLng(48.43443858309919, 35.0468735396862),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(494, 496),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 496, name = "",
                location = LatLng(48.43425217144203, 35.046772956848145),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(495, 497),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 497, name = "",
                location = LatLng(48.43429599381434, 35.04677664488554),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(496, 498),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 498, name = "",
                location = LatLng(48.43415585106957, 35.046905390918255),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(497, 499),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 499, name = "",
                location = LatLng(48.434153849027545, 35.04697177559137),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(498, 500),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 500, name = "",
                location = LatLng(48.43415807556058, 35.04684302955866),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(499, 501),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 501, name = "",
                location = LatLng(48.43409000609092, 35.046900026500225),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(500, 502),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 502, name = "",
                location = LatLng(48.434086446900466, 35.04698317497969),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(501, 503),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 503, name = "",
                location = LatLng(48.43409200813544, 35.04682224243879),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(502, 504),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 504, name = "",
                location = LatLng(48.43405530397326, 35.04689700901508),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(503, 505),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 505, name = "",
                location = LatLng(48.434040622300955, 35.04689332097769),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(504, 506),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 506, name = "",
                location = LatLng(48.433992128262275, 35.04688795655966),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(505, 507),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 507, name = "",
                location = LatLng(48.43397366492346, 35.046883933246136),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(506, 508),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 508, name = "",
                location = LatLng(48.433925170820885, 35.046878568828106),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(507, 509),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 509, name = "",
                location = LatLng(48.43387445216869, 35.04687588661909),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(508, 510),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 510, name = "",
                location = LatLng(48.433810608880975, 35.046871192753315),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(509, 511),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 511, name = "",
                location = LatLng(48.43371851424102, 35.046861469745636),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(510, 512),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 512, name = "",
                location = LatLng(48.43366712802879, 35.046855099499226),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(511, 513),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 513, name = "",
                location = LatLng(48.43366201164983, 35.04693824797869),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(512, 514),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 514, name = "",
                location = LatLng(48.43366801783377, 35.046777315437794),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(513, 515),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 515, name = "",
                location = LatLng(48.433715844828676, 35.04694025963545),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(514, 516),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 516, name = "",
                location = LatLng(48.43372029384918, 35.046783685684204),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(515, 517),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 517, name = "",
                location = LatLng(48.43380838437475, 35.04695501178503),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(516, 518),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 518, name = "",
                location = LatLng(48.43381083133159, 35.04679508507252),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(517, 519),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 519, name = "",
                location = LatLng(48.43386822355876, 35.04698719829321),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(518, 520),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 520, name = "",
                location = LatLng(48.433877121572685, 35.04678536206484),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(519, 521),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 521, name = "",
                location = LatLng(48.43396765877565, 35.04697848111391),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(520, 522),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 523, name = "",
                location = LatLng(48.433926505521576, 35.04681318998337),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(522, 524),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 524, name = "",
                location = LatLng(48.433991016013145, 35.04681721329689),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(523, 525),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 525, name = "",
                location = LatLng(48.434042401897806, 35.04682559520006),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(524, 526),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 526, name = "",
                location = LatLng(48.434052634578606, 35.046970434486866),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(525, 527),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 527, name = "",
                location = LatLng(48.434256842864215, 35.046629793941975),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(526, 528),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 528, name = "",
                location = LatLng(48.4342619591833, 35.046542286872864),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(527, 529),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 529, name = "",
                location = LatLng(48.43426418366966, 35.046499371528625),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(528, 530),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 530, name = "",
                location = LatLng(48.43426507346421, 35.04645276814699),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(529, 531),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 531, name = "",
                location = LatLng(48.43426663060457, 35.04640884697437),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(530, 532),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 532, name = "",
                location = LatLng(48.43427285916564, 35.04627909511328),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(531, 533),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 533, name = "",
                location = LatLng(48.43427419385719, 35.04623416811228),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(532, 534),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 534, name = "",
                location = LatLng(48.43427641834304, 35.04618689417839),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(533, 535),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 535, name = "",
                location = LatLng(48.434231261261225, 35.046182200312614),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(534, 536),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 536, name = "",
                location = LatLng(48.434312455000274, 35.04628177732229),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(535, 537),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 537, name = "",
                location = LatLng(48.43426929998798, 35.0463280454278),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(536, 538),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 538, name = "",
                location = LatLng(48.43431201010342, 35.04633542150259),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(537, 539),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 539, name = "",
                location = LatLng(48.43430867337694, 35.04641521722078),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(538, 540),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 540, name = "",
                location = LatLng(48.434309118273816, 35.04645813256502),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(539, 541),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 541, name = "",
                location = LatLng(48.43430867337694, 35.04650138318539),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(540, 542),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 542, name = "",
                location = LatLng(48.43430711623785, 35.04654664546251),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(541, 543),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 543, name = "",
                location = LatLng(48.434300220335544, 35.04663348197937),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(542, 544),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 544, name = "",
                location = LatLng(48.434304446856416, 35.046189576387405),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(543, 545),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 545, name = "",
                location = LatLng(48.43430422440797, 35.046166107058525),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(544, 546),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 546, name = "",
                location = LatLng(48.43438630782281, 35.04624456167221),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(545, 547),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 547, name = "",
                location = LatLng(48.43444926059582, 35.04624992609024),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(546, 548),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 548, name = "",
                location = LatLng(48.434450150387114, 35.04619359970093),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(547, 549),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 549, name = "",
                location = LatLng(48.43438252620498, 35.04617113620043),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(548, 550),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 550, name = "",
                location = LatLng(48.43423593268534, 35.046234503388405),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(549, 551),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 551, name = "",
                location = LatLng(48.43423237350509, 35.04632569849491),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(550, 552),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 552, name = "",
                location = LatLng(48.43418365720045, 35.0462294742465),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(551, 553),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 553, name = "",
                location = LatLng(48.434156295967774, 35.04622511565685),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(552, 554),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 554, name = "",
                location = LatLng(48.43411847960567, 35.04622243344784),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(553, 555),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 555, name = "",
                location = LatLng(48.4338842399827, 35.046200305223465),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(554, 556),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 556, name = "",
                location = LatLng(48.43386332965047, 35.04619762301445),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(555, 557),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 557, name = "",
                location = LatLng(48.4338332988391, 35.04619427025318),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(556, 558),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 558, name = "",
                location = LatLng(48.43377345961394, 35.04618991166353),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(557, 559),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 559, name = "",
                location = LatLng(48.43374587570946, 35.04618622362614),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(558, 560),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 560, name = "",
                location = LatLng(48.43370071815608, 35.04618287086487),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(559, 561),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 561, name = "",
                location = LatLng(48.43366490351625, 35.04618018865585),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(560, 562),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 562, name = "",
                location = LatLng(48.433663123906165, 35.046270713210106),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(561, 563),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 563, name = "",
                location = LatLng(48.4337438736513, 35.046274065971375),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(562, 564),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 564, name = "",
                location = LatLng(48.43370160796048, 35.046110451221466),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(563, 565),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 565, name = "",
                location = LatLng(48.433747877767544, 35.04611648619175),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(564, 566),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 566, name = "",
                location = LatLng(48.43377034530288, 35.046266689896584),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(565, 567),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 567, name = "",
                location = LatLng(48.43383507844323, 35.046152360737324),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(566, 568),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 568, name = "",
                location = LatLng(48.43386332965047, 35.046154372394085),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(567, 569),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 569, name = "",
                location = LatLng(48.43388134812875, 35.046282447874546),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(568, 570),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 570, name = "",
                location = LatLng(48.433913158513114, 35.04628613591194),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(569, 571),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 571, name = "",
                location = LatLng(48.43391048911097, 35.046136267483234),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(570, 572),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 572, name = "",
                location = LatLng(48.433952309728035, 35.04629485309124),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(571, 573),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 573, name = "",
                location = LatLng(48.43395920567754, 35.04613324999809),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(572, 574),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 574, name = "",
                location = LatLng(48.43407043054029, 35.046303905546665),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(573, 575),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 575, name = "",
                location = LatLng(48.434072655035045, 35.04613861441612),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(574, 576),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 576, name = "",
                location = LatLng(48.434115142866496, 35.04630323499441),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(575, 577),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 577, name = "",
                location = LatLng(48.43412025919981, 35.04614531993866),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(576, 578),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 578, name = "",
                location = LatLng(48.4341827674045, 35.04632268100977),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(577, 579),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 579, name = "",
                location = LatLng(48.43414940004501, 35.04631966352463),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(578, 580),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 580, name = "",
                location = LatLng(48.43415518372223, 35.046137273311615),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(579, 581),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 581, name = "",
                location = LatLng(48.434190553118576, 35.04614531993866),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(580, 582),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 582, name = "",
                location = LatLng(48.4342793101745, 35.04608899354935),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(581, 583),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 583, name = "",
                location = LatLng(48.43432068559123, 35.04609368741512),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(582, 584),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 584, name = "",
                location = LatLng(48.434283314248574, 35.04604909569025),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(583, 585),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 585, name = "",
                location = LatLng(48.43431334479393, 35.04605043679476),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(584, 586),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 586, name = "",
                location = LatLng(48.43431690396851, 35.04601523280144),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(585, 587),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 587, name = "",
                location = LatLng(48.434284426491296, 35.04596561193466),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(586, 588),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 588, name = "",
                location = LatLng(48.4343164590717, 35.04596661776304),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(587, 589),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 589, name = "",
                location = LatLng(48.43431846110732, 35.04591330885887),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(588, 590),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 590, name = "",
                location = LatLng(48.434291989741276, 35.04586469382048),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(589, 591),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 591, name = "",
                location = LatLng(48.43433025087092, 35.04586737602949),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(590, 592),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 592, name = "",
                location = LatLng(48.43429577136583, 35.04577685147524),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(591, 593),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 593, name = "",
                location = LatLng(48.434329805974244, 35.04577685147524),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(592, 594),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 594, name = "",
                location = LatLng(48.43429510402035, 35.04573192447424),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(593, 595),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 595, name = "",
                location = LatLng(48.43433358759597, 35.04573326557875),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(594, 596),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 596, name = "",
                location = LatLng(48.43429999788709, 35.045689679682255),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(595, 597),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 597, name = "",
                location = LatLng(48.43432891618084, 35.04569001495838),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(596, 598),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 598, name = "",
                location = LatLng(48.43433025087092, 35.04564709961414),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(597, 599),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 599, name = "",
                location = LatLng(48.43429955299013, 35.04564441740513),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(598, 600),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 600, name = "",
                location = LatLng(48.43430244482027, 35.04560183733702),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(599, 601),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 601, name = "",
                location = LatLng(48.43433136311262, 35.04560183733702),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(600, 602),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 602, name = "",
                location = LatLng(48.43430199992331, 35.045557245612144),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(601, 603),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 603, name = "",
                location = LatLng(48.43430466930487, 35.04550527781248),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(602, 604),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 604, name = "",
                location = LatLng(48.4342581775562, 35.04550024867058),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(603, 605),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 605, name = "",
                location = LatLng(48.434272414268456, 35.04555456340313),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(604, 606),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 606, name = "",
                location = LatLng(48.43426841019354, 35.0456216186285),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(605, 607),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 607, name = "",
                location = LatLng(48.43421124086725, 35.0455491989851),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(606, 608),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 608, name = "",
                location = LatLng(48.43418321230247, 35.04554584622383),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(607, 609),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 609, name = "",
                location = LatLng(48.43418521434333, 35.0454767793417),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(608, 610),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 610, name = "",
                location = LatLng(48.43421435515128, 35.04547744989395),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(609, 611),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 611, name = "",
                location = LatLng(48.43436272831884, 35.04556529223919),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(610, 612),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 612, name = "",
                location = LatLng(48.43442100971442, 35.045563615858555),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(611, 613),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 613, name = "",
                location = LatLng(48.43447083803011, 35.04556830972433),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(612, 614),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 614, name = "",
                location = LatLng(48.434423901537635, 35.04550326615572),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(613, 615),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 615, name = "",
                location = LatLng(48.43436450790443, 35.04552271217108),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(614, 616),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 616, name = "",
                location = LatLng(48.43433425494098, 35.04552002996206),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(615, 617),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 617, name = "",
                location = LatLng(48.43439676288239, 35.04552271217108),
                locationIndex = NEW, floorIndex = 2,
                connexionWith = listOf(616, 618),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
        )
    }
    val navGraphNew3: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 620, name = "",
                location = LatLng(48.43414005718044, 35.04835311323404),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(619, 621),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 621, name = "",
                location = LatLng(48.43418521434333, 35.04835847765207),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(620, 622),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 622, name = "",
                location = LatLng(48.43418098781255, 35.04840474575758),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(621, 623),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 623, name = "",
                location = LatLng(48.43412493063413, 35.048397704958916),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(622, 624),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 624, name = "",
                location = LatLng(48.43408822649572, 35.04839636385441),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(623, 625),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 625, name = "",
                location = LatLng(48.43406442440391, 35.04839200526476),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(624, 626),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 626, name = "",
                location = LatLng(48.434052634578606, 35.048390328884125),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(625, 627),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 627, name = "",
                location = LatLng(48.43403639575812, 35.048389323055744),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(626, 628),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 628, name = "",
                location = LatLng(48.43400992424516, 35.0483863055706),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(627, 629),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 629, name = "",
                location = LatLng(48.43394897297794, 35.0483812764287),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(628, 630),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 630, name = "",
                location = LatLng(48.433918274866755, 35.048378594219685),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(629, 631),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 631, name = "",
                location = LatLng(48.433888244087896, 35.04837725311518),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(630, 632),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 632, name = "",
                location = LatLng(48.43385865819208, 35.04837088286877),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(631, 633),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 633, name = "",
                location = LatLng(48.433798596546104, 35.048366859555244),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(632, 634),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 634, name = "",
                location = LatLng(48.433790810771974, 35.04845671355724),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(633, 635),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 635, name = "",
                location = LatLng(48.433851317328035, 35.04846643656492),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(634, 636),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 636, name = "",
                location = LatLng(48.433882682830586, 35.04846677184105),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(635, 637),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 637, name = "",
                location = LatLng(48.43391627281539, 35.04846911877394),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(636, 638),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 638, name = "",
                location = LatLng(48.43399969155577, 35.04847951233387),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(637, 639),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 639, name = "",
                location = LatLng(48.43402994471842, 35.04848152399063),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(638, 640),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 640, name = "",
                location = LatLng(48.434059530514496, 35.048484206199646),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(639, 641),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 641, name = "",
                location = LatLng(48.434085779552206, 35.048438273370266),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(640, 642),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 642, name = "",
                location = LatLng(48.43412292859091, 35.048441626131535),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(641, 643),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 643, name = "",
                location = LatLng(48.43415162453633, 35.048437267541885),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(642, 644),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 644, name = "",
                location = LatLng(48.43418410209842, 35.0484399497509),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(643, 645),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 645, name = "",
                location = LatLng(48.43421813678164, 35.04844296723604),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(644, 646),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 646, name = "",
                location = LatLng(48.43380082105276, 35.048310197889805),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(645, 647),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 647, name = "",
                location = LatLng(48.4338900236901, 35.04831489175558),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(646, 648),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 648, name = "",
                location = LatLng(48.43395030767799, 35.04832327365875),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(647, 649),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 649, name = "",
                location = LatLng(48.43401059159439, 35.04832796752453),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(648, 650),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 650, name = "",
                location = LatLng(48.434054859074145, 35.04833433777094),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(649, 651),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 651, name = "",
                location = LatLng(48.434092453034225, 35.04833433777094),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(650, 652),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 652, name = "",
                location = LatLng(48.434247500019396, 35.048363506793976),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(651, 653),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 653, name = "",
                location = LatLng(48.434304446856416, 35.04836719483137),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(652, 654),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 654, name = "",
                location = LatLng(48.43431112030971, 35.04823878407478),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(653, 655),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 655, name = "",
                location = LatLng(48.43419388985279, 35.048224702477455),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(654, 656),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 656, name = "",
                location = LatLng(48.43419522454641, 35.048173405230045),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(655, 657),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 657, name = "",
                location = LatLng(48.43419900617819, 35.04809159785509),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(656, 658),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 658, name = "",
                location = LatLng(48.43420123066735, 35.04799772053957),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(657, 659),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 659, name = "",
                location = LatLng(48.43420701433864, 35.047905184328556),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(658, 660),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 660, name = "",
                location = LatLng(48.43421168576499, 35.04781700670719),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(659, 661),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 661, name = "",
                location = LatLng(48.43421368780473, 35.04777409136295),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(660, 662),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 662, name = "",
                location = LatLng(48.43421502249783, 35.04768490791321),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(661, 663),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 663, name = "",
                location = LatLng(48.4342221408605, 35.04759505391121),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(662, 664),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 664, name = "",
                location = LatLng(48.434221028616406, 35.047552809119225),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(663, 665),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 665, name = "",
                location = LatLng(48.4341687531162, 35.04754442721605),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(664, 666),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 666, name = "",
                location = LatLng(48.434250169403825, 35.0475937128067),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(665, 667),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 667, name = "",
                location = LatLng(48.434308228480056, 35.04759941250086),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(666, 668),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 668, name = "",
                location = LatLng(48.43438853230375, 35.047607123851776),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(667, 669),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 669, name = "",
                location = LatLng(48.43429777340226, 35.047532357275486),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(668, 670),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 670, name = "",
                location = LatLng(48.43425194899335, 35.04752900451422),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(669, 671),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 671, name = "",
                location = LatLng(48.43424905716034, 35.04764266312122),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(670, 672),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 672, name = "",
                location = LatLng(48.434245720429736, 35.04768390208483),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(671, 673),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 673, name = "",
                location = LatLng(48.434245720429736, 35.04773285239935),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(672, 674),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 674, name = "",
                location = LatLng(48.434247500019396, 35.04777308553457),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(673, 675),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 675, name = "",
                location = LatLng(48.434247277570684, 35.047819688916206),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(674, 676),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 676, name = "",
                location = LatLng(48.43424460818613, 35.0479082018137),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(675, 677),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 677, name = "",
                location = LatLng(48.434240159211555, 35.04800342023373),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(676, 678),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 678, name = "",
                location = LatLng(48.434236377582856, 35.04809595644474),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(677, 679),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 679, name = "",
                location = LatLng(48.43423215105633, 35.04817944020033),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(678, 680),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 680, name = "",
                location = LatLng(48.43418499189434, 35.047591365873814),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(679, 681),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 681, name = "",
                location = LatLng(48.43412848982191, 35.047584660351276),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(680, 682),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 682, name = "",
                location = LatLng(48.43410135100886, 35.04758130759001),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(681, 683),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 683, name = "",
                location = LatLng(48.43406308970686, 35.04757896065712),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(682, 684),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 684, name = "",
                location = LatLng(48.4340355059596, 35.04757795482874),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(683, 685),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 685, name = "",
                location = LatLng(48.43402060183187, 35.04757460206747),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(684, 686),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 686, name = "",
                location = LatLng(48.433920944268465, 35.04756588488817),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(685, 687),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 687, name = "",
                location = LatLng(48.4338931379938, 35.04756387323141),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(686, 688),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 688, name = "",
                location = LatLng(48.43385220712979, 35.047558173537254),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(687, 689),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 689, name = "",
                location = LatLng(48.4338041578126, 35.04755515605211),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(688, 690),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 690, name = "",
                location = LatLng(48.433781912742965, 35.047551803290844),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(689, 691),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 690, name = "",
                location = LatLng(48.43377968823547, 35.04755012691021),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(689, 691),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 691, name = "",
                location = LatLng(48.433693599720364, 35.04754174500704),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(690, 692),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 692, name = "",
                location = LatLng(48.4336117376379, 35.04753302782774),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(691, 693),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 693, name = "",
                location = LatLng(48.433602172222926, 35.04762690514326),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(692, 694),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 694, name = "",
                location = LatLng(48.43368803844178, 35.04762690514326),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(693, 695),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 695, name = "",
                location = LatLng(48.433794147532474, 35.047634951770306),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(694, 696),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 696, name = "",
                location = LatLng(48.43384775812087, 35.04763964563608),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(695, 697),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 697, name = "",
                location = LatLng(48.43388868898844, 35.0476423278451),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(696, 698),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 698, name = "",
                location = LatLng(48.434023493677905, 35.047656409442425),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(697, 699),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 699, name = "",
                location = LatLng(48.434055971321875, 35.047664791345596),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(698, 700),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 700, name = "",
                location = LatLng(48.434118257156385, 35.047667138278484),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(699, 701),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 701, name = "",
                location = LatLng(48.434177651077476, 35.0476698204875),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(700, 702),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 702, name = "",
                location = LatLng(48.434128044923455, 35.047508887946606),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(701, 703),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 703, name = "",
                location = LatLng(48.43410068366081, 35.047503523528576),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(702, 704),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 704, name = "",
                location = LatLng(48.43406931829286, 35.04748776555061),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(703, 705),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 705, name = "",
                location = LatLng(48.43401993448277, 35.047485418617725),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(704, 706),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 706, name = "",
                location = LatLng(48.433920276918066, 35.04748038947582),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(705, 707),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 707, name = "",
                location = LatLng(48.43389224819276, 35.047478042542934),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(706, 708),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 708, name = "",
                location = LatLng(48.433782802545934, 35.04747435450554),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(707, 709),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 709, name = "",
                location = LatLng(48.433721851006254, 35.04747334867716),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(708, 710),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 710, name = "",
                location = LatLng(48.43369115275787, 35.04747100174427),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(709, 711),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 711, name = "",
                location = LatLng(48.43422303065576, 35.04740796983242),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(710, 712),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 712, name = "",
                location = LatLng(48.434225700041466, 35.0473191216588),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(711, 713),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 713, name = "",
                location = LatLng(48.43423059391487, 35.04722759127617),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(712, 714),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 714, name = "",
                location = LatLng(48.43423926941658, 35.04705224186182),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(713, 715),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 715, name = "",
                location = LatLng(48.434240159211555, 35.04701033234596),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(714, 716),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 716, name = "",
                location = LatLng(48.43424527553227, 35.04691444337368),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(715, 717),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 717, name = "",
                location = LatLng(48.434245497981, 35.046864822506905),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(716, 718),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 718, name = "",
                location = LatLng(48.434197671484654, 35.04685912281275),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(717, 719),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 719, name = "",
                location = LatLng(48.43427753058594, 35.04691544920206),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(718, 720),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 720, name = "",
                location = LatLng(48.434281534660144, 35.0468510761857),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(719, 721),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 721, name = "",
                location = LatLng(48.4343344773893, 35.046854093670845),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(720, 722),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 722, name = "",
                location = LatLng(48.43435939159569, 35.046924501657486),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(721, 723),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 723, name = "",
                location = LatLng(48.43443769330769, 35.04692416638136),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(722, 724),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 724, name = "",
                location = LatLng(48.43428531628549, 35.047014355659485),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(723, 725),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 725, name = "",
                location = LatLng(48.43428487138841, 35.047059282660484),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(724, 726),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 726, name = "",
                location = LatLng(48.43427308161424, 35.04722859710455),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(725, 727),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 727, name = "",
                location = LatLng(48.43425862245351, 35.04732146859169),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(726, 728),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 728, name = "",
                location = LatLng(48.43425751021021, 35.0472778826952),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(727, 729),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 729, name = "",
                location = LatLng(48.43425306123676, 35.047411657869816),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(728, 730),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 730, name = "",
                location = LatLng(48.43415162453633, 35.046907402575016),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(729, 731),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 735, name = "",
                location = LatLng(48.434053969275936, 35.04690036177635),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(734, 736),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 736, name = "",
                location = LatLng(48.434024605926325, 35.04689432680607),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(735, 737),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 737, name = "",
                location = LatLng(48.43400614259931, 35.0468909740448),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(736, 738),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 738, name = "",
                location = LatLng(48.433955424027914, 35.046887286007404),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(737, 739),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 739, name = "",
                location = LatLng(48.43389046859064, 35.04688125103712),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(738, 740),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 740, name = "",
                location = LatLng(48.43384175195818, 35.046875551342964),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(739, 741),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 741, name = "",
                location = LatLng(48.433773904515505, 35.0468735396862),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(740, 742),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 742, name = "",
                location = LatLng(48.43371384276932, 35.04686314612627),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(741, 743),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 743, name = "",
                location = LatLng(48.43368314451608, 35.046860463917255),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(742, 744),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 744, name = "",
                location = LatLng(48.43363175826807, 35.04685677587986),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(743, 745),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 745, name = "",
                location = LatLng(48.43362953375401, 35.04693891853094),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(744, 746),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 746, name = "",
                location = LatLng(48.43367713833395, 35.046937577426434),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(745, 747),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 747, name = "",
                location = LatLng(48.43377256981079, 35.04694662988186),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(746, 748),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 748, name = "",
                location = LatLng(48.433831519234914, 35.04698049277067),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(747, 749),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 749, name = "",
                location = LatLng(48.433880235877176, 35.046958699822426),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(748, 750),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 750, name = "",
                location = LatLng(48.43401926713367, 35.046968422830105),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(749, 751),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 751, name = "",
                location = LatLng(48.434050854982104, 35.0469721108675),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(750, 752),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 752, name = "",
                location = LatLng(48.434114697967914, 35.046980157494545),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(751, 753),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 753, name = "",
                location = LatLng(48.43412315104015, 35.04686716943979),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(752, 754),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 754, name = "",
                location = LatLng(48.434093565281145, 35.046863816678524),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(753, 755),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 755, name = "",
                location = LatLng(48.43411024898197, 35.0468185544014),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(754, 756),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 756, name = "",
                location = LatLng(48.43405819581729, 35.04682391881943),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(755, 757),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 757, name = "",
                location = LatLng(48.43401192629283, 35.04682458937168),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(756, 758),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 758, name = "",
                location = LatLng(48.43395965057747, 35.04681821912527),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(757, 759),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 759, name = "",
                location = LatLng(48.43389469514559, 35.046814531087875),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(758, 760),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 760, name = "",
                location = LatLng(48.433846645868556, 35.04680313169956),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(759, 761),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 761, name = "",
                location = LatLng(48.433774349417064, 35.04680044949055),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(760, 762),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 762, name = "",
                location = LatLng(48.433715622377655, 35.04679676145315),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(761, 763),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 763, name = "",
                location = LatLng(48.43362953375401, 35.046787708997726),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(762, 764),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 764, name = "",
                location = LatLng(48.434219026576976, 35.04671461880207),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(763, 765),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 765, name = "",
                location = LatLng(48.43422414289983, 35.04662610590458),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(764, 766),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 766, name = "",
                location = LatLng(48.43422592249027, 35.046539939939976),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(765, 767),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 767, name = "",
                location = LatLng(48.43422970411974, 35.046450421214104),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(766, 768),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 768, name = "",
                location = LatLng(48.434234820441525, 35.04636291414499),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(767, 769),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 769, name = "",
                location = LatLng(48.434239046967846, 35.0462831184268),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(768, 770),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 770, name = "",
                location = LatLng(48.43423926941658, 35.046235509216785),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(769, 771),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 771, name = "",
                location = LatLng(48.43424127145524, 35.046192929148674),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(770, 772),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 772, name = "",
                location = LatLng(48.43419589189322, 35.04618387669325),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(771, 773),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 773, name = "",
                location = LatLng(48.43438919964802, 35.04625126719475),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(772, 774),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 774, name = "",
                location = LatLng(48.434392758817275, 35.04618052393198),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(773, 775),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 775, name = "",
                location = LatLng(48.43444169736928, 35.04625294357538),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(774, 776),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 776, name = "",
                location = LatLng(48.43444369939993, 35.0461882352829),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(775, 777),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 777, name = "",
                location = LatLng(48.43428108976303, 35.04628747701645),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(776, 778),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 778, name = "",
                location = LatLng(48.43427730813736, 35.046368949115276),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(777, 779),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 779, name = "",
                location = LatLng(48.434275528548724, 35.04645545035601),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(778, 780),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 780, name = "",
                location = LatLng(48.43425995714545, 35.04649233072996),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(779, 781),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 781, name = "",
                location = LatLng(48.43425840000486, 35.04654295742512),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(780, 782),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 782, name = "",
                location = LatLng(48.43428687342524, 35.04654262214899),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(781, 783),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 783, name = "",
                location = LatLng(48.43426173673465, 35.04662744700909),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(782, 784),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 784, name = "",
                location = LatLng(48.43425550817223, 35.04671864211559),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(783, 785),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 731, name = "",
                location = LatLng(48.434239046967846, 35.04623718559742),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(730, 732),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 785, name = "",
                location = LatLng(48.43418165515954, 35.04622846841812),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(784, 786),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 786, name = "",
                location = LatLng(48.43415140208722, 35.046224780380726),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(785, 787),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 787, name = "",
                location = LatLng(48.43411781225785, 35.04622310400009),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(786, 788),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 788, name = "",
                location = LatLng(48.43408778159691, 35.046219415962696),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(787, 789),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 789, name = "",
                location = LatLng(48.4340328365639, 35.0462157279253),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(788, 790),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 790, name = "",
                location = LatLng(48.43395698117779, 35.04620902240276),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(789, 791),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 791, name = "",
                location = LatLng(48.433918274866755, 35.04620533436537),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(790, 792),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 792, name = "",
                location = LatLng(48.433861772497714, 35.04619896411896),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(791, 793),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 793, name = "",
                location = LatLng(48.43383396619066, 35.04619359970093),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(792, 794),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 794, name = "",
                location = LatLng(48.43377368206471, 35.04618924111128),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(793, 795),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 795, name = "",
                location = LatLng(48.43374765531665, 35.04618790000677),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(794, 796),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 796, name = "",
                location = LatLng(48.43366267900363, 35.046177841722965),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(795, 797),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 797, name = "",
                location = LatLng(48.43365600546518, 35.04627238959074),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(796, 798),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 798, name = "",
                location = LatLng(48.43374164914213, 35.046267695724964),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(797, 799),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 799, name = "",
                location = LatLng(48.43377079020447, 35.04627171903849),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(798, 800),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 800, name = "",
                location = LatLng(48.433853096931536, 35.04628077149391),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(799, 801),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 801, name = "",
                location = LatLng(48.433950085227984, 35.04628647118807),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(800, 802),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 802, name = "",
                location = LatLng(48.43408177546261, 35.04630625247955),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(801, 803),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 803, name = "",
                location = LatLng(48.43411247347499, 35.046308264136314),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(802, 804),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 804, name = "",
                location = LatLng(48.43423593268534, 35.046299546957016),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(803, 805),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 805, name = "",
                location = LatLng(48.43418410209842, 35.046150013804436),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(804, 806),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 806, name = "",
                location = LatLng(48.434157408213295, 35.04614967852831),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(805, 807),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 807, name = "",
                location = LatLng(48.434120481649074, 35.04615068435669),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(806, 808),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 808, name = "",
                location = LatLng(48.43409134078728, 35.04615034908056),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(807, 809),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 809, name = "",
                location = LatLng(48.43403394881214, 35.04614766687155),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(808, 810),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 810, name = "",
                location = LatLng(48.43391916466736, 35.046139284968376),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(809, 811),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 811, name = "",
                location = LatLng(48.43386332965047, 35.04612855613232),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(810, 812),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 812, name = "",
                location = LatLng(48.43383530089374, 35.04612486809492),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(811, 813),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 813, name = "",
                location = LatLng(48.433748990021996, 35.046114809811115),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(812, 814),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 814, name = "",
                location = LatLng(48.4336704647974, 35.046113803982735),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(813, 815),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 815, name = "",
                location = LatLng(48.43428019996877, 35.04610139876604),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(814, 816),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 816, name = "",
                location = LatLng(48.434280422417324, 35.04605378955603),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(815, 817),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 817, name = "",
                location = LatLng(48.4342859836311, 35.04595287144184),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(816, 818),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 818, name = "",
                location = LatLng(48.43428843056497, 35.045866034924984),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(817, 819),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 819, name = "",
                location = LatLng(48.43429421422636, 35.04573158919811),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(818, 820),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 820, name = "",
                location = LatLng(48.4342968836083, 35.04564508795738),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(819, 821),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 821, name = "",
                location = LatLng(48.43429999788709, 35.04556395113468),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(820, 822),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 822, name = "",
                location = LatLng(48.43429999788709, 35.04550829529762),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(821, 823),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 823, name = "",
                location = LatLng(48.434252393890716, 35.04550360143185),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(822, 824),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 824, name = "",
                location = LatLng(48.434323577420145, 35.04551097750664),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(823, 825),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 825, name = "",
                location = LatLng(48.434335367182605, 35.04556328058243),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(824, 826),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 826, name = "",
                location = LatLng(48.43433514473428, 35.04553075879812),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(825, 827),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 827, name = "",
                location = LatLng(48.43436183852602, 35.04556495696306),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(826, 828),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 828, name = "",
                location = LatLng(48.43436295076704, 35.04550628364086),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(827, 829),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 829, name = "",
                location = LatLng(48.43440588325177, 35.04556965082884),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(828, 830),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 830, name = "",
                location = LatLng(48.43433136311262, 35.04561021924019),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(829, 831),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 831, name = "",
                location = LatLng(48.434329361077545, 35.0456477701664),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(830, 832),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 832, name = "",
                location = LatLng(48.43432735904236, 35.04569873213768),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(831, 833),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 833, name = "",
                location = LatLng(48.43432646924893, 35.04573795944452),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(832, 834),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 834, name = "",
                location = LatLng(48.434320018246055, 35.045871399343014),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(833, 835),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 835, name = "",
                location = LatLng(48.4343162366233, 35.04595588892698),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(834, 836),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 836, name = "",
                location = LatLng(48.43431334479393, 35.04605948925018),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(835, 837),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 837, name = "",
                location = LatLng(48.43433981614883, 35.04610810428858),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(836, 838),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 838, name = "",
                location = LatLng(48.43426929998798, 35.045558251440525),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(837, 839),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 839, name = "",
                location = LatLng(48.43426640815596, 35.045637376606464),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(838, 840),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 840, name = "",
                location = LatLng(48.43421502249783, 35.045482479035854),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(839, 841),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 841, name = "",
                location = LatLng(48.434180542914554, 35.045552887022495),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(840, 842),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 842, name = "",
                location = LatLng(48.43417742862846, 35.045639388263226),
                locationIndex = NEW, floorIndex = 3,
                connexionWith = listOf(841, 843),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
        )
    }
    val navGraphNew4: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 843, name = "",
                location = LatLng(48.43414250412133, 35.04835043102503),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(842, 844),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 844, name = "",
                location = LatLng(48.43418677148616, 35.048357136547565),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(843, 845),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 845, name = "",
                location = LatLng(48.434251281647285, 35.048362500965595),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(844, 846),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 846, name = "",
                location = LatLng(48.43429532646885, 35.04836417734623),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(845, 847),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 847, name = "",
                location = LatLng(48.4342973285053, 35.048236437141895),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(846, 848),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 848, name = "",
                location = LatLng(48.43419522454641, 35.04822537302971),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(847, 849),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 849, name = "",
                location = LatLng(48.43418454699639, 35.04839837551117),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(848, 850),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 850, name = "",
                location = LatLng(48.43415362657843, 35.04840038716793),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(849, 851),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 851, name = "",
                location = LatLng(48.43412671022806, 35.04839736968279),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(850, 852),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 852, name = "",
                location = LatLng(48.434094010179905, 35.04839535802603),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(851, 853),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 853, name = "",
                location = LatLng(48.43406553665144, 35.048392340540886),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(852, 854),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 854, name = "",
                location = LatLng(48.43401059159439, 35.04838798195124),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(853, 855),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 855, name = "",
                location = LatLng(48.43395030767799, 35.04837926477194),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(854, 856),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 856, name = "",
                location = LatLng(48.43391782996646, 35.048378594219685),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(855, 857),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 857, name = "",
                location = LatLng(48.43388779918733, 35.0483762472868),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(856, 858),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 858, name = "",
                location = LatLng(48.43385865819208, 35.04837490618229),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(857, 859),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 859, name = "",
                location = LatLng(48.433829517180115, 35.04836853593588),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(858, 860),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 860, name = "",
                location = LatLng(48.43379637203934, 35.04836820065975),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(859, 861),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 861, name = "",
                location = LatLng(48.433792145476204, 35.048459731042385),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(860, 862),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 862, name = "",
                location = LatLng(48.433828627377956, 35.04840709269047),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(861, 863),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 863, name = "",
                location = LatLng(48.43382662532306, 35.04843056201935),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(862, 864),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 864, name = "",
                location = LatLng(48.433855988787116, 35.048434250056744),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(863, 865),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 865, name = "",
                location = LatLng(48.433882905280896, 35.04843793809414),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(864, 866),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 866, name = "",
                location = LatLng(48.43391427076395, 35.04843961447477),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(865, 867),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 867, name = "",
                location = LatLng(48.43400302830253, 35.048446990549564),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(866, 868),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 868, name = "",
                location = LatLng(48.43406308970686, 35.04843760281801),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(867, 869),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 869, name = "",
                location = LatLng(48.434089783641525, 35.04843961447477),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(868, 870),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 870, name = "",
                location = LatLng(48.43412315104015, 35.048445984721184),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(869, 871),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 871, name = "",
                location = LatLng(48.43415140208722, 35.04844531416893),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(870, 872),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 872, name = "",
                location = LatLng(48.43421346535587, 35.04845637828112),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(871, 873),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 873, name = "",
                location = LatLng(48.434098014268564, 35.04833333194256),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(872, 874),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 874, name = "",
                location = LatLng(48.433951419928036, 35.04831589758396),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(873, 875),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 875, name = "",
                location = LatLng(48.43389247064302, 35.04831288009882),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(874, 876),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 876, name = "",
                location = LatLng(48.43385865819208, 35.04831153899431),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(875, 877),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 877, name = "",
                location = LatLng(48.43380148840476, 35.0483088567853),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(876, 878),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 878, name = "",
                location = LatLng(48.4341981163825, 35.048167034983635),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(877, 879),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 879, name = "",
                location = LatLng(48.434197449035715, 35.04814524203539),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(878, 880),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 880, name = "",
                location = LatLng(48.43420100821844, 35.048090256750584),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(879, 881),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 881, name = "",
                location = LatLng(48.43420345515638, 35.0480342656374),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(880, 882),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 882, name = "",
                location = LatLng(48.43420590209421, 35.04796486347914),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(881, 883),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 883, name = "",
                location = LatLng(48.43420968372518, 35.04789747297764),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(882, 884),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 884, name = "",
                location = LatLng(48.434211908213875, 35.047852881252766),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(883, 885),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 885, name = "",
                location = LatLng(48.43421391025359, 35.04778079688549),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(884, 886),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 886, name = "",
                location = LatLng(48.434216802088585, 35.04772413522005),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(885, 887),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 887, name = "",
                location = LatLng(48.434218804128115, 35.04763964563608),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(886, 888),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 888, name = "",
                location = LatLng(48.43422258575814, 35.04759170114994),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(887, 889),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 889, name = "",
                location = LatLng(48.43425172654467, 35.04759639501572),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(888, 890),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 890, name = "",
                location = LatLng(48.4343427079767, 35.04760008305311),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(889, 891),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 891, name = "",
                location = LatLng(48.43439832001874, 35.047608464956284),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(890, 892),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 892, name = "",
                location = LatLng(48.434420787266454, 35.04760980606079),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(891, 893),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 893, name = "",
                location = LatLng(48.434401434291296, 35.047537721693516),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(892, 894),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 894, name = "",
                location = LatLng(48.43434515490782, 35.04753604531288),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(893, 895),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 895, name = "",
                location = LatLng(48.434255285723545, 35.04752531647682),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(894, 896),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 896, name = "",
                location = LatLng(48.434221695962854, 35.04754912108183),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(895, 897),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 897, name = "",
                location = LatLng(48.43417120005569, 35.047543086111546),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(896, 898),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 898, name = "",
                location = LatLng(48.43418855107792, 35.047590024769306),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(897, 899),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 899, name = "",
                location = LatLng(48.4342659632587, 35.04764635115862),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(898, 900),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 900, name = "",
                location = LatLng(48.434260624491415, 35.04772983491421),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(899, 901),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 901, name = "",
                location = LatLng(48.43425395103149, 35.04778213799),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(900, 902),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 902, name = "",
                location = LatLng(48.43424816736551, 35.04785589873791),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(901, 903),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 903, name = "",
                location = LatLng(48.43425039185251, 35.047905184328556),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(902, 904),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 904, name = "",
                location = LatLng(48.434247500019396, 35.047968216240406),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(903, 905),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 905, name = "",
                location = LatLng(48.43423170615876, 35.04809562116861),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(904, 906),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 906, name = "",
                location = LatLng(48.43422970411974, 35.04814390093088),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(905, 907),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 907, name = "",
                location = LatLng(48.43422814697823, 35.04817072302103),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(906, 908),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 908, name = "",
                location = LatLng(48.43413227145866, 35.04758633673191),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(907, 909),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 909, name = "",
                location = LatLng(48.434101795907544, 35.047580637037754),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(908, 910),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 910, name = "",
                location = LatLng(48.43406486930292, 35.04757795482874),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(909, 911),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 911, name = "",
                location = LatLng(48.4340361733085, 35.04757560789585),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(910, 912),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 912, name = "",
                location = LatLng(48.433924058570284, 35.047563537955284),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(911, 913),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 913, name = "",
                location = LatLng(48.4338955849466, 35.04756219685078),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(912, 914),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 914, name = "",
                location = LatLng(48.43386533170392, 35.047559179365635),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(913, 915),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 915, name = "",
                location = LatLng(48.433853541832406, 35.04756052047014),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(914, 916),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 916, name = "",
                location = LatLng(48.433806159868396, 35.04755683243275),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(915, 917),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 917, name = "",
                location = LatLng(48.43372096120222, 35.04754476249218),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(916, 918),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 918, name = "",
                location = LatLng(48.4336976038406, 35.0475437566638),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(917, 919),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 919, name = "",
                location = LatLng(48.43365622791648, 35.04754342138767),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(918, 920),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 920, name = "",
                location = LatLng(48.43361529686163, 35.04753805696964),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(919, 921),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 921, name = "",
                location = LatLng(48.43360929067146, 35.04763092845678),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(920, 922),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 922, name = "",
                location = LatLng(48.43421502249783, 35.04840608686209),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(921, 923),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 923, name = "",
                location = LatLng(48.43365645036776, 35.04762053489685),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(922, 924),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 924, name = "",
                location = LatLng(48.43369337726924, 35.04762623459101),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(923, 925),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 925, name = "",
                location = LatLng(48.43379970879946, 35.047634951770306),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(924, 926),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 926, name = "",
                location = LatLng(48.433850872427165, 35.047635957598686),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(925, 927),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 927, name = "",
                location = LatLng(48.43389224819276, 35.0476386398077),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(926, 928),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 928, name = "",
                location = LatLng(48.43403105696671, 35.04764869809151),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(927, 929),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 929, name = "",
                location = LatLng(48.43406397950489, 35.04765573889017),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(928, 930),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 930, name = "",
                location = LatLng(48.43412537553261, 35.04766009747982),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(929, 931),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 931, name = "",
                location = LatLng(48.43418521434333, 35.04766948521137),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(930, 932),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 932, name = "",
                location = LatLng(48.43413204900944, 35.047519616782665),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(931, 933),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 933, name = "",
                location = LatLng(48.43410735714087, 35.047519616782665),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(932, 934),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 934, name = "",
                location = LatLng(48.43406709379793, 35.04751492291689),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(933, 935),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 935, name = "",
                location = LatLng(48.43403639575812, 35.047530345618725),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(934, 936),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 936, name = "",
                location = LatLng(48.43398100576981, 35.047523975372314),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(935, 937),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 937, name = "",
                location = LatLng(48.43392383612015, 35.04751827567816),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(936, 938),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 938, name = "",
                location = LatLng(48.43389536249634, 35.04751492291689),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(937, 939),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 939, name = "",
                location = LatLng(48.43386688885655, 35.047499500215054),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(938, 940),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 940, name = "",
                location = LatLng(48.43372741228115, 35.04748810082674),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(939, 941),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 941, name = "",
                location = LatLng(48.43369404462264, 35.047481060028076),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(940, 942),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 942, name = "",
                location = LatLng(48.434228814324605, 35.04741232842207),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(941, 943),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1300, name = "",
                location = LatLng(48.43423393064649, 35.04731275141239),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(942, 944),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 943, name = "",
                location = LatLng(48.43423571023658, 35.047228932380676),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(942, 944),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 944, name = "",
                location = LatLng(48.434240159211555, 35.04714746028185),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(943, 945),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 945, name = "",
                location = LatLng(48.43424460818613, 35.047049559652805),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(944, 946),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 946, name = "",
                location = LatLng(48.43424838981422, 35.04696272313595),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(945, 947),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 947, name = "",
                location = LatLng(48.43425217144203, 35.046916119754314),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(946, 948),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 948, name = "",
                location = LatLng(48.43425172654467, 35.04687052220106),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(947, 949),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 949, name = "",
                location = LatLng(48.43420212046296, 35.04686515778303),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(948, 950),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 950, name = "",
                location = LatLng(48.434281979557255, 35.046919137239456),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(949, 951),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 951, name = "",
                location = LatLng(48.43428553873402, 35.04685442894697),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(950, 952),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 952, name = "",
                location = LatLng(48.43434559980437, 35.04685677587986),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(951, 953),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 953, name = "",
                location = LatLng(48.43439476084986, 35.04693053662777),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(952, 954),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 954, name = "",
                location = LatLng(48.43444125247357, 35.04693388938904),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(953, 955),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 955, name = "",
                location = LatLng(48.43429755095378, 35.04696775227785),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(954, 956),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 956, name = "",
                location = LatLng(48.43427886527736, 35.04700865596533),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(955, 957),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 957, name = "",
                location = LatLng(48.4342757509973, 35.04705358296633),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(956, 958),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 958, name = "",
                location = LatLng(48.43427419385719, 35.04710152745247),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(957, 959),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 959, name = "",
                location = LatLng(48.43427775303452, 35.04715148359537),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(958, 960),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 960, name = "",
                location = LatLng(48.434280867314456, 35.04723362624645),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(959, 961),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 961, name = "",
                location = LatLng(48.43426974488519, 35.047318786382675),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(960, 962),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 962, name = "",
                location = LatLng(48.43425884490217, 35.04736874252558),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(961, 963),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 963, name = "",
                location = LatLng(48.43425862245351, 35.04741534590721),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(962, 964),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 964, name = "",
                location = LatLng(48.43425617551822, 35.047457590699196),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(963, 965),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 965, name = "",
                location = LatLng(48.43421591229322, 35.0469134375453),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(964, 966),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 966, name = "",
                location = LatLng(48.434158965356986, 35.046907402575016),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(965, 967),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 967, name = "",
                location = LatLng(48.43409489997741, 35.046903379261494),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(966, 968),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 968, name = "",
                location = LatLng(48.434066871348435, 35.04690036177635),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(967, 969),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 969, name = "",
                location = LatLng(48.4340492978351, 35.046899020671844),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(968, 970),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 970, name = "",
                location = LatLng(48.43399946910596, 35.04689197987318),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(969, 971),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 971, name = "",
                location = LatLng(48.4339374055759, 35.04688762128353),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(970, 972),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 972, name = "",
                location = LatLng(48.43392628307147, 35.04688661545515),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(971, 973),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 973, name = "",
                location = LatLng(48.43386844600915, 35.046881921589375),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(972, 974),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 974, name = "",
                location = LatLng(48.43382217631187, 35.046876557171345),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(973, 975),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 975, name = "",
                location = LatLng(48.43375544109739, 35.046867839992046),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(974, 976),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 976, name = "",
                location = LatLng(48.433726522477215, 35.04686985164881),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(975, 977),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 977, name = "",
                location = LatLng(48.4336755811755, 35.04686616361141),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(976, 978),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 978, name = "",
                location = LatLng(48.433672911760915, 35.04693992435932),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(977, 979),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 979, name = "",
                location = LatLng(48.43372296326129, 35.046945959329605),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(978, 980),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 980, name = "",
                location = LatLng(48.433816392596746, 35.04695165902376),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(979, 981),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 981, name = "",
                location = LatLng(48.43386599905505, 35.04699222743511),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(980, 982),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 982, name = "",
                location = LatLng(48.43392005446791, 35.046961046755314),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(981, 983),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 983, name = "",
                location = LatLng(48.43406086521165, 35.046970434486866),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(982, 984),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 984, name = "",
                location = LatLng(48.43409134078728, 35.04697881639004),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(983, 985),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 985, name = "",
                location = LatLng(48.434210573520666, 35.04699558019638),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(984, 986),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 986, name = "",
                location = LatLng(48.43416118984788, 35.04686951637268),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(985, 987),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 987, name = "",
                location = LatLng(48.434131826560225, 35.04686616361141),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(986, 988),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 988, name = "",
                location = LatLng(48.43409823671791, 35.04683531820774),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(987, 989),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 989, name = "",
                location = LatLng(48.43405419172551, 35.04683397710323),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(988, 990),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 990, name = "",
                location = LatLng(48.43400169360385, 35.04682492464781),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(989, 991),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 991, name = "",
                location = LatLng(48.43393985252656, 35.04682056605816),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(990, 992),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 992, name = "",
                location = LatLng(48.43387044806239, 35.04681587219238),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(991, 993),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 993, name = "",
                location = LatLng(48.433824400817514, 35.04681285470724),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(992, 994),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 994, name = "",
                location = LatLng(48.433758777860184, 35.04680413752794),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(993, 995),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 995, name = "",
                location = LatLng(48.43367380156577, 35.046797432005405),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(994, 996),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 996, name = "",
                location = LatLng(48.43425573062088, 35.046773962676525),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(995, 997),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 997, name = "",
                location = LatLng(48.43425773265889, 35.0467199832201),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(996, 998),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 998, name = "",
                location = LatLng(48.43426218163191, 35.0466338172555),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(997, 999),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 999, name = "",
                location = LatLng(48.43426284897785, 35.046588219702244),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(998, 1000),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1000, name = "",
                location = LatLng(48.43426462856694, 35.04654262214899),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(999, 1001),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1001, name = "",
                location = LatLng(48.43426885509077, 35.046448074281216),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1000, 1002),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1002, name = "",
                location = LatLng(48.43427308161424, 35.04636626690626),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1001, 1003),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1003, name = "",
                location = LatLng(48.43427530610014, 35.04628513008356),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1002, 1004),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1004, name = "",
                location = LatLng(48.43427775303452, 35.04623953253031),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1003, 1005),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1005, name = "",
                location = LatLng(48.43431067541286, 35.04624489694834),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1004, 1006),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1006, name = "",
                location = LatLng(48.43431067541286, 35.046171471476555),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1005, 1007),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1007, name = "",
                location = LatLng(48.43427886527736, 35.04619527608156),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1006, 1008),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1008, name = "",
                location = LatLng(48.43423393064649, 35.04619024693966),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1007, 1009),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1009, name = "",
                location = LatLng(48.43437073645349, 35.04618186503649),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1008, 1010),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1010, name = "",
                location = LatLng(48.434371403797975, 35.04625026136637),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1009, 1011),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1011, name = "",
                location = LatLng(48.43442212195414, 35.04625394940376),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1010, 1012),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1012, name = "",
                location = LatLng(48.43447395229824, 35.04625864326954),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1011, 1013),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1013, name = "",
                location = LatLng(48.434478846147734, 35.046182200312614),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1012, 1014),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1014, name = "",
                location = LatLng(48.434511990843305, 35.046186558902264),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1013, 1015),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1015, name = "",
                location = LatLng(48.434308228480056, 35.0462881475687),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1014, 1016),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1016, name = "",
                location = LatLng(48.43430222237179, 35.0463692843914),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1015, 1017),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1017, name = "",
                location = LatLng(48.434300220335544, 35.04639945924282),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1016, 1018),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1018, name = "",
                location = LatLng(48.434305336650255, 35.046447068452835),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1017, 1019),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1019, name = "",
                location = LatLng(48.43429933054163, 35.04654731601477),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1018, 1020),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1020, name = "",
                location = LatLng(48.43430044278402, 35.04659291356802),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1019, 1021),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1021, name = "",
                location = LatLng(48.4343006652325, 35.046632811427116),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1020, 1022),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1022, name = "",
                location = LatLng(48.43429310198382, 35.046725012362),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1021, 1023),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1023, name = "",
                location = LatLng(48.43429310198382, 35.04677630960941),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1022, 1024),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1024, name = "",
                location = LatLng(48.43424705512198, 35.046239867806435),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1023, 1025),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1025, name = "",
                location = LatLng(48.43418721638411, 35.04623282700777),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1024, 1026),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1026, name = "",
                location = LatLng(48.43415852045879, 35.04623081535101),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1025, 1027),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1027, name = "",
                location = LatLng(48.4341224836924, 35.04622880369425),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1026, 1028),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1028, name = "",
                location = LatLng(48.43408956119213, 35.046224780380726),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1027, 1029),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1029, name = "",
                location = LatLng(48.433951864828046, 35.046211034059525),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1028, 1030),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1030, name = "",
                location = LatLng(48.43392183406901, 35.04620634019375),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1029, 1031),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1031, name = "",
                location = LatLng(48.433896474747584, 35.04620600491762),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1030, 1032),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1032, name = "",
                location = LatLng(48.43386577660467, 35.046202316880226),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1031, 1033),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1033, name = "",
                location = LatLng(48.43383997235427, 35.04619996994734),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1032, 1034),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1034, name = "",
                location = LatLng(48.433816392596746, 35.04619896411896),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1033, 1035),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1035, name = "",
                location = LatLng(48.43377813108014, 35.04619427025318),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1034, 1036),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1036, name = "",
                location = LatLng(48.43375499619565, 35.04619158804417),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1035, 1037),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1037, name = "",
                location = LatLng(48.43372785718312, 35.04618991166353),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1036, 1038),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1038, name = "",
                location = LatLng(48.43367157705356, 35.04618790000677),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1037, 1039),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1039, name = "",
                location = LatLng(48.433664681065, 35.04627473652363),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1038, 1040),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1040, name = "",
                location = LatLng(48.43372318571229, 35.0462744012475),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1039, 1041),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1041, name = "",
                location = LatLng(48.43375076962908, 35.04627741873264),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1040, 1042),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1042, name = "",
                location = LatLng(48.433775906572464, 35.04627674818039),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1041, 1043),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1043, name = "",
                location = LatLng(48.43381194358469, 35.046280436217785),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1042, 1044),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1044, name = "",
                location = LatLng(48.433855988787116, 35.04628546535969),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1043, 1045),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1045, name = "",
                location = LatLng(48.43395342197803, 35.04629451781511),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1044, 1046),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1046, name = "",
                location = LatLng(48.43408733669809, 35.0463055819273),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1045, 1047),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1047, name = "",
                location = LatLng(48.434119369402744, 35.04630893468857),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1046, 1048),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1048, name = "",
                location = LatLng(48.43418187760853, 35.046298541128635),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1047, 1049),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1049, name = "",
                location = LatLng(48.43424371839125, 35.046303905546665),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1048, 1050),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1050, name = "",
                location = LatLng(48.43418855107792, 35.046162083745),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1049, 1051),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1051, name = "",
                location = LatLng(48.434161412296966, 35.04616308957338),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1050, 1052),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1052, name = "",
                location = LatLng(48.434122706141665, 35.04615940153599),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1051, 1053),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1053, name = "",
                location = LatLng(48.43409334283175, 35.04615839570761),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1052, 1054),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1054, name = "",
                location = LatLng(48.433956313827856, 35.046141631901264),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1053, 1055),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1055, name = "",
                location = LatLng(48.43392450347054, 35.04613894969225),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1054, 1056),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1056, name = "",
                location = LatLng(48.433898699249944, 35.046139284968376),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1055, 1057),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1057, name = "",
                location = LatLng(48.43386755620766, 35.0461345911026),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1056, 1058),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1058, name = "",
                location = LatLng(48.43384330911154, 35.04613358527422),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1057, 1059),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1059, name = "",
                location = LatLng(48.43375343903959, 35.04612319171429),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1058, 1060),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1060, name = "",
                location = LatLng(48.43428665097671, 35.04606083035469),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1059, 1061),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1061, name = "",
                location = LatLng(48.434288653013496, 35.04601188004017),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1060, 1062),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1062, name = "",
                location = LatLng(48.43429109994724, 35.04596661776304),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1061, 1063),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1063, name = "",
                location = LatLng(48.43429599381434, 35.04586536437273),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1062, 1064),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1064, name = "",
                location = LatLng(48.43429777340226, 35.0457962974906),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1063, 1065),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1065, name = "",
                location = LatLng(48.43430044278402, 35.04573494195938),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1064, 1066),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1066, name = "",
                location = LatLng(48.434301777474865, 35.04569571465254),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1065, 1067),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1067, name = "",
                location = LatLng(48.43430600399559, 35.04556126892567),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1066, 1068),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1068, name = "",
                location = LatLng(48.43434092839035, 35.04556730389595),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1067, 1069),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1069, name = "",
                location = LatLng(48.4343424855284, 35.04551500082016),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1068, 1070),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1070, name = "",
                location = LatLng(48.434309340722244, 35.04551701247692),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1069, 1071),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1071, name = "",
                location = LatLng(48.43431000806755, 35.04546470940113),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1070, 1072),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1072, name = "",
                location = LatLng(48.43433959370055, 35.045464374125004),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1071, 1073),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1073, name = "",
                location = LatLng(48.43426307142648, 35.0455129891634),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1072, 1074),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1074, name = "",
                location = LatLng(48.4342768632402, 35.04556093364954),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1073, 1075),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1075, name = "",
                location = LatLng(48.43427263671706, 35.045627653598785),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1074, 1076),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1076, name = "",
                location = LatLng(48.43421724698628, 35.045552887022495),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1075, 1077),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1077, name = "",
                location = LatLng(48.43421813678164, 35.045496225357056),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1076, 1078),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1078, name = "",
                location = LatLng(48.43436628748996, 35.04556763917208),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1077, 1079),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1079, name = "",
                location = LatLng(48.43436828952359, 35.04548616707325),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1078, 1080),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1080, name = "",
                location = LatLng(48.43439854246678, 35.0455716624856),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1079, 1081),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1081, name = "",
                location = LatLng(48.43440054449916, 35.04550628364086),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1080, 1082),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1082, name = "",
                location = LatLng(48.43445548913453, 35.04557568579912),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1081, 1083),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1083, name = "",
                location = LatLng(48.43446016053803, 35.04551701247692),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1082, 1084),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1084, name = "",
                location = LatLng(48.4343424855284, 35.045697055757046),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1083, 1085),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1085, name = "",
                location = LatLng(48.4343382590107, 35.04573930054903),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1084, 1086),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1086, name = "",
                location = LatLng(48.434335812079226, 35.04579931497574),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1085, 1087),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1087, name = "",
                location = LatLng(48.43433803656238, 35.04587039351463),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1086, 1088),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1088, name = "",
                location = LatLng(48.43432847128414, 35.045969635248184),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1087, 1089),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1089, name = "",
                location = LatLng(48.4343240223169, 35.046018585562706),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1088, 1090),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1090, name = "",
                location = LatLng(48.434325357007104, 35.046066865324974),
                locationIndex = NEW, floorIndex = 4,
                connexionWith = listOf(1089, 1091),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
        )
    }

    val navGraphNew5: List<NavModel> by lazy {
        listOf(
            NavModel(
                id = 1091, name = "",
                location = LatLng(48.43409734692046, 35.04834607243538),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1090, 1092),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1092, name = "",
                location = LatLng(48.43414183677381, 35.04835043102503),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1091, 1093),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1093, name = "",
                location = LatLng(48.43414161432465, 35.04839166998863),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1092, 1094),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1094, name = "",
                location = LatLng(48.43417075515761, 35.048395693302155),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1093, 1095),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1095, name = "",
                location = LatLng(48.43420301025858, 35.04839736968279),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1094, 1096),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1096, name = "",
                location = LatLng(48.43420345515638, 35.04835680127144),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1095, 1097),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1097, name = "",
                location = LatLng(48.4342668530532, 35.04836216568947),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1096, 1098),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1098, name = "",
                location = LatLng(48.434269077539376, 35.048230066895485),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1097, 1099),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1099, name = "",
                location = LatLng(48.43415140208722, 35.0482153147459),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1098, 1100),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1100, name = "",
                location = LatLng(48.43411291837358, 35.04839301109314),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1099, 1101),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1101, name = "",
                location = LatLng(48.4340811081143, 35.04838865250349),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1100, 1102),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1102, name = "",
                location = LatLng(48.43405619377145, 35.048386976122856),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1101, 1103),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1103, name = "",
                location = LatLng(48.43399390786084, 35.048378594219685),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1102, 1104),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1104, name = "",
                location = LatLng(48.43396254242697, 35.0483812764287),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1103, 1105),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1105, name = "",
                location = LatLng(48.43393273412435, 35.048377588391304),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1104, 1106),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1106, name = "",
                location = LatLng(48.4338757868707, 35.048366859555244),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1105, 1107),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1107, name = "",
                location = LatLng(48.433850872427165, 35.0483675301075),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1106, 1108),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1108, name = "",
                location = LatLng(48.433816392596746, 35.048365853726864),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1107, 1109),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1109, name = "",
                location = LatLng(48.43378502705328, 35.04836082458496),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1108, 1110),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1110, name = "",
                location = LatLng(48.43375499619565, 35.04835780709982),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1109, 1111),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1111, name = "",
                location = LatLng(48.43374832266934, 35.04845168441534),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1110, 1112),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1112, name = "",
                location = LatLng(48.433810608880975, 35.04845704883337),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1111, 1113),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1113, name = "",
                location = LatLng(48.433845088715316, 35.048464089632034),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1112, 1114),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1114, name = "",
                location = LatLng(48.43392494837076, 35.04846442490816),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1113, 1115),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1115, name = "",
                location = LatLng(48.433957870977714, 35.048467107117176),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1114, 1116),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1116, name = "",
                location = LatLng(48.4339883466151, 35.048472471535206),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1115, 1117),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1117, name = "",
                location = LatLng(48.434049520284674, 35.04847716540098),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1116, 1118),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1118, name = "",
                location = LatLng(48.4340771040243, 35.04847984761),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1117, 1119),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1119, name = "",
                location = LatLng(48.43410757959018, 35.04845503717661),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1118, 1120),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1120, name = "",
                location = LatLng(48.43413850003616, 35.04843860864639),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1119, 1121),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1121, name = "",
                location = LatLng(48.43417120005569, 35.04844129085541),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1120, 1122),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1122, name = "",
                location = LatLng(48.43419856128035, 35.048443637788296),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1121, 1123),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1123, name = "",
                location = LatLng(48.43405752846868, 35.04832897335291),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1122, 1124),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1124, name = "",
                location = LatLng(48.43399835685698, 35.048312209546566),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1123, 1125),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1125, name = "",
                location = LatLng(48.433938295376144, 35.04830952733755),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1124, 1126),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1126, name = "",
                location = LatLng(48.433878011374, 35.048304833471775),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1125, 1127),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1127, name = "",
                location = LatLng(48.43378791891271, 35.04829611629248),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1126, 1128),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1128, name = "",
                location = LatLng(48.43415140208722, 35.048174411058426),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1127, 1129),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1129, name = "",
                location = LatLng(48.434154961273116, 35.04808120429516),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1128, 1130),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1130, name = "",
                location = LatLng(48.43416430413496, 35.04794642329216),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1129, 1131),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1131, name = "",
                location = LatLng(48.434164749033116, 35.04785254597664),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1130, 1132),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1132, name = "",
                location = LatLng(48.4341723123009, 35.04778582602739),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1131, 1133),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1133, name = "",
                location = LatLng(48.43417609393436, 35.04772514104843),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1132, 1134),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1134, name = "",
                location = LatLng(48.43417720617945, 35.047633945941925),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1133, 1135),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1135, name = "",
                location = LatLng(48.434177651077476, 35.047587007284164),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1134, 1136),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1136, name = "",
                location = LatLng(48.4342221408605, 35.04763696342707),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1135, 1137),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1137, name = "",
                location = LatLng(48.43422058371876, 35.04773151129484),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1136, 1138),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1137, name = "",
                location = LatLng(48.43421591229322, 35.047786831855774),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1136, 1138),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1138, name = "",
                location = LatLng(48.43421613474206, 35.04785891622305),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1137, 1139),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1139, name = "",
                location = LatLng(48.43420879392969, 35.047947093844414),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1138, 1140),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1140, name = "",
                location = LatLng(48.434207681685294, 35.04808120429516),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1139, 1141),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1141, name = "",
                location = LatLng(48.43420011842277, 35.04817709326744),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1140, 1142),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1142, name = "",
                location = LatLng(48.43430600399559, 35.047602429986),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1141, 1143),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1143, name = "",
                location = LatLng(48.43430466930487, 35.04750084131956),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1142, 1144),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1144, name = "",
                location = LatLng(48.43418009801653, 35.04748810082674),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1143, 1145),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1145, name = "",
                location = LatLng(48.434179208220534, 35.04754073917866),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1144, 1146),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
            NavModel(
                id = 1146, name = "",
                location = LatLng(48.434136942891854, 35.04753839224577),
                locationIndex = NEW, floorIndex = 5,
                connexionWith = listOf(1145, 1147),
                connexionFloor = listOf(),
                connectedLocIndex = NEW
            ),
        )
    }
}