package com.example.interactivemap.ui.screens.welcome.onboarding

import android.annotation.SuppressLint
import android.util.Log
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.logic.navigation.NavigationScreen
import com.example.interactivemap.logic.util.SharedPreferencesRepository
import com.example.interactivemap.ui.resource.status.ScreenProgressBoll
import com.example.interactivemap.ui.screens.welcome.onboarding.fragments.OnboardingFragmentFirst
import com.example.interactivemap.ui.screens.welcome.onboarding.fragments.OnboardingFragmentSecond
import com.example.interactivemap.ui.screens.welcome.onboarding.fragments.OnboardingFragmentThird
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import com.example.interactivemap.ui.translations.Tr


@OptIn(ExperimentalFoundationApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ApplicationOnboarding(navHostController: NavHostController){
    var state by remember { mutableIntStateOf(0) }
    var newState by remember { mutableIntStateOf(0) }

    val onboardingScreens: List<@Composable () -> Unit> = remember { listOf(
        { OnboardingFragmentFirst{ newState = 1 } },
        { OnboardingFragmentSecond{newState = 2} },
        { OnboardingFragmentThird {
            SharedPreferencesRepository.isSecondEnter = true
            navHostController.navigate(NavigationScreen.route) { popUpTo(0) } } }) }

    val pagerState = rememberPagerState(pageCount = {onboardingScreens.size})

    LaunchedEffect(newState) {
        Log.d("state", state.toString())
        pagerState.animateScrollToPage(newState)
    }

    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        Scaffold (containerColor = MaterialTheme.colorScheme.background) { _ ->

            VerticalPager(
                state = pagerState, modifier = Modifier.fillMaxSize()
            ) { page ->
                onboardingScreens[page]()
                state = pagerState.currentPage
            }

            Box(Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier.padding(end = 12.dp).height(54.dp).width(8.dp)
                        .align(Alignment.CenterEnd)
                ) { ScreenProgressBoll(state) }
            }

            Box(
                modifier = Modifier.padding(12.dp).padding(top = 16.dp).fillMaxWidth(),
                contentAlignment = Alignment.TopEnd
            ) {
                Text(
                    Tr.skip, modifier = Modifier.clickable {
                        SharedPreferencesRepository.isSecondEnter = true
                        navHostController.navigate(NavigationScreen.route) { popUpTo(0) }
                    }, style = MaterialTheme.typography.headlineSmall.copy(
                        color = MaterialTheme.colorScheme.onBackground,
                        fontWeight = FontWeight.Light, textAlign = TextAlign.Right
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun ApplicationOnboardingPreview(){
    ApplicationOnboarding(rememberNavController())
}