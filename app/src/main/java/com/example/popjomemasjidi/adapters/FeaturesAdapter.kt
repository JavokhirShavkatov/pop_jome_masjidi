package com.example.popjomemasjidi.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.popjomemasjidi.models.FeaturesModel
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.activitys.*

class FeaturesAdapter(private val items:Array<FeaturesModel>): RecyclerView.Adapter<FeaturesAdapter.ItemHolder>() {

    class ItemHolder(view: View):RecyclerView.ViewHolder(view){
        val cardImg:ImageView = view.findViewById(R.id.cardImg)
        val cardTitle:TextView = view.findViewById(R.id.cardTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.features_card,parent,false))
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]

        holder.itemView.setOnClickListener{
            when (item.id) {
                1 -> {
                    val intent = Intent(it.context,AsmaulHusnaActivity::class.java)
                    it.context.startActivity(intent)
                }
                2 -> {
                    val intent = Intent(it.context,TasbihActivity::class.java)
                    it.context.startActivity(intent)
                }
                3 -> {
                    val intent = Intent(it.context,DuolarActivity::class.java)
                    it.context.startActivity(intent)
                }
                4 -> {
                    val intent = Intent(it.context,NamozActivity::class.java)
                    it.context.startActivity(intent)
                }
            }

        }
        holder.cardImg.setImageResource(item.image)
        holder.cardTitle.text = item.text
    }


}