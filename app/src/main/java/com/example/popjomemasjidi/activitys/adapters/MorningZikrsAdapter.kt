package com.example.popjomemasjidi.activitys.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.activitys.models.MorningZikrsModel
import com.example.popjomemasjidi.utils.OnItemClickListener



class MorningZikrsAdapter(private val items:Array<MorningZikrsModel>, private val listener: OnItemClickListener): RecyclerView.Adapter<MorningZikrsAdapter.ItemHolder>() {

    class ItemHolder(view: View): RecyclerView.ViewHolder(view){
        val arabicDesc:TextView = view.findViewById(R.id.arabicDesc)
        val read:TextView = view.findViewById(R.id.read)
        val translate:TextView = view.findViewById(R.id.translate)
        val shareZikr: ImageView = view.findViewById(R.id.share_zikr)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.zikr_item,parent,false))
    }

    override fun getItemCount(): Int {
        return items.count()
    }


    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]

        holder.shareZikr.setOnClickListener{
            listener.onItemImageClickListener(items[position])
        }
        holder.arabicDesc.text = (item.arabic_desc)
        holder.read.text = item.reading_txt
        holder.translate.text = item.translation_txt
        holder.shareZikr.setImageResource(item.img_m)

    }

}