package com.example.activity_nav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val inputName = findViewById<EditText>(R.id.editText)
        val btn = findViewById<Button>(R.id.editButton)

        btn.setOnClickListener {
            val int =  Intent()
            int.putExtra("ACT_RES", inputName.text.toString())
            setResult(RESULT_OK, int)
            finish()
        }
    }
}