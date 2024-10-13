package com.example.recyclerview_test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class contactlistadapter (

    private val listofcontacts:List<contactlist>
):RecyclerView.Adapter<contactlistadapter.listviewholder>(){


    class listviewholder(
        view:View
    ):RecyclerView.ViewHolder(view){
        val image:ImageView= view.findViewById(R.id.rv_image)
        val heading_text:TextView = view.findViewById(R.id.first_heading)
        val sub_heading_text:TextView=view.findViewById(R.id.sub_heading)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): listviewholder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item,parent,false)
        return listviewholder(view)
    }

    override fun getItemCount(): Int {
        return listofcontacts.size
    }

    override fun onBindViewHolder(holder: listviewholder, position: Int) {
        holder.image.setImageResource(listofcontacts[position].imageRes)
        holder.heading_text.text=listofcontacts[position].first_heading
        holder.sub_heading_text.text=listofcontacts[position].sub_heading

     }
}