package com.example.interactivemap.ui.screens.account.creator

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.interactivemap.R
import com.example.interactivemap.logic.navigation.AccOnboard
import com.example.interactivemap.logic.navigation.LandingScreen
import com.example.interactivemap.logic.navigation.NavigationScreen
import com.example.interactivemap.ui.resource.button.DefaultButton
import com.example.interactivemap.ui.resource.button.RadioRowButton
import com.example.interactivemap.ui.resource.button.TextViewRowIcon
import com.example.interactivemap.ui.resource.fields.BasicField
import com.example.interactivemap.ui.resource.fields.EmailField
import com.example.interactivemap.ui.resource.fields.NumberField
import com.example.interactivemap.ui.resource.fields.PasswordField
import com.example.interactivemap.ui.resource.fields.PhoneField
import com.example.interactivemap.ui.resource.header.DefaultHeader
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.resource.photo.ProfilePhotoUploader
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun CreatorScreen(navHostController: NavHostController,
    creatorViewModel: CreatorViewModel = viewModel(
        factory = CreatorViewModel.factory)
){
    val isStudent = false
    val spacerInterval = 4.dp

    InteractiveMapTheme { val borderRadius = 15.dp
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Box(
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                    .then(
                        ShadowMaterial.CustomShadow.createModifier
                            (borderRadius, MaterialTheme.colorScheme.tertiaryContainer)
                    )
                    .then(
                        ShadowMaterial.CustomReShadow.createModifier
                            (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer)
                    )
            ) {
                DefaultHeader(titleId = R.string.registration, leftImgId = R.drawable.ic_prew_page,
                    rightImgId = R.drawable.ic_account, onClickLeft = {
                        navHostController.navigate(NavigationScreen.route) { popUpTo(0) }
                    }, onClickRight = {
                        navHostController.navigate(LandingScreen.route) { popUpTo(0) }
                    })
            }

            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = stringResource(id = R.string.base_info), Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.headlineMedium
                    .copy(color = MaterialTheme.colorScheme.onPrimary, textAlign = TextAlign.Center)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Row (modifier = Modifier.fillMaxWidth().height(140.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Column(
                    Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = stringResource(R.string.photo),
                        style = MaterialTheme.typography.headlineSmall
                            .copy(color = MaterialTheme.colorScheme.onPrimary)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Box( modifier = Modifier.padding(2.dp, 10.dp, 10.dp, 10.dp)
                        .aspectRatio(1f).height(IntrinsicSize.Min)
                        .then(ShadowMaterial.CustomShadow.createModifier
                                (200.dp, MaterialTheme.colorScheme.tertiaryContainer))
                        .then(ShadowMaterial.CustomReShadow.createModifier
                                (200.dp, MaterialTheme.colorScheme.onTertiaryContainer))
                    ) { ProfilePhotoUploader() }
                }

                Column(
                    Modifier.fillMaxWidth(0.72f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Text(text = stringResource(R.string.last_name),
                            style = MaterialTheme.typography.headlineSmall
                                .copy(color = MaterialTheme.colorScheme.onPrimary)
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Box(modifier = Modifier.height(40.dp)){
                            BasicField(text = remember {
                                mutableStateOf("")
                            }, textStyle = MaterialTheme.typography.headlineMedium
                                .copy(color = MaterialTheme.colorScheme.onPrimary))
                        }
                    }

                    Spacer(modifier = Modifier.height(5.dp))

                    Row (
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier.weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(text = stringResource(R.string.first_name),
                                style = MaterialTheme.typography.headlineSmall
                                    .copy(color = MaterialTheme.colorScheme.onPrimary)
                            )

                            Spacer(modifier = Modifier.height(5.dp))

                            Box(modifier = Modifier.height(40.dp)){
                                BasicField(text = remember {
                                    mutableStateOf("")
                                }, textStyle = MaterialTheme.typography.headlineMedium
                                    .copy(color = MaterialTheme.colorScheme.onPrimary))
                            }
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Column(
                            modifier = Modifier.weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(text = stringResource(R.string.middle_name),
                                style = MaterialTheme.typography.headlineSmall
                                    .copy(color = MaterialTheme.colorScheme.onPrimary)
                            )

                            Spacer(modifier = Modifier.height(5.dp))

                            Box(modifier = Modifier
                                .height(40.dp)){
                                BasicField(text = remember {
                                    mutableStateOf("")
                                }, textStyle = MaterialTheme.typography.headlineMedium
                                    .copy(color = MaterialTheme.colorScheme.onPrimary))
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = stringResource(id = R.string.identity_data), Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.headlineMedium
                    .copy(color = MaterialTheme.colorScheme.onPrimary, textAlign = TextAlign.Center)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Row (modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Text(modifier = Modifier.weight(1f),
                    text = stringResource(R.string.phone),
                    style = MaterialTheme.typography.headlineSmall
                        .copy(color = MaterialTheme.colorScheme.onPrimary)
                )
                Box(modifier = Modifier
                    .fillMaxWidth(0.72f)
                    .height(40.dp)){
                    PhoneField(text = remember {
                        mutableStateOf("")
                    }, textStyle = MaterialTheme.typography.headlineMedium
                        .copy(color = MaterialTheme.colorScheme.onPrimary))
                }
            }

            Spacer(modifier = Modifier.height(spacerInterval))

            Row (modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Text(modifier = Modifier.weight(1f),
                    text = stringResource(R.string.role),
                    style = MaterialTheme.typography.headlineSmall
                        .copy(color = MaterialTheme.colorScheme.onPrimary)
                )

                Row (
                    modifier = Modifier.fillMaxWidth(0.66f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly){

                    Box(modifier = Modifier.weight(1f)){
                        RadioRowButton(checked = isStudent, textId = R.string.student)
                    }

                    Spacer(modifier = Modifier.width(25.dp))

                    Box(modifier = Modifier.weight(1f)){
                        RadioRowButton(checked = !isStudent, textId = R.string.tutor)
                    }
                }
            }

            Spacer(modifier = Modifier.height(spacerInterval))

            Row (modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Text(modifier = Modifier.weight(1f),
                    text = if(isStudent) stringResource(R.string.group) else
                        stringResource(R.string.lessons),
                    style = MaterialTheme.typography.headlineSmall
                        .copy(color = MaterialTheme.colorScheme.onPrimary)
                )
                Box(modifier = Modifier
                    .fillMaxWidth(0.72f)
                    .height(40.dp)) {
                    if (isStudent) {
                        BasicField(
                            text = remember {
                                mutableStateOf("")
                            },
                            textStyle = MaterialTheme.typography.headlineMedium
                                .copy(color = MaterialTheme.colorScheme.onPrimary)
                        )
                    } else {
                        TextViewRowIcon(iconId = R.drawable.ic_list, text = remember {
                            mutableStateOf("")
                        }, textStyle = MaterialTheme.typography.headlineMedium
                            .copy(color = MaterialTheme.colorScheme.onPrimary))
                    }
                }
            }

            Spacer(modifier = Modifier.height(spacerInterval))

            Row (modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Text(modifier = Modifier.weight(1f),
                    text = if(isStudent) stringResource(R.string.student_num) else
                        stringResource(R.string.reg_num),
                    style = MaterialTheme.typography.headlineSmall
                        .copy(color = MaterialTheme.colorScheme.onPrimary)
                )
                Box(modifier = Modifier
                    .fillMaxWidth(0.72f)
                    .height(40.dp)){
                    NumberField(text = remember {
                        mutableStateOf("")
                    }, textStyle = MaterialTheme.typography.headlineMedium
                        .copy(color = MaterialTheme.colorScheme.onPrimary))
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = stringResource(id = R.string.date_to_enter), Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.headlineMedium
                    .copy(color = MaterialTheme.colorScheme.onPrimary, textAlign = TextAlign.Center)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Row (modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Text(modifier = Modifier.weight(1f),
                    text = stringResource(R.string.email),
                    style = MaterialTheme.typography.headlineSmall
                        .copy(color = MaterialTheme.colorScheme.onPrimary)
                )
                Box(modifier = Modifier
                    .fillMaxWidth(0.72f)
                    .height(40.dp)){
                    EmailField(text = remember {
                        mutableStateOf("")
                    }, textStyle = MaterialTheme.typography.headlineMedium
                        .copy(color = MaterialTheme.colorScheme.onPrimary))
                }
            }

            Spacer(modifier = Modifier.height(spacerInterval))

            Row (modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Text(modifier = Modifier.weight(1f),
                    text = stringResource(R.string.password),
                    style = MaterialTheme.typography.headlineSmall
                        .copy(color = MaterialTheme.colorScheme.onPrimary)
                )
                Box(modifier = Modifier
                    .fillMaxWidth(0.72f)
                    .height(40.dp)){
                    PasswordField(text = remember {
                        mutableStateOf("")
                    }, textStyle = MaterialTheme.typography.headlineMedium
                        .copy(color = MaterialTheme.colorScheme.onPrimary))
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 12.dp), contentAlignment = Alignment.Center){
                Text(text = stringResource(id = R.string.reg_rules), Modifier.clickable {
                    navHostController.navigate(AccOnboard.route){ popUpTo(0)}
                }, style = MaterialTheme.typography.headlineMedium.copy(
                    color = MaterialTheme.colorScheme.onBackground, textAlign = TextAlign.Center),
                )
            }

            Box(modifier = Modifier
                .padding(bottom = 12.dp)
                .fillMaxWidth(0.7f)
                .height(50.dp)
                .then(
                    ShadowMaterial.CustomShadow.createModifier
                        (borderRadius + 5.dp, MaterialTheme.colorScheme.tertiaryContainer)
                )
                .then(
                    ShadowMaterial.CustomReShadow.createModifier
                        (borderRadius + 5.dp, MaterialTheme.colorScheme.onTertiaryContainer)
                )
            ){
                DefaultButton(buttonColor = MaterialTheme.colorScheme.onBackground,
                    textString = stringResource(id = R.string.register), borderRadius + 5.dp,
                    textStyle = MaterialTheme.typography.headlineLarge.copy(
                        color = MaterialTheme.colorScheme.background, fontWeight = FontWeight.Light)
                ) {}
            }

            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 5.dp), contentAlignment = Alignment.Center){
                Text(text = stringResource(id = R.string.reg_rules_description),
                    style = MaterialTheme.typography.labelSmall.copy(
                    color = MaterialTheme.colorScheme.onBackground, textAlign = TextAlign.Center),
                )
            }
        }
    }
}

@Preview
@Composable
fun CreatorScreenPreview(){
    CreatorScreen(navHostController = rememberNavController())
}