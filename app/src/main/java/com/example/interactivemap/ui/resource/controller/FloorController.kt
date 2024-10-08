package com.example.interactivemap.ui.resource.controller

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun FloorController(floor: MutableState<Int>, maxFloor: MutableState<Int>, minFloor: MutableState<Int>, onFloorChange: () -> Unit){
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(15.dp))
                .background(MaterialTheme.colorScheme.onPrimaryContainer)
                .fillMaxSize()
        ){
            Column (modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally){

                Box (modifier = Modifier.fillMaxWidth().weight(1f).clickable {  if (floor.value != maxFloor.value) floor.value += 1
                    onFloorChange() }) {
                    Icon(painter = painterResource(id = R.drawable.ic_up), contentDescription = null,
                        tint = MaterialTheme.colorScheme.onBackground.copy(
                            alpha = if(floor.value != maxFloor.value) 1f else 0.5f),
                        modifier = Modifier.fillMaxSize().padding(top = 10.dp)
                    )
                }



Box (modifier = Modifier.fillMaxWidth().weight(1f)) {
    Text(text = floor.value.toString(),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.bodyMedium.copy(
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Medium),
        modifier = Modifier.fillMaxSize().padding(vertical = 12.dp)
    )
}

                Box (modifier = Modifier.fillMaxWidth().weight(1f).clickable { if (floor.value != minFloor.value) floor.value -= 1
                    onFloorChange() }) {
                    Icon(painter = painterResource(id = R.drawable.ic_down), contentDescription = null,
                        tint = MaterialTheme.colorScheme.onBackground.copy(
                            alpha = if(floor.value != minFloor.value) 1f else 0.5f),
                        modifier = Modifier.fillMaxSize().padding(bottom = 10.dp)
                    )
                }


            }
        }
    }
}