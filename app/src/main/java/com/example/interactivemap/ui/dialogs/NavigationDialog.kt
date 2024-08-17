package com.example.interactivemap.ui.dialogs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.model.navigation.models.NavigationEventModel
import com.example.interactivemap.ui.resource.button.DefaultButton
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun NavigationDialog(
    textRes: State<NavigationEventModel>,
    onConfirm: () -> Unit){
    val borderRadius = 15.dp

    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Dialog(onDismissRequest = { onConfirm() },
            properties = DialogProperties(usePlatformDefaultWidth = false)) {
            Card(modifier = Modifier.fillMaxWidth().padding(30.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
                shape = RoundedCornerShape(16.dp)
            ){
                Column (modifier = Modifier.fillMaxWidth().padding(14.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally ){

                    Text(text = textRes.value.title, style = MaterialTheme.typography
                        .headlineMedium.copy(color = MaterialTheme.colorScheme.onPrimary))

                    Spacer(modifier = Modifier.height(18.dp))

                    Text(text = textRes.value.description, textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineSmall.copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.7f)),
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 5.dp)
                    )

                    Spacer(modifier = Modifier.height(18.dp))

                    Box(modifier = Modifier.height(40.dp).padding(horizontal = 40.dp)
                        .then(ShadowMaterial.CustomShadow.createModifier
                            (borderRadius, MaterialTheme.colorScheme.tertiaryContainer))
                        .then(ShadowMaterial.CustomReShadow.createModifier
                            (borderRadius, MaterialTheme.colorScheme.onTertiaryContainer))
                    ) {
                        DefaultButton(buttonColor =  MaterialTheme.colorScheme.onBackground,
                            textString = textRes.value.buttonText, borderRadius,
                            textStyle = MaterialTheme.typography.labelMedium.copy(
                                color = MaterialTheme.colorScheme.background, fontWeight = FontWeight.Light)
                        ) { onConfirm() }
                    }
                }
            }
        }
    }
}