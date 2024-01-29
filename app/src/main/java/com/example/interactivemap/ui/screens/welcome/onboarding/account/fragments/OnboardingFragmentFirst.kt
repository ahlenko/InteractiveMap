package com.example.interactivemap.ui.screens.welcome.onboarding.account.fragments

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
                Text(stringResource(id = R.string.activity), modifier = Modifier,
                    style = MaterialTheme.typography.headlineLarge.copy(
                        color = MaterialTheme.colorScheme.onBackground,
                        fontWeight = FontWeight.Light, textAlign = TextAlign.Left)) }

            Box(modifier = Modifier.fillMaxSize().weight(1f)){
                Box(modifier = Modifier.align(Alignment.BottomEnd).padding(bottom = 120.dp, end = 16.dp)
                    .fillMaxWidth(0.71f).fillMaxHeight(0.32f)){
                    Image(painter = painterResource(id = R.drawable.img_user_settings),
                        modifier = Modifier.rotate(-23.34f).fillMaxSize()
                            .then(ShadowMaterial.CustomShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                            .then(ShadowMaterial.CustomReShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.onTertiaryContainer)),
                        contentDescription = null)
                }

                Box(modifier = Modifier.align(Alignment.CenterStart).padding(bottom = 110.dp, start = 45.dp)
                    .fillMaxWidth(0.46f).fillMaxHeight(0.60f)){
                    Image(painter = painterResource(id = R.drawable.img_user_avatar),
                        modifier = Modifier.rotate(-21.61f).fillMaxSize()
                            .then(ShadowMaterial.CustomShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                            .then(ShadowMaterial.CustomReShadow.createModifier
                                (5.dp, MaterialTheme.colorScheme.onTertiaryContainer)),
                        contentDescription = null)
                }

                Box(modifier = Modifier.align(Alignment.TopEnd).padding(top = 50.dp, end = 25.dp)
                    .fillMaxWidth(0.73f).fillMaxHeight(0.32f)){
                    Image(painter = painterResource(id = R.drawable.img_status_selector),
                        modifier = Modifier.rotate(23.28f).fillMaxSize()
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
                Text( stringResource(id = R.string.activity_description),
                    modifier = Modifier.padding(horizontal = 20.dp),
                    style = MaterialTheme.typography.headlineMedium.copy(
                        color = MaterialTheme.colorScheme.onBackground,
                        fontWeight = FontWeight.Light, textAlign = TextAlign.Center)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text( stringResource(id = R.string.activity_description_full),
                    modifier = Modifier.padding(horizontal = 20.dp),
                    style = MaterialTheme.typography.titleSmall.copy(
                        color = MaterialTheme.colorScheme.onPrimary,
                        fontWeight = FontWeight.Light, textAlign = TextAlign.Justify)
                )
                Spacer(modifier = Modifier.weight(1f))
                Box(modifier = Modifier.padding(bottom = 10.dp).size(50.dp)
                    .align(Alignment.CenterHorizontally)) {
                    IconButton(buttonColor = Color.Transparent, size = 50.dp,
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