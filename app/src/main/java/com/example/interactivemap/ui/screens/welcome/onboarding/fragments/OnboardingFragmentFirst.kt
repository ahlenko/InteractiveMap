package com.example.interactivemap.ui.screens.welcome.onboarding.fragments

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ui.resource.button.IconButton
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme


@Composable
fun OnboardingFragmentFirst(){



    InteractiveMapTheme {
        Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally){

            Row (verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(12.dp).padding(top = 12.dp).fillMaxWidth()){
                Text(stringResource(id = R.string.navigation), modifier = Modifier,
                    style = MaterialTheme.typography.headlineLarge.copy(
                        color = MaterialTheme.colorScheme.onBackground,
                        fontWeight = FontWeight.Light, textAlign = TextAlign.Left))
            }

            Box(modifier = Modifier.fillMaxSize().weight(1f).padding(20.dp)){
                Box(modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 50.dp, end = 30.dp, start = 10.dp)
                    .fillMaxWidth(0.90f).fillMaxHeight(0.60f)){
                    Image(painter = painterResource(id = R.drawable.img_clear_map_sample),
                        modifier = Modifier.rotate(-26.85f).fillMaxSize()
                            .then(ShadowMaterial.CustomShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                            .then(ShadowMaterial.CustomReShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.onTertiaryContainer)),
                        contentDescription = null)
                }

                Box(modifier = Modifier.align(Alignment.TopEnd).padding(top = 20.dp, end = 8.dp)
                    .fillMaxWidth(0.82f).fillMaxHeight(0.43f)){
                    Image(painter = painterResource(id = R.drawable.img_navigation_bar),
                        modifier = Modifier.rotate(18.6f).fillMaxSize()
                            .then(ShadowMaterial.CustomShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                            .then(ShadowMaterial.CustomReShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.onTertiaryContainer)),
                        contentDescription = null)
                }

                Box(modifier = Modifier.align(Alignment.BottomStart).padding(start = 10.dp, bottom = 40.dp)
                    .fillMaxWidth(0.50f).fillMaxHeight(0.72f)){
                    Image(painter = painterResource(id = R.drawable.img_road_sample),
                        modifier = Modifier.rotate(-15.7f).fillMaxSize(),
                        contentDescription = null)
                }

                Box(modifier = Modifier.align(Alignment.BottomEnd).padding(end = 80.dp, bottom = 95.dp)
                    .fillMaxWidth(0.11f).fillMaxHeight(0.27f)){
                    Image(painter = painterResource(id = R.drawable.img_floor_controller),
                        modifier = Modifier.rotate(46.53f).fillMaxSize()
                            .then(ShadowMaterial.CustomShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                            .then(ShadowMaterial.CustomReShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.onTertiaryContainer)),
                        contentDescription = null)
                }

                Box(modifier = Modifier.align(Alignment.BottomStart).padding(start = 5.dp, bottom = 120.dp)
                    .fillMaxWidth(0.09f).fillMaxHeight(0.30f)){
                    Image(painter = painterResource(id = R.drawable.img_map_controller),
                        modifier = Modifier.rotate(-18.65f).fillMaxSize()
                            .then(ShadowMaterial.CustomShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                            .then(ShadowMaterial.CustomReShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.onTertiaryContainer)),
                        contentDescription = null)
                }
            }

            Column (modifier = Modifier.fillMaxHeight(0.42f),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(stringResource(id = R.string.navigation_description),
                    modifier = Modifier.padding(horizontal = 20.dp),
                    style = MaterialTheme.typography.headlineMedium.copy(
                        color = MaterialTheme.colorScheme.onBackground,
                        fontWeight = FontWeight.Light, textAlign = TextAlign.Center
                    )
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(stringResource(id = R.string.navigation_description_full),
                    modifier = Modifier.padding(horizontal = 20.dp),
                    style = MaterialTheme.typography.titleSmall.copy(
                        color = MaterialTheme.colorScheme.onPrimary,
                        fontWeight = FontWeight.Light, textAlign = TextAlign.Justify
                    )
                )
                Spacer(modifier = Modifier.weight(1f))
                Box(modifier = Modifier
                    .padding(bottom = 10.dp).size(60.dp).align(Alignment.CenterHorizontally)) {
                    IconButton(buttonColor = Color.Transparent,size = 60.dp,
                        imageResourceId = R.drawable.ic_to_next_item, radius = 30.dp,
                        iconColor = MaterialTheme.colorScheme.onBackground) {}
                }
            }
        }
    }
}

@Preview
@Composable
fun OnboardingFragmentFirstPreview(){
    OnboardingFragmentFirst()
}