package com.example.popjomemasjidi.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.activitys.adapters.AsmaulHusnaAdapter
import com.example.popjomemasjidi.activitys.adapters.MainMapsAdapter
import com.example.popjomemasjidi.activitys.models.AsmaulHusnaModel
import com.example.popjomemasjidi.activitys.models.MainMapsModel
import com.example.popjomemasjidi.databinding.ActivityMainMapsBinding

class MainMapsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainMapsBinding

    var items11 = arrayOf(
        MainMapsModel("Abdulhakim Domla","Kichik xo'jaobod jome masjidi","",R.drawable.masjid3,"1"),
        MainMapsModel("Abdulhakim Domla","Kichik xo'jaobod jome masjidi","",R.drawable.masjid3,"1"),
        MainMapsModel("Abdulhakim Domla","Kichik xo'jaobod jome masjidi","",R.drawable.masjid3,"1"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv11.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.rv11.adapter = MainMapsAdapter(items11)



    }

}