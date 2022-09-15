package com.example.chapter4.RVDataBinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4.databinding.ItemContactBinding

class ContactAdapter (var lisKontak : ArrayList<Contact>) : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    class ViewHolder(var binding: ItemContactBinding) :RecyclerView.ViewHolder(binding.root){
        fun bind(itemData : Contact) {
            binding.listContact = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemContactBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(lisKontak[position])
    }

    override fun getItemCount(): Int {
    return  lisKontak.size
    }

}