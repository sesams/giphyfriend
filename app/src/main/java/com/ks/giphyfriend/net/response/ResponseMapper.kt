package com.ks.giphyfriend.net.response

import com.ks.giphyfriend.data.Gif

object ResponseMapper {

    fun convertToGif(data: TrendingResponse.Datum): Gif {
        return Gif(
            data.id,
            data.type,
            data.images.previewGif.url,
            data.images.previewGif.width.toInt(),
            data.images.previewGif.height.toInt()
        )
    }
}