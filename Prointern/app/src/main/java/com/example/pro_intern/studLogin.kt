package com.example.pro_intern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class studLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stud_login)
        Toast.makeText(applicationContext,"hi students", Toast.LENGTH_SHORT).show()
    }
}