package com.ld.picasso_image_loader

import android.widget.ImageView
import com.squareup.picasso.Picasso

class PicassoImageLoader {

    fun load(imageView: ImageView, imageUrl: String) {
        Picasso.Builder(imageView.context)
            .build()
            .load(imageUrl)
            .into(imageView)
    }
}