package com.example.popjomemasjidi.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.popjomemasjidi.activitys.models.NamozModel
import com.example.popjomemasjidi.databinding.ActivityForNamazDetailsBinding
import com.example.popjomemasjidi.fragments.FirstFragment

class ActivityForNamazDetails : AppCompatActivity() {

    private lateinit var binding: ActivityForNamazDetailsBinding
    lateinit var item:NamozModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForNamazDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        item = intent.getSerializableExtra("extra_data") as NamozModel

        binding.txt.text = item.nText

        binding.backIcon1.setOnClickListener {
            val intent: Intent = Intent(
                this,
                FirstFragment::class.java
            )
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            finish ()
        }
    }
}