package com.example.popjomemasjidi.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.adapters.DuaCategoriesAdapter
import com.example.popjomemasjidi.databinding.ActivityDuolarBinding
import com.example.popjomemasjidi.models.DuaCategoriesModel


class DuolarActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDuolarBinding

    var duaCategories = arrayOf(
        DuaCategoriesModel(R.drawable.hazrat2,"Qibla Kompass",1),
        DuaCategoriesModel(R.drawable.hazrat2,"Qibla Kompass",2),
        DuaCategoriesModel(R.drawable.hazrat2,"Qibla Kompass",3),
        DuaCategoriesModel(R.drawable.hazrat2,"Qibla Kompass",4),
        DuaCategoriesModel(R.drawable.hazrat2,"Qibla Kompass",5),
        DuaCategoriesModel(R.drawable.hazrat2,"Qibla Kompass",6),
        DuaCategoriesModel(R.drawable.hazrat2,"Qibla Kompass",7),
        DuaCategoriesModel(R.drawable.hazrat2,"Qibla Kompass",8),
        DuaCategoriesModel(R.drawable.hazrat2,"Qibla Kompass",9),
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDuolarBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.rv7.layoutManager = GridLayoutManager(this,3)
        binding.rv7.adapter = DuaCategoriesAdapter(duaCategories)


        binding.allDuas.setOnClickListener {
            val intent = Intent(it.context,SearchAllDuasActivity::class.java)
            it.context.startActivity(intent)
        }
    }
}