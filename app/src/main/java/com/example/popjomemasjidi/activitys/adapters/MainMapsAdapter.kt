package com.example.popjomemasjidi.activitys.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.popjomemasjidi.MapsActivity
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.activitys.models.MainMapsModel

class MainMapsAdapter (private val items:Array<MainMapsModel>): RecyclerView.Adapter<MainMapsAdapter.ItemHolder>() {

    class ItemHolder(view: View): RecyclerView.ViewHolder(view){
        val name_ofMasjid:TextView = view.findViewById(R.id.name_ofMasjid)
        val name_ofImam:TextView = view.findViewById(R.id.name_ofImam)
        val location_ofMasjid:TextView = view.findViewById(R.id.location_ofMasjid)
        val id_ofMasjid:TextView = view.findViewById(R.id.id_ofMasjid)
        val img_ofMasjid:ImageView = view.findViewById(R.id.image_ofMasjid)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.main_masjid_item,parent,false))
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]

        holder.itemView.setOnClickListener{
            val intent = Intent(it.context, MapsActivity::class.java)
            it.context.startActivity(intent)
        }
        holder.img_ofMasjid.setImageResource(item.image_ofMasjid)
        holder.name_ofMasjid.text = item.name_ofMasjid
        holder.name_ofImam.text = item.name_ofImam
        holder.id_ofMasjid.text = item.id_ofMasjid

    }


}