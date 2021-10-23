package com.example.popjomemasjidi.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.popjomemasjidi.activitys.adapters.SavedDuasAdapter
import com.example.popjomemasjidi.databinding.ActivitySavedDuasBinding
import com.example.popjomemasjidi.db.MyDatabaseHelper
import java.util.ArrayList

class SavedDuasActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySavedDuasBinding

    var myDB: MyDatabaseHelper? = null
    var dua_title: ArrayList<String>? = null
    var dua_id:ArrayList<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySavedDuasBinding.inflate(layoutInflater)
        setContentView(binding.root)


        myDB = MyDatabaseHelper(this)
        dua_title = ArrayList<String>()
        dua_id = ArrayList<String>()

        storeDataInArrays()

        binding.rv6.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rv6.adapter = SavedDuasAdapter(this,this,dua_title,dua_id)

    }

    private fun storeDataInArrays() {
        val cursor = myDB!!.readAllData()
        if (cursor.count == 0) {
//            empty_imageview.setVisibility(View.VISIBLE)
//            no_data.setVisibility(View.VISIBLE)
        } else {
            while (cursor.moveToNext()) {
                dua_title?.add(cursor.getString(0))
                dua_id?.add(cursor.getString(1))
            }
//            empty_imageview.setVisibility(View.GONE)
//            no_data.setVisibility(View.GONE)
        }
    }
}