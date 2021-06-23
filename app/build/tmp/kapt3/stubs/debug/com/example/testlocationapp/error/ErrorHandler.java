package com.example.testlocationapp.error;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/testlocationapp/error/ErrorHandler;", "", "handleError", "", "error", "Lcom/example/triviaapp/error/AppError;", "context", "Landroid/content/Context;", "trivia-1.0_debug"})
public abstract interface ErrorHandler {
    
    public abstract void handleError(@org.jetbrains.annotations.Nullable()
    com.example.triviaapp.error.AppError error, @org.jetbrains.annotations.NotNull()
    android.content.Context context);
}