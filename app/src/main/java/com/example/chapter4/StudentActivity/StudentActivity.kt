package com.example.chapter4.StudentActivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4.R

class StudentActivity : AppCompatActivity() {

    lateinit var rvStudent: RecyclerView
    lateinit var  adapterStudent : StudentAdapter
    lateinit var  studentVm : StudentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        dataStudent()
        studentVm = ViewModelProvider(this).get(StudentViewModel::class.java)

        studentVm.getStudent()
        studentVm.studentList.observe(this, Observer {
            adapterStudent.setDataStudent(it as ArrayList<DataStudent>)
        })

    }

    fun dataStudent(){
        rvStudent = findViewById(R.id.rvStudent)
        adapterStudent = StudentAdapter(ArrayList())

        rvStudent.layoutManager =LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        rvStudent.adapter = adapterStudent

        adapterStudent.onClick= {
            var pindah = Intent(this, DetailStudentActivity::class.java)
            pindah.putExtra("detailnews", it)
            startActivity(pindah)
        }

    }
}