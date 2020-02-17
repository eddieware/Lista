package com.example.lista

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AdapterAlbum(var list: ArrayList<Album>): RecyclerView.Adapter<AdapterAlbum.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent?.context).inflate(R.layout.content_item,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
      return list.size
    }

    override fun onBindViewHolder(holder: AdapterAlbum.ViewHolder, position: Int) {
        holder.bindItems(list[position])

    }


    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        fun bindItems(data:Album){
            val title:TextView=itemView.findViewById(R.id.txtTitle)
            val count:TextView=itemView.findViewById(R.id.txtCount)
            val thumbnail:TextView=itemView.findViewById(R.id.thumbnail)

            title.text=data.name
            count.text=data.numOfSongs.toString()

            Glide.with(itemView.context).load(data.thumbnail).into(thumbnail)

            itemView.setOnClickListener{
                Toast.makeText(itemView.context,"Albumde ${data.name}",Toast.LENGTH_LONG).show()
            }

        }
    }
}