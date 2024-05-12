package com.example.interactivemap

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.ActivityResultLauncher
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.example.interactivemap.logic.navigation.AppNavigationGraph
import com.example.interactivemap.logic.util.IntentPlainTextUtil
import com.example.interactivemap.logic.util.SharedPreferencesRepository
import com.example.interactivemap.ui.theme.InteractiveMapTheme

class MainActivity : ComponentActivity() {
    private lateinit var requestPermissionLauncher: ActivityResultLauncher<Array<String>>
    private val ifFirstStart = true
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_FULLSCREEN
            or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
        actionBar?.hide()

        val intent = intent
        if (intent.action == Intent.ACTION_SEND && intent.type == "text/plain") {
            ThisApplication.getInstance().setFromMassage(false)
            val sharedText = intent.getStringExtra(Intent.EXTRA_TEXT)
            if (sharedText != null) {
                val receivedData = IntentPlainTextUtil.processingReceiveMessage(sharedText)
                if (receivedData.first) {
                    ThisApplication.getInstance().setFromMassage(true)
                    SharedPreferencesRepository.linkList = receivedData.second
                }
            }
        }

        setContent {
            InteractiveMapTheme {}
                Box (Modifier.fillMaxSize()
                        .background(MaterialTheme.colorScheme.background))
                AppNavigationGraph(rememberNavController())
        }
    }

    override fun onPause() {
        super.onPause()
        ThisApplication.getInstance().stopForegroundService()
    }

    override fun onResume() {
        super.onResume()
        if(!ifFirstStart) ThisApplication.getInstance().startForegroundService()
    }
}