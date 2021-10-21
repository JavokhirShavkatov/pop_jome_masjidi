package com.example.popjomemasjidi.activitys.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.activitys.*
import com.example.popjomemasjidi.activitys.models.AsmaulHusnaModel
import org.w3c.dom.Text

class AsmaulHusnaAdapter (private val items:Array<AsmaulHusnaModel>): RecyclerView.Adapter<AsmaulHusnaAdapter.ItemHolder>() {

    class ItemHolder(view: View): RecyclerView.ViewHolder(view){
        val name_img:ImageView = view.findViewById(R.id.name_img)
        val names_ofAllah:TextView = view.findViewById(R.id.names_ofAllah)
        val meaning_ofName:TextView = view.findViewById(R.id.meaning_ofName)
        val number:TextView = view.findViewById(R.id.number)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.asmaulhusna_item,parent,false))
    }

    override fun getItemCount(): Int {
        return items.count()
    }


    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]

        holder.itemView.setOnClickListener{
            val intent = Intent(it.context,NameDetailActivity::class.java)
            intent.putExtra("extra_data",item)
            it.context.startActivity(intent)
        }
        holder.name_img.setImageResource(item.img)
        holder.names_ofAllah.text = item.text_reading
        holder.meaning_ofName.text = item.translate
        holder.number.text = item.id.toString()

    }


}