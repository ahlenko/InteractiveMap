package com.example.interactivemap.ui.screens.welcome.onboarding.fragments

import android.annotation.SuppressLint
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ui.resource.button.DefaultButton
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun OnboardingFragmentThird(onClick: () -> Unit){ val borderRadius = 15.dp
    InteractiveMapTheme {
        Scaffold (containerColor = MaterialTheme.colorScheme.background){ _ ->
            Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally) {

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.padding(12.dp).padding(top = 12.dp).fillMaxWidth()
                ) {
                    Text(
                        stringResource(id = R.string.distant), modifier = Modifier,
                        style = MaterialTheme.typography.headlineLarge.copy(
                            color = MaterialTheme.colorScheme.onBackground,
                            fontWeight = FontWeight.Light, textAlign = TextAlign.Left
                        )
                    )
                }

                Box(modifier = Modifier.fillMaxSize().weight(1f).padding(top = 10.dp)) {
                    Box(
                        modifier = Modifier.align(Alignment.BottomStart)
                            .padding(bottom = 100.dp, start = 30.dp)
                            .fillMaxWidth(0.70f).fillMaxHeight(0.10f)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_distant_switch),
                            modifier = Modifier.rotate(-15.76f).fillMaxSize()
                                .then(
                                    ShadowMaterial.CustomShadow.createModifier
                                        (5.dp, MaterialTheme.colorScheme.tertiaryContainer)
                                )
                                .then(
                                    ShadowMaterial.CustomReShadow.createModifier
                                        (5.dp, MaterialTheme.colorScheme.onTertiaryContainer)
                                ),
                            contentDescription = null
                        )
                    }

                    Box(
                        modifier = Modifier.align(Alignment.BottomEnd)
                            .padding(bottom = 100.dp, end = 45.dp)
                            .fillMaxWidth(0.80f).fillMaxHeight(0.67f)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_schedule_editor),
                            modifier = Modifier.rotate(22.42f).fillMaxSize()
                                .then(
                                    ShadowMaterial.CustomShadow.createModifier
                                        (5.dp, MaterialTheme.colorScheme.tertiaryContainer)
                                )
                                .then(
                                    ShadowMaterial.CustomReShadow.createModifier
                                        (5.dp, MaterialTheme.colorScheme.onTertiaryContainer)
                                ),
                            contentDescription = null
                        )
                    }

                    Box(
                        modifier = Modifier.align(Alignment.TopStart)
                            .padding(top = 35.dp, start = 25.dp)
                            .fillMaxWidth(0.69f).fillMaxHeight(0.41f)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_lesson_editor),
                            modifier = Modifier.rotate(-9.2f).fillMaxSize()
                                .then(
                                    ShadowMaterial.CustomShadow.createModifier
                                        (5.dp, MaterialTheme.colorScheme.tertiaryContainer)
                                )
                                .then(
                                    ShadowMaterial.CustomReShadow.createModifier
                                        (5.dp, MaterialTheme.colorScheme.onTertiaryContainer)
                                ),
                            contentDescription = null
                        )
                    }

                    Box(
                        modifier = Modifier.align(Alignment.TopEnd)
                            .padding(top = 28.dp, end = 10.dp)
                            .fillMaxWidth(0.703f).fillMaxHeight(0.08f)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_schedule_bar),
                            modifier = Modifier.rotate(15.19f).fillMaxSize()
                                .then(
                                    ShadowMaterial.CustomShadow.createModifier
                                        (5.dp, MaterialTheme.colorScheme.tertiaryContainer)
                                )
                                .then(
                                    ShadowMaterial.CustomReShadow.createModifier
                                        (5.dp, MaterialTheme.colorScheme.onTertiaryContainer)
                                ),
                            contentDescription = null
                        )
                    }
                }

                Column(
                    modifier = Modifier.fillMaxHeight(0.42f),
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        stringResource(id = R.string.distant_description),
                        modifier = Modifier.padding(horizontal = 20.dp),
                        style = MaterialTheme.typography.headlineMedium.copy(
                            color = MaterialTheme.colorScheme.onBackground,
                            fontWeight = FontWeight.Light, textAlign = TextAlign.Center
                        )
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        stringResource(id = R.string.distant_description_full),
                        modifier = Modifier.padding(horizontal = 20.dp),
                        style = MaterialTheme.typography.titleSmall.copy(
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontWeight = FontWeight.Light, textAlign = TextAlign.Justify
                        )
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Box(
                        modifier = Modifier.height(60.dp).padding(horizontal = 20.dp)
                            .padding(bottom = 15.dp)
                            .then(
                                ShadowMaterial.CustomShadow.createModifier
                                    (borderRadius, MaterialTheme.colorScheme.tertiaryContainer)
                            )
                            .then(
                                ShadowMaterial.CustomReShadow.createModifier
                                    (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer)
                            )
                    ) {
                        DefaultButton(
                            buttonColor = MaterialTheme.colorScheme.onBackground,
                            textString = stringResource(id = R.string.go_to_application),
                            borderRadius,
                            textStyle = MaterialTheme.typography.headlineLarge.copy(
                                color = MaterialTheme.colorScheme.background,
                                fontWeight = FontWeight.Light
                            )
                        ) { onClick() }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun OnboardingFragmentThirdPreview(){
    OnboardingFragmentThird(){}
}