package com.itacademy.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        button = findViewById(R.id.btn)
        textView = findViewById(R.id.text)

        val text = intent.getStringExtra("RESULT")
        textView.text = text.toString()



        button.setOnClickListener {
            onBackPressed()
        }
    }
}