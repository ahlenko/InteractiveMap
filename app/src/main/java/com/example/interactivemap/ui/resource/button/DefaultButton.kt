package com.example.interactivemap.ui.resource.button

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
fun DefaultButton (buttonColor: Color, textString: String, radius : Dp,
                   textStyle: TextStyle, onClick: () -> Unit
) {
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected){
    Box(
        modifier = Modifier.clip(RoundedCornerShape(radius)).clickable { onClick() }) {
        Box(
            modifier = Modifier.background(buttonColor).fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = textString, style = textStyle)
        }
    }
}
}


@Preview
@Composable
fun DefaultButtonPreview(){
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        DefaultButton(
            buttonColor = MaterialTheme.colorScheme.onBackground,
            textString = Tr.skip, 50.dp,
            textStyle = MaterialTheme.typography.titleLarge.copy(
                color = MaterialTheme.colorScheme.background, fontWeight = FontWeight.Light)
        ){}
    }
}