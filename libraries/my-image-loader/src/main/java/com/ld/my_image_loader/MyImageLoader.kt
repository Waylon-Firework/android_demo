package com.ld.my_image_loader

import android.widget.ImageView

interface MyImageLoader {
    fun load(imageView: ImageView, imageUrl: String)
}