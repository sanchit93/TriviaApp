package com.example.triviaapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/triviaapp/di/ContextModule;", "", "()V", "provideApplication", "Landroid/app/Application;", "application", "Lcom/example/triviaapp/TriviaApp;", "provideApplication$app_debug", "provideContext", "Landroid/content/Context;", "provideContext$app_debug", "app_debug"})
@dagger.Module()
public final class ContextModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.triviaapp.di.ContextModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideContext$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.TriviaApp application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.app.Application provideApplication$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.TriviaApp application) {
        return null;
    }
    
    private ContextModule() {
        super();
    }
}