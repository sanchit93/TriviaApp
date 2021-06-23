package com.example.triviaapp.error

sealed class AppError {
    object UserDataNotFound : AppError()
}