package com.example.chapter4.StudentActivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4.R

class StudentAdapter (var listStudent : ArrayList<DataStudent>) :RecyclerView.Adapter<StudentAdapter.ViewHolder>(){

    var onClick : ((DataStudent) -> Unit) ? = null

    class ViewHolder (itemview: View):RecyclerView.ViewHolder(itemview){
        var judul = itemview.findViewById<TextView>(R.id.judul)
        var pembuat = itemview.findViewById<TextView>(R.id.pembuat)
        var tanggal = itemview.findViewById<TextView>(R.id.tanggal)
        var image = itemview.findViewById<ImageView>(R.id.studentimage)
        var card = itemview.findViewById<CardView>(R.id.card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_student,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.judul.text = listStudent[position].judul
        holder.pembuat.text = listStudent[position].penulis
        holder.tanggal.text = listStudent[position].tanggal
        holder.image.setImageResource(listStudent[position].img)
        holder.card.setOnClickListener{
            onClick?.invoke(listStudent[position])
        }
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }

    fun setDataStudent (studentList : ArrayList<DataStudent>){
        this.listStudent = studentList
    }

}