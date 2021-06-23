package com.example.triviaapp.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import com.example.testlocationapp.di.ViewModelFactory
import com.example.triviaapp.error.AppError
import com.example.testlocationapp.error.ErrorHandler
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment : DaggerFragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    @Inject
    lateinit var errorHandler: ErrorHandler

//    private var loadingDialog: LoadingDialog? = null

    @LayoutRes
    abstract fun getLayoutResId(): Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayoutResId(), container, false)
    }

//    fun showLoading() {
//        if (loadingDialog == null) {
//            loadingDialog = LoadingDialog(requireActivity())
//        }
//        loadingDialog?.show()
//    }
//
//    fun dismissLoading() {
//        loadingDialog?.dismiss()
//    }

    fun handleError(appError: AppError?) {
        errorHandler.handleError(appError, requireActivity())
    }


}