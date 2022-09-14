package com.example.chapter4.StudentActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter4.R
import kotlinx.android.synthetic.main.activity_detail_student.*

class DetailStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_student)

        var getdetail = intent.getSerializableExtra("detailnews") as DataStudent
        image.setImageResource(getdetail.img)
        judul.text = getdetail.judul
        penulis.text = getdetail.penulis
        detail.text = getdetail.detail
    }
}