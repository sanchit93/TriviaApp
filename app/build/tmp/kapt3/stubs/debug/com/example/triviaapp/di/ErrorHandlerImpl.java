package com.example.triviaapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0006\u0010\u000b\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/example/triviaapp/di/ErrorHandlerImpl;", "Lcom/example/testlocationapp/error/ErrorHandler;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "handleError", "", "error", "Lcom/example/triviaapp/error/AppError;", "longToast", "app_debug"})
public final class ErrorHandlerImpl implements com.example.testlocationapp.error.ErrorHandler {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @java.lang.Override()
    public void handleError(@org.jetbrains.annotations.Nullable()
    com.example.triviaapp.error.AppError error, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void longToast() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @javax.inject.Inject()
    public ErrorHandlerImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}