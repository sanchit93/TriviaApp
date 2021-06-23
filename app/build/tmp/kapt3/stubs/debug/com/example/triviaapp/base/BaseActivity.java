package com.example.triviaapp.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/example/triviaapp/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "errorHandler", "Lcom/example/testlocationapp/error/ErrorHandler;", "getErrorHandler", "()Lcom/example/testlocationapp/error/ErrorHandler;", "setErrorHandler", "(Lcom/example/testlocationapp/error/ErrorHandler;)V", "handleError", "", "appError", "Lcom/example/triviaapp/error/AppError;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.example.testlocationapp.error.ErrorHandler errorHandler;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testlocationapp.error.ErrorHandler getErrorHandler() {
        return null;
    }
    
    public final void setErrorHandler(@org.jetbrains.annotations.NotNull()
    com.example.testlocationapp.error.ErrorHandler p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void handleError(@org.jetbrains.annotations.Nullable()
    com.example.triviaapp.error.AppError appError) {
    }
    
    public BaseActivity() {
        super();
    }
}