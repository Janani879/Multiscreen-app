package com.example.multiscreenapp13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    companion object{
        const val KEY=" com.example.multiscreenapp13"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      val btnorder=findViewById<Button>(R.id.btnorder)
        val et1=findViewById<EditText>(R.id.eT1)
        val et2=findViewById<EditText>(R.id.et2)
        val et3=findViewById<EditText>(R.id.et3)
        val et4=findViewById<EditText>(R.id.et4)
        btnorder.setOnClickListener{
         val orderrecieved=et1.text.toString()+" "+et2.text.toString()+" "+et3.text.toString()+" "+et4.text.toString()
            intent= Intent(this,Order::class.java)
            intent.putExtra(KEY,orderrecieved)
            startActivity(intent)

        }
    }
}