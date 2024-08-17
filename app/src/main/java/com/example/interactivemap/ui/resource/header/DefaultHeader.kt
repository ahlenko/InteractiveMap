package com.example.interactivemap.ui.resource.header

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import com.example.interactivemap.ui.translations.Tr

@Composable
fun DefaultHeader (titleId: String, leftImgId: Int, rightImgId: Int,
                   onClickLeft : () -> Unit, onClickRight : () -> Unit){
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Box(
            modifier = Modifier.clip(RoundedCornerShape(15.dp)).fillMaxSize()
                .background(MaterialTheme.colorScheme.onPrimaryContainer)
        ) {
            Row (
                Modifier.padding(vertical = 5.dp, horizontal = 12.dp).fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically)
            {
                Icon(painter = painterResource(id = leftImgId), contentDescription = null,
                    tint = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.size(30.dp).clickable { onClickLeft() }
                )

                Text(text = titleId, Modifier.weight(1f),
                    style = MaterialTheme.typography.displaySmall.copy(color = MaterialTheme.colorScheme.onBackground,
                        textAlign = TextAlign.Center, fontWeight = FontWeight.Medium
                    )
                )

                Icon(painter = painterResource(id = rightImgId), contentDescription = null,
                    tint = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.size(30.dp).clickable { onClickRight() }
                )
            }
        }
    }
}

@Preview
@Composable
fun DefaultHeaderPreview(){
    DefaultHeader(titleId = Tr.skip, leftImgId = R.drawable.ic_search,
        rightImgId = R.drawable.ic_account, onClickLeft = {}, onClickRight = {})
}

