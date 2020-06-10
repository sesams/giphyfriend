package com.ks.giphyfriend.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ks.giphyfriend.data.Gif
import com.ks.giphyfriend.data.db.LocalStorageImpl
import com.ks.giphyfriend.net.GiphyApiImpl
import com.ks.giphyfriend.repository.GiphyRepository
import com.ks.giphyfriend.repository.GiphyRepositoryImpl

class FavoriteViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: GiphyRepository by lazy {
        GiphyRepositoryImpl(GiphyApiImpl(), LocalStorageImpl(application))
    }

    val list = MutableLiveData<List<Gif>>()

    fun loadGifList() {
        repository.getFavoriteGif({ list.value = it })
    }

    fun getGif(id: String): Gif? {
        return repository.getGif(id)
    }

    fun updateGif(gif: Gif) {
        if (gif.isFavorite)
            repository.addGif(gif)
        else
            repository.removeGif(gif)
    }
}