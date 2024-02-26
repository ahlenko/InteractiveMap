package com.example.interactivemap.ui.dialogs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.interactivemap.R
import com.example.interactivemap.ui.resource.button.DefaultButton
import com.example.interactivemap.ui.resource.fields.EmailField
import com.example.interactivemap.ui.resource.fields.PasswordField
import com.example.interactivemap.ui.resource.fields.PhoneField
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FieldsEditDialog(dialogType: Int, onDismiss: () -> Unit, onConfirm: () -> Unit){
    val modalBottomSheetState = rememberModalBottomSheetState()
    val borderRadius = 15.dp

    InteractiveMapTheme {
        ModalBottomSheet(
            containerColor = Color.Transparent,
            shape = RoundedCornerShape(borderRadius),
            dragHandle = { }, modifier = Modifier.fillMaxWidth().padding(6.dp),
            onDismissRequest = { onDismiss() },
            sheetState = modalBottomSheetState,
        ) {
            Card(modifier = Modifier.fillMaxWidth().padding(bottom = 14.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
                shape = RoundedCornerShape(16.dp)
            ) {
                Box(
                    modifier = Modifier.padding(top = 12.dp).height(4.dp).width(60.dp)
                        .align(Alignment.CenterHorizontally)
                        .clip(RoundedCornerShape(100.dp))
                        .background(MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.4f))
                )

                Column (modifier = Modifier.fillMaxWidth().padding(14.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally ){

                    Text(text = stringResource(
                            id = when (dialogType){
                            0 -> R.string.change_phone
                            1 -> R.string.change_email
                            else -> R.string.change_password
                        }), style = MaterialTheme.typography.headlineMedium
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(text = stringResource(
                            id = when (dialogType){
                                0 -> R.string.old_phone
                                1 -> R.string.old_email
                                else -> R.string.old_password
                            }), textAlign = TextAlign.Left,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier.fillMaxWidth().padding(start = 8.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Box(modifier = Modifier.fillMaxWidth().height(50.dp)){
                        when (dialogType){
                            0 -> PhoneField(text = remember { mutableStateOf("0") }, MaterialTheme.typography.headlineMedium
                                .copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.85f)))
                            1 -> EmailField(text = remember { mutableStateOf("") }, MaterialTheme.typography.headlineMedium
                                .copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.85f)))
                            else -> PasswordField(text = remember { mutableStateOf("") }, MaterialTheme.typography.headlineMedium
                                .copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.85f)))
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = stringResource(
                            id = when (dialogType){
                                0 -> R.string.new_phone
                                1 -> R.string.new_email
                                else -> R.string.new_password
                            }), textAlign = TextAlign.Left,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier.fillMaxWidth().padding(start = 8.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Box(modifier = Modifier.fillMaxWidth().height(50.dp)){
                        when (dialogType){
                            0 -> PhoneField(text = remember { mutableStateOf("0") }, MaterialTheme.typography.headlineMedium
                                .copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.85f)))
                            1 -> EmailField(text = remember { mutableStateOf("") }, MaterialTheme.typography.headlineMedium
                                .copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.85f)))
                            else -> PasswordField(text = remember { mutableStateOf("") }, MaterialTheme.typography.headlineMedium
                                .copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.85f)))
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Row (modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically ){
                        Box(modifier = Modifier.height(40.dp).weight(1f)
                            .then(ShadowMaterial.CustomShadow.createModifier
                                    (borderRadius, MaterialTheme.colorScheme.tertiaryContainer))
                            .then(ShadowMaterial.CustomReShadow.createModifier
                                    (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer))
                        ) {
                            DefaultButton(buttonColor = MaterialTheme.colorScheme.onBackground,
                                textString = stringResource(id = R.string.dismiss), borderRadius,
                                textStyle = MaterialTheme.typography.labelMedium.copy(
                                    color = MaterialTheme.colorScheme.background, fontWeight = FontWeight.Light)
                            ) { onDismiss() }
                        }

                        Spacer(modifier = Modifier.width(12.dp))

                        Box(modifier = Modifier.height(40.dp).weight(1f)
                            .then(ShadowMaterial.CustomShadow.createModifier
                                    (borderRadius, MaterialTheme.colorScheme.tertiaryContainer))
                            .then(ShadowMaterial.CustomReShadow.createModifier
                                    (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer))
                        ) {
                            DefaultButton(buttonColor = MaterialTheme.colorScheme.onError,
                                textString = stringResource(id = R.string.change), borderRadius,
                                textStyle = MaterialTheme.typography.labelMedium.copy(
                                    color = MaterialTheme.colorScheme.background, fontWeight = FontWeight.Light)
                            ) { onConfirm() }
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun FieldsEditDialogPreview(){
    FieldsEditDialog(dialogType = 0, onDismiss = {}){}
}

