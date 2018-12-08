package com.example.kei.runeexodussemi

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageButton

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun move(v: View) {
        var button: ImageButton = findViewById(v.id)

        if (button.tag == "tutorial") {
            val textIntent = Intent(this, Tutorial::class.java)
            textIntent.putExtra("txt", true)
            startActivity(textIntent)
        } else if (button.tag == "setting") {
            val textIntent = Intent(this, Setting::class.java)
            textIntent.putExtra("txt", true)
            textIntent.putExtra("back", "menu")
            startActivity(textIntent)
        }
    }
}