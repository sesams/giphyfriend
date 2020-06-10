package com.ks.giphyfriend.manager

import com.ks.giphyfriend.data.GifRequest

class PageManager {

    var prevRequest: GifRequest? = null

    fun newRequest(): GifRequest = GifRequest()

    fun getRequest(): GifRequest {
        return if (prevRequest == null)
            newRequest()
        else
            GifRequest(prevRequest!!.limit, offset = prevRequest!!.offset + prevRequest!!.limit)
    }
}