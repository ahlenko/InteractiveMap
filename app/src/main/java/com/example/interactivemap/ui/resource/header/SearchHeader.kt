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
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.model.navigation.models.NavModel
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import com.example.interactivemap.ui.translations.Tr

@Composable
fun SearchHeader (leftImgId: Int, searchResult: ArrayList<NavModel>,  rightImgId: Int,
                   onChange: (String) -> Unit, onSelected:(NavModel) -> Unit){

    var isTextFieldActive by remember { mutableStateOf(false) }
    var entered by remember { mutableStateOf("") }
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current

    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
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

                        BasicTextField(value = entered,
                            onValueChange = { entered = it
                                if (entered.length > 1) onChange(entered)
                            },
                            textStyle = MaterialTheme.typography.displaySmall.copy(color = MaterialTheme.colorScheme.onBackground,
                                textAlign = TextAlign.Center, fontWeight = FontWeight.Medium
                            ), modifier = Modifier.weight(1f).onFocusChanged { isTextFieldActive = it.isFocused }
                        )

                        Icon(painter = painterResource(id = rightImgId), contentDescription = null,
                            tint = MaterialTheme.colorScheme.onBackground,
                            modifier = Modifier.size(30.dp)
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
                            if (searchResult.isEmpty()){
                                item { SearchResultEmpty(value =
                                     if (entered.isEmpty()) Tr.search_request else Tr.search_no_result)
                                }
                            }
                            items(searchResult.size) {
                                item -> SearchResultElement(searchResult[item]){ entered = ""
                                isTextFieldActive = false
                                keyboardController?.hide()
                                focusManager.clearFocus()
                                onSelected(it) }
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
fun SearchResultElement(value: NavModel, onClick: (NavModel) -> Unit){
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Box(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp, horizontal = 5.dp)
            .clip(RoundedCornerShape(5.dp)).clickable { onClick(value) }){
            Row (modifier =  Modifier.padding(horizontal = 3.dp, vertical = 2.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically){


                Text(modifier = Modifier.fillMaxWidth(), text = value.name ?: value.id.toString(),
                    style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.onBackground,
                        fontWeight = FontWeight.Medium), softWrap = false)

            }
        }
    }
}