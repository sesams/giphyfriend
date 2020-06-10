package com.ks.giphyfriend.repository

import com.ks.giphyfriend.data.Gif
import com.ks.giphyfriend.data.GifRequest

interface GiphyRepository {
    fun getTrendingGif(
        request: GifRequest,
        callback: (list: List<Gif>) -> Unit,
        error: (e: Throwable) -> Unit
    )

    fun getFavoriteGif(
        callback: (list: List<Gif>) -> Unit,
        error: ((e: Throwable) -> Unit)? = null
    )

    fun getGif(id: String): Gif?

    fun addGif(gif: Gif)

    fun removeGif(gif: Gif)
}