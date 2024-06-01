package com.example.interactivemap.logic.model.navigation.graph

import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.logic.model.navigation.models.NavObjects

object NavGraphList {
    val nawGraphList: List<List<NavModel>> by lazy {
        listOf(
            getNavGraph(NavObjects.YARD, 1),

            getNavGraph(NavObjects.OLD, 0),
            getNavGraph(NavObjects.OLD, 1),
            getNavGraph(NavObjects.OLD, 2),
            getNavGraph(NavObjects.OLD, 3),
            getNavGraph(NavObjects.OLD, 4),
            getNavGraph(NavObjects.OLD, 5),

            getNavGraph(NavObjects.NEW, 1),
            getNavGraph(NavObjects.NEW, 2),
            getNavGraph(NavObjects.NEW, 3),
            getNavGraph(NavObjects.NEW, 4),

            getNavGraph(NavObjects.SK, 1),
            getNavGraph(NavObjects.SK, 2)
        )
    }

    fun findFirstFourMatchesByName(name: String): List<NavModel> {
        val matches = mutableListOf<NavModel>()

        for (navList in this.nawGraphList) {
            for (navModel in navList) {
                if (navModel.name != null){
                    if (navModel.name.startsWith(name, ignoreCase = true) ) {
                        matches.add(navModel)
                        if (matches.size == 4) {
                            return matches
                        }
                    }
                } else {
                    if ( navModel.id.toString().startsWith(name)) {
                        matches.add(navModel)
                        if (matches.size == 4) {
                            return matches
                        }
                    }
                }
            }
        }

        return matches
    }

    private fun getNavGraph(locationIndex: Int, floorIndex: Int): List<NavModel> {
        return when (locationIndex) {
            NavObjects.YARD -> when (floorIndex) {
                1 -> NavGraphYard.navGraphYard
                else -> emptyList()
            }
            NavObjects.OLD -> when (floorIndex) {
                0 -> NavGraphOld.navGraphOld0
                1 -> NavGraphOld.navGraphOld1
                2 -> NavGraphOld.navGraphOld2
                3 -> NavGraphOld.navGraphOld3
                4 -> NavGraphOld.navGraphOld4
                5 -> NavGraphOld.navGraphOld5
                else -> emptyList()
            }
            NavObjects.NEW -> when (floorIndex) {
                1 -> NavGraphNew.navGraphNew1
                2 -> NavGraphNew.navGraphNew2
                3 -> NavGraphNew.navGraphNew3
                4 -> NavGraphNew.navGraphNew4
                else -> emptyList()
            }
            NavObjects.SK -> when (floorIndex) {
                1 -> NavGraphSk.navGraphSk1
                2 -> NavGraphSk.navGraphSk2
                else -> emptyList()
            }
            else -> emptyList()
        }
    }
}