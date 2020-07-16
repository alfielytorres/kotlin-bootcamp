package com.alfietorres.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.alfietorres.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val myName: MyName = MyName("Aleks Haecky")

    data class MyName(var name: String = "", var nickname: String = "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.myName = myName

        binding.doneButton.setOnClickListener { showNickName(it) }

    }

    fun showNickName(view:View){

        binding.apply {
            textView2.text=binding.nicknameText.text
            nicknameText.visibility=View.GONE
            textView2.visibility= View.VISIBLE
        }
        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }




}
