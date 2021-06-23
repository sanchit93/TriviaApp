package com.example.triviaapp.di

import android.content.Context
import com.example.triviaapp.*
import com.example.triviaapp.room.AppDatabase
import com.example.triviaapp.room.DatabaseBuilder
import com.example.triviaapp.room.UserDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule {
    @Singleton
    @Provides
    fun provideAppDatabase(context: Context): AppDatabase {
        return DatabaseBuilder(context).getInstance()
    }

    @Singleton
    @Provides
    fun provideAppDatabaseRepoImpl(databaseRepository: DatabaseRepositoryImpl): DatabaseRepository {
        return databaseRepository
    }

    @Singleton
    @Provides
    fun provideUserDao(appDatabase: AppDatabase): UserDao = appDatabase.userDao()
}