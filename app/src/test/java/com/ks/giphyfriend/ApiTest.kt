package com.ks.giphyfriend

import com.ks.giphyfriend.data.Gif
import com.ks.giphyfriend.data.GifRequest
import com.ks.giphyfriend.exception.NetworkException
import com.ks.giphyfriend.manager.PageManager
import com.ks.giphyfriend.net.GiphyAPI
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ApiTest {

    @Test
    fun test_create_page_info() {
        val pageManager = PageManager()
        val request = pageManager.newRequest()
        assertTrue(request.offset == 0)

        pageManager.prevRequest = request

        val next = pageManager.getRequest()
        assertTrue(next.offset == 25)
    }

    @Test
    fun test_trending_api() {
        //val api: GiphyAPI = GiphyApiImpl()
        val api: GiphyAPI = MockApiImpl()

        val request = PageManager().getRequest()
        assertTrue(request.offset == 0)
        println("page offset = ${request.offset}")

        api.getTrendingGif(request, { list ->
            assertNotNull(list)
            assertTrue(list.isNotEmpty())
            println(list.joinToString(", "))
        }, {
            it.printStackTrace()
        })
    }

    class MockApiImpl : GiphyAPI {
        override fun getTrendingGif(
            request: GifRequest,
            callback: (list: List<Gif>) -> Unit,
            error: (error: Throwable) -> Unit
        ) {
            callback(arrayListOf(Gif("gif1"), Gif("gif2")))
            error(NetworkException("Error is occurred during network operation."))
        }
    }
}