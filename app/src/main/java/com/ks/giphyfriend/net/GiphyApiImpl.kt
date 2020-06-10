package com.ks.giphyfriend.net

import com.ks.giphyfriend.data.Gif
import com.ks.giphyfriend.data.GifRequest
import com.ks.giphyfriend.net.response.ResponseMapper
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class GiphyApiImpl : GiphyAPI {

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(OkHttpClient.Builder().connectTimeout(1, TimeUnit.MINUTES).build())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val service = retrofit.create(APIService::class.java)

    override fun getTrendingGif(
        request: GifRequest,
        callback: (list: List<Gif>) -> Unit,
        error: (error: Throwable) -> Unit
    ) {
        try {
            service.getTrendingGif(request.limit, request.offset).execute().apply {
                val response = body()
                if (isSuccessful && response != null) {
                    callback(response.data.map { ResponseMapper.convertToGif(it) })
                    return
                }
            }
        } catch (exception: Exception) {
            error(exception)
        }

        callback(emptyList())
    }
}


