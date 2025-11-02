package com.example.boockshop3.data

import android.accessibilityservice.GestureDescription
import android.media.Image
import kotlinx.serialization.descriptors.SerialDescriptor
import java.net.URL

data class Book(
    val name: String = "",
    val description: String = "",
    val price: String = "",
    val category: String = "",
    val imageUrl: String = ""
)
