package com.example.interactivemap.ui.screens.navigation

import android.annotation.SuppressLint
import android.graphics.BitmapFactory
import android.util.Log
import android.view.View
import androidx.activity.ComponentActivity
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asAndroidBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toBitmap
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.interactivemap.R
import com.example.interactivemap.logic.Constants
import com.example.interactivemap.logic.navigation.ScheduleViewer
import com.example.interactivemap.logic.navigation.SettingsScreen
import com.example.interactivemap.logic.util.GoogleMapUtil
import com.example.interactivemap.ui.resource.controller.BottomNavigation
import com.example.interactivemap.ui.resource.controller.FloorController
import com.example.interactivemap.ui.resource.controller.HeaderMapNavigation
import com.example.interactivemap.ui.resource.controller.PlacesController
import com.example.interactivemap.ui.resource.header.DefaultHeader
import com.example.interactivemap.ui.resource.header.SearchHeader
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.screens.schedule.editor.ScheduleEditorViewModel
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import com.google.android.gms.maps.CameraUpdate
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.GroundOverlayOptions
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.GroundOverlay
import com.google.maps.android.compose.GroundOverlayPosition
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.rememberCameraPositionState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "MutableCollectionMutableState",
    "CoroutineCreationDuringComposition"
)
@Composable
fun NavigationScreen( navHostController: NavHostController,
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    viewModel: NavigationViewModel = viewModel()
){
    val cameraPositionState = rememberCameraPositionState{ position = viewModel.baseCameraPosition }

    val clickers: ArrayList<() -> Unit> = ArrayList()
    clickers.add { coroutineScope.launch { cameraPositionState.animate(
            CameraUpdateFactory.newCameraPosition(
                viewModel.baseCameraPosition), Constants.DURATION_ANIM) } }
    clickers.add {
        viewModel.logPosition(cameraPositionState.position) }

    clickers.add {
        viewModel.removeLast()
        //navHostController.navigate(ScheduleViewer.route)
    }
    clickers.add {
        //navHostController.navigate(SettingsScreen.route)
    }

    var navigationOpen by remember { mutableStateOf(false) }
    var navigate by remember { mutableStateOf(false) }
    val camPosition = remember { mutableIntStateOf(1) }

    val clickersCenter: ArrayList<() -> Unit> = ArrayList()
    clickersCenter.add { navigationOpen = true }
    clickersCenter.add { navigationOpen = false }
    clickersCenter.add { navigate = false }

    val floor = remember { mutableIntStateOf(1) }
    val maxFloor = remember { mutableIntStateOf(5) }
    val minFloor = remember { mutableIntStateOf(0) }

    val searchRes =  remember { mutableStateOf(arrayListOf(
            "Новий. к: ауд. 3227", "Новий. к: ауд. 3228",
            "Новий. к: ауд. 3229", "Новий. к: ауд. 3230",
            "Старий. к: ауд. 365")) }
    searchRes.value.clear()

    InteractiveMapTheme {
        Scaffold (containerColor = MaterialTheme.colorScheme.background) {  _ ->
            GoogleMap(
                properties = MapProperties(minZoomPreference = 13f),
                uiSettings = MapUiSettings(zoomControlsEnabled = false),
                modifier = Modifier.fillMaxSize(), cameraPositionState = cameraPositionState,
            ) {
                // Background
                GroundOverlay( bearing = Constants.BEARING_BASE, image = viewModel.drawBackground,
                    position = GroundOverlayPosition.create(Constants.baseLocation, Constants.SIZE_BASE)
                )

                // New Floors
                GroundOverlay(
                    bearing = Constants.BEARING_NEW, visible = floor.intValue == 0, image = viewModel.drawFloor0New,
                    position = GroundOverlayPosition.create(Constants.newLocation, Constants.SIZE_NEW)
                )

                GroundOverlay(
                    bearing = Constants.BEARING_NEW, visible = floor.intValue == 1, image = viewModel.drawFloor1New,
                    position = GroundOverlayPosition.create(Constants.newLocation, Constants.SIZE_NEW)
                )

                GroundOverlay(
                    bearing = Constants.BEARING_NEW, visible = floor.intValue == 2, image = viewModel.drawFloor2New,
                    position = GroundOverlayPosition.create(Constants.newLocation, Constants.SIZE_NEW)

                )

                GroundOverlay(
                    bearing = Constants.BEARING_NEW, visible = floor.intValue == 3, image = viewModel.drawFloor3New,
                    position = GroundOverlayPosition.create(Constants.newLocation, Constants.SIZE_NEW)
                )

                GroundOverlay(
                    bearing = Constants.BEARING_NEW, visible = floor.intValue == 4, image = viewModel.drawFloor4New,
                    position = GroundOverlayPosition.create(Constants.newLocation, Constants.SIZE_NEW)
                )

                GroundOverlay(
                    bearing = Constants.BEARING_NEW, visible = floor.intValue == 5,  image = viewModel.drawFloor5New,
                    position = GroundOverlayPosition.create(Constants.newLocation, Constants.SIZE_NEW)
                )

                // Old Floors
//                GroundOverlay(
//                    bearing = Constants.BEARING_OLD, visible = floor.intValue == 1, image = viewModel.drawFloor1Old,
//                    position = GroundOverlayPosition.create(Constants.oldLocation, Constants.SIZE_OLD)
//                )
//
//                GroundOverlay(
//                    bearing = Constants.BEARING_OLD, visible = floor.intValue == 2, image = viewModel.drawFloor2Old,
//                    position = GroundOverlayPosition.create(Constants.oldLocation, Constants.SIZE_OLD)
//                )
//
//                GroundOverlay(
//                    bearing = Constants.BEARING_OLD, visible = floor.intValue == 3, image = viewModel.drawFloor3Old,
//                    position = GroundOverlayPosition.create(Constants.oldLocation, Constants.SIZE_OLD)
//                )
//
//                GroundOverlay(
//                    bearing = Constants.BEARING_OLD, visible = floor.intValue == 4, image = viewModel.drawFloor4Old,
//                    position = GroundOverlayPosition.create(Constants.oldLocation, Constants.SIZE_OLD)
//                )

                // SK Floors

//                GroundOverlay(
//                    bearing = Constants.BEARING_SK, visible = floor.intValue == 1, image = viewModel.drawFloor1Sk,
//                    position = GroundOverlayPosition.create(Constants.skLocation, Constants.SIZE_SK)
//                )
//
//                GroundOverlay(
//                    bearing = Constants.BEARING_SK, visible = floor.intValue == 2, image = viewModel.drawFloor2Sk,
//                    position = GroundOverlayPosition.create(Constants.skLocation, Constants.SIZE_SK),
//                )
            }

            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                SearchHeader(remember { mutableStateOf("") },
                    leftImgId = R.drawable.ic_search, searchResult = searchRes,
                    rightImgId = R.drawable.ic_transparent,
                    onClickRight = {}, onChange = {}) {}

                if (navigationOpen){
                    Box(modifier = Modifier
                        .padding(15.dp)
                        .fillMaxWidth()){
                        HeaderMapNavigation(locationStart ="Новий. к: ауд. 3227", locationEnd ="СК: Легка атлетика")
                    }
                }

                Spacer(modifier = Modifier.weight(1f))

                Row(modifier = Modifier
                    .padding(horizontal = 15.dp)
                    .height(140.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(modifier = Modifier
                        .width(46.dp)
                        .fillMaxHeight()
                        .then(
                            ShadowMaterial.CustomShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.tertiaryContainer)
                        )
                        .then(
                            ShadowMaterial.CustomReShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.onTertiaryContainer)
                        )
                        .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
                    ) {
                        PlacesController(placeType = camPosition, coroutineScope = coroutineScope) {
                            coroutineScope.launch{
                                when (camPosition.intValue){
                                    0 -> {
                                        if (floor.intValue != 1 || floor.intValue != 2) floor.intValue = 1
                                        cameraPositionState.animate(
                                            CameraUpdateFactory.newCameraPosition(viewModel.skCameraPosition), Constants.DURATION_ANIM)
                                    }
                                    1 -> cameraPositionState.animate(
                                        CameraUpdateFactory.newCameraPosition(viewModel.oldCameraPosition), Constants.DURATION_ANIM)
                                    2 -> {
                                        if (floor.intValue == 5 || floor.intValue == 0) floor.intValue = 1
                                        cameraPositionState.animate(
                                            CameraUpdateFactory.newCameraPosition(viewModel.newCameraPosition), Constants.DURATION_ANIM)
                                    }
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.weight(1f))
                    
                    Box(modifier = Modifier.padding(bottom = 18.dp).height(34.dp).width(18.dp)){
                        Image(painter = painterResource(id = R.drawable.map_pointer), contentDescription = null)
                    }

                    Spacer(modifier = Modifier.weight(1f))

                    Box(modifier = Modifier
                        .width(46.dp)
                        .fillMaxHeight()
                        .then(
                            ShadowMaterial.CustomShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.tertiaryContainer)
                        )
                        .then(
                            ShadowMaterial.CustomReShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.onTertiaryContainer)
                        )
                        .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
                    ) { FloorController(floor, maxFloor, minFloor) }
                }

                Spacer(modifier = Modifier.weight(1f))

                BottomNavigation(
                    state = remember { mutableIntStateOf(0) }, clickers, clickersCenter
                )
            }
        }
    }
}

@Preview
@Composable
fun NavigationScreenPreview(){
    NavigationScreen(rememberNavController())
}
