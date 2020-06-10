package com.ks.giphyfriend.net

import com.ks.giphyfriend.data.Gif
import com.ks.giphyfriend.data.GifRequest
import com.ks.giphyfriend.net.response.TrendingResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

const val BASE_URL = "https://api.giphy.com/"
const val API_KEY = "0v6YQbpOwLNVKMVcMdyMzjt2oZ4MU47V"

interface GiphyAPI {
    fun getTrendingGif(
        request: GifRequest,
        callback: (list: List<Gif>) -> Unit,
        error: (error: Throwable) -> Unit
    )
}

interface APIService {

    @GET("v1/gifs/trending")
    fun getTrendingGif(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int,
        @Query("api_key") key: String = API_KEY
    ): Call<TrendingResponse>
}