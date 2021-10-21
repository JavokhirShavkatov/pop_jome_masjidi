package com.example.popjomemasjidi.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.models.TreasureModel

class DailyTreasureAdapter(private val items: Array<TreasureModel>): RecyclerView.Adapter<DailyTreasureAdapter.ItemHolder>() {

    class ItemHolder(view: View): RecyclerView.ViewHolder(view){
        val treasure_img:ImageView = view.findViewById(R.id.treasure_img)
        val treasure_title:TextView = view.findViewById(R.id.treasure_title)
        val treasure_subtitle:TextView = view.findViewById(R.id.treasure_subtitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.daily_treasure_item,parent,false))
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]

        holder.itemView.setOnClickListener{

        }
        holder.treasure_img.setImageResource(item.treasure_image)
        holder.treasure_title.text = item.treasure_title
        holder.treasure_subtitle.text = item.treasure_subtext

    }


}