package com.example.triviaapp.utils

import android.location.Address
import android.location.Geocoder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LocationManager @Inject constructor(
    private val geoCoder: Geocoder
) {
    suspend fun getAddressFromLocation(latitude: Double, longitude: Double): Address? {
        return try {
            withContext(Dispatchers.IO) {
                @Suppress("BlockingMethodInNonBlockingContext")
                geoCoder.getFromLocation(latitude, longitude, 1).firstOrNull()
            }
        } catch (exception: Exception) {
            null
        }
    }
}