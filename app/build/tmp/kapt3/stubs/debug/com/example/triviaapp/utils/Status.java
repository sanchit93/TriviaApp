package com.example.triviaapp.utils;

import java.lang.System;

/**
 * Status of a resource that is provided to the UI.
 *
 *
 * These are usually created by the Repository classes where they return
 * `LiveData<Resource<T>>` to pass back the latest data to the UI with its fetch status.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/triviaapp/utils/Status;", "", "()V", "ERROR", "LOADING", "SUCCESS", "Lcom/example/triviaapp/utils/Status$LOADING;", "Lcom/example/triviaapp/utils/Status$SUCCESS;", "Lcom/example/triviaapp/utils/Status$ERROR;", "app_debug"})
public abstract class Status {
    
    private Status() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/triviaapp/utils/Status$LOADING;", "Lcom/example/triviaapp/utils/Status;", "()V", "app_debug"})
    public static final class LOADING extends com.example.triviaapp.utils.Status {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.triviaapp.utils.Status.LOADING INSTANCE = null;
        
        private LOADING() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/triviaapp/utils/Status$SUCCESS;", "Lcom/example/triviaapp/utils/Status;", "()V", "app_debug"})
    public static final class SUCCESS extends com.example.triviaapp.utils.Status {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.triviaapp.utils.Status.SUCCESS INSTANCE = null;
        
        private SUCCESS() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/triviaapp/utils/Status$ERROR;", "Lcom/example/triviaapp/utils/Status;", "()V", "app_debug"})
    public static final class ERROR extends com.example.triviaapp.utils.Status {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.triviaapp.utils.Status.ERROR INSTANCE = null;
        
        private ERROR() {
            super();
        }
    }
}