package com.example.multiscreenapp13

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Order : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        val orderofcus = intent.getStringExtra(MainActivity.KEY)

        val ord1=findViewById<TextView>(R.id.ord)
        ord1.text=orderofcus.toString()


    }
}
