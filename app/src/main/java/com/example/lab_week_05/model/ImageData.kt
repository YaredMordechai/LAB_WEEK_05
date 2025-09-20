package com.example.lab_week_05.model

import com.squareup.moshi.Json

data class ImageData(
    val id: String,
    @Json(name = "url") val imageUrl: String,
    val width: Int?,
    val height: Int?
)
