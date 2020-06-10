package com.ks.giphyfriend.data.db

import com.ks.giphyfriend.data.Gif

interface LocalStorage {
    fun getGifList(): List<Gif>
    fun getGif(id: String): Gif?
    fun insertGif(gif: Gif)
    fun deleteGif(gif: Gif)
}