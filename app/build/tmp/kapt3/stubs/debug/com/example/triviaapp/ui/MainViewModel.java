package com.example.triviaapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u0018\u001a\u00020\u000eJ\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\bR\'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/triviaapp/ui/MainViewModel;", "Lcom/example/testlocationapp/base/BaseViewModel;", "databaseRepository", "Lcom/example/triviaapp/DatabaseRepositoryImpl;", "(Lcom/example/triviaapp/DatabaseRepositoryImpl;)V", "currentObserver", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/triviaapp/utils/Resource;", "Lcom/example/triviaapp/room/User;", "getCurrentObserver", "()Landroidx/lifecycle/MutableLiveData;", "currentObserver$delegate", "Lkotlin/Lazy;", "newUser", "", "user", "doesPlayerExist", "name", "", "getCurrentUserObserver", "Landroidx/lifecycle/LiveData;", "getLatestUser", "", "getUser", "isNewUser", "saveUser", "updateCommonUser", "updateUser", "app_debug"})
public final class MainViewModel extends com.example.testlocationapp.base.BaseViewModel {
    private final kotlin.Lazy currentObserver$delegate = null;
    private boolean newUser = true;
    private com.example.triviaapp.room.User user;
    private final com.example.triviaapp.DatabaseRepositoryImpl databaseRepository = null;
    
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
    
    public final boolean doesPlayerExist(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.DatabaseRepositoryImpl databaseRepository) {
        super();
    }
}