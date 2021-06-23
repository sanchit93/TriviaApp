package com.example.triviaapp.di

import android.content.Context
import android.content.Intent
import androidx.viewbinding.BuildConfig
import com.example.triviaapp.extensions.longToast
import com.example.triviaapp.error.AppError
import com.example.testlocationapp.error.ErrorHandler
import com.example.triviaapp.ui.MainActivity
import javax.inject.Inject
import javax.net.ssl.HttpsURLConnection
import kotlin.coroutines.cancellation.CancellationException

class ErrorHandlerImpl @Inject constructor(
    val context: Context
) : ErrorHandler {
    override fun handleError(error: AppError?, context: Context) {
        when (error) {
            is AppError.UserDataNotFound -> {
                context.longToast("No data found")
            }

            null -> {
//                Timber.w("Received error is null")
            }
        }
    }
}