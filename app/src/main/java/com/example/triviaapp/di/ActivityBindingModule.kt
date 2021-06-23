package com.example.triviaapp.di

import com.example.triviaapp.ui.HistoryActivity
import com.example.triviaapp.ui.SummaryActivity
import com.example.triviaapp.ui.MainActivity
import com.example.triviaapp.ui.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun summaryActivity(): SummaryActivity

    @ContributesAndroidInjector
    abstract fun historyActivity(): HistoryActivity

    @ContributesAndroidInjector
    abstract fun splashActivity(): SplashActivity

}