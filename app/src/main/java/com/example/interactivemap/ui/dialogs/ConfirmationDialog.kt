package com.example.interactivemap.ui.dialogs

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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.interactivemap.ui.resource.button.DefaultButton
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun ConfirmationDialog(titleRes: Int, textRex: Int, dismissRes: Int, confirmRes: Int,
                       onDismiss: () -> Unit, onConfirm: () -> Unit){
    val borderRadius = 15.dp

    InteractiveMapTheme {
        Dialog(onDismissRequest = { onDismiss() },
            properties = DialogProperties(usePlatformDefaultWidth = false)) {
            Card(modifier = Modifier.fillMaxWidth().padding(16.dp),
                shape = RoundedCornerShape(20.dp)
            ){
                Column (modifier = Modifier.fillMaxWidth().padding(14.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally ){

                    Text(text = stringResource(id = titleRes), style = MaterialTheme.typography.headlineMedium)

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(text = stringResource(id = textRex), textAlign = TextAlign.Justify,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier.fillMaxWidth().padding(start = 8.dp)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Row (modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically ){
                        Box(modifier = Modifier.height(40.dp).weight(1f)
                            .then(
                                ShadowMaterial.CustomShadow.createModifier
                                (borderRadius, MaterialTheme.colorScheme.tertiaryContainer))
                            .then(
                                ShadowMaterial.CustomReShadow.createModifier
                                (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer))
                        ) {
                            DefaultButton(buttonColor = MaterialTheme.colorScheme.onBackground,
                                textString = stringResource(id = dismissRes), borderRadius,
                                textStyle = MaterialTheme.typography.labelMedium.copy(
                                    color = MaterialTheme.colorScheme.background, fontWeight = FontWeight.Light)
                            ) { onDismiss() }
                        }

                        Spacer(modifier = Modifier.width(12.dp))

                        Box(modifier = Modifier.height(40.dp).weight(1f)
                            .then(
                                ShadowMaterial.CustomShadow.createModifier
                                (borderRadius, MaterialTheme.colorScheme.tertiaryContainer))
                            .then(
                                ShadowMaterial.CustomReShadow.createModifier
                                (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer))
                        ) {
                            DefaultButton(buttonColor = MaterialTheme.colorScheme.onError,
                                textString = stringResource(id = confirmRes), borderRadius,
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