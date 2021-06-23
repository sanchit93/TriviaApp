package com.example.triviaapp.ui.items;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/example/triviaapp/ui/items/SummaryItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "user", "Lcom/example/triviaapp/room/User;", "detailType", "", "(Lcom/example/triviaapp/room/User;Ljava/lang/String;)V", "getDetailType", "()Ljava/lang/String;", "setDetailType", "(Ljava/lang/String;)V", "getUser", "()Lcom/example/triviaapp/room/User;", "setUser", "(Lcom/example/triviaapp/room/User;)V", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/GroupieViewHolder;", "position", "", "getLayout", "app_debug"})
public final class SummaryItem extends com.xwray.groupie.kotlinandroidextensions.Item {
    @org.jetbrains.annotations.NotNull()
    private com.example.triviaapp.room.User user;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String detailType;
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder viewHolder, int position) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.triviaapp.room.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.room.User p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDetailType() {
        return null;
    }
    
    public final void setDetailType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public SummaryItem(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.room.User user, @org.jetbrains.annotations.NotNull()
    java.lang.String detailType) {
        super();
    }
}