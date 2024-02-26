package com.example.interactivemap.ui.screens.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.interactivemap.R
import com.example.interactivemap.logic.navigation.AccOnboard
import com.example.interactivemap.logic.navigation.AccountCreator
import com.example.interactivemap.logic.navigation.LandingScreen
import com.example.interactivemap.logic.navigation.ScheduleViewer
import com.example.interactivemap.logic.navigation.SettingsScreen
import com.example.interactivemap.ui.resource.controller.BottomNavigation
import com.example.interactivemap.ui.resource.controller.FloorController
import com.example.interactivemap.ui.resource.controller.HeaderMapNavigation
import com.example.interactivemap.ui.resource.controller.PlacesController
import com.example.interactivemap.ui.resource.header.DefaultHeader
import com.example.interactivemap.ui.resource.header.SearchHeader
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun NavigationScreen(navHostController: NavHostController,

){
    val clickers: ArrayList<() -> Unit> = ArrayList()
    clickers.add { /* обробник 1 */ }
    clickers.add { /* обробник 2 */ }
    clickers.add { navHostController.navigate(ScheduleViewer.route)}
    clickers.add { navHostController.navigate(SettingsScreen.route)}

    val clickersCenter: ArrayList<() -> Unit> = ArrayList()
    clickersCenter.add { /* обробник 1 */ }
    clickersCenter.add { /* обробник 2 */ }
    clickersCenter.add { /* обробник 3 */ }

    val searchRes =  remember { mutableStateOf(arrayListOf(
            "Новий. к: ауд. 3227", "Новий. к: ауд. 3228",
            "Новий. к: ауд. 3229", "Новий. к: ауд. 3230",
            "Старий. к: ауд. 365")) }
    searchRes.value.clear()

    val baseLocation = LatLng(48.43471507685138, 35.04729302323573)
    val cameraPositionState = rememberCameraPositionState{
        position = CameraPosition.fromLatLngZoom(baseLocation, 16f)
    }

    InteractiveMapTheme {
        GoogleMap(
            properties = MapProperties(minZoomPreference = 13f),
            uiSettings = MapUiSettings(zoomControlsEnabled = false),
            modifier = Modifier.fillMaxSize(), cameraPositionState = cameraPositionState
        )

        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            SearchHeader(
                remember { mutableStateOf("") }, leftImgId = R.drawable.ic_search, searchResult = searchRes,
                rightImgId = R.drawable.ic_account, onClickRight = {
                    navHostController.navigate(LandingScreen.route)
                }, onChange = {}){}

//            Box(modifier = Modifier.padding(15.dp).fillMaxWidth()){
//                HeaderMapNavigation(locationStart ="Новий. к: ауд. 3227", locationEnd ="СК: Легка атлетика")
//            }

            Spacer(modifier = Modifier.weight(1f))

            Row (modifier = Modifier.padding(horizontal = 15.dp).height(140.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly){

                Box(modifier = Modifier.width(46.dp).fillMaxHeight()
                    .then(ShadowMaterial.CustomShadow.createModifier
                            (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                    .then(ShadowMaterial.CustomReShadow.createModifier
                            (5.dp, MaterialTheme.colorScheme.onTertiaryContainer))
                    .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
                ) {
                    PlacesController(
                        placeType = remember { mutableIntStateOf(1) }
                    )
                }

                Spacer(modifier = Modifier.weight(1f))

                Box(modifier = Modifier.width(46.dp).fillMaxHeight()
                    .then(ShadowMaterial.CustomShadow.createModifier
                            (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                    .then(ShadowMaterial.CustomReShadow.createModifier
                            (5.dp, MaterialTheme.colorScheme.onTertiaryContainer))
                    .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
                ) {
                    FloorController(
                        floor = remember { mutableIntStateOf(1) },
                        maxFloor = remember { mutableIntStateOf(5) },
                        minFloor = remember { mutableIntStateOf(-1) }
                    )
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            BottomNavigation(state = remember { mutableIntStateOf(0) }, clickers, clickersCenter)
        }
    }
}


@Preview
@Composable
fun NavigationScreenPreview(){
    NavigationScreen(rememberNavController())
}
