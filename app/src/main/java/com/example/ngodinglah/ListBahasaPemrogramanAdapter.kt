package com.example.ngodinglah

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.button.MaterialButton

class ListBahasaPemrogramanAdapter(val listBahasaPemrograman: ArrayList<BahasaPemrograman>) : RecyclerView.Adapter<ListBahasaPemrogramanAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_bahasa_pemrograman, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val bahasaPemrograman = listBahasaPemrograman[position]

        Glide.with(holder.itemView.context)
            .load(bahasaPemrograman.logo)
            .into(holder.ivLogo)

        holder.tvNama.text = bahasaPemrograman.nama
        holder.tvDeskripsi.text = bahasaPemrograman.deskripsi

        holder.mbDetail.setOnClickListener {
            onItemClickCallback.onItemClicked(listBahasaPemrograman[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listBahasaPemrograman.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_bahasa_pemrograman)
        var tvDeskripsi: TextView = itemView.findViewById(R.id.tv_deskripsi)
        var ivLogo: ImageView = itemView.findViewById(R.id.iv_logo)
        var mbDetail: MaterialButton = itemView.findViewById(R.id.mb_detail)
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: BahasaPemrograman)
    }
}