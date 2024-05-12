package com.example.interactivemap.ui.resource.controller

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun PlacesController(placeType: MutableState<Int>,  coroutineScope: CoroutineScope, onChange: () -> Unit){
    InteractiveMapTheme {
        Box(modifier = Modifier.clip(RoundedCornerShape(15.dp))
                .background(MaterialTheme.colorScheme.onPrimaryContainer).fillMaxSize()){
            Column (modifier = Modifier.fillMaxSize()
                .padding(horizontal = 5.dp, vertical = 10.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally){

                Text(text = stringResource(id = R.string.sk),
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = MaterialTheme.colorScheme.onBackground.copy(
                            alpha = if(placeType.value == 0) 1f else 0.5f),
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier.weight(1f).clickable
                        { if (placeType.value != 0) {
                            coroutineScope.launch { onChange() }
                            placeType.value = 0
                        } }
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(text = stringResource(id = R.string.n),
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = MaterialTheme.colorScheme.onBackground.copy(
                            alpha = if(placeType.value == 1) 1f else 0.5f),
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier.weight(1f).clickable
                        { if (placeType.value != 1) {
                            coroutineScope.launch { onChange() }
                            placeType.value = 1
                        } }
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(text = stringResource(id = R.string.s),
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = MaterialTheme.colorScheme.onBackground.copy(
                            alpha = if(placeType.value == 2) 1f else 0.5f),
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier.weight(1f).clickable
                        { if (placeType.value != 2) {
                            coroutineScope.launch { onChange() }
                            placeType.value = 2
                        } }
                )
            }
        }
    }
}
