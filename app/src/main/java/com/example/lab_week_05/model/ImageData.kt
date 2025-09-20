package com.example.lab_week_05.model

import com.squareup.moshi.Json

data class ImageData(
    val id: String,
    @Json(name = "url") val imageUrl: String,
    val width: Int?,
    val height: Int?,
    val breeds: List<Breed>?
)

data class Breed(
    val id: String?,
    val name: String?
)
