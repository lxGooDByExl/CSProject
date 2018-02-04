package com.example.csproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.EditText
import java.io.File

class WallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wall)
    }

    fun posttoWall(view: View){
        val string_post = findViewById<EditText>(R.id.editPost)
        //pass string_post to database include details of account [etUser, rbAccType]
        val intent = Intent(this, WallActivity::class.java)
        startActivity(intent)
    }
}
