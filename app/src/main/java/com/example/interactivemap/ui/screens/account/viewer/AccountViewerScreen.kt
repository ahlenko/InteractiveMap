package com.example.interactivemap.ui.screens.account.viewer

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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
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
import com.example.interactivemap.logic.navigation.AppOnboard
import com.example.interactivemap.logic.navigation.NavigationScreen
import com.example.interactivemap.ui.resource.button.RadioRowButton
import com.example.interactivemap.ui.resource.button.TextIconButton
import com.example.interactivemap.ui.resource.button.TextViewRowIcon
import com.example.interactivemap.ui.resource.fields.IconTextRow
import com.example.interactivemap.ui.resource.fields.ViewField
import com.example.interactivemap.ui.resource.header.DefaultHeader
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.resource.photo.ProfilePhotoView
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun AccountViewerScreen(navHostController: NavHostController,
    accountViewerViewModel: AccountViewerViewModel = viewModel()
){
    val isStudent = true

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
                DefaultHeader(titleId = R.string.user, leftImgId = R.drawable.ic_prew_page,
                    rightImgId = R.drawable.ic_account, onClickLeft = {
                        navHostController.navigate(NavigationScreen.route) { popUpTo(0) }
                    }, onClickRight = {
                        navHostController.navigate(AccOnboard.route) { popUpTo(0) }
                    })
            }

            Spacer(modifier = Modifier.height(55.dp))

            Box(
                modifier = Modifier
                    .size(220.dp)
                    .then(
                        ShadowMaterial.CustomShadow.createModifier
                            (200.dp, MaterialTheme.colorScheme.tertiaryContainer)
                    )
                    .then(
                        ShadowMaterial.CustomReShadow.createModifier
                            (200.dp, MaterialTheme.colorScheme.onTertiaryContainer)
                    )
            ) {
                ProfilePhotoView(0)
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Ахленко Дмитро\n" + "Андрійович", Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.headlineLarge
                    .copy(color = MaterialTheme.colorScheme.onBackground,
                        textAlign = TextAlign.Center)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Column (Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround){
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
                            RadioRowButton(checked = isStudent, textId = R.string.student){}
                        }

                        Spacer(modifier = Modifier.width(25.dp))

                        Box(modifier = Modifier.weight(1f)){
                            RadioRowButton(checked = !isStudent, textId = R.string.tutor){}
                        }
                    }
                }

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    if (isStudent){
                        Text(modifier = Modifier.weight(1f),
                            text = stringResource(R.string.group),
                            style = MaterialTheme.typography.headlineSmall
                                .copy(color = MaterialTheme.colorScheme.onPrimary)
                        )
                        Box(modifier = Modifier
                            .fillMaxWidth(0.72f)
                            .height(40.dp)){
                            ViewField(text = remember {
                                mutableStateOf("")
                            }, textStyle = MaterialTheme.typography.headlineLarge
                                .copy(color = MaterialTheme.colorScheme.onPrimary))
                        }
                    } else{
                        Text(modifier = Modifier.weight(1f),
                            text = stringResource(R.string.lessons),
                            style = MaterialTheme.typography.headlineSmall
                                .copy(color = MaterialTheme.colorScheme.onPrimary)
                        )
                        Box(modifier = Modifier
                            .fillMaxWidth(0.72f)
                            .height(40.dp)){
                            TextViewRowIcon(iconId = R.drawable.ic_list, text = remember {
                                mutableStateOf("")
                            }, textStyle = MaterialTheme.typography.headlineLarge
                                .copy(color = MaterialTheme.colorScheme.onPrimary)){}
                        }
                    }
                }

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
                        ViewField(text = remember {
                            mutableStateOf("")
                        }, textStyle = MaterialTheme.typography.headlineLarge
                            .copy(color = MaterialTheme.colorScheme.onPrimary))
                    }
                }

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
                        ViewField(text = remember {
                            mutableStateOf("")
                        }, textStyle = MaterialTheme.typography.headlineLarge
                            .copy(color = MaterialTheme.colorScheme.onPrimary))
                    }
                }

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { navHostController.navigate(AppOnboard.route) { popUpTo(0) } },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Row (modifier = Modifier.padding(horizontal = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly){

                        Box(modifier = if(isStudent) Modifier.weight(1f) else Modifier.alpha(1f)){
                            IconTextRow(imageId = R.drawable.ic_star, textId = R.string.clip,
                                tint = MaterialTheme.colorScheme.onBackground)
                        }

                        if(isStudent){
                            Spacer(modifier = Modifier.width(25.dp))

                            Box(modifier = Modifier.weight(1f)){
                                IconTextRow(imageId = R.drawable.ic_account_block, textId = R.string.block,
                                    tint = MaterialTheme.colorScheme.onError)
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(55.dp))

            Box(modifier = Modifier
                .padding(bottom = 35.dp)
                .padding(horizontal = 57.dp)
                .height(55.dp)
                .then(
                    ShadowMaterial.CustomShadow.createModifier
                        (borderRadius + 5.dp, MaterialTheme.colorScheme.tertiaryContainer)
                )
                .then(
                    ShadowMaterial.CustomReShadow.createModifier
                        (borderRadius + 5.dp, MaterialTheme.colorScheme.onTertiaryContainer)
                )
            ){
                TextIconButton(buttonColor = MaterialTheme.colorScheme.onBackground,
                    iconColor = MaterialTheme.colorScheme.background, imageResourceId = R.drawable.ic_map_mini,
                    text = stringResource(id = R.string.search_on_map), radius = borderRadius+5.dp,
                    textStyle = MaterialTheme.typography.headlineLarge.copy(
                        color = MaterialTheme.colorScheme.background, fontWeight = FontWeight.Light)
                ) {}
            }
        }
    }
}

@Preview
@Composable
fun AccountViewScreenPreview(){
    AccountViewerScreen(navHostController = rememberNavController())
}