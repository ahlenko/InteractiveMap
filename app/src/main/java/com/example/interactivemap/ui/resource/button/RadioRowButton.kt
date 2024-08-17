package com.example.interactivemap.ui.resource.button

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun RadioRowButton (checked: Boolean, textId: String, onClick: () -> Unit){
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Row (verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Absolute.Left,
            modifier = Modifier.clickable {onClick()}){
            RadioButton( selected = checked, onClick = {onClick() },
                modifier = Modifier.padding(all = 0.dp).size(15.dp),
                colors =  RadioButtonDefaults.colors(
                    selectedColor = MaterialTheme.colorScheme.onBackground,
                    unselectedColor = MaterialTheme.colorScheme.onBackground,
                )
            )

            Text( modifier = Modifier.padding(horizontal = 10.dp).weight(1f),
                text = textId,
                style = MaterialTheme.typography.titleSmall
                    .copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.7f))
            )
        }
    }
}

