package com.example.triviaapp.di

import com.example.triviaapp.DatabaseRepository
import com.example.triviaapp.DatabaseRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [LocalModule::class])
class RepositoryModule {
    @Provides
    @Singleton
    fun providesDatabaseRepository(databaseRepository: DatabaseRepositoryImpl): DatabaseRepository {
        return databaseRepository
    }
}