package com.example.interactivemap.ui.resource.fields

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun LessonRow (text: String){
    InteractiveMapTheme {
        Box(modifier = Modifier.fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 5.dp).clip(RoundedCornerShape(5.dp))){
            Text(modifier = Modifier.padding(horizontal = 3.dp, vertical = 2.dp).fillMaxWidth(), text = text, style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Light), softWrap = false)
        }
    }
}
