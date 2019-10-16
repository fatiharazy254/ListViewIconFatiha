package com.example.listviewiconfatiha.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.widget.DecorContentParent
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewiconfatiha.R
import com.example.listviewiconfatiha.model.Bhspemrograman
import com.example.listviewiconfatiha.model.DataBhspemrograman.listBhspemrograman
import kotlinx.android.synthetic.main.item_bhspemrograman.view.*
import java.text.FieldPosition

class ListBhspemrogramanAdapter (private val context: Context, private val bhspemrograman: ArrayList<Bhspemrograman>, private val listener: (Bhspemrograman) -> Unit)
    : RecyclerView.Adapter<ListBhspemrogramanAdapter.ViewHolder>(){


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListBhspemrogramanAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_bhspemrograman, parent, false))

    }

    override fun getItemCount(): Int {
        return listBhspemrograman.size
    }

    override fun onBindViewHolder(holder: ListBhspemrogramanAdapter.ViewHolder, position: Int) {
        holder.bindBhspemrograman(bhspemrograman[position], listener)

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvName: TextView = view.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = view.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = view.findViewById(R.id.img_item_poster)

        fun bindBhspemrograman(bhspemrograman: Bhspemrograman, listener: (Bhspemrograman) -> Unit){
            tvName.text = bhspemrograman.name
            tvDetail.text = bhspemrograman.detail
            Glide.with(itemView.context)
                .load(bhspemrograman.poster)
                .into(imgPoster)

            
        }
    }
}