package com.example.triviaapp.di

import android.app.Application
import android.content.Context
import com.example.triviaapp.TriviaApp
import dagger.Module
import dagger.Provides

@Module
object ContextModule {
    @Provides
    internal fun provideContext(application: TriviaApp): Context =
        application.applicationContext

    @Provides
    internal fun provideApplication(application: TriviaApp): Application = application
}