package com.example.triviaapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/example/triviaapp/ui/SummaryActivity;", "Lcom/example/triviaapp/base/DaggerBaseActivity;", "()V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/GroupieViewHolder;", "detailType", "", "viewModel", "Lcom/example/triviaapp/ui/SummaryViewModel;", "getViewModel", "()Lcom/example/triviaapp/ui/SummaryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initialise", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setData", "user", "Lcom/example/triviaapp/room/User;", "setListeners", "setObservers", "Companion", "app_debug"})
public final class SummaryActivity extends com.example.triviaapp.base.DaggerBaseActivity {
    private com.xwray.groupie.GroupAdapter<com.xwray.groupie.GroupieViewHolder> adapter;
    private java.lang.String detailType;
    private final kotlin.Lazy viewModel$delegate = null;
    private static final java.lang.String DETAIL_TYPE = "DETAIL_TYPE";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.triviaapp.ui.SummaryActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.triviaapp.ui.SummaryViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initialise() {
    }
    
    private final void setListeners() {
    }
    
    private final void setObservers() {
    }
    
    private final void setData(com.example.triviaapp.room.User user) {
    }
    
    public SummaryActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/triviaapp/ui/SummaryActivity$Companion;", "", "()V", "DETAIL_TYPE", "", "getStartIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "detailType", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getStartIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String detailType) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}