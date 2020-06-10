package com.ks.giphyfriend.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite")
data class Gif(
    @PrimaryKey val id: String,
    val type: String = "",
    val url: String = "",
    val width: Int = 0,
    val height: Int = 0,
    var isFavorite: Boolean = false
)

data class GifRequest(
    val limit: Int = 25,
    val offset: Int = 0
)

data class PageInfo(
    val total: Int,
    val count: Int,
    val offset: Int
) {
    override fun toString(): String {
        return "total count = $total, count = $count, offset = $offset"
    }
}