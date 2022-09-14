package com.example.chapter4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import kotlinx.android.synthetic.main.activity_using_view_model.*

class UsingViewModelActivity : AppCompatActivity(){

    lateinit var etPanjang : EditText
    lateinit var etLebar : EditText
    lateinit var etTinggi : EditText
    lateinit var btnHitung : Button
    lateinit var etHasil : TextView
    lateinit var viewModel : ViewModelExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_using_view_model)

        etPanjang = findViewById(R.id.panjang)
        etLebar = findViewById(R.id.lebar)
        etTinggi = findViewById(R.id.tinggi)
        btnHitung = findViewById(R.id.submit)
        etHasil = findViewById(R.id.hasilnya)

        viewModel = ViewModelProvider(this).get(ViewModelExample::class.java)
        etHasil.text = viewModel.hasil.toString()

        submit.setOnClickListener {
            var p1 = panjang.text.toString().toInt()
            var l1 = lebar.text.toString().toInt()
            var t1 = tinggi.text.toString().toInt()

            viewModel.count(p1,l1,t1)

            etHasil.text = viewModel.hasil.toString()
        }

    }

}