package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val editText1 = findViewById<EditText>(R.id.editTextText21)
        val editText2 = findViewById<EditText>(R.id.editTextText22)
        val button1 = findViewById<Button>(R.id.button21)
        val textView1 = findViewById<TextView>(R.id.textView21)

        fun degree (view: View){
            val number1 = editText1.text.toString().toFloat()
            val number2 = editText2.text.toString().toFloat()
            val degree = number1.pow(number2)
            textView1.setText(degree.toString())

        }
    }
}