package com.ks.giphyfriend.repository

import com.ks.giphyfriend.data.Gif
import com.ks.giphyfriend.data.GifRequest
import com.ks.giphyfriend.data.db.LocalStorage
import com.ks.giphyfriend.exception.LocalDatabaseException
import com.ks.giphyfriend.net.GiphyAPI
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class GiphyRepositoryImpl(
    private val api: GiphyAPI,
    private val localStorage: LocalStorage? = null
) : GiphyRepository {

    override fun getTrendingGif(
        request: GifRequest,
        callback: (list: List<Gif>) -> Unit,
        error: (e: Throwable) -> Unit
    ) {
        CoroutineScope(Dispatchers.IO).launch {
            api.getTrendingGif(request, {
                launch(Dispatchers.Main) {
                    callback(it)
                }
            }, {
                launch(Dispatchers.Main) {
                    error(it)
                }
            })
        }
    }

    override fun getFavoriteGif(
        callback: (list: List<Gif>) -> Unit,
        error: ((e: Throwable) -> Unit)?
    ) {

        if (localStorage == null)
            throw IllegalStateException("LocalStorage is null!")

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val list = localStorage.getGifList()
                launch(Dispatchers.Main) {
                    callback(list)
                }
            } catch (e: Exception) {
                launch(Dispatchers.Main) {
                    error?.invoke(LocalDatabaseException("Room database exception is occurred."))
                }
            }
        }
    }

    override fun getGif(id: String): Gif? {
        if (localStorage == null)
            throw IllegalStateException("LocalStorage is null!")

        return runBlocking(Dispatchers.IO) { localStorage.getGif(id) }
    }

    override fun addGif(gif: Gif) {
        if (localStorage == null)
            throw IllegalStateException("LocalStorage is null!")

        runBlocking(Dispatchers.IO) { localStorage.insertGif(gif) }
    }

    override fun removeGif(gif: Gif) {
        if (localStorage == null)
            throw IllegalStateException("LocalStorage is null!")

        runBlocking(Dispatchers.IO) { localStorage.deleteGif(gif) }
    }
}