package com.example.interactivemap.ui.dialogs

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.model.datamodel.LessonData
import com.example.interactivemap.ui.resource.button.DefaultButton
import com.example.interactivemap.ui.resource.fields.ViewField
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.screens.schedule.DefScheduleViewModel
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonViewDialog(lessonData: LessonData, lessonDescription: String, viewModel: DefScheduleViewModel, onDismiss: () -> Unit) {
    val modalBottomSheetState = rememberModalBottomSheetState()

    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        val borderRadius = 15.dp
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
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(14.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = lessonDescription,
                        style = MaterialTheme.typography.headlineLarge
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = stringResource(id = R.string.lesson_data),
                        style = MaterialTheme.typography.headlineMedium
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Text(
                            modifier = Modifier.weight(1f),
                            text = stringResource(R.string.lesson),
                            style = MaterialTheme.typography.headlineSmall
                                .copy(color = MaterialTheme.colorScheme.onPrimary)
                        )

                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.74f)
                                .height(38.dp)
                        ) {
                            ViewField(
                                text = remember {
                                    mutableStateOf(lessonData.name)
                                }, textStyle = MaterialTheme.typography.bodySmall
                                    .copy(color = MaterialTheme.colorScheme.onPrimary)
                            )
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Text(
                            modifier = Modifier.weight(1f),
                            text = stringResource(R.string.tutor_),
                            style = MaterialTheme.typography.headlineSmall
                                .copy(color = MaterialTheme.colorScheme.onPrimary)
                        )

                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.74f)
                                .height(38.dp)
                        ) {
                            ViewField(
                                text = remember {
                                    mutableStateOf(lessonData.tutor)
                                }, textStyle = MaterialTheme.typography.bodySmall
                                    .copy(color = MaterialTheme.colorScheme.onPrimary)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = stringResource(id = R.string.place_data),
                        style = MaterialTheme.typography.headlineMedium
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Text(
                            modifier = Modifier.weight(1f),
                            text = stringResource(R.string.lider),
                            style = MaterialTheme.typography.headlineSmall
                                .copy(color = MaterialTheme.colorScheme.onPrimary)
                        )

                        Box(modifier = Modifier
                            .fillMaxWidth(0.74f)
                            .height(38.dp)
                            .clickable { viewModel.openUrlInBrowser(lessonData.lidLink) }) {
                            ViewField(
                                text = remember {
                                    mutableStateOf(lessonData.lidLink)
                                }, textStyle = MaterialTheme.typography.bodySmall
                                    .copy(color = MaterialTheme.colorScheme.onPrimary)
                            )
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Text(
                            modifier = Modifier.weight(1f),
                            text = stringResource(R.string.kab),
                            style = MaterialTheme.typography.headlineSmall
                                .copy(color = MaterialTheme.colorScheme.onPrimary)
                        )

                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.74f)
                                .height(38.dp)
                        ) {
                            ViewField(
                                text = remember {
                                    mutableStateOf(lessonData.locationIndex.toString())
                                }, textStyle = MaterialTheme.typography.bodySmall
                                    .copy(color = MaterialTheme.colorScheme.onPrimary)
                            )
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Text(
                            modifier = Modifier.weight(1f),
                            text = stringResource(R.string.link),
                            style = MaterialTheme.typography.headlineSmall
                                .copy(color = MaterialTheme.colorScheme.onPrimary)
                        )

                        Box(modifier = Modifier
                            .fillMaxWidth(0.74f)
                            .height(38.dp)
                            .clickable { viewModel.openUrlInBrowser(lessonData.link) }) {
                            ViewField(
                                text = remember {
                                    mutableStateOf(lessonData.link)
                                }, textStyle = MaterialTheme.typography.bodySmall
                                    .copy(color = MaterialTheme.colorScheme.onPrimary)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .padding(bottom = 5.dp)
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
                            textString = stringResource(id = R.string.close_viewer), borderRadius,
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