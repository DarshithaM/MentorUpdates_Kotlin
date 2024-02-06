package com.example.pro_intern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pro_intern.databinding.ActivityManLoginBinding

class manLogin : AppCompatActivity() {
    private lateinit var b: ActivityManLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b=ActivityManLoginBinding.inflate(layoutInflater)
        setContentView(b.root)
        val bun:Bundle?=intent.extras
        var user=bun!!.get("name")
        b.welNote.text="USER : $user"
        b.addUsers.setOnClickListener{
            val intent= Intent(this,addU::class.java)
            startActivity(intent)
        }

    }
}