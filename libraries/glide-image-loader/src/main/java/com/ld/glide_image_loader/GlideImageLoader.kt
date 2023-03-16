package com.ld.glide_image_loader

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.google.auto.service.AutoService
import com.ld.my_image_loader.MyImageLoader

@AutoService(MyImageLoader::class)
class GlideImageLoader: MyImageLoader {

    override fun load(imageView: ImageView, imageUrl: String) {
        Glide.with(imageView.context)
            .load(imageUrl)
            .into(imageView)
    }
}