package com.example.testlocationapp.error

import android.content.Context
import com.example.triviaapp.error.AppError

interface ErrorHandler {
    fun handleError(error: AppError?, context: Context)
}