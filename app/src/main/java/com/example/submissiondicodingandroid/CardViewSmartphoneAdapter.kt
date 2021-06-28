package com.example.submissiondicodingandroid

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewSmartphoneAdapter(private val listSmartphone: ArrayList<Smartphone>) :
    RecyclerView.Adapter<CardViewSmartphoneAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cardview_smartphone, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSmartphone.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val smartphone = listSmartphone[position]

        Glide.with(holder.itemView.context).load(smartphone.photo)
            .apply(RequestOptions().override(350, 550)).into(holder.imgPhoto)

        holder.tvName.text = smartphone.name
        holder.tvPrice.text = smartphone.price

        holder.btnBuy.setOnClickListener {Toast.makeText(holder.itemView.context, "Thank you for buying " + listSmartphone[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()}

        val mContext = holder.itemView.context
        holder.btnSpec.setOnClickListener {
            val moveDetail = Intent(mContext, DetailActivity::class.java)
            moveDetail.putExtra(DetailActivity.EXTRA_NAME, smartphone.name)
            moveDetail.putExtra(DetailActivity.EXTRA_PHOTO, smartphone.photo)
            moveDetail.putExtra(DetailActivity.EXTRA_PRICE, smartphone.price)
            moveDetail.putExtra(DetailActivity.EXTRA_SPEC, smartphone.specDetail)
            mContext.startActivity(moveDetail)
        }
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_item_price)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var btnBuy: Button = itemView.findViewById(R.id.btn_set_buy)
        var btnSpec: Button = itemView.findViewById(R.id.btn_set_spec_detail)
    }
}