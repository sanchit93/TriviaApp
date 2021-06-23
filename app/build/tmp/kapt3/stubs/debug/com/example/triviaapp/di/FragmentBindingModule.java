package com.example.triviaapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/example/triviaapp/di/FragmentBindingModule;", "", "()V", "gameFragment1", "Lcom/example/triviaapp/ui/game/GameFragment1;", "gameFragment2", "Lcom/example/triviaapp/ui/game/GameFragment2;", "userFragment", "Lcom/example/triviaapp/ui/UserNameFragment;", "app_debug"})
@dagger.Module()
public abstract class FragmentBindingModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.triviaapp.ui.UserNameFragment userFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.triviaapp.ui.game.GameFragment1 gameFragment1();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.triviaapp.ui.game.GameFragment2 gameFragment2();
    
    public FragmentBindingModule() {
        super();
    }
}