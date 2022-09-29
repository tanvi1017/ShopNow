package com.tanvi.shopnow

import android.graphics.ColorSpace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemListAdapter(val itemDataList:List<ItemData>) : RecyclerView.Adapter<ItemListAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.ivImage)
        val tvTitle: TextView= itemView.findViewById(R.id.tvTitle)
        val tvPrice: TextView= itemView.findViewById(R.id.tvPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row, parent, false)

        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val data = itemDataList[position]
        holder.imageView.setImageResource(data.image)
        holder.tvTitle.text = data.title
        holder.tvPrice.text = data.price

    }

    override fun getItemCount(): Int {
        return itemDataList.size
    }


}
