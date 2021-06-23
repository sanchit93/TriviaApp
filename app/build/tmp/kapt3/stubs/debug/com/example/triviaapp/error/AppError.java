package com.example.triviaapp.error;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/triviaapp/error/AppError;", "", "()V", "UserDataNotFound", "Lcom/example/triviaapp/error/AppError$UserDataNotFound;", "trivia-1.0_debug"})
public abstract class AppError {
    
    private AppError() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/triviaapp/error/AppError$UserDataNotFound;", "Lcom/example/triviaapp/error/AppError;", "()V", "trivia-1.0_debug"})
    public static final class UserDataNotFound extends com.example.triviaapp.error.AppError {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.triviaapp.error.AppError.UserDataNotFound INSTANCE = null;
        
        private UserDataNotFound() {
            super();
        }
    }
}