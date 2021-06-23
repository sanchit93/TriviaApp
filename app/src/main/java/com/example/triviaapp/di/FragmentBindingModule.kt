package com.example.triviaapp.di

import com.example.triviaapp.ui.GameFragment1
import com.example.triviaapp.ui.GameFragment2
import com.example.triviaapp.ui.UserFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {
    @ContributesAndroidInjector
    abstract fun userFragment(): UserFragment

    @ContributesAndroidInjector
    abstract fun gameFragment1(): GameFragment1

    @ContributesAndroidInjector
    abstract fun gameFragment2(): GameFragment2
}