package com.example.popjomemasjidi.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.databinding.ActivitySettingBinding

class SettingActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_setting)
    }
}