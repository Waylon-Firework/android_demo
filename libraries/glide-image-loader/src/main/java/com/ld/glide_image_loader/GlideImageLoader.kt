package com.ld.glide_image_loader

import android.widget.ImageView
import com.bumptech.glide.Glide

class GlideImageLoader {

    fun load(imageView: ImageView, imageUrl: String) {
        Glide.with(imageView.context)
            .load(imageUrl)
            .into(imageView)
    }
}