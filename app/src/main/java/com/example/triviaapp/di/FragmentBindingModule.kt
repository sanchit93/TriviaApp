package com.example.triviaapp.di

import com.example.triviaapp.ui.game.GameFragment1
import com.example.triviaapp.ui.game.GameFragment2
import com.example.triviaapp.ui.UserNameFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {
    @ContributesAndroidInjector
    abstract fun userFragment(): UserNameFragment

    @ContributesAndroidInjector
    abstract fun gameFragment1(): GameFragment1

    @ContributesAndroidInjector
    abstract fun gameFragment2(): GameFragment2
}