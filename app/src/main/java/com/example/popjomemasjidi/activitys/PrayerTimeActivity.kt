package com.example.popjomemasjidi.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.databinding.ActivityPrayerTimeBinding
import com.example.popjomemasjidi.fragments.FirstFragment


class PrayerTimeActivity : AppCompatActivity() {
    private lateinit var binding:ActivityPrayerTimeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrayerTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.prayerTimeFinish.setOnClickListener {
            val intent: Intent = Intent(
                this,
                FirstFragment::class.java
            )
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                finish ()
        }

    }
}