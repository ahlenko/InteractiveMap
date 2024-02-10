package com.example.interactivemap.ui.screens.account.editor

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
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
import com.example.interactivemap.ui.resource.button.DefaultButton
import com.example.interactivemap.ui.resource.button.SwitchRowButton
import com.example.interactivemap.ui.resource.button.TextViewRowIcon
import com.example.interactivemap.ui.resource.fields.IconTextRow
import com.example.interactivemap.ui.resource.header.DefaultHeader
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.resource.photo.ProfilePhotoEditor
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun EditorScreen(navHostController: NavHostController,
    editorViewModel: EditorViewModel = viewModel(
        factory = EditorViewModel.factory)
) {
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
                DefaultHeader(titleId = R.string.account, leftImgId = R.drawable.ic_prew_page,
                    rightImgId = R.drawable.ic_exit, onClickLeft = {
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
                ProfilePhotoEditor(0)
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
                    .height(50.dp)
                    .clickable { navHostController.navigate(AppOnboard.route) { popUpTo(0) } },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Box(modifier = Modifier.weight(1f)){
                        IconTextRow(imageId = R.drawable.ic_reset_phone_number, textId = R.string.phone_number,
                            tint = MaterialTheme.colorScheme.onBackground)
                    }
                    Icon(painter = painterResource(id = R.drawable.ic_right), contentDescription = null,
                        tint = MaterialTheme.colorScheme.onBackground, modifier = Modifier.size(15.dp))
                }

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Box(modifier = Modifier.weight(1f)){
                        IconTextRow(imageId = R.drawable.ic_hide_number, textId = R.string.hide_number,
                            tint = MaterialTheme.colorScheme.onBackground)}
                    SwitchRowButton(state = remember { mutableStateOf(true)})
                }

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { navHostController.navigate(AppOnboard.route) { popUpTo(0) } },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Box(modifier = Modifier.weight(1f)){
                        IconTextRow(imageId = R.drawable.ic_reset_email, textId = R.string.reset_email,
                            tint = MaterialTheme.colorScheme.onBackground)
                    }
                    Icon(painter = painterResource(id = R.drawable.ic_right), contentDescription = null,
                        tint = MaterialTheme.colorScheme.onBackground, modifier = Modifier.size(15.dp))
                }

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { navHostController.navigate(AppOnboard.route) { popUpTo(0) } },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    if (isStudent){
                        Box(modifier = Modifier.weight(1f)){
                            IconTextRow(imageId = R.drawable.ic_group, textId = R.string.group,
                                tint = MaterialTheme.colorScheme.onBackground)
                        }
                    } else{
                        Box(modifier = Modifier.weight(1f)){
                            IconTextRow(imageId = R.drawable.ic_notebook, textId = R.string.lessons,
                                tint = MaterialTheme.colorScheme.onBackground)
                        }
                    }

                    Box(modifier = Modifier.fillMaxWidth(0.72f). height(40.dp)){
                        TextViewRowIcon(iconId = R.drawable.ic_edit_mini, text = remember {
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
                    Box(modifier = Modifier.weight(1f)){
                        IconTextRow(imageId = R.drawable.ic_reset_password, textId = R.string.reset_password,
                            tint = MaterialTheme.colorScheme.onBackground)
                    }
                    Icon(painter = painterResource(id = R.drawable.ic_right), contentDescription = null,
                        tint = MaterialTheme.colorScheme.onBackground, modifier = Modifier.size(15.dp))
                }

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { navHostController.navigate(AppOnboard.route) { popUpTo(0) } },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Box(modifier = Modifier.weight(1f)){
                        IconTextRow(imageId = R.drawable.ic_delete_account, textId = R.string.delete_account,
                            tint = MaterialTheme.colorScheme.onError)
                    }
                    Icon(painter = painterResource(id = R.drawable.ic_right), contentDescription = null,
                        tint = MaterialTheme.colorScheme.onError, modifier = Modifier.size(15.dp))
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

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
                DefaultButton(buttonColor = MaterialTheme.colorScheme.onBackground,
                    textString = stringResource(id = R.string.users_list), borderRadius+5.dp,
                    textStyle = MaterialTheme.typography.headlineLarge.copy(
                        color = MaterialTheme.colorScheme.background, fontWeight = FontWeight.Light)
                ) {}
            }

        }
    }
}

@Preview
@Composable
fun EditorScreenPreview(){
    EditorScreen(rememberNavController())
}