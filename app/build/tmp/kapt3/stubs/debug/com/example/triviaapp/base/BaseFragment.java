package com.example.triviaapp.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\'J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/example/triviaapp/base/BaseFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "errorHandler", "Lcom/example/testlocationapp/error/ErrorHandler;", "getErrorHandler", "()Lcom/example/testlocationapp/error/ErrorHandler;", "setErrorHandler", "(Lcom/example/testlocationapp/error/ErrorHandler;)V", "viewModelFactory", "Lcom/example/testlocationapp/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/example/testlocationapp/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/example/testlocationapp/di/ViewModelFactory;)V", "getLayoutResId", "", "handleError", "", "appError", "Lcom/example/triviaapp/error/AppError;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "app_debug"})
public abstract class BaseFragment extends dagger.android.support.DaggerFragment {
    @javax.inject.Inject()
    public com.example.testlocationapp.di.ViewModelFactory viewModelFactory;
    @javax.inject.Inject()
    public com.example.testlocationapp.error.ErrorHandler errorHandler;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testlocationapp.di.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.testlocationapp.di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testlocationapp.error.ErrorHandler getErrorHandler() {
        return null;
    }
    
    public final void setErrorHandler(@org.jetbrains.annotations.NotNull()
    com.example.testlocationapp.error.ErrorHandler p0) {
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutResId();
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void handleError(@org.jetbrains.annotations.Nullable()
    com.example.triviaapp.error.AppError appError) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public BaseFragment() {
        super();
    }
}