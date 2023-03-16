package com.ld.picasso_image_loader

import android.widget.ImageView
import com.google.auto.service.AutoService
import com.ld.my_image_loader.MyImageLoader
import com.squareup.picasso.Picasso

@AutoService(MyImageLoader::class)
class PicassoImageLoader: MyImageLoader {

    override fun load(imageView: ImageView, imageUrl: String) {
        Picasso.Builder(imageView.context)
            .build()
            .load(imageUrl)
            .into(imageView)
    }
}