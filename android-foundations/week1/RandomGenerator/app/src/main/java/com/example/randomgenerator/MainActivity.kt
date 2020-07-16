package com.example.randomgenerator

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val number: TextView =findViewById(R.id.number_textView)
        val generateButton:Button = findViewById(R.id.generate_button)

        fun rollDice(){
            Toast.makeText(this,"Generated Number",Toast.LENGTH_SHORT).show()
            number.text= (Random.nextInt(12)+1).toString()
        }
        generateButton.setOnClickListener {rollDice() }
    }


}

