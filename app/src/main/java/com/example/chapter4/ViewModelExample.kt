package com.example.chapter4

import androidx.lifecycle.ViewModel

class ViewModelExample : ViewModel() {

    var hasil = 0

    fun count (panjang : Int, lebar : Int, tinggi : Int){
        hasil = panjang * lebar * tinggi
    }

}