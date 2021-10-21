package com.example.popjomemasjidi.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.popjomemasjidi.activitys.models.AsmaulHusnaModel
import com.example.popjomemasjidi.databinding.ActivityNameDetailBinding

class NameDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNameDetailBinding
    lateinit var item:AsmaulHusnaModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNameDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.backToAHActivity.setOnClickListener {
                val intent: Intent = Intent(
                    this,
                    AsmaulHusnaActivity::class.java
                )
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                finish ()
        }

        item = intent.getSerializableExtra("extra_data") as AsmaulHusnaModel

        binding.nameIdm.text = item.id.toString()
        binding.nameImgm.setImageResource(item.img)
        binding.readingTxtm.text = item.text_reading
        binding.meaningTxtm.text = item.translate

    }
}