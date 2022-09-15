package com.example.chapter4.databindingsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.chapter4.R
import com.example.chapter4.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    lateinit var binding : ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_user)

//        binding.firstname.text = "danial"
//        binding.lastname.text = "farros"
        binding.user = User("danial","farros")
        binding.handler = EventHandler(this)
    }
}