package com.example.interactivemap.logic.util

import android.content.ContentValues
import android.content.Context
import android.net.Uri
import android.os.Environment
import android.provider.MediaStore
import com.example.interactivemap.logic.model.datamodel.Lesson
import com.example.interactivemap.logic.model.datamodel.LessonData
import com.example.interactivemap.logic.model.datamodel.ScheduleDay
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONException
import org.json.JSONObject
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object JSONLoadSaveHelper {

    suspend fun readFileFromSharedStorage(uri: Uri, context: Context): String {
        val contentResolver = context.contentResolver
        return withContext(Dispatchers.IO) {
            val stringBuilder = StringBuilder()
            var bufferedReader: BufferedReader? = null
            try {
                val inputStream = contentResolver.openInputStream(uri)
                bufferedReader = BufferedReader(InputStreamReader(inputStream))
                var line: String? = bufferedReader.readLine()
                while (line != null) {
                    stringBuilder.append(line).append("\n")
                    line = bufferedReader.readLine()
                }
            } catch (e: IOException) {
                e.printStackTrace()
            } finally {
                bufferedReader?.close()
            }
            stringBuilder.toString()
        }
    }

    suspend fun writeJsonToFileInDocumentsDirectory(context: Context, data: String) {
        val timeStamp = SimpleDateFormat("yyyy-MM-dd'T'HH:mm", Locale.getDefault()).format(Date())
        val fileName = "schedule_$timeStamp.json"

        val contentResolver = context.contentResolver

        val contentValues = ContentValues().apply {
            put(MediaStore.MediaColumns.DISPLAY_NAME, fileName)
            put(MediaStore.MediaColumns.MIME_TYPE, "application/json")
            put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DOCUMENTS)
        }

        val uri = contentResolver.insert(MediaStore.Files.getContentUri("external"), contentValues)

        try {
            uri?.let { fileUri ->
                contentResolver.openOutputStream(fileUri)?.use { outputStream ->
                    val json = JSONObject()
                    json.put("days", data)
                    val resString = json.toString().replace("\\","")
                    outputStream.write(resString.toByteArray())
                }
            }
        } catch (e: IOException) { e.printStackTrace() }
    }

    fun parseJsonFromString(jsonString:String): ArrayList<ScheduleDay>{
        val returnArray = ArrayList<ScheduleDay>()
        try {
            val jsonObject = JSONObject(jsonString)
            val daysArray = jsonObject.getJSONArray("days")
            for (i in 0 until daysArray.length()) {
                if (daysArray.length() != 7) return ArrayList()
                val dayObject = daysArray.getJSONObject(i)
                val lessonsArray = dayObject.getJSONArray("lessons")
                val lessonsList = mutableListOf<Lesson>()
                for (j in 0 until lessonsArray.length()) {
                    if (lessonsArray.length() != 6) return ArrayList()
                    val lessonObject = lessonsArray.getJSONObject(j)
                    val lessonDataArray = lessonObject.getJSONArray("lessonData")
                    val lessonDataList = mutableListOf<LessonData>()
                    for (k in 0 until lessonDataArray.length()) {
                        if (lessonDataArray.length() < 1 ||
                            lessonDataArray.length() > 2) return ArrayList()
                        val lessonDataObject = lessonDataArray.getJSONObject(k)
                        val lessonData = LessonData(
                            name = lessonDataObject.getString("name"),
                            tutor = lessonDataObject.getString("tutor"),
                            locationIndex = lessonDataObject.optInt("locationIndex"),
                            link = lessonDataObject.optString("link"),
                            lidLink = lessonDataObject.optString("lidLink"))
                        lessonDataList.add(lessonData)
                    }
                    val lesson = Lesson(
                        index = lessonObject.getInt("index"),
                        lessonData = lessonDataList as ArrayList<LessonData>
                    )
                    lessonsList.add(lesson)
                }
                val scheduleDay = ScheduleDay(
                    index = dayObject.getInt("index"),
                    lessons = lessonsList as ArrayList<Lesson>
                )
                returnArray.add(scheduleDay)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return returnArray
    }
}