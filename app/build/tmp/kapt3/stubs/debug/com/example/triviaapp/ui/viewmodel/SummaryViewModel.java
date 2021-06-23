package com.example.triviaapp.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e0\u00070\u0014J\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0014J\u0006\u0010\u0016\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\bR\'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R-\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e0\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/example/triviaapp/ui/viewmodel/SummaryViewModel;", "Lcom/example/testlocationapp/base/BaseViewModel;", "databaseRepository", "Lcom/example/triviaapp/repo/DatabaseRepositoryImpl;", "(Lcom/example/triviaapp/repo/DatabaseRepositoryImpl;)V", "currentObserver", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/triviaapp/utils/Resource;", "Lcom/example/triviaapp/room/User;", "getCurrentObserver", "()Landroidx/lifecycle/MutableLiveData;", "currentObserver$delegate", "Lkotlin/Lazy;", "userObserver", "", "getUserObserver", "userObserver$delegate", "getAllUser", "", "getAllUsersObserver", "Landroidx/lifecycle/LiveData;", "getCurrentUserObserver", "getLatestUser", "saveUser", "user", "trivia-1.0_debug"})
public final class SummaryViewModel extends com.example.testlocationapp.base.BaseViewModel {
    private final kotlin.Lazy userObserver$delegate = null;
    private final kotlin.Lazy currentObserver$delegate = null;
    private final com.example.triviaapp.repo.DatabaseRepositoryImpl databaseRepository = null;
    
    private final androidx.lifecycle.MutableLiveData<com.example.triviaapp.utils.Resource<java.util.List<com.example.triviaapp.room.User>>> getUserObserver() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<com.example.triviaapp.utils.Resource<com.example.triviaapp.room.User>> getCurrentObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.triviaapp.utils.Resource<java.util.List<com.example.triviaapp.room.User>>> getAllUsersObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.triviaapp.utils.Resource<com.example.triviaapp.room.User>> getCurrentUserObserver() {
        return null;
    }
    
    public final void getAllUser() {
    }
    
    public final void getLatestUser() {
    }
    
    public final void saveUser(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.room.User user) {
    }
    
    @javax.inject.Inject()
    public SummaryViewModel(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.repo.DatabaseRepositoryImpl databaseRepository) {
        super();
    }
}