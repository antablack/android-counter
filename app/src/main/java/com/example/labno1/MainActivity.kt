package com.example.labno1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonToast = findViewById<Button>(R.id.button_toast)
        val showCountTextView = findViewById<TextView>(R.id.show_count)
        val buttonCount = findViewById<Button>(R.id.button_count)

        buttonCount.setOnClickListener {
            val counter: Int = (showCountTextView.text.toString()).toInt()
            showCountTextView.text = (counter + 1).toString()
        }

        buttonToast.setOnClickListener {
            val toast: Toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT)
            toast.show()
        }

    }
}