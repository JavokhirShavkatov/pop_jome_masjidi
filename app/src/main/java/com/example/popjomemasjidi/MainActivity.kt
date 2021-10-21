package com.example.popjomemasjidi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.popjomemasjidi.activitys.CompassActivity
import com.example.popjomemasjidi.activitys.YouTubeLiveActivity
import com.example.popjomemasjidi.adapters.SlidePagerAdapter
import com.example.popjomemasjidi.databinding.ActivityMainBinding
import com.example.popjomemasjidi.fragments.FeaturepadFragment
import com.example.popjomemasjidi.fragments.FirstFragment
import com.example.popjomemasjidi.fragments.NewsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViewPager(binding.pager)

        binding.qiblaFinderAc.setOnClickListener{
            val intent = Intent(this, CompassActivity::class.java)
            this.startActivity(intent)
        }

        binding.youtubeButton.setOnClickListener{
            val intent = Intent(this, YouTubeLiveActivity::class.java)
            this.startActivity(intent)
        }

    }

    private fun setupViewPager(viewpager: ViewPager) {
        val adapter = SlidePagerAdapter(supportFragmentManager)

        adapter.addFragment(FirstFragment())
        adapter.addFragment(FeaturepadFragment())
        adapter.addFragment(NewsFragment())

        viewpager.adapter = adapter
    }



}