package com.example.interactivemap.logic.util

import android.app.ActivityManager
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.os.Debug
import com.google.firebase.analytics.FirebaseAnalytics
import java.io.RandomAccessFile

object FirebaseEventUtil {
    fun logCustomEvent(context: Context, eventName: String, eventParams: Bundle) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)

        eventParams.apply {
            putString("device_name", Build.DEVICE)
            putString("manufacturer", Build.MANUFACTURER)

            val memoryInfo = getMemoryInfo(context)
            putLong("total_memory", memoryInfo.totalMem / (1024 * 1024))
            putLong("used_memory", (memoryInfo.totalMem - memoryInfo.availMem) / (1024 * 1024))
        }

        firebaseAnalytics.logEvent(eventName, eventParams)
    }
}

fun getMemoryInfo(context: Context): ActivityManager.MemoryInfo {
    val activityManager = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
    val memoryInfo = ActivityManager.MemoryInfo()
    activityManager.getMemoryInfo(memoryInfo)
    return memoryInfo
}