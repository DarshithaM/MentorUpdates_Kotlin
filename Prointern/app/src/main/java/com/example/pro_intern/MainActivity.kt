package com.example.pro_intern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        android.os.Handler().postDelayed({
            val intent= Intent(this,home::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}