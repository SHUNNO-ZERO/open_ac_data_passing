package com.example.hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_edit_profiel.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Login_button.setOnClickListener {

            Login_button()
        }


}

    private fun Login_button() {


        val intent = Intent(this,Edit_profiel::class.java)




        startActivity(intent)
    }














}