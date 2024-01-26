package com.example.interactivemap.logic.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.interactivemap.logic.database.dao.LocalAccountDAO
import com.example.interactivemap.logic.database.dao.MainScheduleDAO
import com.example.interactivemap.logic.database.dao.ReserveScheduleDAO
import com.example.interactivemap.logic.database.entity.LocalAccount
import com.example.interactivemap.logic.database.entity.MainSchedule
import com.example.interactivemap.logic.database.entity.ReserveSchedule

@Database(entities = [LocalAccount::class, MainSchedule::class, ReserveSchedule::class],
    version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun daoLocalAccount(): LocalAccountDAO

    abstract fun daoMainSchedule(): MainScheduleDAO

    abstract fun daoReserveSchedule(): ReserveScheduleDAO

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "money_manager_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}