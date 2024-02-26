package com.example.interactivemap.ui.resource.header

import android.annotation.SuppressLint
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun SearchHeader (entered: MutableState<String>, leftImgId: Int, rightImgId: Int, searchResult: MutableState<ArrayList<String>>,
                  onClickRight : () -> Unit, onChange: () -> Unit, onSelected:() -> Unit){

    var isTextFieldActive by remember { mutableStateOf(false) }

    InteractiveMapTheme {
        Column (modifier = Modifier.fillMaxWidth().padding(15.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally){

            Box(modifier = Modifier.height(50.dp).fillMaxWidth()
                .then(ShadowMaterial.CustomShadow.createModifier
                        (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                .then(ShadowMaterial.CustomReShadow.createModifier
                        (5.dp, MaterialTheme.colorScheme.onTertiaryContainer))
            ){
                Box(modifier = Modifier.clip(RoundedCornerShape(15.dp)).fillMaxSize()
                    .background(MaterialTheme.colorScheme.onPrimaryContainer)
                ) {
                    Row (
                        Modifier.padding(vertical = 5.dp, horizontal = 12.dp).fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically)
                    {
                        Icon(painter = painterResource(id = leftImgId), contentDescription = null,
                            tint = MaterialTheme.colorScheme.onBackground,
                            modifier = Modifier.size(30.dp)
                        )

                        BasicTextField(value = entered.value,
                            onValueChange = { entered.value = it
                                if (entered.value.length > 2)onChange()
                            },
                            textStyle = MaterialTheme.typography.displaySmall.copy(color = MaterialTheme.colorScheme.onBackground,
                                textAlign = TextAlign.Center, fontWeight = FontWeight.Medium
                            ), modifier = Modifier.weight(1f).onFocusChanged { isTextFieldActive = it.isFocused }
                        )

                        Icon(painter = painterResource(id = rightImgId), contentDescription = null,
                            tint = MaterialTheme.colorScheme.onBackground,
                            modifier = Modifier.size(30.dp).clickable { onClickRight() }
                        )
                    }
                }
            }

            if(isTextFieldActive){
                Spacer(modifier = Modifier.height(12.dp))

                Box(modifier = Modifier.fillMaxWidth()
                    .then(ShadowMaterial.CustomShadow.createModifier
                            (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                    .then(ShadowMaterial.CustomReShadow.createModifier
                            (5.dp, MaterialTheme.colorScheme.onTertiaryContainer))
                ){
                    Box(modifier = Modifier.clip(RoundedCornerShape(15.dp)).fillMaxWidth()
                        .background(MaterialTheme.colorScheme.onPrimaryContainer)
                    ) {
                        LazyColumn(
                            modifier = Modifier.padding(vertical = 4.dp, horizontal = 5.dp),
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            if (searchResult.value.isEmpty()){
                                item { SearchResultEmpty(value = stringResource(
                                    id = if (entered.value.isEmpty()) R.string.search_request else R.string.search_no_result) )
                                }
                            }
                            items(searchResult.value.size) {
                                    item -> SearchResultElement(searchResult.value[item]){ onSelected() }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SearchResultEmpty(value: String){
    Row (modifier =  Modifier.padding(horizontal = 8.dp, vertical = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically){

        Text(modifier = Modifier.fillMaxWidth(), text = value,
            style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.onBackground,
                fontWeight = FontWeight.Medium, textAlign = TextAlign.Center), softWrap = false)
    }
}

@Composable
fun SearchResultElement(value: String, onClick: () -> Unit){
    InteractiveMapTheme {
        Box(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp, horizontal = 5.dp)
            .clip(RoundedCornerShape(5.dp)).clickable { onClick() }){
            Row (modifier =  Modifier.padding(horizontal = 3.dp, vertical = 2.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically){

                Text(modifier = Modifier.fillMaxWidth(), text = value,
                    style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.onBackground,
                        fontWeight = FontWeight.Medium), softWrap = false)
            }
        }
    }
}

@SuppressLint("MutableCollectionMutableState")
@Preview
@Composable
fun SearchHeaderPreview(){
    val searchRes =  remember { mutableStateOf(
        arrayListOf(
        "Новий. к: ауд. 3227", "Новий. к: ауд. 3228",
        "Новий. к: ауд. 3229", "Новий. к: ауд. 3230",
        "Старий. к: ауд. 365"
    )) }

    searchRes.value.clear()

    SearchHeader(
        remember { mutableStateOf("") }, leftImgId = R.drawable.ic_search, searchResult = searchRes,
        rightImgId = R.drawable.ic_account, onClickRight = {}, onChange = {}){}
}