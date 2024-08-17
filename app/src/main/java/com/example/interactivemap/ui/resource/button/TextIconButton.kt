package com.example.interactivemap.ui.resource.button

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import com.example.interactivemap.ui.translations.Tr

@Composable
fun TextIconButton (text: String, textStyle: TextStyle, buttonColor: Color, imageResourceId: Int,
                    radius : Dp, iconColor: Color, onClick: () -> Unit ){
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Box(modifier = Modifier
            .clip(RoundedCornerShape(radius))
            .clickable { onClick() }) {
            Row(modifier = Modifier.background(buttonColor).fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center){
                Text(text = text, style = textStyle)
                Spacer(modifier = Modifier.width(10.dp))
                Icon(painterResource(id = imageResourceId),
                    contentDescription = null, tint = iconColor,
                    modifier = Modifier.size(28.dp),)
            }
        }
    }
}

@Preview
@Composable
fun TextIconButtonPreview(){
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        TextIconButton(
            buttonColor = MaterialTheme.colorScheme.onBackground,
            text = Tr.skip, radius = 50.dp,
            imageResourceId = R.drawable.ic_demo,
            iconColor = MaterialTheme.colorScheme.background,
            textStyle = MaterialTheme.typography.titleLarge.copy(
                color = MaterialTheme.colorScheme.background, fontWeight = FontWeight.Light)
        ){}
    }
}