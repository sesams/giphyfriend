package com.ks.giphyfriend.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ks.giphyfriend.data.Gif
import com.ks.giphyfriend.manager.PageManager
import com.ks.giphyfriend.net.GiphyApiImpl
import com.ks.giphyfriend.repository.GiphyRepository
import com.ks.giphyfriend.repository.GiphyRepositoryImpl

class GifViewModel : ViewModel() {

    private val pageManager: PageManager = PageManager()
    private val repository: GiphyRepository = GiphyRepositoryImpl(GiphyApiImpl())

    private val gifList = mutableListOf<Gif>()

    val list: MutableLiveData<List<Gif>> = MutableLiveData()
    var error: MutableLiveData<Throwable> = MutableLiveData()

    fun loadTrendingList() {
        val request = pageManager.newRequest()
        repository.getTrendingGif(request, {
            with(gifList) {
                clear()
                addAll(it)
                list.value = gifList
            }
            pageManager.prevRequest = request
        }, {
            it.printStackTrace()
            error.value = it
        })
    }

    fun loadMore() {
        val request = pageManager.getRequest()
        repository.getTrendingGif(request, {
            with(gifList) {
                addAll(it)
                list.value = gifList
            }
            pageManager.prevRequest = request
        }, {
            it.printStackTrace()
            error.value = it
        })
    }
}