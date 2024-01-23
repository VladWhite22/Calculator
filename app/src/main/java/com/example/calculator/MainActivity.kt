package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText1 = findViewById<EditText>(R.id.editTextText1)
        val editText2 = findViewById<EditText>(R.id.editTextText2)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val textView = findViewById<TextView>(R.id.textView1)

        val button5 = findViewById<Button>(R.id.button5)


        button1.setOnClickListener {
            val number1 = editText1.text.toString().toFloat()
            val number2 = editText2.text.toString().toFloat()

            val summ = number1 + number2
            textView.setText(summ.toString())
        }
        button2.setOnClickListener {
            val number1 = editText1.text.toString().toFloat()
            val number2 = editText2.text.toString().toFloat()

            val minus = number1 - number2
            textView.setText(minus.toString())
        }
        button3.setOnClickListener {
            val number1 = editText1.text.toString().toFloat()
            val number2 = editText2.text.toString().toFloat()

            val multiplication = number1 * number2
            textView.setText(multiplication.toString())
        }
        button4.setOnClickListener {
            val number1 = editText1.text.toString().toFloat()
            val number2 = editText2.text.toString().toFloat()

            val division = number1 / number2
            textView.setText(division.toString())

        }

    }
}