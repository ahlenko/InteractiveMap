package com.example.interactivemap.ui.dialogs

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.model.datamodel.LessonData
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.ui.resource.button.IconButton
import com.example.interactivemap.ui.resource.button.TextIconButton
import com.example.interactivemap.ui.resource.fields.BasicField
import com.example.interactivemap.ui.resource.header.SearchResultElement
import com.example.interactivemap.ui.resource.header.SearchResultEmpty
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.screens.schedule.editor.ScheduleEditorViewModel
import com.example.interactivemap.ui.theme.InteractiveMapTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonEditorDialog(lessonData: LessonData, lessonDescription: String, isTextFieldActive: Boolean, locationName: MutableState<String>,
                       viewModel: ScheduleEditorViewModel, onSelected:(NavModel) -> Unit, onDismiss: () -> Unit,) {
    val searchResults by viewModel.searchResults.collectAsState()
    val modalBottomSheetState = rememberModalBottomSheetState()
    val context = LocalContext.current

    val name = remember { mutableStateOf(lessonData.name) }
    val tutor = remember { mutableStateOf(lessonData.tutor) }
    val lidLink = remember { mutableStateOf(lessonData.lidLink) }
    val link = remember { mutableStateOf(lessonData.link) }

    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current
    var entered by remember { mutableStateOf("") }

    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        val borderRadius = 15.dp
        ModalBottomSheet(
            containerColor = Color.Transparent,
            shape = RoundedCornerShape(borderRadius),
            dragHandle = { }, modifier = Modifier.fillMaxWidth().padding(6.dp),
            onDismissRequest = { onDismiss() },
            sheetState = modalBottomSheetState,
        ) {

            if(isTextFieldActive){
                Spacer(modifier = Modifier.height(12.dp))

                Box(modifier = Modifier.fillMaxWidth()
                    .then(ShadowMaterial.CustomShadow.createModifier
                        (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                    .then(ShadowMaterial.CustomReShadow.createModifier
                        (5.dp, MaterialTheme.colorScheme.onTertiaryContainer))
                ){
                    Box(modifier = Modifier.clip(RoundedCornerShape(15.dp)).fillMaxWidth()
                        .background(MaterialTheme.colorScheme.background)
                    ) {
                        LazyColumn(
                            modifier = Modifier.padding(vertical = 4.dp, horizontal = 5.dp),
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            if (searchResults.isEmpty()){
                                item { SearchResultEmpty(value = stringResource(
                                    id = if (entered.isEmpty()) R.string.search_request else R.string.search_no_result) )
                                }
                            }
                            items(searchResults.size) {
                                    item -> SearchResultElement(searchResults[item]){ entered = ""
                                keyboardController?.hide()
                                focusManager.clearFocus()
                                onSelected(it) }
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 14.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
                shape = RoundedCornerShape(16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .padding(top = 12.dp)
                        .height(4.dp)
                        .width(60.dp)
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

                    Text(text = lessonDescription, style = MaterialTheme.typography.headlineLarge)

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
                        Row (modifier = Modifier.weight(1f)){
                            Text(text = stringResource(R.string.lesson),
                                style = MaterialTheme.typography.headlineSmall
                                    .copy(color = MaterialTheme.colorScheme.onPrimary)
                            )

                            Text(text = "*",
                                style = MaterialTheme.typography.headlineSmall
                                    .copy(color = MaterialTheme.colorScheme.onError)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.74f)
                                .height(38.dp)
                        ) {
                            LocalSoftwareKeyboardController.current?.let {
                                BasicField(
                                    text = name,
                                    textStyle = MaterialTheme.typography.bodySmall
                                        .copy(color = MaterialTheme.colorScheme.onPrimary), ""
                                )
                            }
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Row (modifier = Modifier.weight(1f)){
                            Text(text = stringResource(R.string.tutor_),
                                style = MaterialTheme.typography.headlineSmall
                                    .copy(color = MaterialTheme.colorScheme.onPrimary)
                            )

                            Text(text = "*",
                                style = MaterialTheme.typography.headlineSmall
                                    .copy(color = MaterialTheme.colorScheme.onError)
                            )
                        }


                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.74f)
                                .height(38.dp)
                        ) {
                            LocalSoftwareKeyboardController.current?.let {
                                BasicField(
                                    text = tutor,
                                    textStyle = MaterialTheme.typography.bodySmall
                                        .copy(color = MaterialTheme.colorScheme.onPrimary), ""
                                )
                            }
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

                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.74f)
                                .height(38.dp)
                        ) {
                            BasicField(
                                text = lidLink, textStyle = MaterialTheme.typography.bodySmall
                                    .copy(color = MaterialTheme.colorScheme.onPrimary), ""
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
                            BasicField(
                                text = locationName, textStyle = MaterialTheme.typography.bodySmall
                                    .copy(color = MaterialTheme.colorScheme.onPrimary), ""
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

                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.74f)
                                .height(38.dp)
                        ) {
                            BasicField(
                                text = link, textStyle = MaterialTheme.typography.bodySmall
                                    .copy(color = MaterialTheme.colorScheme.onPrimary), ""
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Row(
                        modifier = Modifier
                            .padding(bottom = 6.dp)
                            .height(50.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Box(
                            modifier = Modifier
                                .height(IntrinsicSize.Max)
                                .aspectRatio(1f)
                                .then(
                                    ShadowMaterial.CustomShadow.createModifier
                                        (borderRadius, MaterialTheme.colorScheme.tertiaryContainer)
                                )
                                .then(
                                    ShadowMaterial.CustomReShadow.createModifier
                                        (
                                        borderRadius,
                                        MaterialTheme.colorScheme.onTertiaryContainer
                                    )
                                )
                                .alpha(if (viewModel.deleteEnable) 1f else 0.7f)
                        ) {
                            IconButton(
                                buttonColor = MaterialTheme.colorScheme.onError,
                                radius = borderRadius,
                                imageResourceId = R.drawable.ic_trashbox,
                                size = 28.dp,
                                iconColor = MaterialTheme.colorScheme.background,
                            ) {
                                if (viewModel.deleteEnable) {
                                    viewModel.onDeleteButtonClick()
                                    onDismiss()
                                }
                            }
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Box(
                            modifier = Modifier
                                .fillMaxHeight()
                                .weight(1f)
                                .then(
                                    ShadowMaterial.CustomShadow.createModifier
                                        (borderRadius, MaterialTheme.colorScheme.tertiaryContainer)
                                )
                                .then(
                                    ShadowMaterial.CustomReShadow.createModifier
                                        (
                                        borderRadius,
                                        MaterialTheme.colorScheme.onTertiaryContainer
                                    )
                                )
                        ) {
                            TextIconButton(
                                imageResourceId = R.drawable.ic_save,
                                iconColor = MaterialTheme.colorScheme.background,
                                buttonColor = MaterialTheme.colorScheme.onBackground,
                                text = stringResource(id = R.string.save), radius = borderRadius,
                                textStyle = MaterialTheme.typography.headlineLarge.copy(
                                    color = MaterialTheme.colorScheme.background,
                                    fontWeight = FontWeight.Light
                                )
                            ) {
                                if (viewModel.checkFields(
                                        tutor.value,
                                        name.value
                                    )
                                ) {
                                    viewModel.onDataChanged(
                                        link.value,
                                        lidLink.value,
                                        tutor.value,
                                        name.value
                                    )
                                    onDismiss()
                                } else {
                                    Toast.makeText(
                                        context,
                                        R.string.all_fields_mast_be_filled,
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}