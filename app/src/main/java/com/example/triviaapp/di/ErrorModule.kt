package com.example.triviaapp.di

import com.example.testlocationapp.error.ErrorHandler
import com.example.triviaapp.di.ErrorHandlerImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object ErrorModule {
    @Provides
    @Singleton
    internal fun providesErrorHandler(errorHandler: ErrorHandlerImpl): ErrorHandler {
        return errorHandler
    }
}