package com.example.interactivemap.ui.screens.account.table

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.interactivemap.R
import com.example.interactivemap.logic.navigation.AccOnboard
import com.example.interactivemap.logic.navigation.LandingScreen
import com.example.interactivemap.logic.navigation.NavigationScreen
import com.example.interactivemap.ui.resource.controller.UserFilter
import com.example.interactivemap.ui.resource.header.DefaultHeader
import com.example.interactivemap.ui.resource.material.ShadowMaterial
import com.example.interactivemap.ui.resource.material.ShadowMaterial.CustomReShadow.createModifier
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@Composable
fun TableViewerScreen(navHostController: NavHostController,
    tableViewerViewModel: TableViewerViewModel = viewModel()
){
    InteractiveMapTheme {
        Column(modifier = Modifier.fillMaxSize().padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Box(
                modifier = Modifier.height(50.dp).fillMaxWidth()
                    .then(ShadowMaterial.CustomShadow.createModifier
                            (15.dp, MaterialTheme.colorScheme.tertiaryContainer))
                    .then(ShadowMaterial.CustomReShadow.createModifier
                            (15.dp, MaterialTheme.colorScheme.onTertiaryContainer))
            ) {
                DefaultHeader(titleId = R.string.users, leftImgId = R.drawable.ic_prew_page,
                    rightImgId = R.drawable.ic_account, onClickLeft = {
                        navHostController.navigate(NavigationScreen.route) { popUpTo(0) }
                    }, onClickRight = {
                        navHostController.navigate(AccOnboard.route) { popUpTo(0) } })
            }

            Spacer(modifier = Modifier.height(20.dp))

            Box(modifier = Modifier.fillMaxWidth()
                    .then(ShadowMaterial.CustomShadow.createModifier
                            (5.dp, MaterialTheme.colorScheme.tertiaryContainer))
                    .then(ShadowMaterial.CustomReShadow.createModifier
                            (5.dp, MaterialTheme.colorScheme.onTertiaryContainer))
            ) {
                UserFilter(isStudentType = true, isFullView = true)
            }

            Spacer(modifier = Modifier.height(15.dp))

            LazyColumn(
                modifier = Modifier.padding(bottom = 10.dp)
                    .fillMaxWidth().weight(1f),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {
                    TableElement(type = 0)
                }
                item {
                    TableElement(type = 1)
                }
                item {
                    TableElement(type = 2)
                }
                item {
                    TableElement(type = 0)
                }
            }
        }
    }

}

@Preview
@Composable
fun TableViewerScreenPreview(){
    TableViewerScreen(rememberNavController())
}