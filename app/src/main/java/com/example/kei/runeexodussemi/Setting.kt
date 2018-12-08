package com.example.kei.runeexodussemi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.media.AudioManager
import android.view.View
import android.widget.ImageButton


class Setting : AppCompatActivity() {
    private val back by lazy { intent.extras["back"] as String }
    var ok : Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
    }
    fun sound(v: View)
    {
        val audioManager: AudioManager = getSystemService(AUDIO_SERVICE) as AudioManager
        val button :ImageButton = findViewById(v.id)

        if (ok == true){
            audioManager.setMediaVolume(0)
            ok = false
            button.alpha = 1F
        }
        else{
            audioManager.setMediaVolume(7)
            ok = true
            button.alpha = 0F
        }
    }
    fun move(v : View)
    {
        val button : ImageButton = findViewById(v.id)
        if(button.tag == "back")
        {
            if(back == "title") {
                val textIntent = Intent(this, Title::class.java)
                textIntent.putExtra("txt", true)
                startActivity(textIntent)
            }
            else if(back == "menu"){
                val textIntent = Intent(this, Menu::class.java)
                textIntent.putExtra("txt", true)
                startActivity(textIntent)
            }
            else if(back == "tutorial"){
                val textIntent = Intent(this, Tutorial::class.java)
                textIntent.putExtra("txt", true)
                startActivity(textIntent)
            }
        }
    }
}


// Extension function to change media volume programmatically
fun AudioManager.setMediaVolume(volumeIndex:Int) {
    // Set media volume level
    this.setStreamVolume(
        AudioManager.STREAM_MUSIC, // Stream type
        volumeIndex, // Volume index
        AudioManager.FLAG_SHOW_UI// Flags
    )
}


// Extension property to get media/music current volume index
val AudioManager.mediaCurrentVolume:Int
    get() = this.getStreamVolume(AudioManager.STREAM_MUSIC)