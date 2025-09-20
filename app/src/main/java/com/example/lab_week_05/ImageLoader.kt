package com.example.lab_week_05

import android.widget.ImageView

interface ImageLoader {
    fun loadImage(url: String, imageView: ImageView)
}
