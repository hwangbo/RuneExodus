package com.example.kei.runeexodussemi

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.content.DialogInterface
import android.view.ViewGroup
import android.support.v4.content.ContextCompat.getSystemService
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater




class Tutorial : AppCompatActivity() {
    var getItem : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)
    }
    fun change(v : View)
    {
        var button : ImageButton = findViewById(v.id)

        if(button.tag == "door")
        {
            if(getItem) {
                button.tag = "opened"
                button.alpha = 0F
            }
        }
        else if(button.tag == "opened")
        {
            val textIntent = Intent(this, Menu::class.java)
            textIntent.putExtra("txt", true)
            startActivity(textIntent)
        }
        else
        {
            button.tag = "1"
            button.alpha = 1F
        }
    }
    fun getItem(v : View)
    {
        var button : ImageButton = findViewById(v.id)
        getItem = true
        button.visibility = View.GONE
    }
    fun move(v : View)
    {
        var button : ImageButton = findViewById(v.id)

        if(button.tag == "setting")
        {
            val textIntent = Intent(this, Setting::class.java)
            textIntent.putExtra("txt", true)
            textIntent.putExtra("back","tutorial")
            startActivity(textIntent)
        }
    }
}
