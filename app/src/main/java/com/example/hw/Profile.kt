package com.example.hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_edit_profiel.*
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val name = intent.getStringExtra("user_name")
        val age = intent.getStringExtra("edit_profilenumber_age")
        val phone  = intent.getStringExtra("edit_profilenumber_phone")
        val weight  = intent.getStringExtra("edit_profilenumber_weight")



        textView6.text = name
        textView8.text = age
        textView.text = phone
        textView7.text=weight







        //made a back arrow sign
        supportActionBar?.setHomeButtonEnabled(true);
        supportActionBar?.setDisplayHomeAsUpEnabled(true);


    }

    //back arrow sign....................
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==android.R.id.home){

            this.finish()


        }


        return super.onOptionsItemSelected(item)
    }





}