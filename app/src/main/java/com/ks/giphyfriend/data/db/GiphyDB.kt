package com.ks.giphyfriend.data.db

import android.content.Context
import androidx.room.*
import com.ks.giphyfriend.data.Gif

@Dao
interface GiphyDao {

    @Query("select * from favorite")
    fun getGifList(): List<Gif>

    @Query("select * from favorite where id == :id")
    fun getGif(id: String): Gif

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertGif(gif: Gif)

    @Delete
    fun deleteGif(gif: Gif)
}

@Database(entities = [Gif::class], version = 1, exportSchema = false)
abstract class GiphyDatabase : RoomDatabase() {

    abstract fun getDao(): GiphyDao

    companion object {

        private var INSTANCE: GiphyDatabase? = null

        fun getDatabase(context: Context): GiphyDatabase {
            if (INSTANCE == null) {
                synchronized(GiphyDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        GiphyDatabase::class.java,
                        "giphy_db"
                    ).build()
                }
            }
            return INSTANCE!!
        }
    }
}