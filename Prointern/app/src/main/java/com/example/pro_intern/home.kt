package com.example.pro_intern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pro_intern.databinding.ActivityHomeBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class home : AppCompatActivity() {

    private lateinit var b: ActivityHomeBinding
    private lateinit var db: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(b.root)
        b.sub.setOnClickListener{
            val un:String = b.name.text.toString()
            val pa:String = b.pass.text.toString()
            if(un.isNotEmpty()){
                if(pa.isNotEmpty()){
                    verify(un,pa)
                }else{
                    Toast.makeText(applicationContext, "enter your password",Toast.LENGTH_SHORT).show()
                }


            }else{
                Toast.makeText(applicationContext, "enter your name",Toast.LENGTH_SHORT).show()
            }

        }


    }

    private fun verify(un: String, pa: String) {
        db=FirebaseDatabase.getInstance().getReference("users")
        db.child(un).get().addOnSuccessListener {
            if(it.exists()){
                val user=it.child("name").value
                val passw=it.child("password").value
                val role=it.child("role").value
                if(user==un && passw==pa){
                    Toast.makeText(applicationContext,"successfully logged in",Toast.LENGTH_SHORT).show()
                    if(role=="student"){
                        val intent=Intent(this,studLogin::class.java)
                        intent.putExtra("n",un)
                        startActivity(intent)
                    }else if(role=="professor"){
                        val intent= Intent(this,profLogin::class.java)
                        intent.putExtra("name",un)
                        startActivity(intent)
                    }else{
                        val intent= Intent(this,manLogin::class.java)
                        intent.putExtra("name",un)
                        startActivity(intent)
                    }

                }else{
                    Toast.makeText(applicationContext,"password does not match",Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(applicationContext,"the username does not exist",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener{
            Toast.makeText(applicationContext,"failed!!",Toast.LENGTH_SHORT).show()
        }

    }


}


