package com.example.triviaapp.utils;

import java.lang.System;

/**
 * A generic class that holds a value with its loading status.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u001eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0006\u0010\u001a\u001a\u00020\u0016J\u0006\u0010\u001b\u001a\u00020\u0016J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001f"}, d2 = {"Lcom/example/triviaapp/utils/Resource;", "T", "", "status", "Lcom/example/triviaapp/utils/Status;", "data", "error", "Lcom/example/triviaapp/error/AppError;", "(Lcom/example/triviaapp/utils/Status;Ljava/lang/Object;Lcom/example/triviaapp/error/AppError;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Lcom/example/triviaapp/error/AppError;", "getStatus", "()Lcom/example/triviaapp/utils/Status;", "component1", "component2", "component3", "copy", "(Lcom/example/triviaapp/utils/Status;Ljava/lang/Object;Lcom/example/triviaapp/error/AppError;)Lcom/example/triviaapp/utils/Resource;", "equals", "", "other", "hashCode", "", "isLoading", "isSuccess", "toString", "", "Companion", "app_debug"})
public final class Resource<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.triviaapp.utils.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.triviaapp.error.AppError error = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.triviaapp.utils.Resource.Companion Companion = null;
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.triviaapp.utils.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.triviaapp.error.AppError getError() {
        return null;
    }
    
    public Resource(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.utils.Status status, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    com.example.triviaapp.error.AppError error) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.triviaapp.utils.Status component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.triviaapp.error.AppError component3() {
        return null;
    }
    
    /**
     * A generic class that holds a value with its loading status.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.triviaapp.utils.Resource<T> copy(@org.jetbrains.annotations.NotNull()
    com.example.triviaapp.utils.Status status, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    com.example.triviaapp.error.AppError error) {
        return null;
    }
    
    /**
     * A generic class that holds a value with its loading status.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * A generic class that holds a value with its loading status.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A generic class that holds a value with its loading status.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\bJ#\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\nJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/example/triviaapp/utils/Resource$Companion;", "", "()V", "error", "Lcom/example/triviaapp/utils/Resource;", "T", "Lcom/example/triviaapp/error/AppError;", "data", "(Lcom/example/triviaapp/error/AppError;Ljava/lang/Object;)Lcom/example/triviaapp/utils/Resource;", "loading", "(Ljava/lang/Object;)Lcom/example/triviaapp/utils/Resource;", "success", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.triviaapp.utils.Resource<T> success(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.triviaapp.utils.Resource<T> error(@org.jetbrains.annotations.Nullable()
        com.example.triviaapp.error.AppError error, @org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.triviaapp.utils.Resource<T> loading(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}