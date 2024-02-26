package com.example.interactivemap.ui.resource.controller

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ui.resource.button.IconButton
import com.example.interactivemap.ui.resource.button.RadioRowButton
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun UserFilter(isStudentType: Boolean, isFullView: Boolean){
    InteractiveMapTheme {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(15.dp))
                .background(MaterialTheme.colorScheme.onPrimaryContainer)
                .padding(10.dp)
        ) {
            Row (modifier = Modifier.height(50.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically)
            {
                Text(text = stringResource(id = R.string.students), Modifier.weight(1f).clickable {  },
                    style = MaterialTheme.typography.headlineMedium.copy(
                        color = MaterialTheme.colorScheme.onPrimary.copy(alpha = if (isStudentType) 1f else 0.3f),
                        textAlign = TextAlign.Center,
                    )
                )

                Text(text = stringResource(id = R.string.tutors), Modifier.weight(1f).clickable {  },
                    style = MaterialTheme.typography.headlineMedium.copy
                        (color = MaterialTheme.colorScheme.onPrimary.copy(alpha = if (isStudentType) 0.3f else 1f),
                        textAlign = TextAlign.Center,
                    )
                )

                Box(modifier = Modifier.aspectRatio(1f).height(IntrinsicSize.Max)){
                    IconButton(buttonColor = Color.Transparent, size = 30.dp,
                        imageResourceId = R.drawable.ic_filter, radius = 30.dp,
                        iconColor = MaterialTheme.colorScheme.onPrimary) {}
                }

            }


            if(isFullView){
                Row (modifier = Modifier.padding(vertical = 15.dp).fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically){

                    Column (
                        modifier = Modifier.weight(1f).padding(start = 20.dp),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        RadioRowButton(checked = false, textId = R.string.active){}
                        Spacer(modifier = Modifier.height(25.dp))
                        RadioRowButton(checked = false, textId = if (isStudentType) R.string.all_students
                        else R.string.all_tutors){}
                    }

                    Column (
                        modifier = Modifier.weight(1f).padding(start = 40.dp),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        RadioRowButton(checked = false, textId = if (isStudentType) R.string.not_at_place
                        else R.string.blocked){}
                        Spacer(modifier = Modifier.height(25.dp))
                        RadioRowButton(checked = true, textId = R.string.clipped){}
                    }
                }
            }

        }
    }
}

@Preview
@Composable
fun UserFilterPreview(){
    UserFilter(true, true)
}