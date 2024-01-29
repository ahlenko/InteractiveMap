package com.example.interactivemap.ui.resource.controller

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ui.resource.button.IconButton
import com.example.interactivemap.ui.resource.button.TextIconButton
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun ScheduleEditor(){
    val borderRadius = 18.dp
    val editorType = 0
    val isItemSelected = false
    val isItemDoubled = false

    InteractiveMapTheme {
        Column (modifier = Modifier.padding(borderRadius),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally){
            Row(modifier = Modifier.weight(1f)){
                Box(modifier = Modifier.aspectRatio(1f).height(IntrinsicSize.Min)
                    .then(ShadowMaterial.CustomShadow.createModifier
                            (borderRadius, MaterialTheme.colorScheme.tertiaryContainer))
                    .then(ShadowMaterial.CustomReShadow.createModifier
                            (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer))
                    .alpha(if (isItemSelected) 1f else 0.7f)
                ){
                    IconButton(
                        buttonColor = MaterialTheme.colorScheme.onError, radius = borderRadius,
                        imageResourceId = R.drawable.ic_trashbox, size = 28.dp,
                        iconColor = MaterialTheme.colorScheme.background,
                    ){}
                }

                Spacer(modifier = Modifier.width(15.dp))

                Box(modifier = Modifier.weight(1f)
                    .then(ShadowMaterial.CustomShadow.createModifier
                        (borderRadius, MaterialTheme.colorScheme.tertiaryContainer))
                    .then(ShadowMaterial.CustomReShadow.createModifier
                        (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer))
                    .alpha(if (isItemDoubled && isItemSelected) 1f else 0.7f)
                ){
                    TextIconButton(
                        buttonColor = MaterialTheme.colorScheme.onPrimaryContainer,
                        text = stringResource(id = R.string.signifier), radius = borderRadius,
                        imageResourceId = R.drawable.ic_next_mini,
                        iconColor = MaterialTheme.colorScheme.onBackground,
                        textStyle = MaterialTheme.typography.headlineLarge.copy(
                            color = MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.Light)
                    ){}
                }

                Spacer(modifier = Modifier.width(15.dp))

                Box(modifier = Modifier.weight(1f)
                    .then(ShadowMaterial.CustomShadow.createModifier
                        (borderRadius, MaterialTheme.colorScheme.tertiaryContainer))
                    .then(ShadowMaterial.CustomReShadow.createModifier
                        (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer))
                    .alpha(if (isItemSelected) 1f else 0.7f)
                ){
                    TextIconButton(
                        buttonColor = MaterialTheme.colorScheme.onPrimaryContainer,
                        text = stringResource(id = R.string.change), radius = borderRadius,
                        imageResourceId = R.drawable.ic_edit,
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
                    text = stringResource(when (editorType) {
                        0 -> R.string.save_schedule
                        1 -> R.string.save_changes
                        else -> R.string.add_read_data
                    }), radius = borderRadius,
                    imageResourceId = R.drawable.ic_save,
                    iconColor = MaterialTheme.colorScheme.background,
                    textStyle = MaterialTheme.typography.headlineLarge.copy(
                        color = MaterialTheme.colorScheme.background, fontWeight = FontWeight.Light)
                ){}
            }
        }
    }
}