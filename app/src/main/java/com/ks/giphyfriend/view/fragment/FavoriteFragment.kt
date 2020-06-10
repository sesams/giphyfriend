package com.ks.giphyfriend.view.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.gson.Gson
import com.ks.giphyfriend.R
import com.ks.giphyfriend.view.activity.DetailActivity
import com.ks.giphyfriend.view.adapter.TrendingListAdapter
import com.ks.giphyfriend.viewmodel.FavoriteViewModel
import kotlinx.android.synthetic.main.fragment_main.*

class FavoriteFragment : Fragment() {

    private val viewModel: FavoriteViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = TrendingListAdapter().apply {
            listener = { _, gif ->
                Intent(requireActivity(), DetailActivity::class.java).apply {
                    putExtra("gif", Gson().toJson(gif))
                    requireActivity().startActivity(this)
                }
            }
        }

        with(recyclerView) {
            this.adapter = adapter
            layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL).apply {
                    gapStrategy = StaggeredGridLayoutManager.GAP_HANDLING_NONE
                }
        }

        viewModel.list.observe(requireActivity(), Observer {
            adapter.list = it
        })
    }

    override fun onResume() {
        super.onResume()
        viewModel.loadGifList()
    }
}