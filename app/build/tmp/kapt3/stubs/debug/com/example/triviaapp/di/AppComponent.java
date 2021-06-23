package com.example.triviaapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/triviaapp/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/example/triviaapp/TriviaApp;", "Builder", "trivia-1.0_debug"})
@javax.inject.Singleton()
@dagger.Component(modules = {com.example.triviaapp.di.ActivityBindingModule.class, com.example.triviaapp.di.FragmentBindingModule.class, com.example.triviaapp.di.ViewModelModule.class, com.example.triviaapp.di.ContextModule.class, com.example.triviaapp.di.RepositoryModule.class, com.example.triviaapp.di.ErrorModule.class, com.example.triviaapp.di.AppModule.class, dagger.android.support.AndroidSupportInjectionModule.class})
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.example.triviaapp.TriviaApp> {
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/triviaapp/di/AppComponent$Builder;", "", "application", "Lcom/example/triviaapp/TriviaApp;", "build", "Lcom/example/triviaapp/di/AppComponent;", "trivia-1.0_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.example.triviaapp.di.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        com.example.triviaapp.TriviaApp application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.triviaapp.di.AppComponent build();
    }
}