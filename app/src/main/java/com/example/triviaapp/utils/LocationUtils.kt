package com.example.testlocationapp.utils

object LocationUtils {
//    fun mapToDeviceAddress(address: Address): DeviceAddress {
//        val fullAddress = if (address.maxAddressLineIndex != -1) {
//            address.getAddressLine(0)
//        } else {
//            ""
//        }
//        return DeviceAddress(fullAddress = fullAddress,
//            latitude = address.latitude,
//            longitude = address.longitude,
//            postalCode = address.postalCode,
//            countryCode = address.countryCode,
//            countryName = address.countryName,
//            adminArea = address.adminArea,
//            subAdminArea = address.subAdminArea,
//            subLocality = address.subLocality,
//            locality = address.locality,
//            premise = address.premises)
//    }

//    fun mapToDeviceAddress(address: DeliveryAddressDto): DeviceAddress {
//        return DeviceAddress(fullAddress = address.address,
//            latitude = address.latitude,
//            longitude = address.longitude,
//            subLocality = address.smallestAddressField)
//    }
//
//    fun mapToDeliveryAddress(deviceAddress: DeviceAddress?): DeliveryAddressDto {
//        return DeliveryAddressDto(address = getDisplayedAddress(
//            deviceAddress?.fullAddress),
//            latitude = deviceAddress?.latitude,
//            longitude = deviceAddress?.longitude,
//            smallestAddressField = getSmallestAddressField(deviceAddress))
//    }


    fun getDisplayedAddress(fullAddress: String?): String? {
        return fullAddress?.split(",")
            .orEmpty()
            .take(3)
            .joinToString { it.trim() }
    }
}