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
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun ProfilePhotoViewSmall(onlineType: Int){

    val onlineTypeId = when(onlineType){
        0 -> R.drawable.ic_online
        1 -> R.drawable.ic_not_at_place
        2 -> R.drawable.ic_not_disturb
        else -> R.drawable.ic_invisible
    }

    InteractiveMapTheme {
        Box(modifier = Modifier.padding(all = 3.dp).fillMaxSize().clip(RoundedCornerShape(200.dp))
            .background(MaterialTheme.colorScheme.onSecondary)
        ){
            Box(modifier = Modifier.fillMaxSize().padding(4.dp).clip(RoundedCornerShape(200.dp))
                .background(MaterialTheme.colorScheme.onSecondaryContainer), contentAlignment = Alignment.Center
            ){
                Icon(painter = painterResource(id = R.drawable.ic_profile_photo_mini), contentDescription = null,
                    modifier = Modifier.size(34.dp), tint = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.3F))
            }
        }

        Box(modifier = Modifier.fillMaxWidth().height(18.dp)){
            Box(modifier = Modifier.padding(end = 8.dp).size(18.dp).align(Alignment.TopEnd)
                .then(ShadowMaterial.CustomShadow.createModifier
                    (200.dp, MaterialTheme.colorScheme.tertiaryContainer))
                .then(ShadowMaterial.CustomReShadow.createModifier
                    (200.dp, MaterialTheme.colorScheme.onTertiaryContainer))
            ){
                Image(painter = painterResource(id = onlineTypeId), contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                ) }
        }
    }
}

@Preview
@Composable
fun ProfilePhotoViewSmallPreview(){
    ProfilePhotoViewSmall(1)
}