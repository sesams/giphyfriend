package com.ks.giphyfriend.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
import com.ks.giphyfriend.R
import com.ks.giphyfriend.view.fragment.FavoriteFragment
import com.ks.giphyfriend.view.fragment.TrendingFragment
import com.ks.giphyfriend.view.adapter.GiphyFragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
    }

    private fun initialize() {
        GiphyFragmentPagerAdapter(
            supportFragmentManager,
            BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
        ).apply {
            addFragment(TrendingFragment(), getString(R.string.fragment_trending))
            addFragment(FavoriteFragment(), getString(R.string.fragment_favorite))
            viewPager.adapter = this
        }

        tabLayout.setupWithViewPager(viewPager);
    }
}