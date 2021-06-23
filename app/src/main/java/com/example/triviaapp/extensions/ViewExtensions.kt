package com.example.testlocationapp.extensions

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import android.view.inputmethod.InputMethodManager
import androidx.annotation.StringRes
import androidx.core.view.ViewCompat
import com.google.android.material.snackbar.Snackbar

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun View.isVisible(): Boolean {
    return visibility == View.VISIBLE
}

fun View.shortSnackbar(text: CharSequence) {
    Snackbar.make(this, text, Snackbar.LENGTH_SHORT).show()
}

fun View.shortSnackbar(@StringRes resId: Int) {
    shortSnackbar(context.getString(resId))
}

fun View.longSnackbar(text: CharSequence) {
    Snackbar.make(this, text, Snackbar.LENGTH_LONG).show()
}

fun View.longSnackbar(@StringRes resId: Int) {
    longSnackbar(context.getString(resId))
}

fun View.showKeyboard() {
    requestFocus()
    val inputMethodManager =
        context.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
    inputMethodManager?.showSoftInput(this, 0)
}

fun View.showKeyboard(forced: Boolean = false) {
    requestFocus()
    val inputMethodManager =
        context.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
    if (forced) {
        inputMethodManager?.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0)
    } else {
        inputMethodManager?.showSoftInput(this, 0)
    }
}

fun View.showKeyboardImplicit() {
    val inputMethodManager =
        context.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
    inputMethodManager?.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
    requestFocus()
}


fun View.hideKeyboard() {
    val inputMethodManager =
        context.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
    inputMethodManager?.hideSoftInputFromWindow(windowToken, 0)
}

fun ViewGroup.inflate(res: Int): View {
    return LayoutInflater.from(context).inflate(res, this, false)
}

fun View.isRtl() = ViewCompat.getLayoutDirection(this) == ViewCompat.LAYOUT_DIRECTION_RTL

inline fun View.afterMeasured(crossinline f: View.() -> Unit) {
    viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
        override fun onGlobalLayout() {
            if (measuredWidth > 0 && measuredHeight > 0) {
                viewTreeObserver.removeOnGlobalLayoutListener(this)
                f()
            }
        }
    })
}