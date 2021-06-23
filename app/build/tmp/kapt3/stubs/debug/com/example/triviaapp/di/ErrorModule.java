package com.example.triviaapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/triviaapp/di/ErrorModule;", "", "()V", "providesErrorHandler", "Lcom/example/testlocationapp/error/ErrorHandler;", "errorHandler", "Lcom/example/triviaapp/di/ErrorHandlerImpl;", "providesErrorHandler$trivia_1_0_debug", "trivia-1.0_debug"})
@dagger.Module()
public final class ErrorModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.triviaapp.di.ErrorModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.testlocationapp.error.ErrorHandler providesErrorHandler$trivia_1_0_debug(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.di.ErrorHandlerImpl errorHandler) {
        return null;
    }
    
    private ErrorModule() {
        super();
    }
}