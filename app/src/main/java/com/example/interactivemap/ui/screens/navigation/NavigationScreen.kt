package com.example.interactivemap.ui.screens.navigation

import android.annotation.SuppressLint
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
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.Constants
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.logic.navigation.ScheduleViewer
import com.example.interactivemap.logic.navigation.SettingsScreen
import com.example.interactivemap.logic.repository.DescriptorRepository
import com.example.interactivemap.logic.util.GoogleMapUtil.getMapStyleDarkTheme
import com.example.interactivemap.logic.util.GoogleMapUtil.getMapStyleWithoutLabels
import com.example.interactivemap.ui.dialogs.ConfirmationDialog
import com.example.interactivemap.ui.dialogs.LoadingDialog
import com.example.interactivemap.ui.dialogs.NavigationDialog
import com.example.interactivemap.ui.resource.controller.BottomMapNavigation
import com.example.interactivemap.ui.resource.controller.BottomNavigation
import com.example.interactivemap.ui.resource.controller.FloorController
import com.example.interactivemap.ui.resource.controller.HeaderMapNavigation
import com.example.interactivemap.ui.resource.controller.PlacesController
import com.example.interactivemap.ui.resource.header.SearchHeader
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.GroundOverlay
import com.google.maps.android.compose.GroundOverlayPosition
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.Polygon
import com.google.maps.android.compose.Polyline
import com.google.maps.android.compose.rememberCameraPositionState
import com.google.maps.android.compose.rememberMarkerState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "MutableCollectionMutableState",
    "CoroutineCreationDuringComposition")
