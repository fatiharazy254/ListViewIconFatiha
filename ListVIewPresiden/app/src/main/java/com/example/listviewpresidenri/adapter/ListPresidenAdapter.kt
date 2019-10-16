package com.example.listviewpresidenri.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewpresidenri.R
import com.example.listviewpresidenri.model.DataPresiden.listPresiden
import com.example.listviewpresidenri.model.Presiden
import org.w3c.dom.Text

class ListPresidenAdapter (
    private val context: Context, private val presiden: ArrayList<Presiden>, private val listener: (Presiden) -> Unit)
    : RecyclerView.Adapter<ListPresidenAdapter.ViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListPresidenAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.daftar_presiden, parent, false))
    }

    override fun getItemCount(): Int {
        return listPresiden.size
    }

    override fun onBindViewHolder(holder: ListPresidenAdapter.ViewHolder, position: Int) {
        holder.bindPresiden(presiden[position], listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvName: TextView = view.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = view.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = view.findViewById(R.id.img_item_poster)

        fun bindPresiden(presiden: Presiden, listener: (Presiden) -> Unit){
            tvName.text = presiden.name
            Glide.with(itemView.context)
                .load(presiden.poster)
                .into(imgPoster)

            itemView.setOnClickListener{
                listener(presiden)
            }
        }
    }
}
