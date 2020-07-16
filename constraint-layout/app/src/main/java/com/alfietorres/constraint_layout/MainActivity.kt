package com.alfietorres.constraint_layout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickListeners()
    }

    private fun clickListeners(){
         var views: List<View> = listOf(
             box_one_text,
             box_two_text,
             box_three_text,
             box_four_text,
             box_five_text,
             one_button,
             two_button,
             three_button) // this is the views we are looking at

        for(view in views){
            view.setOnClickListener(){makeColored(it)}
        }
    }

    fun makeColored(view: View){
        when(view.id){ //gets the id of the view
            R.id.box_one_text -> view.setBackgroundColor(Color.RED)
            R.id.box_two_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_three_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_four_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_five_text -> view.setBackgroundColor(Color.GREEN)
            R.id.one_button -> box_one_text.setBackgroundResource(R.color.colorAccent)
            R.id.two_button -> box_one_text.setBackgroundResource(R.color.colorPrimary)
            R.id.three_button -> box_one_text.setBackgroundResource(R.color.colorPrimaryDark)
            else -> view.setBackgroundColor(Color.MAGENTA)
        }
    }
}
