package com.ks.giphyfriend.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ks.giphyfriend.R
import com.ks.giphyfriend.data.Gif
import com.ks.giphyfriend.view.view.GifView


class TrendingListAdapter : RecyclerView.Adapter<TrendingListAdapter.Holder>() {

    var list: List<Gif>? = null
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    var listener: ((position: Int, gif: Gif) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_gif, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        if (list == null)
            return

        with(holder.root) {
            gifWidth = list!![position].width
            gifHeight = list!![position].height
            tag = position
        }

        holder.image.post {
            Glide.with(holder.image).load(list!![position].url).into(holder.image)
        }
    }

    inner class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val root: GifView = view.findViewById(R.id.cardView)
        val image: ImageView = view.findViewById(R.id.imageView)

        init {
            root.setOnClickListener {
                val position = it.tag as Int
                listener?.invoke(position, list!![position])
            }
        }
    }
}