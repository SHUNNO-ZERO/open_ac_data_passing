package com.example.hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edit_profiel.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profile.*

class Edit_profiel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profiel)





      //made a function for edit profile button...
        edit_profile_save_button.setOnClickListener {

            edit_profile_button()

            //passing data another activity...



        }

        //made a back arrow sign
        supportActionBar?.setHomeButtonEnabled(true);
        supportActionBar?.setDisplayHomeAsUpEnabled(true);



    }

    //back button..........................
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId==android.R.id.home){

            this.finish()



        }


        return super.onOptionsItemSelected(item)
    }







    private fun edit_profile_button() {



       // val intent = Intent(this, Profile::class.java)

        //passing data another activity ....
        val userName = edit_profile_name_edittext_2.text.toString()
        val edit_profilenumber_age = edit_profile_number_age.text.toString()
        val edit_profilenumber_phone = edit_profile_editext_phone2.text.toString()

        val edit_profilenumber_weight = edit_profile_body_weight1.text.toString()



        Toast.makeText(this, userName, Toast.LENGTH_SHORT).show()


        val intent = Intent(this, Profile::class.java)
        intent.putExtra("user_name", userName)
        intent.putExtra("edit_profilenumber_age", edit_profilenumber_age)
        intent.putExtra("edit_profilenumber_phone", edit_profilenumber_phone)
        intent.putExtra("edit_profilenumber_weight", edit_profilenumber_weight)



        startActivity(intent)






        startActivity(intent)
    }








}