package com.example.triviaapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0016\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lcom/example/triviaapp/ui/HistoryActivity;", "Lcom/example/triviaapp/base/DaggerBaseActivity;", "()V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/GroupieViewHolder;", "detailType", "", "viewModel", "Lcom/example/triviaapp/ui/viewmodel/SummaryViewModel;", "getViewModel", "()Lcom/example/triviaapp/ui/viewmodel/SummaryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initialise", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setData", "list", "", "Lcom/example/triviaapp/room/User;", "setObservers", "Companion", "app_debug"})
public final class HistoryActivity extends com.example.triviaapp.base.DaggerBaseActivity {
    private com.xwray.groupie.GroupAdapter<com.xwray.groupie.GroupieViewHolder> adapter;
    private java.lang.String detailType;
    private final kotlin.Lazy viewModel$delegate = null;
    private static final java.lang.String DETAIL_TYPE = "DETAIL_TYPE";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.triviaapp.ui.HistoryActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.triviaapp.ui.viewmodel.SummaryViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initialise() {
    }
    
    private final void setObservers() {
    }
    
    private final void setData(java.util.List<com.example.triviaapp.room.User> list) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public HistoryActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/triviaapp/ui/HistoryActivity$Companion;", "", "()V", "DETAIL_TYPE", "", "getStartIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "detailType", "app_debug"})
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