package com.example.interactivemap.ui.resource.button

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ChangeStatusButton (isActivate: Boolean, text:String, iconId: Int, onClick: () -> Unit){
    Box(modifier = Modifier.border(
            2.dp, if (isActivate)
                MaterialTheme.colorScheme.onBackground else Color.Transparent,
            RoundedCornerShape(8.dp)
        ).clickable { onClick() }
    ) {
        Row(
            modifier = Modifier.padding(6.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically){
            Text(modifier = Modifier.weight(1f), text = text, style = MaterialTheme.typography.bodySmall, softWrap = false)
            Spacer(modifier = Modifier.width(12.dp))
            Image(modifier = Modifier.size(18.dp), painter = painterResource(id = iconId), contentDescription = null)
        }
    }
}