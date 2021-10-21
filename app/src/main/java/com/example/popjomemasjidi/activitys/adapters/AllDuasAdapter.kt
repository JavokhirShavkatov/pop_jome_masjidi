package com.example.popjomemasjidi.activitys.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.activitys.DuaDetailsActivity
import com.example.popjomemasjidi.activitys.models.AllDuasModel
import java.util.ArrayList

class AllDuasAdapter(courseModalArrayList: ArrayList<AllDuasModel>, context: Context): RecyclerView.Adapter<AllDuasAdapter.ViewHolder>() {
    private var courseModalArrayList: ArrayList<AllDuasModel>
    private val context: Context

    @SuppressLint("NotifyDataSetChanged")
    fun filterList(filterllist: ArrayList<AllDuasModel>) {

        courseModalArrayList = filterllist
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.dua_rv_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val modal: AllDuasModel = courseModalArrayList[position]
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context,DuaDetailsActivity::class.java)
            intent.putExtra("extra_data",modal)
            it.context.startActivity(intent)
        }
        holder.dua_id.text = modal.dua_id.toString()
        holder.dua_title.text = modal.dua_title
    }

    override fun getItemCount(): Int {
        return courseModalArrayList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dua_title: TextView = itemView.findViewById(R.id.dua_title)
        val dua_id: TextView = itemView.findViewById(R.id.number)
    }

    init {
        this.courseModalArrayList = courseModalArrayList
        this.context = context
    }
}
