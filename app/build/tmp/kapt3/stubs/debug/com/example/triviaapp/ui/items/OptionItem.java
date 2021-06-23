package com.example.triviaapp.ui.items;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lcom/example/triviaapp/ui/items/OptionItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "title", "", "checked", "", "callback", "Lcom/example/triviaapp/ui/items/OptionItem$Callback;", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/example/triviaapp/ui/items/OptionItem$Callback;)V", "getCallback", "()Lcom/example/triviaapp/ui/items/OptionItem$Callback;", "getChecked", "()Ljava/lang/Boolean;", "setChecked", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/GroupieViewHolder;", "position", "", "payloads", "", "", "getLayout", "Callback", "app_debug"})
public final class OptionItem extends com.xwray.groupie.kotlinandroidextensions.Item {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean checked;
    @org.jetbrains.annotations.NotNull()
    private final com.example.triviaapp.ui.items.OptionItem.Callback callback = null;
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder viewHolder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder viewHolder, int position) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getChecked() {
        return null;
    }
    
    public final void setChecked(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.triviaapp.ui.items.OptionItem.Callback getCallback() {
        return null;
    }
    
    public OptionItem(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean checked, @org.jetbrains.annotations.NotNull()
    com.example.triviaapp.ui.items.OptionItem.Callback callback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/triviaapp/ui/items/OptionItem$Callback;", "", "onPlayerSelected", "", "optionItem", "Lcom/example/triviaapp/ui/items/OptionItem;", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void onPlayerSelected(@org.jetbrains.annotations.NotNull()
        com.example.triviaapp.ui.items.OptionItem optionItem);
    }
}