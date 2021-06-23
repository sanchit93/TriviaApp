package com.example.triviaapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.triviaapp.room.User
import com.example.triviaapp.room.UserDao

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}