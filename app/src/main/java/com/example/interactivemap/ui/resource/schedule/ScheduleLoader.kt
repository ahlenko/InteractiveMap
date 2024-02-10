package com.example.interactivemap.ui.resource.schedule

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ui.resource.button.TextIconButton
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun ScheduleLoader(){
    val borderRadius = 18.dp
    val isExportActive = false

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
                    .alpha(if (isExportActive) 1f else 0.7f)
                ){
                    TextIconButton(
                        buttonColor = MaterialTheme.colorScheme.onPrimaryContainer,
                        text = stringResource(id = R.string.save), radius = borderRadius,
                        imageResourceId = R.drawable.ic_download,
                        iconColor = MaterialTheme.colorScheme.onBackground,
                        textStyle = MaterialTheme.typography.headlineLarge.copy(
                            color = MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.Light)
                    ){}
                }
                Spacer(modifier = Modifier.width(25.dp))
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
                    ){}
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
                    text = stringResource(if (isExportActive) R.string.create_schedule
                    else R.string.edit_schedule), radius = borderRadius,
                    imageResourceId = R.drawable.ic_edit,
                    iconColor = MaterialTheme.colorScheme.background,
                    textStyle = MaterialTheme.typography.headlineLarge.copy(
                        color = MaterialTheme.colorScheme.background, fontWeight = FontWeight.Light)
                ){}
            }
        }
    }
}

@Preview
@Composable
fun ScheduleLoaderPreview(){
    ScheduleLoader()
}