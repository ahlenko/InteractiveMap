package com.example.interactivemap.ui.resource.controller

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ui.resource.button.IconButton
import com.example.interactivemap.ui.resource.material.CustomShape
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun BottomNavigation(state: MutableState<Int>, clickers: ArrayList<() -> Unit>, onClickCenter: ArrayList<() -> Unit>){
    InteractiveMapTheme {
        when(state.value){
            0 -> {
                Box(modifier = Modifier.fillMaxWidth()){
                    Box(modifier = Modifier.align(Alignment.BottomCenter).height(66.dp).fillMaxWidth()
                        .then(ShadowMaterial.CustomShadow.createModifier
                                (15.dp, MaterialTheme.colorScheme.tertiaryContainer))
                        .then(ShadowMaterial.CustomReShadow.createModifier
                                (15.dp, MaterialTheme.colorScheme.onTertiaryContainer))
                        .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
                    ) {
                        Box(modifier = Modifier.background(
                                    MaterialTheme.colorScheme.onPrimaryContainer,
                                    shape = CustomShape()).fillMaxSize()
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row (modifier = Modifier.weight(1f),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween){

                                    Box(modifier = Modifier.weight(1f)){
                                        IconButton(buttonColor = Color.Transparent, size = 30.dp,
                                            imageResourceId = R.drawable.ic_to_location, radius = 15.dp,
                                            iconColor = MaterialTheme.colorScheme.onBackground)
                                        { clickers[0]() }
                                    }

                                    Box(modifier = Modifier.weight(1f)){
                                        IconButton(buttonColor = Color.Transparent, size = 30.dp,
                                            imageResourceId = R.drawable.ic_translation_active, radius = 15.dp,
                                            iconColor = MaterialTheme.colorScheme.onBackground)
                                        { clickers[1]() }
                                    }
                                }

                                Spacer(modifier = Modifier.weight(0.52f))

                                Row (modifier = Modifier.weight(1f),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween){
                                    Box(modifier = Modifier.weight(1f)){
                                        IconButton(buttonColor = Color.Transparent, size = 30.dp,
                                            imageResourceId = R.drawable.ic_schedule_mini, radius = 15.dp,
                                            iconColor = MaterialTheme.colorScheme.onBackground)
                                        { clickers[2]() }
                                    }

                                    Box(modifier = Modifier.weight(1f)){
                                        IconButton(buttonColor = Color.Transparent, size = 30.dp,
                                            imageResourceId = R.drawable.ic_settings, radius = 15.dp,
                                            iconColor = MaterialTheme.colorScheme.onBackground)
                                        { clickers[3]() }
                                    }
                                }
                            }
                        }
                    }

                    Box(modifier = Modifier.padding(bottom = 5.dp, start = 3.dp).align(Alignment.Center)){
                        Image(modifier = Modifier.height(125.dp).width(90.dp),
                            painter = painterResource(id = R.drawable.button_create_route), contentDescription = null
                        )
                        Box(modifier = Modifier.align(Alignment.TopCenter).
                        padding(top = 28.dp, end = 3.dp).size(40.dp)){
                            IconButton(buttonColor = Color.Transparent, size = 40.dp,
                                imageResourceId = R.drawable.ic_navigate, radius = 15.dp,
                                iconColor = MaterialTheme.colorScheme.surfaceDim)
                            { onClickCenter[state.value]() }
                        }
                    }
                }
            } else -> {
            Box(modifier = Modifier.fillMaxWidth()){
                Box(modifier = Modifier.height(66.dp).fillMaxWidth()
                    .then(ShadowMaterial.CustomShadow.createModifier
                            (15.dp, MaterialTheme.colorScheme.tertiaryContainer))
                    .then(ShadowMaterial.CustomReShadow.createModifier
                            (15.dp, MaterialTheme.colorScheme.onTertiaryContainer))
                    .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
                ) {
                    Row(modifier = Modifier
                        .background(MaterialTheme.colorScheme.onPrimaryContainer)
                        .fillMaxSize(), verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Box(modifier = Modifier.weight(1f)){
                            IconButton(buttonColor = Color.Transparent, size = 30.dp,
                                imageResourceId = R.drawable.ic_to_location, radius = 15.dp,
                                iconColor = MaterialTheme.colorScheme.onBackground)
                            { clickers[0]() }
                        }

                        Box(modifier = Modifier.weight(1f)){
                            IconButton(buttonColor = Color.Transparent, size = 30.dp,
                                imageResourceId = R.drawable.ic_translation_active, radius = 15.dp,
                                iconColor = MaterialTheme.colorScheme.onBackground)
                            { clickers[1]() }
                        }

                        Box(modifier = Modifier.weight(1f)){
                            IconButton(buttonColor = Color.Transparent, size = 30.dp,
                                imageResourceId = if(state.value == 1) R.drawable.ic_hide else
                                    R.drawable.ic_route_final, radius = 15.dp,
                                iconColor = MaterialTheme.colorScheme.onBackground)
                            { onClickCenter[state.value]() }
                        }

                        Box(modifier = Modifier.weight(1f)){
                            IconButton(buttonColor = Color.Transparent, size = 30.dp,
                                imageResourceId = R.drawable.ic_schedule_mini, radius = 15.dp,
                                iconColor = MaterialTheme.colorScheme.onBackground)
                            { clickers[2]() }
                        }

                        Box(modifier = Modifier.weight(1f)){
                            IconButton(buttonColor = Color.Transparent, size = 30.dp,
                                imageResourceId = R.drawable.ic_settings, radius = 15.dp,
                                iconColor = MaterialTheme.colorScheme.onBackground)
                            { clickers[3]() }
                        }
                    }
                }
            }
            }
        }
    }
}

@Preview
@Composable
fun BottomNavigationPreview(){
    val clickers: ArrayList<() -> Unit> = ArrayList()
    clickers.add { /* обробник 1 */ }
    clickers.add { /* обробник 2 */ }
    clickers.add { /* обробник 3 */ }
    clickers.add { /* обробник 4 */ }

    val clickersCenter: ArrayList<() -> Unit> = ArrayList()
    clickersCenter.add { /* обробник 1 */ }
    clickersCenter.add { /* обробник 2 */ }
    clickersCenter.add { /* обробник 3 */ }

    BottomNavigation(state = remember {
        mutableIntStateOf(0)
    }, clickers,  clickersCenter)
}