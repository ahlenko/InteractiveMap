package com.example.interactivemap.ui.resource.button

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.ContentAlpha
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.interactivemap.R
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import kotlinx.coroutines.flow.StateFlow

@Composable
fun TextEditRowIcon (text: StateFlow<String>, textStyle: TextStyle, iconId: Int, onClick:()->Unit, onTextEdit: (text:String)-> Unit){
    InteractiveMapTheme {
        Row(horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize().border(2.dp, MaterialTheme.colorScheme.onBackground, RoundedCornerShape(11.dp))
        ) {
            Box(modifier = Modifier.padding(horizontal = 12.dp).weight(1f)) {
                BasicTextField(value = text.collectAsState().value,
                    onValueChange = {
                        onTextEdit(it)
                    }, textStyle = textStyle,
                )

                if (text.collectAsState().value.isEmpty()) {
                    Text(text = stringResource(id = R.string.add_lessons),
                        style = textStyle, color = Color.Gray,
                        modifier = Modifier.alpha(ContentAlpha.medium)
                    )
                }
            }

            Box(modifier = Modifier
                .padding(end = 10.dp)
                .size(34.dp).clip(RoundedCornerShape(5.dp))){
                IconButton(size = 34.dp, iconColor = MaterialTheme.colorScheme.onBackground,
                    imageResourceId = iconId, radius = 0.dp, buttonColor = Color.Transparent){onClick()}
            }
        }
    }
}