package com.example.kei.runeexodussemi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class Title : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title)
    }

    fun move(v: View)
    {
        var button : ImageButton = findViewById(v.id)

        if(button.tag == "exit")
        {
            finish()
        }
        else if(button.tag == "start")
        {
            val textIntent = Intent(this, Menu::class.java)
            textIntent.putExtra("txt",true)
            startActivity(textIntent)
        }
        else if(button.tag == "setting")
        {
            val textIntent = Intent(this, Setting::class.java)
            textIntent.putExtra("txt",true)
            textIntent.putExtra("back","title")
            startActivity(textIntent)
        }
    }
}