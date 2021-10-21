package com.example.popjomemasjidi.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.databinding.ActivityZikrBinding
import com.example.popjomemasjidi.fragments.FeaturepadFragment

class ZikrActivity : AppCompatActivity() {

    private lateinit var binding: ActivityZikrBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityZikrBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.morningZikrs.setOnClickListener {
            val intent = Intent(it.context, AllZikrsActivity::class.java)
            intent.putExtra("extra_data",1)
            it.context.startActivity(intent)
        }

        binding.eveningZikrs.setOnClickListener {
            val intent = Intent(it.context, AllZikrsActivity::class.java)
            intent.putExtra("extra_data",2)
            it.context.startActivity(intent)
        }

            binding.backIcon3.setOnClickListener {
                val intent: Intent = Intent(
                    this,
                    FeaturepadFragment::class.java
                )
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                finish ()
            }
    }
}