package com.example.triviaapp.di

import com.example.triviaapp.repo.DatabaseRepository
import com.example.triviaapp.repo.DatabaseRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun providesDatabaseRepository(databaseRepository: DatabaseRepositoryImpl): DatabaseRepository {
        return databaseRepository
    }
}