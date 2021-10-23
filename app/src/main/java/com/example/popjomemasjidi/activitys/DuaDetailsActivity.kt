package com.example.popjomemasjidi.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.popjomemasjidi.activitys.models.AllDuasModel
import com.example.popjomemasjidi.databinding.ActivityDuaDetailsBinding
import com.example.popjomemasjidi.db.MyDatabaseHelper

class DuaDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDuaDetailsBinding
    lateinit var item:AllDuasModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDuaDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        item = intent.getSerializableExtra("extra_data") as AllDuasModel

        binding.txt.text = item.dua_title

        binding.saveIcon.setOnClickListener {
            val myDB = MyDatabaseHelper(this)
            myDB.addBook(item.dua_title,item.dua_id)
            Toast.makeText(this,"saved!",Toast.LENGTH_SHORT).show()
        }


    }
}