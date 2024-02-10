package com.example.interactivemap.ui.resource.schedule

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun ScheduleGroupRow (isDoubled: Boolean, number: String, isLast: Boolean){
    InteractiveMapTheme {
        Column (modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally){

                Box(modifier = Modifier.height(1.dp).fillMaxWidth()
                        .background(MaterialTheme.colorScheme.onBackground)
                )


            Row (modifier = Modifier.weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly){

                Text(text = number, Modifier.fillMaxWidth(0.16f),
                    style = MaterialTheme.typography.labelLarge
                        .copy(color = MaterialTheme.colorScheme.onBackground
                            , textAlign = TextAlign.Center)
                )

                Box(modifier = Modifier.width(1.dp).fillMaxHeight()
                    .background(MaterialTheme.colorScheme.onBackground))

                Column (modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally){

                    Box(modifier = Modifier.weight(1f).clickable {  }){
                        ScheduleRow ("Фізичне виховання", "Викладач: Умеренко В. Л.", "Каб: СК(ва)", true)
                    }

                    if (isDoubled){
                    Box(modifier = Modifier.height(1.dp).fillMaxWidth()
                        .background(MaterialTheme.colorScheme.onBackground))

                     Box(modifier = Modifier.weight(1f).clickable {  }){
                        ScheduleRow ("Економіка ПЗ", "Викладач: Клименко І. В.", "Каб: 421", false) }
                    }
                }
            }

            if (isLast) {
                Box(modifier = Modifier.height(1.dp).fillMaxWidth()
                    .background(MaterialTheme.colorScheme.onBackground)
                )
            }
        }

    }
}

@Preview
@Composable
fun ScheduleGroupRowPreview(){
    ScheduleGroupRow(true, "II", false)
}