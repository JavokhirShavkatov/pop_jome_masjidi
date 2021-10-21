package com.example.popjomemasjidi.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.activitys.adapters.AllDuasAdapter
import com.example.popjomemasjidi.activitys.models.AllDuasModel
import com.example.popjomemasjidi.databinding.ActivitySearchAllDuasBinding
import java.util.*
import kotlin.collections.ArrayList

class SearchAllDuasActivity : AppCompatActivity() {
    private var courseRV: RecyclerView? = null
    private var adapter: AllDuasAdapter? = null
    private var courseModalArrayList: ArrayList<AllDuasModel>? = null
    private lateinit var binding:ActivitySearchAllDuasBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchAllDuasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Duolar"


        courseRV = findViewById(R.id.rv8)

        buildRecyclerView()
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)

        val searchItem: MenuItem = menu.findItem(R.id.actionSearch)
        val searchView: SearchView = searchItem.getActionView() as SearchView

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                filter(newText)
                return false
            }
        })
        return true
    }

    private fun filter(text: String) {
        val filteredlist: ArrayList<AllDuasModel> = ArrayList()

        for (item in courseModalArrayList!!) {
            if (item.dua_title.lowercase(Locale.getDefault()).contains(text.lowercase(Locale.getDefault()))) {
                filteredlist.add(item)
            }
        }
        if (filteredlist.isEmpty()) {
            Toast.makeText(this, "Malumot topilmadi..", Toast.LENGTH_SHORT).show()
        } else {
            adapter!!.filterList(filteredlist)
        }
    }

    private fun buildRecyclerView() {

        courseModalArrayList = ArrayList()

        courseModalArrayList!!.add(AllDuasModel("DSA",1))
        courseModalArrayList!!.add(AllDuasModel("JAVA",2))
        courseModalArrayList!!.add(AllDuasModel("DSA",3))
        courseModalArrayList!!.add(AllDuasModel("JAVA",4))
        courseModalArrayList!!.add(AllDuasModel("DSA",5))
        courseModalArrayList!!.add(AllDuasModel("JAVA",6))
        courseModalArrayList!!.add(AllDuasModel("DSA",7))
        courseModalArrayList!!.add(AllDuasModel("JAVA",8))
        courseModalArrayList!!.add(AllDuasModel("DSA", 9))
        courseModalArrayList!!.add(AllDuasModel("JAVA",10))

        adapter = AllDuasAdapter(courseModalArrayList!!, this)
        val manager = LinearLayoutManager(this)
        courseRV!!.setHasFixedSize(true)
        courseRV!!.layoutManager = manager
        courseRV!!.adapter = adapter
    }
}