@Composable
fun NavigationScreen( navHostController: NavHostController,
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    viewModel: NavigationViewModel = viewModel()
) {
    val cameraPositionState =
        rememberCameraPositionState { position = ThisApplication.getInstance().lastCameraPosition }
    val startLocationMarkerState =
        rememberMarkerState("startMarker", Constants.baseCameraPosition.target)
    val endLocationMarkerState =
        rememberMarkerState("endMarker", Constants.baseCameraPosition.target)
    val userLocationMarkerState =
        rememberMarkerState("userMarker", Constants.baseCameraPosition.target)
    val middleLocationMarkerState =
        rememberMarkerState("middleMarker", Constants.baseCameraPosition.target)
    val movedCameraPosition by viewModel.movedCameraPosition.collectAsState()
    val locationMarkerShown by viewModel.locationMarkerShown.collectAsState()
    val googleMapRoad by viewModel.googleMapRoad.collectAsState()
    val foundNearestPoint by viewModel.foundNearestPoint.collectAsState()
    val movementState by viewModel.movementState.collectAsState()
    val searchResults by viewModel.searchResults.collectAsState()
    val loading by viewModel.loading.collectAsState()

    var nearestMarkerTitle by remember {mutableStateOf<String?>(null) }

    if (viewModel.activateGPSDialogShown  && !viewModel.loadingMapComponent && !viewModel.dialogGPSBeShown) {
        InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
            ConfirmationDialog(
                titleRes = R.string.permission,
                textRes = R.string.permission_description,
                dismissRes = R.string.permission_denied, confirmRes = R.string.permission_grant,
                reverseColors = true,
                onDismiss = {
                    viewModel.dialogGPSBeShown = true
                    viewModel.activateGPSDialogShown = false
                }, onConfirm = {
                    viewModel.dialogGPSBeShown = true
                    viewModel.openGPSSettings()
                })
        }
    }

    if (viewModel.navigationEventDialogShown) {
        InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
            NavigationDialog(
                viewModel.navigationEventDialogData.collectAsState()){}
        }
    }

    if (viewModel.loadingMapComponent) {
        InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
            LoadingDialog()
        }
    }

    val clickers: ArrayList<() -> Unit> = ArrayList()
    clickers.add {
        viewModel.disableMovementObserver()
        coroutineScope.launch {
            cameraPositionState.animate(
                CameraUpdateFactory.newCameraPosition(
                    Constants.baseCameraPosition
                ), Constants.DURATION_ANIM
            )
        }
    }
    clickers.add {
        viewModel.setMovementObserver()
        coroutineScope.launch {
            cameraPositionState.animate(
                CameraUpdateFactory.newCameraPosition(movedCameraPosition), Constants.DURATION_ANIM
            )
        }
    }
    clickers.add {
        viewModel.rememberLastCameraPosition(cameraPositionState.position)
        navHostController.navigate(ScheduleViewer.route)
    }
    clickers.add {
        viewModel.makeTestRoad()
//        viewModel.rememberLastCameraPosition(cameraPositionState.position)
//        navHostController.navigate(SettingsScreen.route)
    }

    var navigationState by remember { mutableIntStateOf(0) }
    val camPosition = remember { mutableIntStateOf(1) }

    val clickersCenter: ArrayList<() -> Unit> = ArrayList()
    clickersCenter.add { navigationState = 1 }
    clickersCenter.add { navigationState = 0 }
    clickersCenter.add { navigationState = 0 }

    val clickersMapController: ArrayList<() -> Unit> = ArrayList()
    clickersMapController.add {  }
    clickersMapController.add {  }
    clickersMapController.add {  }

    val floor = remember { mutableIntStateOf(1) }
    val maxFloor = remember { mutableIntStateOf(5) }
    val minFloor = remember { mutableIntStateOf(0) }

    LaunchedEffect(movedCameraPosition) {
        userLocationMarkerState.position = movedCameraPosition.target
        if (movementState) {
            cameraPositionState.animate(
                CameraUpdateFactory.newCameraPosition(movedCameraPosition),
                Constants.DURATION_ANIM_ON_MOVEMENT
            )
        }
    }

    LaunchedEffect(foundNearestPoint) {

        startLocationMarkerState.position = foundNearestPoint.location
        nearestMarkerTitle = foundNearestPoint.name
        viewModel.locationMarkerStateVisible = true
        if (foundNearestPoint.location != LatLng(0.0, 0.0)) {
            floor.intValue = foundNearestPoint.floorIndex
        cameraPositionState.animate(
            CameraUpdateFactory.newCameraPosition(CameraPosition.Builder().target(
                foundNearestPoint.location).zoom(18f).bearing(15f).build()),
            Constants.DURATION_ANIM_ON_MOVEMENT_TO_POI
        )}
        if (nearestMarkerTitle != null) {
            startLocationMarkerState.showInfoWindow()
        }
    }

    LaunchedEffect(floor.intValue) {
        if (googleMapRoad.isNotEmpty()) viewModel.rebuildRoadByFloor(floor.intValue)
        viewModel.disableMovementObserver()
    }

    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Scaffold(containerColor = MaterialTheme.colorScheme.background) { _ ->
            GoogleMap(modifier = Modifier.fillMaxSize(),
                cameraPositionState = cameraPositionState,
                properties = MapProperties(
                    minZoomPreference = Constants.ZOOM_MIN,
                    mapStyleOptions = MapStyleOptions(if (ThisApplication.getInstance().darkThemeSelected)  getMapStyleDarkTheme() else getMapStyleWithoutLabels())),
                uiSettings = MapUiSettings(zoomControlsEnabled = false),
                onMapLoaded = { viewModel.disableLoadingState()},
                onMapClick = { latLng ->
                    viewModel.locationMarkerStateVisible = false
                    viewModel.disableMovementObserver()
                    viewModel.findLocationByLatLng(latLng, floor = floor.intValue)
                }
            ) {
                if (!loading) {
                    Marker(
                        visible = locationMarkerShown, anchor = Offset(0.5f,0.4f), state = userLocationMarkerState,
                        icon = ThisApplication.getInstance().bitmapDescriptorsMarkers[DescriptorRepository.USER_MARKER]
                    )

                    Marker(title = nearestMarkerTitle,
                        icon = ThisApplication.getInstance().bitmapDescriptorsMarkers[DescriptorRepository.LOCATION_MARKER],
                        state = startLocationMarkerState, visible = viewModel.locationMarkerStateVisible,
                        onInfoWindowClick = {
                            nearestMarkerTitle =
                                if (nearestMarkerTitle == foundNearestPoint.name)
                                { foundNearestPoint.description } else foundNearestPoint.name
                        }
                    )

                    Polygon(
                        points = Constants.mapRedZone, holes = listOf(Constants.mapBorder),
                        fillColor = MaterialTheme.colorScheme.onError.copy(alpha = 0.20f),
                        strokeColor = MaterialTheme.colorScheme.onError, strokeWidth = 5f
                    )

                    // Background
                    viewModel.descriptorRepository.bitmapDescriptors.value[DescriptorRepository.LAYER_BACKGROUND]?.let {
                        GroundOverlay(bearing = Constants.BEARING_BASE, image = it,
                            position = GroundOverlayPosition.create(Constants.baseLocation, Constants.SIZE_BASE),)
                    }

                    // Old Floors
                    viewModel.descriptorRepository.bitmapDescriptors.value[DescriptorRepository.LAYER_0_OLD]?.let {
                        GroundOverlay(bearing = Constants.BEARING_OLD, visible = floor.intValue == 0, image = it,
                            position = GroundOverlayPosition.create(Constants.oldLocation, Constants.SIZE_OLD))
                    }

                    viewModel.descriptorRepository.bitmapDescriptors.value[DescriptorRepository.LAYER_1_OLD]?.let {
                        GroundOverlay(bearing = Constants.BEARING_OLD, visible = floor.intValue == 1, image = it,
                            position = GroundOverlayPosition.create(Constants.oldLocation, Constants.SIZE_OLD))
                    }

                    viewModel.descriptorRepository.bitmapDescriptors.value[DescriptorRepository.LAYER_2_OLD]?.let {
                        GroundOverlay(bearing = Constants.BEARING_OLD, visible = floor.intValue == 2, image = it,
                            position = GroundOverlayPosition.create(Constants.oldLocation, Constants.SIZE_OLD))
                    }

                    viewModel.descriptorRepository.bitmapDescriptors.value[DescriptorRepository.LAYER_3_OLD]?.let {
                        GroundOverlay(bearing = Constants.BEARING_OLD, visible = floor.intValue == 3, image = it,
                            position = GroundOverlayPosition.create(Constants.oldLocation, Constants.SIZE_OLD))
                    }

                    viewModel.descriptorRepository.bitmapDescriptors.value[DescriptorRepository.LAYER_4_OLD]?.let {
                        GroundOverlay(bearing = Constants.BEARING_OLD, visible = floor.intValue == 4, image = it,
                            position = GroundOverlayPosition.create(Constants.oldLocation, Constants.SIZE_OLD))
                    }

                    viewModel.descriptorRepository.bitmapDescriptors.value[DescriptorRepository.LAYER_5_OLD]?.let {
                        GroundOverlay(bearing = Constants.BEARING_OLD, visible = floor.intValue == 5, image = it,
                            position = GroundOverlayPosition.create(Constants.oldLocation, Constants.SIZE_OLD))
                    }

                    // New Floors
                    viewModel.descriptorRepository.bitmapDescriptors.value[DescriptorRepository.LAYER_1_NEW]?.let {
                        GroundOverlay(
                            bearing = Constants.BEARING_NEW, visible = floor.intValue == 1, image = it,
                            position = GroundOverlayPosition.create(Constants.newLocation, Constants.SIZE_NEW))
                    }

                    viewModel.descriptorRepository.bitmapDescriptors.value[DescriptorRepository.LAYER_2_NEW]?.let {
                        GroundOverlay(bearing = Constants.BEARING_NEW, visible = floor.intValue == 2, image = it,
                            position = GroundOverlayPosition.create(Constants.newLocation, Constants.SIZE_NEW))
                    }

                    viewModel.descriptorRepository.bitmapDescriptors.value[DescriptorRepository.LAYER_3_NEW]?.let {
                        GroundOverlay(bearing = Constants.BEARING_NEW, visible = floor.intValue == 3, image = it,
                            position = GroundOverlayPosition.create(Constants.newLocation, Constants.SIZE_NEW))
                    }

                    viewModel.descriptorRepository.bitmapDescriptors.value[DescriptorRepository.LAYER_4_NEW]?.let {
                        GroundOverlay(bearing = Constants.BEARING_NEW, visible = floor.intValue == 4, image = it,
                            position = GroundOverlayPosition.create(Constants.newLocation, Constants.SIZE_NEW))
                    }

                    // SK Floors

                    viewModel.descriptorRepository.bitmapDescriptors.value[DescriptorRepository.LAYER_1_SK]?.let {
                        GroundOverlay(bearing = Constants.BEARING_SK, visible = floor.intValue == 1, image = it,
                            position = GroundOverlayPosition.create(Constants.skLocation, Constants.SIZE_SK))
                    }

                    viewModel.descriptorRepository.bitmapDescriptors.value[DescriptorRepository.LAYER_2_SK]?.let {
                        GroundOverlay(bearing = Constants.BEARING_SK, visible = floor.intValue == 2, image = it,
                            position = GroundOverlayPosition.create(Constants.skLocation, Constants.SIZE_SK),)
                    }
                }
            }

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                if (navigationState != 2){
                    SearchHeader(
                        leftImgId = R.drawable.ic_search,
                        searchResult = searchResults,
                        rightImgId = R.drawable.ic_transparent,
                        onChange = { viewModel.onSearchEnter(it) }) { viewModel.onSearchSelect(it) }
                }

                if (navigationState == 2) {
                    Box(
                        modifier = Modifier
                            .padding(15.dp)
                            .fillMaxWidth()
                    ) {
                        HeaderMapNavigation(
                            locationStart = "Новий. к: ауд. 3227",
                            locationEnd = "СК: Легка атлетика"
                        )
                    }
                }

                Spacer(modifier = Modifier.weight(1f))

                Row(
                    modifier = Modifier
                        .padding(horizontal = 15.dp)
                        .height(140.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(
                        modifier = Modifier
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
                            viewModel.disableMovementObserver()
                            coroutineScope.launch {
                                when (camPosition.intValue) {
                                    0 -> {
                                        if (floor.intValue != 1 || floor.intValue != 2) floor.intValue =
                                            1
                                        cameraPositionState.animate(
                                            CameraUpdateFactory.newCameraPosition(
                                                Constants.skCameraPosition
                                            ), Constants.DURATION_ANIM
                                        )
                                    }

                                    1 -> {
                                        if (floor.intValue == 5 || floor.intValue == 0) floor.intValue =
                                            1
                                        cameraPositionState.animate(
                                            CameraUpdateFactory.newCameraPosition(
                                                Constants.newCameraPosition
                                            ), Constants.DURATION_ANIM
                                        )
                                    }

                                    2 -> {
                                        cameraPositionState.animate(
                                            CameraUpdateFactory.newCameraPosition(
                                                Constants.oldCameraPosition
                                            ), Constants.DURATION_ANIM
                                        )
                                    }
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.weight(1f))

                    Box(
                        modifier = Modifier
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
                    ) { FloorController(floor, maxFloor, minFloor){viewModel.locationMarkerStateVisible = false} }
                }

                Spacer(modifier = Modifier.weight(1f))

                if(navigationState == 1){
                    Box(modifier = Modifier
                        .padding(horizontal = 15.dp)
                        .padding(bottom = 15.dp)
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
                        BottomMapNavigation(
                            locationStart = "", locationEnd = "",
                            onClickCenter = clickersMapController
                        )
                    }
                }

                BottomNavigation(
                    state = navigationState,
                    clickers,
                    clickersCenter
                )
            }
        }
    }
}
