package com.example.chapter4.databindingsimple

import android.content.Context
import android.content.Intent
import com.example.chapter4.MainActivity

class EventHandler (var context: Context) {
    fun onPindah(){
        context.startActivity(Intent(context, MainActivity::class.java))
    }
}