package com.example.randomgenerator

import android.app.Application
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val generateButton:Button = findViewById(R.id.generate_button)
        var diceImage: ImageView =findViewById(R.id.dice_image)

        
        fun rollDice(){
            Toast.makeText(this,"Generated Number",Toast.LENGTH_SHORT).show()


            var generatedNumber:Int = (Random.nextInt(6)+1)


            val drawableResource = when (generatedNumber) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            diceImage.setImageResource(drawableResource)


        }
        generateButton.setOnClickListener {rollDice() }
    }


}

