package com.example.pro_intern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class addStd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_std)
        val b:Bundle?=intent.extras
        var role=b!!.get("role")
        Toast.makeText(applicationContext,"$role",Toast.LENGTH_SHORT).show()
    }
}