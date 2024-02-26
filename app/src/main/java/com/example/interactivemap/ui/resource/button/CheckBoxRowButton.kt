package com.example.interactivemap.ui.resource.button

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
fun CheckBoxRowButton (isChecked: Boolean, text: String, stateChange:()->Unit){
    InteractiveMapTheme {
        Box(modifier = Modifier.fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 5.dp).clip(RoundedCornerShape(5.dp))
            .clickable { stateChange() }){
            Row (modifier =  Modifier.padding(horizontal = 3.dp, vertical = 2.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically){

            Text(modifier = Modifier.weight(1f), text = text, maxLines = 1, style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Light), softWrap = false)

            Spacer(modifier = Modifier.width(12.dp))

            Box(modifier = Modifier.border(
                1.6.dp, MaterialTheme.colorScheme.onBackground, RoundedCornerShape(6.dp)
            )
            ) {
                Checkbox(
                    modifier = Modifier.padding(3.dp).size(18.dp),
                    checked = isChecked,
                    onCheckedChange = { stateChange() },
                    colors = CheckboxDefaults.colors(
                        checkmarkColor = MaterialTheme.colorScheme.onBackground,
                        uncheckedColor = Color.Transparent,
                        checkedColor = Color.Transparent,
                        disabledColor = Color.Transparent,
                        disabledIndeterminateColor = Color.Transparent
                    )
                )
            }
        }
        }

    }
}
