package com.example.interactivemap.ui.resource.schedule

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun ScheduleDayController (isActive: Boolean, daySelected: Int) {
    InteractiveMapTheme {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .alpha(alpha = 0.7f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Icon(painter = painterResource(id = R.drawable.ic_left), contentDescription = null,
                tint = MaterialTheme.colorScheme.onPrimary.copy(alpha = if (isActive) 1f else 0.7f),
                modifier = Modifier.size(16.dp).clickable { }
            )

            Spacer(modifier = Modifier.weight(1f))

            Text(text = "Понеділок", modifier = Modifier.clickable {  },
                style = MaterialTheme.typography.bodyLarge
                    .copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.7f), textAlign = TextAlign.Center)
            )

            Spacer(modifier = Modifier.weight(1f))

            Icon(painter = painterResource(id = R.drawable.ic_right), contentDescription = null,
                tint = MaterialTheme.colorScheme.onPrimary.copy(alpha = if (isActive) 1f else 0.7f),
                modifier = Modifier
                    .size(16.dp)
                    .clickable { }
            )
        }
    }
}

@Preview
@Composable
fun ScheduleDayControllerPreview(){
    ScheduleDayController(isActive = true, daySelected = 0)
}