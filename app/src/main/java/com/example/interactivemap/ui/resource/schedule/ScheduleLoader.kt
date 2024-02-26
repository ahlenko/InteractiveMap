package com.example.interactivemap.ui.resource.schedule

import android.annotation.SuppressLint
import android.content.Context
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.logic.model.datamodel.ScheduleDay
import com.example.interactivemap.logic.util.JSONLoadSaveHelper
import com.example.interactivemap.ui.resource.button.TextIconButton
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.screens.schedule.viewer.ScheduleViewerViewModel
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun ScheduleLoader(viewerViewModel: ScheduleViewerViewModel){
    val selectedFileUri = remember { mutableStateOf<Uri?>(null) }
    val launcher = rememberLauncherForActivityResult(
        ActivityResultContracts.GetContent()) { selectedFileUri.value = it }

    val context = LocalContext.current
    val borderRadius = 18.dp

    InteractiveMapTheme {
        Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally){
            Row(modifier = Modifier.weight(1f).fillMaxWidth()){
                Box(modifier = Modifier.weight(1f)
                    .then(ShadowMaterial.CustomShadow.createModifier
                            (borderRadius, MaterialTheme.colorScheme.tertiaryContainer))
                    .then(ShadowMaterial.CustomReShadow.createModifier
                            (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer))
                    .alpha(if (viewerViewModel.scheduleExist.value) 1f else 0.7f)
                ){
                    TextIconButton(
                        buttonColor = MaterialTheme.colorScheme.onPrimaryContainer,
                        text = stringResource(id = R.string.save), radius = borderRadius,
                        imageResourceId = R.drawable.ic_download,
                        iconColor = MaterialTheme.colorScheme.onBackground,
                        textStyle = MaterialTheme.typography.headlineLarge.copy(
                            color = MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.Light)
                    ){if (viewerViewModel.scheduleExist.value) viewerViewModel.onSaveJsonClick() }
                }
                Spacer(modifier = Modifier.width(15.dp))
                Box(modifier = Modifier.weight(1f)
                    .then(ShadowMaterial.CustomShadow.createModifier
                            (borderRadius, MaterialTheme.colorScheme.tertiaryContainer))
                    .then(ShadowMaterial.CustomReShadow.createModifier
                            (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer))
                ){
                    TextIconButton(
                        buttonColor = MaterialTheme.colorScheme.onPrimaryContainer,
                        text = stringResource(id = R.string.load), radius = borderRadius,
                        imageResourceId = R.drawable.ic_upload,
                        iconColor = MaterialTheme.colorScheme.onBackground,
                        textStyle = MaterialTheme.typography.headlineLarge.copy(
                            color = MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.Light)
                    ){ launcher.launch("application/json") }
                }
            }

            Spacer(modifier = Modifier.height(15.dp))

            Box(modifier = Modifier.weight(1f).fillMaxWidth()
                .then(ShadowMaterial.CustomShadow.createModifier
                        (borderRadius, MaterialTheme.colorScheme.tertiaryContainer))
                .then(ShadowMaterial.CustomReShadow.createModifier
                        (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer))
            ){
                TextIconButton(
                    buttonColor = MaterialTheme.colorScheme.onBackground,
                    text = stringResource(if (!viewerViewModel.scheduleExist.value)
                        R.string.create_schedule
                    else R.string.edit_schedule), radius = borderRadius,
                    imageResourceId = R.drawable.ic_edit,
                    iconColor = MaterialTheme.colorScheme.background,
                    textStyle = MaterialTheme.typography.headlineLarge.copy(
                        color = MaterialTheme.colorScheme.background, fontWeight = FontWeight.Light)
                ){viewerViewModel.goToEditScreen(true)}
            }
        }
    }

    selectedFileUri.value?.let { uri ->
        LaunchedEffect(uri) {
            loadJsonFile(context, uri) { schedule ->
                viewerViewModel.onJSONObjectLoaded(schedule)
            }
        }
    }
}

suspend fun loadJsonFile(context: Context, fileUri: Uri, onObjectLoaded: (ArrayList<ScheduleDay>) -> Unit) {
    withContext(Dispatchers.IO) {
        val loadedString = JSONLoadSaveHelper.readFileFromSharedStorage(fileUri, context)
        val schedule = JSONLoadSaveHelper.parseJsonFromString(loadedString)
        withContext(Dispatchers.Main) {
            onObjectLoaded(schedule)
        }
    }
}