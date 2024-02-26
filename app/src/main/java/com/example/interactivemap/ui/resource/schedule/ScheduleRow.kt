package com.example.interactivemap.ui.resource.schedule

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun ScheduleRow (title: String, tutor: String, place: String, isSelected: Boolean){
    InteractiveMapTheme {
        Box(modifier = Modifier.padding(3.dp).clip(RoundedCornerShape(10.dp))
            .background(MaterialTheme.colorScheme.onBackground.copy(alpha = if (isSelected) 0.3f else 0f))){
            Column (modifier = Modifier.fillMaxSize().padding(horizontal = 6.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = title, Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.headlineMedium
                        .copy(color = MaterialTheme.colorScheme.onPrimary)
                )

                Text(text = tutor, Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.headlineSmall
                        .copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.5f))
                )

                Text(text = place, Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.headlineSmall
                        .copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.7f),
                            textAlign = TextAlign.Right)
                )
            }
        }
    }
}

@Preview
@Composable
fun ScheduleRowPreview(){
    ScheduleRow("Фізичне виховання", "Викладач: Умеренко В. Л.", "Каб: СК(ва)", true)
}