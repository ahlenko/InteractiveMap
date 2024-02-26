package com.example.interactivemap.ui.dialogs

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ui.resource.button.CheckBoxRowButton
import com.example.interactivemap.ui.resource.button.DefaultButton
import com.example.interactivemap.ui.resource.button.IconButton
import com.example.interactivemap.ui.resource.button.TextEditRowIcon
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.screens.account.creator.CreatorViewModel
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SubjectEditorDialog(viewModel: CreatorViewModel, onDismiss: () -> Unit, onConfirm: () -> Unit){
    val modalBottomSheetState = rememberModalBottomSheetState()
    val borderRadius = 15.dp

    val filteredLessonList by viewModel.filteredLessonList.collectAsState()

    InteractiveMapTheme {
        ModalBottomSheet(containerColor = Color.Transparent,
            shape = RoundedCornerShape(borderRadius),
            dragHandle = { }, modifier = Modifier.fillMaxWidth().padding(6.dp),
            onDismissRequest = { onDismiss() }, sheetState = modalBottomSheetState,
        ) {
            Card(modifier = Modifier.fillMaxWidth().padding(bottom = 14.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
                shape = RoundedCornerShape(16.dp)
            ) {
                Box(modifier = Modifier.padding(top = 12.dp).height(4.dp).width(60.dp)
                    .align(Alignment.CenterHorizontally).clip(RoundedCornerShape(100.dp))
                    .background(MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.4f))
                )

                Column(modifier = Modifier.fillMaxWidth().padding(14.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(text = stringResource(id = R.string.select_lesson),
                        style = MaterialTheme.typography.bodyLarge)

                    Spacer(modifier = Modifier.height(16.dp))

                    Box(modifier = Modifier.border(2.dp,
                            MaterialTheme.colorScheme.onBackground,
                            RoundedCornerShape(14.dp)
                        ).height(240.dp)
                    ) {
                        LazyColumn(modifier = Modifier.padding(vertical = 4.dp).fillMaxSize(),
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            items(filteredLessonList) {
                                item -> CheckBoxRowButton( item.selected, item.name) { viewModel.onSelected(item.id) }
                            }
                        }
                    }

                    if (viewModel.inEditState) {
                        Spacer(modifier = Modifier.height(8.dp))

                        Box(modifier = Modifier.fillMaxWidth().height(50.dp)) {
                            TextEditRowIcon(
                                iconId = R.drawable.ic_notebook, text = viewModel.subjectText,
                                textStyle = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Light)
                                    .copy(color = MaterialTheme.colorScheme.onPrimary), onClick = { viewModel.addALesson() }
                            ) { text ->  viewModel.filterList(text) }
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Row(modifier = Modifier
                        .padding(bottom = 6.dp)
                        .height(42.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Box(modifier = Modifier
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
                            DefaultButton(
                                buttonColor = MaterialTheme.colorScheme.onBackground,
                                textString = stringResource(id = R.string.confirm),
                                radius = borderRadius,
                                textStyle = MaterialTheme.typography.headlineLarge.copy(
                                    color = MaterialTheme.colorScheme.background,
                                    fontWeight = FontWeight.Light)
                            ) { onConfirm() }
                        }

                        Spacer(modifier = Modifier.width(30.dp))

                        Box(modifier = Modifier
                            .height(IntrinsicSize.Max)
                            .aspectRatio(1f)) {
                            IconButton(buttonColor = Color.Transparent, radius = borderRadius,
                                imageResourceId = if (viewModel.inEditState) R.drawable.ic_back
                                else R.drawable.ic_notebook_plus, size = 32.dp,
                                iconColor = MaterialTheme.colorScheme.onBackground,
                            ) { viewModel.inEditState = !viewModel.inEditState }
                        }
                    }
                }
            }
        }
    }
}