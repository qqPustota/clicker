package com.example.clicker

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        val btnClick = findViewById<Button>(R.id.btnClick)

        btnClick.setOnClickListener {
            count++
            tvCounter.text = count.toString()
        }
    }
}