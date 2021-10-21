package com.example.popjomemasjidi.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.popjomemasjidi.databinding.ActivityYouTubeLiveBinding
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener



class YouTubeLiveActivity : AppCompatActivity() {
    private lateinit var binding: ActivityYouTubeLiveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYouTubeLiveBinding.inflate(layoutInflater)
        setContentView(binding.root)


        lifecycle.addObserver(binding.activityMainYoutubePlayerView)

        binding.activityMainYoutubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                val videoId = "atsOvkLE6LU"
                youTubePlayer.loadVideo(videoId, 0f)
            }
        })

    }

}