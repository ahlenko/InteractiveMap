package com.example.interactivemap.ui.resource.photo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material3.MaterialTheme
import com.example.interactivemap.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun ProfilePhotoPreview(){
    InteractiveMapTheme {
        Box(modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(200.dp))
            .background(MaterialTheme.colorScheme.onSecondary)
        ){
            Box(modifier = Modifier.fillMaxSize().padding(10.dp)
                .clip(RoundedCornerShape(200.dp)).background(MaterialTheme.colorScheme.onSecondaryContainer),
                contentAlignment = Alignment.Center
            ){
                Icon(painter = painterResource(id = R.drawable.ic_photo_not_enable), contentDescription = null,
                    modifier = Modifier.size(80.dp), tint = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.3F))
            }
        }
    }
}

@Preview
@Composable
fun ProfilePhotoPreviewPreview(){
    ProfilePhotoPreview()
}