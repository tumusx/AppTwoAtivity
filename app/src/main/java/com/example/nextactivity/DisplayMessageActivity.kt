package com.example.nextactivity

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import org.w3c.dom.Text

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val callButton = intent.getIntExtra(EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.result).apply {
            text = callButton.toString()
        }
    }

 }

private fun Intent.getIntExtra(extraMessage: String) {

}


