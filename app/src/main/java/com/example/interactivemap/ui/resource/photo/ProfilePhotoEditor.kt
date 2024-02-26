package com.example.interactivemap.ui.resource.photo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ui.resource.button.IconButton
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun ProfilePhotoEditor(onlineType: Int, statusClick:() -> Unit, photoClick:()-> Unit){

    val onlineTypeId = when(onlineType){
        0 -> R.drawable.ic_online
        1 -> R.drawable.ic_not_at_place
        2 -> R.drawable.ic_not_disturb
        else -> R.drawable.ic_invisible
    }

    InteractiveMapTheme {
        Box {
            Box(modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(200.dp)).background(MaterialTheme.colorScheme.onSecondary)
            ) {
                Box(modifier = Modifier.fillMaxSize().padding(10.dp).clip(RoundedCornerShape(200.dp))
                        .background(MaterialTheme.colorScheme.onSecondaryContainer),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(painter = painterResource(id = R.drawable.ic_profile_photo),
                        contentDescription = null,
                        modifier = Modifier.size(70.dp),
                        tint = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.3F)
                    )
                }
            }

            Box(modifier = Modifier.align(Alignment.BottomStart).size(60.dp).clickable { }
                .then(ShadowMaterial.CustomShadow.createModifier
                        (14.dp, MaterialTheme.colorScheme.tertiaryContainer.copy(alpha = 0.09f)))
                .then(ShadowMaterial.CustomReShadow.createModifier
                        (14.dp, MaterialTheme.colorScheme.onTertiaryContainer.copy(alpha = 0.12f)))
            ) {
                IconButton(buttonColor = MaterialTheme.colorScheme.onErrorContainer.copy(alpha = 0.2f),
                    imageResourceId = R.drawable.ic_photo_add, radius = 14.dp,
                    iconColor = MaterialTheme.colorScheme.onBackground, size = 42.dp
                ) { photoClick() }
            }


            Box(modifier = Modifier.fillMaxWidth().height(36.dp)

            ) {
                Box(modifier = Modifier.padding(end = 25.dp).size(36.dp).align(Alignment.TopEnd)
                        .then(ShadowMaterial.CustomShadow.createModifier
                                (200.dp, MaterialTheme.colorScheme.tertiaryContainer))
                        .then(ShadowMaterial.CustomReShadow.createModifier
                                (200.dp, MaterialTheme.colorScheme.onTertiaryContainer))
                ) {
                    Image(painter = painterResource(id = onlineTypeId), contentDescription = null,
                        modifier = Modifier.fillMaxSize().clickable{ statusClick() }
                    )
                }
            }

        }
    }
}