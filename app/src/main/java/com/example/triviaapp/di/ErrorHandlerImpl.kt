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
            is AppError.ApiError -> {
                when (error.statusCode) {
                    HttpsURLConnection.HTTP_UNAUTHORIZED -> {
                        context.longToast(error.message)

                        // Navigate to login activity
                        val intent = Intent(context, MainActivity::class.java)
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                        context.startActivity(intent)
                    }

                    else -> {
                        context.longToast(error.message)
                    }
                }
            }

            is AppError.ApiFailure -> {
                // Ignore displaying toast for api cancel
                if (error.throwable !is CancellationException) {
                    if (BuildConfig.DEBUG) {
                        context.longToast(error.throwable.localizedMessage.orEmpty())
                    } else {
//                        FirebaseCrashlytics.getInstance().recordException(error.throwable)
                        context.longToast("Continue")
                    }
                }
            }

            is AppError.OrderCancelled -> {
                context.longToast(error.message)
            }

            null -> {
//                Timber.w("Received error is null")
            }
        }
    }

    fun longToast() {

    }
}