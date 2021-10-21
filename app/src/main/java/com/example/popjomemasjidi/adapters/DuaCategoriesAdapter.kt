package com.example.popjomemasjidi.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.activitys.EmptyActivity
import com.example.popjomemasjidi.models.DuaCategoriesModel

class DuaCategoriesAdapter (private val items: Array<DuaCategoriesModel>): RecyclerView.Adapter<DuaCategoriesAdapter.ItemHolder>() {

    class ItemHolder(view: View): RecyclerView.ViewHolder(view){
        val cImgM: ImageView = view.findViewById(R.id.cImgM)
        val cTitleM :TextView = view.findViewById(R.id.cTitleM)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.dua_categories_item,parent,false))
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]

        holder.itemView.setOnClickListener{
            val intent = Intent(it.context,EmptyActivity::class.java)
            intent.putExtra("extra_data",item)
            it.context.startActivity(intent)
        }
        holder.cImgM.setBackgroundResource(item.cImg)
        holder.cTitleM.text = item.cTitle
    }
}