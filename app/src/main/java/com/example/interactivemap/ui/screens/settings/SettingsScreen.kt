package com.example.interactivemap.ui.screens.settings

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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.interactivemap.R
import com.example.interactivemap.ui.resource.button.DropDownRowButton
import com.example.interactivemap.ui.resource.button.SwitchRowButton
import com.example.interactivemap.ui.resource.fields.IconTextRow
import com.example.interactivemap.ui.resource.header.DefaultHeader
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun ScheduleViewerScreen(navHostController: NavHostController,
    settingsViewModel: SettingsViewModel = viewModel()
){
    val fullScreen = true

    InteractiveMapTheme {
        Column (modifier = Modifier.fillMaxSize().padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ){
            Box(modifier = Modifier.height(50.dp).fillMaxWidth()){
                DefaultHeader(titleId = R.string.skip, leftImgId = R.drawable.ic_prew_page,
                    rightImgId = R.drawable.ic_account, onClickLeft = {}, onClickRight = {})
            }

            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "Загальні", Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.headlineSmall
                    .copy(color = MaterialTheme.colorScheme.onPrimary, textAlign = TextAlign.Center)
            )

            Spacer(modifier = Modifier.height(15.dp))

            Row (modifier = Modifier.fillMaxWidth().height(50.dp).clickable { },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
                ){
                Box(modifier = Modifier.weight(1f)){
                    IconTextRow(imageId = R.drawable.ic_language, textId = R.string.skip) }
                DropDownRowButton(textId = R.string.skip)
            }

            Spacer(modifier = Modifier.height(15.dp))

            Row (modifier = Modifier.fillMaxWidth().height(50.dp).clickable { },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Box(modifier = Modifier.weight(1f)){
                IconTextRow(imageId = R.drawable.ic_theme, textId = R.string.skip)}
                SwitchRowButton(state = true)
            }

            Spacer(modifier = Modifier.height(15.dp))

            Row (modifier = Modifier.fillMaxWidth().height(50.dp).clickable { },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Box(modifier = Modifier.weight(1f)){
                IconTextRow(imageId = R.drawable.ic_distant, textId = R.string.skip)}
                SwitchRowButton(state = true)
            }

            Spacer(modifier = Modifier.height(15.dp))

            Row (modifier = Modifier.fillMaxWidth().height(50.dp).clickable { },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Box(modifier = Modifier.weight(1f)){
                IconTextRow(imageId = R.drawable.ic_demo, textId = R.string.skip)}
                Text(text = ">>", style = MaterialTheme.typography.headlineSmall
                    .copy(color = MaterialTheme.colorScheme.onPrimary))
            }

            if (fullScreen){
                Spacer(modifier = Modifier.height(15.dp))

                Text(text = "Геолокація", Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.headlineSmall
                        .copy(color = MaterialTheme.colorScheme.onPrimary, textAlign = TextAlign.Center),
                )

                Spacer(modifier = Modifier.height(15.dp))

                Row (modifier = Modifier.fillMaxWidth().height(50.dp).clickable { },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Box(modifier = Modifier.weight(1f)){
                    IconTextRow(imageId = R.drawable.ic_translation, textId = R.string.skip)}
                    SwitchRowButton(state = true)
                }

                Spacer(modifier = Modifier.height(15.dp))

                Row (modifier = Modifier.fillMaxWidth().height(50.dp).clickable { },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Box(modifier = Modifier.weight(1f)){
                    IconTextRow(imageId = R.drawable.ic_map_view, textId = R.string.skip)}
                    DropDownRowButton(textId = R.string.skip)
                }

                Spacer(modifier = Modifier.height(15.dp))

                Row (modifier = Modifier.fillMaxWidth().height(50.dp).clickable { },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Box(modifier = Modifier.weight(1f)){
                    IconTextRow(imageId = R.drawable.ic_interval, textId = R.string.skip)}
                    DropDownRowButton(textId = R.string.skip)
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                Text(text = "До головної сторінки", Modifier.clickable { },
                    style = MaterialTheme.typography.headlineSmall
                        .copy(color = MaterialTheme.colorScheme.onBackground, textAlign = TextAlign.Center),
                )
            }

            Spacer(modifier = Modifier.height(15.dp))

            Text(text = "Version: 1.0.37 (93)", Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.headlineSmall
                    .copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.6f), textAlign = TextAlign.Center),
            )
        }
    }
}

@Preview
@Composable
fun ScheduleViewerScreenPreview(){
    ScheduleViewerScreen(rememberNavController())
}
