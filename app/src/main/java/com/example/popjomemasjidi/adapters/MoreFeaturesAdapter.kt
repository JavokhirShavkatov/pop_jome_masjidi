package com.example.popjomemasjidi.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.popjomemasjidi.MapsActivity
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.activitys.*
import com.example.popjomemasjidi.models.MoreFeaturesModel

class MoreFeaturesAdapter(private val items:Array<MoreFeaturesModel>): RecyclerView.Adapter<MoreFeaturesAdapter.ItemHolder>() {

    class ItemHolder(view: View): RecyclerView.ViewHolder(view){
        val more_functions_image:ImageView = view.findViewById(R.id.more_functions_image)
        val more_functions_title:TextView = view.findViewById(R.id.more_functions_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.more_functions_item,parent,false))
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]

        holder.itemView.setOnClickListener{
            when (item.mId) {
                1 -> {
                    val intent = Intent(it.context, CompassActivity::class.java)
                    it.context.startActivity(intent)
                }
                2 -> {
                    val intent = Intent(it.context, DuolarActivity::class.java)
                    it.context.startActivity(intent)
                }
                3 -> {
                    val intent = Intent(it.context, YouTubeLiveActivity::class.java)
                    it.context.startActivity(intent)
                }
                4 -> {
                    val intent = Intent(it.context, MainMapsActivity::class.java)
                    it.context.startActivity(intent)
                }
                5 -> {
                    val intent = Intent(it.context, ZikrActivity::class.java)
                    it.context.startActivity(intent)
                }
                6 -> {
                val intent = Intent(it.context, TasbihActivity::class.java)
                it.context.startActivity(intent)
            }
            }
        }
        holder.more_functions_image.setImageResource(item.mfImg)
        holder.more_functions_title.text = item.mfTitle
    }


}