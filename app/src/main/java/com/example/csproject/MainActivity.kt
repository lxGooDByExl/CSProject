package com.example.csproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.media.Image
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.io.File
import java.sql.Array

val EXTRA_MESSAGE = "com.example.csproject.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val PisayLogo = findViewById<ImageView>(R.id.PisayLogo)
        val etUser = findViewById<EditText>(R.id.etUser)
        val etPass = findViewById<EditText>(R.id.etPass)
        val LoginButton = findViewById<Button>(R.id.LoginButton)
        val divide = findViewById<ImageView>(R.id.divide)
        val Register = findViewById<TextView>(R.id.Register)
        val Forgot_Pass = findViewById<TextView>(R.id.Forgot_Pass)
        val tvAbout = findViewById<TextView>(R.id.tvAbout)
    }

    fun check_account(view: View){
        //checks database for username and pass
    }

    fun LoginMethod(view: View){
        val logIntent = Intent(this, WallActivity::class.java)
        startActivity(logIntent)
    }

    fun RegisterMethod(view: View){
        val regIntent = Intent(this, RegisterActivity::class.java)
        startActivity(regIntent)
    }

    fun AboutUsMethod(view: View){
        val AUsIntent = Intent(this, AboutUsActivity::class.java)
        startActivity(AUsIntent)
    }
}
