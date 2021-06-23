package com.example.triviaapp.base

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.testlocationapp.di.ViewModelFactory
import com.example.triviaapp.error.AppError
import com.example.testlocationapp.error.ErrorHandler
import javax.inject.Inject

abstract class BaseActivity : AppCompatActivity() {
    @Inject
    lateinit var errorHandler: ErrorHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }

//    fun showLoading() {
//        if (loadingDialog == null) {
//            loadingDialog = LoadingDialog(this)
//        }
//        loadingDialog?.show()
//    }
//
//    fun dismissLoading() {
//        loadingDialog?.dismiss()
//    }

    fun handleError(appError: AppError?) {
        errorHandler.handleError(appError, this)
    }

}