package com.example.interactivemap.ui.dialogs

import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.interactivemap.R
import com.example.interactivemap.ui.resource.button.DefaultButton
import com.example.interactivemap.ui.resource.fields.LessonRow
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun SubjectViewDialog(onDismiss: () -> Unit){

    val borderRadius = 15.dp

    InteractiveMapTheme {
        Dialog(onDismissRequest = { onDismiss() },
            properties = DialogProperties(usePlatformDefaultWidth = false)
        ) {
            Card(
                modifier = Modifier.fillMaxWidth().padding(20.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(14.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = stringResource(id = R.string.view_lessons),
                        style = MaterialTheme.typography.bodyLarge
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Box(modifier = Modifier.border(2.dp,
                        MaterialTheme.colorScheme.onBackground,
                        RoundedCornerShape(14.dp)
                    ).height(240.dp)
                    ) {
                        LazyColumn(
                            modifier = Modifier.padding(vertical = 4.dp).fillMaxSize(),
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            item {
                                LessonRow(remember { mutableStateOf(false) },"Економіка програмного забезпеч...")
                            }
                            item {
                                LessonRow(remember { mutableStateOf(true) },"Проектний практикум")
                            }
                            item {
                                LessonRow(remember { mutableStateOf(false) },"Основи програмування")
                            }
                            item {
                                LessonRow(remember { mutableStateOf(false) },"Архітектура комп’ютера")
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Row(modifier = Modifier.padding(bottom = 6.dp).height(42.dp).fillMaxWidth().padding(horizontal = 50.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically) {

                        Box(
                            modifier = Modifier.fillMaxHeight().weight(1f)
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
                                textString = stringResource(id = R.string.close), radius = borderRadius,
                                textStyle = MaterialTheme.typography.headlineLarge.copy(
                                    color = MaterialTheme.colorScheme.background,
                                    fontWeight = FontWeight.Light
                                )
                            ) { onDismiss() }
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun SubjectViewDialogPreview(){ SubjectViewDialog(onDismiss = {}) }