package com.example.interactivemap.ui.resource.controller

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.logic.util.SharedPreferencesRepository
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun BottomMapNavigation(locationStart: String, locationEnd: String, onClickCenter: ArrayList<() -> Unit>, myLocationEnable: Boolean, isEndPointSelectable:Boolean){
    InteractiveMapTheme(darkTheme = SharedPreferencesRepository.darkThemeSelected) {
        Column(modifier = Modifier
            .clip(RoundedCornerShape(15.dp))
            .background(MaterialTheme.colorScheme.onPrimaryContainer)) {
            Row (modifier = Modifier.padding(12.dp)){
                Box (modifier = Modifier
                    .height(160.dp)
                    .width(34.dp)
                    .then(
                        ShadowMaterial.CustomShadow.createModifier(
                            15.dp,
                            MaterialTheme.colorScheme.tertiaryContainer
                        )
                    )
                    .then(
                        ShadowMaterial.CustomReShadow.createModifier(
                            15.dp,
                            MaterialTheme.colorScheme.onTertiaryContainer
                        )
                    )
                ){
                    Box(modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.onPrimaryContainer)){
                        Icon(modifier = Modifier
                            .padding(8.dp)
                            .fillMaxSize(),
                            tint = MaterialTheme.colorScheme.onBackground,
                            painter = painterResource(id = R.drawable.ic_down_large),
                            contentDescription = null)
                    }
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column (modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally){

                    Text(modifier = Modifier.fillMaxWidth(), text = stringResource(R.string.start_point),
                        style = MaterialTheme.typography.headlineMedium.copy(
                            color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.8f),
                            textAlign = TextAlign.Left, fontWeight = FontWeight.Medium
                        ))

                    Spacer(modifier = Modifier.height(8.dp))

                    Box (modifier = Modifier
                        .height(47.dp)
                        .fillMaxWidth()
                        .then(
                            ShadowMaterial.CustomShadow.createModifier(
                                15.dp,
                                MaterialTheme.colorScheme.tertiaryContainer
                            )
                        )
                        .then(
                            ShadowMaterial.CustomReShadow.createModifier(
                                15.dp,
                                MaterialTheme.colorScheme.onTertiaryContainer
                            )
                        )
                    ){
                        Row (modifier = Modifier
                            .clickable {
                                val onClick = onClickCenter[0]
                                onClick()
                            }
                            .clip(RoundedCornerShape(15.dp))
                            .fillMaxSize()
                            .background(MaterialTheme.colorScheme.onPrimaryContainer)
                            .border(
                                width = 1.dp,
                                color = if (locationStart == "0"&& !isEndPointSelectable) MaterialTheme.colorScheme.error else Color.Transparent,
                                shape = RoundedCornerShape(15.dp)
                            ),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly){
                            Icon(modifier = Modifier
                                .padding(start = 7.dp)
                                .size(32.dp),
                                painter = painterResource(id = R.drawable.ic_start_place),
                                contentDescription = null, tint = MaterialTheme.colorScheme.onBackground)
                            Text(modifier = Modifier.weight(1f),
                                text = if (locationStart == "0") if (!isEndPointSelectable) stringResource(id = R.string.select_point) else "----" else if (myLocationEnable) stringResource(id = R.string.your_location) else locationStart, style = MaterialTheme.typography.headlineLarge.copy(
                                    color = MaterialTheme.colorScheme.onBackground,
                                    textAlign = TextAlign.Center, fontWeight = FontWeight.Medium))
                            Icon(modifier = Modifier
                                .padding(start = 7.dp)
                                .size(32.dp),
                                painter = painterResource(id = R.drawable.ic_transparent),
                                contentDescription = null, tint = MaterialTheme.colorScheme.onBackground)
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(modifier = Modifier.fillMaxWidth(), text = stringResource(id = R.string.end_point),
                        style = MaterialTheme.typography.headlineMedium.copy(
                            color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.8f),
                            textAlign = TextAlign.Left, fontWeight = FontWeight.Medium
                        ))

                    Spacer(modifier = Modifier.height(8.dp))

                    Box (modifier = Modifier.height(47.dp).fillMaxWidth()
                        .then(ShadowMaterial.CustomShadow.createModifier(15.dp,
                                MaterialTheme.colorScheme.tertiaryContainer))
                        .then(ShadowMaterial.CustomReShadow.createModifier(15.dp,
                                MaterialTheme.colorScheme.onTertiaryContainer))
                    ){
                        Row (modifier = Modifier
                            .clickable {
                                val onClick = onClickCenter[1]
                                onClick()
                            }
                            .clip(RoundedCornerShape(15.dp))
                            .fillMaxSize()
                            .background(MaterialTheme.colorScheme.onPrimaryContainer)
                            .border(
                                width = 1.dp,
                                color = if (locationEnd == "0" && isEndPointSelectable) MaterialTheme.colorScheme.error else Color.Transparent,
                                shape = RoundedCornerShape(15.dp)
                            ),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly){
                            Icon(modifier = Modifier
                                .padding(start = 7.dp)
                                .size(32.dp),
                                painter = painterResource(id = R.drawable.ic_finish_place),
                                contentDescription = null, tint = MaterialTheme.colorScheme.onBackground)
                            Text(modifier = Modifier.weight(1f),
                                text = if (locationEnd == "0") if (isEndPointSelectable) stringResource(id = R.string.select_point) else "----" else locationEnd, style = MaterialTheme.typography.headlineLarge.copy(
                                    color = MaterialTheme.colorScheme.onBackground,
                                    textAlign = TextAlign.Center, fontWeight = FontWeight.Medium))
                            Icon(modifier = Modifier
                                .padding(start = 7.dp)
                                .size(32.dp),
                                painter = painterResource(id = R.drawable.ic_transparent),
                                contentDescription = null, tint = MaterialTheme.colorScheme.onBackground)
                        }
                    }
                }
            }

            Box(modifier = Modifier
                .height(40.dp)
                .align(Alignment.CenterHorizontally)
                .clickable {
                    val onClick = onClickCenter[2]
                    onClick()
                }){
                Text(modifier = Modifier
                    .align(Alignment.Center)
                    .padding(horizontal = 10.dp), text = stringResource(R.string.find_road),
                    style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.onBackground,
                        textAlign = TextAlign.Center, fontWeight = FontWeight.Medium
                    ))
            }

            Spacer(modifier = Modifier.height(15.dp))
        }
    }
}