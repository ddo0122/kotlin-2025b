package com.appweek04

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CounterActivity: AppCompatActivity() {

    private var count = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        val textViewCount = findViewById<TextView>(R.id.textViewCount)
        val buttonMinus = findViewById<Button>(R.id.buttonMinus)
        val buttonPlus = findViewById<Button>(R.id.buttonPlus)
        val buttonInit = findViewById<Button>(R.id.buttonInit)

        buttonMinus.setOnClickListener {
            count--
            textViewCount.text = count.toString()
            Log.d("KotlinWeek05App", "{$count}")
        }

        buttonPlus.setOnClickListener {
            count++
            textViewCount.text = count.toString()
            Log.d("KotlinWeek05App", "{$count}")
        }

        buttonInit.setOnClickListener {
            count = 0
            textViewCount.text = count.toString()
            Log.d("KotlinWeek05App", "{$count}")
        }
    }
}