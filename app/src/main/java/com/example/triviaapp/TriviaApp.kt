package com.example.triviaapp

import android.os.StrictMode
import androidx.viewbinding.BuildConfig
import com.example.triviaapp.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class TriviaApp : DaggerApplication() {
    private val applicationInjector = DaggerAppComponent.builder()
        .application(this)
        .build()

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = applicationInjector

    override fun onCreate() {
        // ThreeTenBP for times and dates, called before super to be available for objects
//        setupThreeTen()

        // Enable strict mode before Dagger creates graph
        setupStrictMode()

        super.onCreate()
    }

    private fun setupStrictMode() {
        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(
                StrictMode.ThreadPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build()
            )
        }
    }
}