package com.example.triviaapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \'2\u00020\u00012\u00020\u0002:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0002J\u0006\u0010#\u001a\u00020\u0019J\u0014\u0010$\u001a\u00020\u00192\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006("}, d2 = {"Lcom/example/triviaapp/ui/GameFragment2;", "Lcom/example/triviaapp/base/BaseFragment;", "Lcom/example/triviaapp/ui/items/OptionItem$Callback;", "()V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/GroupieViewHolder;", "nameList", "", "", "viewModel", "Lcom/example/triviaapp/ui/MainViewModel;", "getViewModel", "()Lcom/example/triviaapp/ui/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "checkIfSelectedColorPresentInUser", "", "user", "Lcom/example/triviaapp/room/User;", "name", "getLayoutResId", "", "getSelectedColors", "initialise", "", "onPlayerSelected", "optionItem", "Lcom/example/triviaapp/ui/items/OptionItem;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "openSummary", "selectAllColors", "setData", "setListeners", "setObservers", "Companion", "app_debug"})
public final class GameFragment2 extends com.example.triviaapp.base.BaseFragment implements com.example.triviaapp.ui.items.OptionItem.Callback {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.xwray.groupie.GroupAdapter<com.xwray.groupie.GroupieViewHolder> adapter;
    private final java.util.List<java.lang.String> nameList = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "GameFragment2";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.triviaapp.ui.GameFragment2.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.triviaapp.ui.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutResId() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setListeners() {
    }
    
    private final void openSummary() {
    }
    
    private final void initialise() {
    }
    
    private final void setObservers() {
    }
    
    private final void setData(com.example.triviaapp.room.User user) {
    }
    
    @java.lang.Override()
    public void onPlayerSelected(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.ui.items.OptionItem optionItem) {
    }
    
    private final boolean checkIfSelectedColorPresentInUser(com.example.triviaapp.room.User user, java.lang.String name) {
        return false;
    }
    
    private final java.lang.String getSelectedColors() {
        return null;
    }
    
    public final void selectAllColors() {
    }
    
    public GameFragment2() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/triviaapp/ui/GameFragment2$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/example/triviaapp/ui/GameFragment2;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.triviaapp.ui.GameFragment2 newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}