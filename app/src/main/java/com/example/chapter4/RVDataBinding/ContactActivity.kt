package com.example.chapter4.RVDataBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter4.R
import com.example.chapter4.databinding.ActivityContactBinding


class ContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_contact)

        val listkontak = arrayListOf(
            Contact("Eliezer", "82"),
            Contact("pepuho", "83")
        )

        binding.rvContact.adapter = ContactAdapter(listkontak)
        binding.rvContact.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}