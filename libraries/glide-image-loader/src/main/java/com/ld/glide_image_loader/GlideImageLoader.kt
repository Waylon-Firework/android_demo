package com.ld.glide_image_loader

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.ld.my_image_loader.MyImageLoader

class GlideImageLoader: MyImageLoader {

    override fun load(imageView: ImageView, imageUrl: String) {
        Glide.with(imageView.context)
            .load(imageUrl)
            .into(imageView)
    }
}