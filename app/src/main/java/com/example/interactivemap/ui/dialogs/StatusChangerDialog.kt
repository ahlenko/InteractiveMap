package com.example.interactivemap.ui.dialogs

import android.graphics.BlurMaskFilter
import android.graphics.Paint
import android.graphics.RectF
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.interactivemap.R
import com.example.interactivemap.ui.resource.button.ChangeStatusButton
import com.example.interactivemap.ui.resource.button.RadioRowButton
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun StatusChangerDialog(status: Int, onDismiss: () -> Unit, onConfirm: () -> Unit){
    InteractiveMapTheme {
        Dialog(onDismissRequest = { onDismiss() },
            properties = DialogProperties(usePlatformDefaultWidth = false)
        ) {
            Card(
                modifier = Modifier.fillMaxWidth().padding(20.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
                shape = RoundedCornerShape(16.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(14.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = stringResource(id = R.string.display_status),
                        style = MaterialTheme.typography.bodyLarge
                    )

                    Spacer(modifier = Modifier.height(16.dp))


                    Row (modifier = Modifier
                        .padding(vertical = 15.dp)
                        .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically){

                        Column (
                            modifier = Modifier.weight(1f),
                            verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.CenterHorizontally){

                            ChangeStatusButton(isActivate = true, text = stringResource(id = R.string.online), iconId = R.drawable.ic_online) {}
                            Spacer(modifier = Modifier.height(25.dp))
                            ChangeStatusButton(isActivate = false, text = stringResource(id = R.string.not_disturb), iconId = R.drawable.ic_not_disturb) {}
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Column (
                            modifier = Modifier.weight(1f),
                            verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.CenterHorizontally){

                            ChangeStatusButton(isActivate = false, text = stringResource(id = R.string.not_at_place), iconId = R.drawable.ic_not_at_place) {}
                            Spacer(modifier = Modifier.height(25.dp))
                            ChangeStatusButton(isActivate = false, text = stringResource(id = R.string.invisible), iconId = R.drawable.ic_invisible) {}
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun StatusChangerDialogPreview(){
    StatusChangerDialog(status = 1, onDismiss = {}, onConfirm = {})
}