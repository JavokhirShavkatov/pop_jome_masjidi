package com.example.popjomemasjidi.activitys.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.activitys.ActivityForNamazDetails
import com.example.popjomemasjidi.activitys.models.NamozModel

class NamozAdapter (private val items:Array<NamozModel>): RecyclerView.Adapter<NamozAdapter.ItemHolder>() {

    class ItemHolder(view: View): RecyclerView.ViewHolder(view){
        val number:TextView = view.findViewById(R.id.number)
        val dua_title:TextView = view.findViewById(R.id.dua_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.dua_rv_item,parent,false))
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]

        holder.itemView.setOnClickListener{
            val intent = Intent(it.context, ActivityForNamazDetails::class.java)
            intent.putExtra("extra_data",item)
            it.context.startActivity(intent)
        }
        holder.number.text = item.nId.toString()
        holder.dua_title.text = item.nTitle
    }


}