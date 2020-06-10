package com.ks.giphyfriend.view.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager.VERTICAL
import com.google.gson.Gson
import com.ks.giphyfriend.R
import com.ks.giphyfriend.view.activity.DetailActivity
import com.ks.giphyfriend.view.adapter.TrendingListAdapter
import com.ks.giphyfriend.viewmodel.GifViewModel
import kotlinx.android.synthetic.main.fragment_main.*

class TrendingFragment : Fragment() {

    private val viewModel: GifViewModel by viewModels()

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

        var isRequested = false

        with(recyclerView) {
            this.adapter = adapter
            layoutManager = StaggeredGridLayoutManager(2, VERTICAL).apply {
                gapStrategy = StaggeredGridLayoutManager.GAP_HANDLING_NONE
            }

            addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                    if (!recyclerView.canScrollVertically(1) && !isRequested) {
                        viewModel.loadMore()
                    }
                }
            })
        }

        viewModel.list.observe(requireActivity(), Observer {
            adapter.list = it
            isRequested = false
        })

        viewModel.error.observe(requireActivity(), Observer {
            Toast.makeText(context, getString(R.string.network_error), Toast.LENGTH_SHORT).show()
        })

        viewModel.loadTrendingList()
    }
}