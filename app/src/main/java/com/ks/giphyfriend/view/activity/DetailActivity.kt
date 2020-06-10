package com.ks.giphyfriend.view.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.ks.giphyfriend.R
import com.ks.giphyfriend.data.Gif
import com.ks.giphyfriend.viewmodel.FavoriteViewModel
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    private val viewModel: FavoriteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initialize()
    }

    private fun initialize() {
        intent.getStringExtra("gif")?.let { json ->
            val target = Gson().fromJson(json, Gif::class.java)
            imageView.post { Glide.with(imageView).load(target.url).into(imageView) }

            val gif = viewModel.getGif(target.id) ?: target
            setStarIcon(gif)

            star.setOnClickListener {
                gif.isFavorite = !gif.isFavorite
                setStarIcon(gif)
                viewModel.updateGif(gif)
            }
        }
    }

    private fun setStarIcon(gif: Gif) {
        star.setImageResource(
            if (gif.isFavorite)
                R.drawable.bookmark_black_24x24
            else
                R.drawable.bookmark_border_black_24x24
        )
    }
}