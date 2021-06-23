package com.example.triviaapp.extensions

import android.Manifest
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.LocationManager
import android.net.Uri
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.core.app.ActivityCompat

//fun Context.isNetworkActive(): Boolean {
//    val connectivityManager =
//        applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
//    val activeNetworkInfo = connectivityManager.activeNetworkInfo
//    return activeNetworkInfo != null && activeNetworkInfo.isConnected
//}
//
//fun Context.isNetworkActiveWithMessage(): Boolean {
//    val isNetworkActive = isNetworkActive()
//    if (!isNetworkActive) {
//        shortToast(R.string.connection_error_message)
//    }
//    return isNetworkActive
//}

//fun View.isNetworkActiveWithMessage(): Boolean {
//    val isNetworkActive = context.isNetworkActive()
//    if (!isNetworkActive) {
//        longSnackbar(R.string.connection_error_message)
//    }
//    return isNetworkActive
//}

fun Context.clearNotifications() {
    (getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager).cancelAll()
}

fun Context.shortToast(text: CharSequence) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}

fun Context.shortToast(@StringRes resId: Int) {
    shortToast(getString(resId))
}

fun Context.longToast(text: CharSequence) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}

fun Context.longToast(@StringRes resId: Int) {
    longToast(getString(resId))
}

fun Context.dpToPx(dp: Int): Int {
    return (dp.toFloat() * resources.displayMetrics.density).toInt()
}

fun Context.pxToDp(px: Int): Int {
    return (px / resources.displayMetrics.density).toInt()
}


fun Context.sendEmail(recipient: String, subject: String = "", message: String = "") {
    val intent = Intent(Intent.ACTION_SENDTO)
    intent.data = Uri.parse("mailto:")
    intent.putExtra(Intent.EXTRA_EMAIL, recipient)
    intent.putExtra(Intent.EXTRA_SUBJECT, subject)
    intent.putExtra(Intent.EXTRA_TEXT, message)
    try {
        startActivity(intent)
        //startActivity(Intent.createChooser(intent, "Choose Email Client..."))
    } catch (exception: Exception) {
//        Timber.i(exception)
    }
}


fun Context.openUrl(url: String) {
    try {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    } catch (exception: Exception) {
//        Timber.i(exception)
    }
}

fun Context.locationPermissionAndGpsEnabled(): Boolean {
    return locationPermissionGranted() && isGpsEnabled()
}

fun Context.locationPermissionGranted(): Boolean {
    return ActivityCompat.checkSelfPermission(
        this,
        Manifest.permission.ACCESS_FINE_LOCATION
    ) == PackageManager.PERMISSION_GRANTED
}

fun Context.isGpsEnabled(): Boolean {
    val locationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
    return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
}