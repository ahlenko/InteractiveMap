package com.example.interactivemap.ui.screens.welcome.onboarding.account

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.interactivemap.R
import com.example.interactivemap.logic.navigation.AccountCreator
import com.example.interactivemap.logic.navigation.AppOnboard
import com.example.interactivemap.logic.navigation.NavigationScreen
import com.example.interactivemap.ui.resource.status.ScreenProgressBoll
import com.example.interactivemap.ui.screens.welcome.onboarding.account.fragments.OnboardingFragmentFirst
import com.example.interactivemap.ui.screens.welcome.onboarding.account.fragments.OnboardingFragmentSecond
import com.example.interactivemap.ui.screens.welcome.onboarding.account.fragments.OnboardingFragmentThird
import com.example.interactivemap.ui.screens.welcome.onboarding.all_app.ApplicationOnboarding
import com.example.interactivemap.ui.theme.InteractiveMapTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AccountOnboarding(navHostController: NavHostController){
    val state = remember { mutableIntStateOf(1) }

    val onboardingScreens: List<@Composable () -> Unit> = remember { listOf(
            { OnboardingFragmentFirst() },
            { OnboardingFragmentSecond() },
            { OnboardingFragmentThird() { navHostController
                .navigate(NavigationScreen.route) { popUpTo(0) } } }) }

    val pagerState = rememberPagerState(pageCount = {onboardingScreens.size})

    InteractiveMapTheme {
        Box(Modifier.fillMaxSize()){
            Box(modifier = Modifier.padding(end = 12.dp).height(54.dp).width(8.dp)
                .align(Alignment.CenterEnd)){ ScreenProgressBoll(state) } }

        VerticalPager(state = pagerState, modifier = Modifier.fillMaxSize()
        ) { page -> onboardingScreens[page]()
            state.intValue = pagerState.currentPage }

        Box(modifier = Modifier.padding(12.dp).padding(top = 16.dp).fillMaxWidth(),
            contentAlignment = Alignment.TopEnd){
            Text(stringResource(id = R.string.skip), modifier = Modifier.clickable {
                navHostController.navigate(AccountCreator.route) { popUpTo(0) } },
                style = MaterialTheme.typography.headlineSmall.copy(
                    color = MaterialTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.Light, textAlign = TextAlign.Right)) }
    }
}

@Preview
@Composable
fun AccountOnboardingPreview(){
    AccountOnboarding(rememberNavController())
}