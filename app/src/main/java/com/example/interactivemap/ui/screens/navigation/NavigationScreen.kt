package com.example.interactivemap.ui.screens.navigation

import android.annotation.SuppressLint
import android.widget.Toast
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
import androidx.compose.runtime.CompositionContext
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
import com.google.android.gms.maps.model.LatLngBounds
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

    val movedCameraPosition by viewModel.movedCameraPosition.collectAsState()
    val locationMarkerShown by viewModel.locationMarkerShown.collectAsState()
    val googleMapRoad by viewModel.googleMapRoad.collectAsState()
    val foundNearestPointEnd by viewModel.foundNearestPointEnd.collectAsState()
    val foundNearestPointStart by viewModel.foundNearestPointStart.collectAsState()
    val movementState by viewModel.movementState.collectAsState()
    val searchResults by viewModel.searchResults.collectAsState()
    val loading by viewModel.loading.collectAsState()
    val floorView by viewModel.floor.collectAsState()

    val startLocationMarkerState =
        rememberMarkerState("startMarker", foundNearestPointStart.location)
    val endLocationMarkerState =
        rememberMarkerState("endMarker", foundNearestPointEnd.location)
    val userLocationMarkerState =
        rememberMarkerState("userMarker", movedCameraPosition.target)

    var startMarkerTitle by remember {mutableStateOf<String?>(null) }
    var endMarkerTitle by remember {mutableStateOf<String?>(null) }

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
                    Constants.baseCameraPosition), Constants.DURATION_ANIM
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
        viewModel.rememberLastCameraPosition(cameraPositionState.position)
        navHostController.navigate(SettingsScreen.route)
    }

    var navigationState by remember { mutableIntStateOf(0) }
    val camPosition = remember { mutableIntStateOf(1) }

    val clickersCenter: ArrayList<() -> Unit> = ArrayList()
    clickersCenter.add { navigationState = 1 }
    clickersCenter.add {
        viewModel.startMarkerStateVisible = false
        viewModel.endMarkerStateVisible = false
        viewModel.clearRoad()
        navigationState = 0
    }
    clickersCenter.add {
        if (viewModel.nextSegmentExist())
            viewModel.makeSegmentRoad(true)
        else{
            viewModel.startMarkerStateVisible = false
            viewModel.endMarkerStateVisible = false
            viewModel.clearRoad()
            navigationState = 0
        }
    }

    val clickersMapController: ArrayList<() -> Unit> = ArrayList()
    clickersMapController.add { viewModel.isEndPointSelectable = false }
    clickersMapController.add { viewModel.isEndPointSelectable = true }
    clickersMapController.add {navigationState = 2
        if (viewModel.startMarkerStateVisible && viewModel.endMarkerStateVisible) viewModel.makeSegmentRoad(false)
        else viewModel.showCreateRoadError()

    }

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

    LaunchedEffect(foundNearestPointStart) {
        startLocationMarkerState.position = foundNearestPointStart.location
        startMarkerTitle = foundNearestPointStart.name
        if (foundNearestPointStart.location != LatLng(0.0, 0.0)) {
            viewModel.startMarkerStateVisible = true
            floor.intValue = foundNearestPointStart.floorIndex
            if(navigationState == 2) return@LaunchedEffect
            if (viewModel.endMarkerStateVisible) {
                viewModel.makeFullRoad()
            } else { cameraPositionState.animate(
                    CameraUpdateFactory.newCameraPosition(
                        CameraPosition.Builder().target(
                            foundNearestPointStart.location
                        ).zoom(18f).bearing(15f).build()
                    ), Constants.DURATION_ANIM_ON_MOVEMENT_TO_POI
                )
            }
        }
        if (startMarkerTitle != null) {
            startLocationMarkerState.showInfoWindow()
        }
    }

    LaunchedEffect(foundNearestPointEnd) {
        endLocationMarkerState.position = foundNearestPointEnd.location
        endMarkerTitle = foundNearestPointEnd.name

        if (foundNearestPointEnd.location != LatLng(0.0, 0.0)) {
            viewModel.endMarkerStateVisible = true
            floor.intValue = foundNearestPointEnd.floorIndex
            if(navigationState == 2) return@LaunchedEffect
            if (viewModel.endMarkerStateVisible) {
                viewModel.makeFullRoad()
            } else { cameraPositionState.animate(
                    CameraUpdateFactory.newCameraPosition(
                        CameraPosition.Builder().target(
                            foundNearestPointEnd.location
                        ).zoom(18f).bearing(15f).build()
                    ), Constants.DURATION_ANIM_ON_MOVEMENT_TO_POI
                )
            }
        }
        if (endMarkerTitle != null) {
            endLocationMarkerState.showInfoWindow()
        }

    }

    LaunchedEffect(floor.intValue) {
        if (navigationState != 2)
        viewModel.disableMovementObserver()
    }

    LaunchedEffect(floorView) {
        floor.intValue = floorView
    }

    LaunchedEffect(googleMapRoad) {
        if (googleMapRoad.isNotEmpty()) {
            val boundsBuilder = LatLngBounds.builder()

            boundsBuilder.include(googleMapRoad.first())
            boundsBuilder.include(googleMapRoad.last())

            val bounds = boundsBuilder.build()
            val cameraUpdate = CameraUpdateFactory.newLatLngBounds(bounds, 100)

            cameraPositionState.animate(cameraUpdate,
                Constants.DURATION_ANIM_ON_MOVEMENT
            )
        }
    }

    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Scaffold(containerColor = MaterialTheme.colorScheme.background) { _ ->
            GoogleMap(modifier = Modifier.fillMaxSize(),
                cameraPositionState = cameraPositionState,
                properties = MapProperties(
                    minZoomPreference = Constants.ZOOM_MIN,
                    mapStyleOptions = MapStyleOptions(
                        if (ThisApplication.getInstance().darkThemeSelected) getMapStyleDarkTheme()
                        else getMapStyleWithoutLabels())),
                uiSettings = MapUiSettings(zoomControlsEnabled = false),
                onMapLoaded = { viewModel.disableLoadingState()},
                onMapClick = { latLng ->
                    viewModel.disableMovementObserver()
                    viewModel.findLocationByLatLng(latLng, floor = floor.intValue)
                }
            ) {
                if (!loading) {
                    if (googleMapRoad.isNotEmpty()) {
                        Polyline(points = googleMapRoad,
                            color = MaterialTheme.colorScheme.onError.copy(alpha = 0.82f))
                    }
                    
                    Marker(
                        visible = locationMarkerShown, anchor = Offset(0.5f,0.4f), state = userLocationMarkerState,
                        icon = ThisApplication.getInstance().bitmapDescriptorsMarkers[DescriptorRepository.USER_MARKER]
                    )

                    if (viewModel.startMarkerStateVisible) {
                        Marker(title = startMarkerTitle,
                            icon = ThisApplication.getInstance().bitmapDescriptorsMarkers[viewModel.startMarkerType],
                            state = startLocationMarkerState,
                            onInfoWindowClick = {
                                startMarkerTitle =
                                    if (startMarkerTitle == foundNearestPointStart.name) {
                                        foundNearestPointStart.description
                                    } else foundNearestPointStart.name
                            }
                        )
                    }

                    if (viewModel.endMarkerStateVisible) {
                        Marker(title = endMarkerTitle,
                            icon = ThisApplication.getInstance().bitmapDescriptorsMarkers[viewModel.endMarkerType],
                            state = endLocationMarkerState,
                            onInfoWindowClick = {
                                endMarkerTitle = if (endMarkerTitle == foundNearestPointEnd.name) {
                                    foundNearestPointEnd.description
                                } else foundNearestPointEnd.name
                            }
                        )
                    }

                    Polygon(
                        points = Constants.mapRedZone, holes = listOf(Constants.mapBorder),
                        fillColor = MaterialTheme.colorScheme.onError.copy(alpha = 0.16f),
                        strokeColor = MaterialTheme.colorScheme.onError.copy(alpha = 0.60f), strokeWidth = 4f
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

            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                if (navigationState != 2){
                    SearchHeader(leftImgId = R.drawable.ic_search,
                        searchResult = searchResults, rightImgId = R.drawable.ic_transparent,
                        onChange = { viewModel.onSearchEnter(it) }) { viewModel.onSearchSelect(it) }
                }

                if (navigationState == 2) {
                    Box(modifier = Modifier.padding(15.dp).fillMaxWidth()) {
                        HeaderMapNavigation(
                            locationStart = startMarkerTitle ?: foundNearestPointStart.id.toString(),
                            locationEnd = endMarkerTitle ?: foundNearestPointEnd.id.toString()
                        )
                    }
                }

                Spacer(modifier = Modifier.weight(1f))

                if (navigationState != 2) {
                    Row(
                        modifier = Modifier.padding(horizontal = 15.dp).height(140.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Box(
                            modifier = Modifier.width(46.dp).fillMaxHeight()
                                .then(ShadowMaterial.CustomShadow.createModifier
                                        (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                                .then(ShadowMaterial.CustomReShadow.createModifier
                                        (5.dp, MaterialTheme.colorScheme.onTertiaryContainer))
                                .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
                        ) {
                            PlacesController(
                                placeType = camPosition,
                                coroutineScope = coroutineScope
                            ) {
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
                            modifier = Modifier.width(46.dp).fillMaxHeight()
                                .then(ShadowMaterial.CustomShadow.createModifier
                                        (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                                .then(ShadowMaterial.CustomReShadow.createModifier
                                        (5.dp, MaterialTheme.colorScheme.onTertiaryContainer))
                                .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
                        ) {
                            FloorController(floor, maxFloor, minFloor
                            ) { if (navigationState ==0 ) viewModel.endMarkerStateVisible = false }
                        }
                    }
                }

                Spacer(modifier = Modifier.weight(1f))

                if(navigationState == 1){
                    Box(modifier = Modifier.padding(horizontal = 15.dp).padding(bottom = 15.dp)
                        .then(ShadowMaterial.CustomShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                        .then(ShadowMaterial.CustomReShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.onTertiaryContainer))
                        .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
                    ) {
                        BottomMapNavigation(
                            locationStart = startMarkerTitle ?: foundNearestPointStart.id.toString(),
                            locationEnd = endMarkerTitle ?: foundNearestPointEnd.id.toString(),
                            onClickCenter = clickersMapController
                        )
                    }
                }

                BottomNavigation(state = navigationState, clickers, clickersCenter)
            }
        }
    }
}
