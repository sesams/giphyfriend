package com.ks.giphyfriend.data.db

import android.content.Context
import com.ks.giphyfriend.data.Gif

class LocalStorageImpl(private val context: Context) : LocalStorage {

    override fun getGifList(): List<Gif> {
        return GiphyDatabase.getDatabase(context).getDao().getGifList()
    }

    override fun getGif(id: String): Gif {
        return GiphyDatabase.getDatabase(context).getDao().getGif(id)
    }

    override fun insertGif(gif: Gif) {
        GiphyDatabase.getDatabase(context).getDao().insertGif(gif)
    }

    override fun deleteGif(gif: Gif) {
        GiphyDatabase.getDatabase(context).getDao().deleteGif(gif)
    }
}