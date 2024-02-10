package com.example.interactivemap.ui.screens.account.table

import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.resource.photo.ProfilePhotoViewSmall
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun TableElement(type: Int){
    InteractiveMapTheme {
        Column (modifier = Modifier.alpha(alpha = if (type == 2) 0.6f else 1f)){
            Row (modifier = Modifier.padding(3.dp).fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween){

                Box(modifier = Modifier.fillMaxWidth(0.20f).aspectRatio(1f)
                    .height(IntrinsicSize.Min)
                    .then(ShadowMaterial.CustomShadow.createModifier
                        (200.dp, MaterialTheme.colorScheme.tertiaryContainer))
                    .then(ShadowMaterial.CustomReShadow.createModifier
                        (200.dp, MaterialTheme.colorScheme.onTertiaryContainer))
                ){
                    ProfilePhotoViewSmall(onlineType = 1)
                }

                Column (modifier = Modifier.padding(start = 4.dp, top = 5.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Row (verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween){
                        Column (modifier = Modifier.weight(1f),
                            verticalArrangement = Arrangement.SpaceBetween,
                            horizontalAlignment = Alignment.CenterHorizontally){
                            Text(text = "Студент: гр. 940п ", modifier = Modifier.fillMaxWidth(),
                                style = MaterialTheme.typography.titleSmall.copy(color = MaterialTheme.colorScheme.onPrimary))
                            Spacer(modifier = Modifier.height(3.dp))
                            Text(text = "Еmail: ahlenko.02@gmail.com", modifier = Modifier.fillMaxWidth(),
                                style = MaterialTheme.typography.titleSmall.copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.7f), fontWeight = FontWeight.Light))
                        }
                        when (type){
                            0 -> Icon(painter = painterResource(id = R.drawable.ic_star), contentDescription = null,
                                modifier = Modifier.size(26.dp),
                                tint = MaterialTheme.colorScheme.onBackground)
                            2 -> Icon(painter = painterResource(id = R.drawable.ic_account_block), contentDescription = null,
                                modifier = Modifier.size(26.dp),
                                tint = MaterialTheme.colorScheme.onError)
                        }

                    }

                    Spacer(modifier = Modifier.height(3.dp))

                    Row (verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween){
                        Text(text = "Ахленко Дмитро\n" + "Андрійович", modifier = Modifier.weight(1f),
                            style = MaterialTheme.typography.titleMedium.copy(color = MaterialTheme.colorScheme.onBackground))
                        Icon(painter = painterResource(id = R.drawable.ic_right), contentDescription = null,
                            modifier = Modifier
                                .padding(end = 3.dp)
                                .size(20.dp),
                            tint = MaterialTheme.colorScheme.onBackground)
                    }
                }
            }

            Box(modifier = Modifier
                .padding(top = 1.dp)
                .height(1.dp)
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5f)))
        }

    }
}

@Preview
@Composable
fun TableElementPreview(){
    TableElement(1)
}