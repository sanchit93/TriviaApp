package com.example.triviaapp.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    @ColumnInfo(name = "name") val name: String? = null,
    @ColumnInfo(name = "ans1") var ans1: String? = null,
    @ColumnInfo(name = "ans2") var ans2: String? = null,
    @ColumnInfo(name = "time") var time: String? = null
)
