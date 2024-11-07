package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.edit_text)
        val textView = findViewById<TextView>(R.id.text_view)

        editText.setOnEditorActionListener { _, _, _ ->
            val input = editText.text.toString()
            if (input.equals("d", ignoreCase = true)) {
                textView.text = "Это дуб!"
            } else {
                textView.text = "Это не дуб!"
            }
            true
        }
    }
}