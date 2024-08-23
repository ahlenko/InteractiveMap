package com.example.interactivemap.ui.resource.button

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.ui.theme.InteractiveMapTheme


@Composable
fun IconButton (buttonColor: Color, imageResourceId: Int, radiusTop : Dp, radiusBottom : Dp,
                   iconColor: Color, size: Dp, onClick: () -> Unit){

    var isPressed by remember { mutableStateOf(false) }

    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Box(modifier = Modifier.clip(RoundedCornerShape( topStart= radiusTop, topEnd =radiusTop, bottomStart = radiusBottom, bottomEnd = radiusBottom)).fillMaxSize().background(if (isPressed) Color.Gray.copy(alpha = 0.3f) else buttonColor)
            .pointerInput(Unit) {
                detectTapGestures(
                    onPress = {
                        isPressed = true
                        tryAwaitRelease()
                        isPressed = false
                        onClick()
                    }
                )
            })
        {
            Box(
                modifier = Modifier.background(buttonColor).fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painterResource(id = imageResourceId),
                    contentDescription = null, tint = iconColor,
                    modifier = Modifier.size(size)
                )
            }
        }
    }
}