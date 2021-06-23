package com.example.triviaapp.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\bR\'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/triviaapp/ui/viewmodel/MainViewModel;", "Lcom/example/testlocationapp/base/BaseViewModel;", "databaseRepository", "Lcom/example/triviaapp/repo/DatabaseRepositoryImpl;", "(Lcom/example/triviaapp/repo/DatabaseRepositoryImpl;)V", "currentObserver", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/triviaapp/utils/Resource;", "Lcom/example/triviaapp/room/User;", "getCurrentObserver", "()Landroidx/lifecycle/MutableLiveData;", "currentObserver$delegate", "Lkotlin/Lazy;", "newUser", "", "user", "getCurrentUserObserver", "Landroidx/lifecycle/LiveData;", "getLatestUser", "", "getUser", "isNewUser", "saveUser", "updateCommonUser", "updateUser", "app_debug"})
public final class MainViewModel extends com.example.testlocationapp.base.BaseViewModel {
    private final kotlin.Lazy currentObserver$delegate = null;
    private boolean newUser = true;
    private com.example.triviaapp.room.User user;
    private final com.example.triviaapp.repo.DatabaseRepositoryImpl databaseRepository = null;
    
    private final androidx.lifecycle.MutableLiveData<com.example.triviaapp.utils.Resource<com.example.triviaapp.room.User>> getCurrentObserver() {
        return null;
    }
    
    public final boolean isNewUser() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.triviaapp.room.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.triviaapp.utils.Resource<com.example.triviaapp.room.User>> getCurrentUserObserver() {
        return null;
    }
    
    public final void saveUser(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.room.User user) {
    }
    
    public final void updateUser(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.room.User user) {
    }
    
    public final void getLatestUser() {
    }
    
    private final void updateCommonUser() {
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.repo.DatabaseRepositoryImpl databaseRepository) {
        super();
    }
}