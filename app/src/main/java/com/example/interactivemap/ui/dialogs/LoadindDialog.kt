package com.example.interactivemap.ui.dialogs

import androidx.compose.material3.CircularProgressIndicator
import com.example.interactivemap.R


import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import com.example.interactivemap.ui.translations.Tr

@Composable
fun LoadingDialog(){
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Dialog(onDismissRequest = {  },
            properties = DialogProperties(usePlatformDefaultWidth = false)) {
            Card(modifier = Modifier.fillMaxWidth().padding(40.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
                shape = RoundedCornerShape(16.dp)
            ){
                Column (modifier = Modifier.fillMaxWidth().padding(14.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally ){

                    Text(text = Tr.loading, style = MaterialTheme.typography
                        .headlineMedium.copy(color = MaterialTheme.colorScheme.onPrimary))

                    Spacer(modifier = Modifier.height(18.dp))

                    Text(text = Tr.pleaseWaiting, style = MaterialTheme.typography
                        .headlineMedium.copy(color = MaterialTheme.colorScheme.onPrimary))

                    Spacer(modifier = Modifier.height(18.dp))

                    CircularProgressIndicator(
                        color = MaterialTheme.colorScheme.onBackground,
                        strokeWidth = 4.dp
                    )
                }
            }
        }
    }
}