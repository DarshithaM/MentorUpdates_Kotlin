package com.example.pro_intern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class addU : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_u)
        val role = arrayOf<String?>("student","mentor","other")


        val spinner = findViewById<Spinner>(R.id.sp)
        val bu=findViewById<Button>(R.id.addu)

        if (spinner != null) {

            val arrayAdapter: ArrayAdapter<*> = ArrayAdapter<Any?>(this, android.R.layout.simple_spinner_item, role)

            spinner.adapter = arrayAdapter

            spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>?, view: View, position: Int, id: Long) {
                    val selectedItem=role[position].toString()
                    bu.setOnClickListener{
                        if(selectedItem=="student"){
                            val addStd= Intent(this@addU,addStd::class.java)
                            addStd.putExtra("role",selectedItem)
                            startActivity(addStd)
                        }else if(selectedItem=="mentor"){
                            val addMen= Intent(this@addU,addMen::class.java)
                            addMen.putExtra("role",selectedItem)
                            startActivity(addMen)
                        }else{
                            val addNew= Intent(this@addU,addNew::class.java)
                            addNew.putExtra("role",selectedItem)
                            startActivity(addNew)
                        }
                    }


                }

                override fun onNothingSelected(parent: AdapterView<*>?) {}
            }
        }
    }
}