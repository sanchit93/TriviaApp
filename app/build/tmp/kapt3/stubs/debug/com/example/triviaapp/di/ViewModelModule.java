package com.example.triviaapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/example/triviaapp/di/ViewModelModule;", "", "()V", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/example/triviaapp/di/ViewModelFactory;", "bindViewModelFactory$app_debug", "mainViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/example/triviaapp/ui/viewmodel/MainViewModel;", "summaryViewModel", "Lcom/example/triviaapp/ui/viewmodel/SummaryViewModel;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.example.triviaapp.ui.viewmodel.MainViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel mainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.ui.viewmodel.MainViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.example.triviaapp.ui.viewmodel.SummaryViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel summaryViewModel(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.ui.viewmodel.SummaryViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.di.ViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}