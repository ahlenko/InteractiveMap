package com.example.interactivemap.ui.resource.button

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun TextViewRowIcon (text: MutableState<String>, textStyle: TextStyle, iconId: Int, click: () -> Unit){
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Row(horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize()
                .border(2.dp, MaterialTheme.colorScheme.onBackground, RoundedCornerShape(11.dp))
        ) {
            Text(
                modifier = Modifier.padding(horizontal = 15.dp).weight(1f),
                text = text.value, style = textStyle,
            )

            Icon(modifier = Modifier.padding(end = 5.dp).size(28.dp).clickable { }, tint = MaterialTheme.colorScheme.onBackground,
                painter = painterResource(id = iconId), contentDescription = null)
        }
    }
}