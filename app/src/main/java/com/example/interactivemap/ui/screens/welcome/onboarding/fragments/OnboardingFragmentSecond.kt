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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.ui.resource.button.IconButton
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import com.example.interactivemap.ui.translations.Tr

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun OnboardingFragmentSecond(onClick: () -> Unit){
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Scaffold (containerColor = MaterialTheme.colorScheme.background) { _ ->
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.padding(12.dp).padding(top = 12.dp).fillMaxWidth()
                ) {
                    Text(
                        Tr.schedule_lessons, modifier = Modifier,
                        style = MaterialTheme.typography.headlineLarge.copy(
                            color = MaterialTheme.colorScheme.onBackground,
                            fontWeight = FontWeight.Light, textAlign = TextAlign.Left
                        )
                    )
                }

                Column (modifier = Modifier
                    .fillMaxSize().verticalScroll(rememberScrollState())) {

                    Box(modifier = Modifier.fillMaxSize().weight(1f).padding(top = 8.dp)) {
                        Box(
                            modifier = Modifier.align(Alignment.BottomStart)
                                .padding(bottom = 60.dp, start = 30.dp)
                                .fillMaxWidth(0.78f).fillMaxHeight(0.38f)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_schedule_loader),
                                modifier = Modifier.rotate(-13f).fillMaxSize(),
                                contentDescription = null
                            )
                        }

                        Box(
                            modifier = Modifier.align(Alignment.CenterEnd)
                                .padding(end = 30.dp, bottom = 70.dp)
                                .fillMaxWidth(0.85f).fillMaxHeight(0.39f)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_schedule_sample),
                                modifier = Modifier.rotate(18.57f).fillMaxSize(),
                                contentDescription = null
                            )
                        }

                        Box(
                            modifier = Modifier.align(Alignment.TopStart)
                                .padding(top = 25.dp, start = 25.dp)
                                .fillMaxWidth(0.80f).fillMaxHeight(0.26f)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_schedule_header),
                                modifier = Modifier.rotate(-17.4f).fillMaxSize(),
                                contentDescription = null
                            )
                        }
                    }

                    Column(
                        modifier = Modifier.fillMaxHeight(0.42f),
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Text(
                            Tr.schedule_description,
                            modifier = Modifier.padding(horizontal = 20.dp),
                            style = MaterialTheme.typography.headlineMedium.copy(
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.Light, textAlign = TextAlign.Center
                            )
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(
                            Tr.schedule_description_full,
                            modifier = Modifier.padding(horizontal = 20.dp),
                            style = MaterialTheme.typography.titleSmall.copy(
                                color = MaterialTheme.colorScheme.onPrimary,
                                fontWeight = FontWeight.Light, textAlign = TextAlign.Justify
                            )
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Box(
                            modifier = Modifier.padding(bottom = 10.dp).size(60.dp)
                                .align(Alignment.CenterHorizontally)
                        ) {
                            IconButton(
                                buttonColor = Color.Transparent,
                                size = 60.dp,
                                imageResourceId = R.drawable.ic_to_next_item,
                                radiusTop = 30.dp,
                                radiusBottom = 30.dp,
                                iconColor = MaterialTheme.colorScheme.onBackground
                            ) { onClick() }
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun OnboardingFragmentSecondPreview(){
    OnboardingFragmentSecond{}
}