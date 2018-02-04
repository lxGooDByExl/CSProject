package com.example.csproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import java.io.PrintWriter

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etUser = findViewById<EditText>(R.id.etUser)
        val etFirstName = findViewById<EditText>(R.id.etFirstName)
        val etLastName = findViewById<EditText>(R.id.etLastName)
        val etPass = findViewById<EditText>(R.id.etPass)
        val etEMail = findViewById<EditText>(R.id.etEMail)
        val button = findViewById<Button>(R.id.RegSubmit)
        val rbAccType = findViewById<RadioButton>(R.id.rbAccStudent or R.id.rbAccTeacher)
        val gender = findViewById<RadioButton>(R.id.rbGenMale or R.id.rbGenFem)
    }
    fun create_account(view: View){
        //saves into database the information
    }
}
