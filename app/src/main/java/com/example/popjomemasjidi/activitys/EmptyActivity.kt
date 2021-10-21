package com.example.popjomemasjidi.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.popjomemasjidi.databinding.ActivityEmptyBinding
import com.example.popjomemasjidi.models.DuaCategoriesModel


class EmptyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEmptyBinding
    lateinit var item:DuaCategoriesModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmptyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backIcon.setOnClickListener {
            val intent: Intent = Intent(
                this,
                DuolarActivity::class.java
            )
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            finish ()
        }

        item = intent.getSerializableExtra("extra_data") as DuaCategoriesModel

        binding.activityTitle.text = item.cTitle
    }
}