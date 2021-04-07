package com.example.week1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener


class screen_danh : AppCompatActivity() {
    var sampleImages = intArrayOf(
        R.drawable.inview1,
        R.drawable.inview2,
        R.drawable.inview3
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_danh)
        val carouselView = findViewById<CarouselView>(R.id.carouselView)
        carouselView.setPageCount(sampleImages.size)
        carouselView.setImageListener(imageListener)
    }
    var imageListener: ImageListener = ImageListener { position, imageView -> //
        // You can use Glide or Picasso here

        imageView.setImageResource(sampleImages[position])

    }
}