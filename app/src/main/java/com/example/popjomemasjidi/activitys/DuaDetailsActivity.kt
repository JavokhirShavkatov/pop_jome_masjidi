package com.example.popjomemasjidi.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.databinding.ActivityDuaDetailsBinding

class DuaDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDuaDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDuaDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}