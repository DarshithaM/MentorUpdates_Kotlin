package com.example.pro_intern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class profLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prof_login)
        Toast.makeText(applicationContext,"hi professor", Toast.LENGTH_SHORT).show()
    }
}