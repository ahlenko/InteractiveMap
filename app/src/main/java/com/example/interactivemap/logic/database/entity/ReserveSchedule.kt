package com.example.interactivemap.logic.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ReserveSchedule (
    @PrimaryKey(autoGenerate = true) val id: Int,
)