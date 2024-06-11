// MainActivity.kt
package com.eemi.calc

import Calculatrice
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var calculatrice: Calculatrice

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculatrice = Calculatrice()

        val numberA: EditText = findViewById(R.id.numberA)
        val numberB: EditText = findViewById(R.id.numberB)
        val numberC: EditText = findViewById(R.id.numberC)
        val btnAddition: Button = findViewById(R.id.btnAddition)
        val btnSoustraction: Button = findViewById(R.id.btnSoustraction)
        val btnDivision: Button = findViewById(R.id.btnDivision)
        val textViewResult: TextView = findViewById(R.id.textViewResult)

        btnAddition.setOnClickListener {
            val a = numberA.text.toString().toDoubleOrNull()
            val b = numberB.text.toString().toDoubleOrNull()
            val c = numberC.text.toString().toDoubleOrNull()

            if (a != null && b != null && c != null) {
                val result = calculatrice.addition(a, b, c)
                textViewResult.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        btnSoustraction.setOnClickListener {
            val a = numberA.text.toString().toDoubleOrNull()
            val b = numberB.text.toString().toDoubleOrNull()
            val c = numberC.text.toString().toDoubleOrNull()

            if (a != null && b != null && c != null) {
                val result = calculatrice.soustraction(a, b, c)
                textViewResult.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        btnDivision.setOnClickListener {
            val a = numberA.text.toString().toDoubleOrNull()
            val b = numberB.text.toString().toDoubleOrNull()
            val c = numberC.text.toString().toDoubleOrNull()

            if (a != null && b != null && c != null) {
                try {
                    val result = calculatrice.division(a, b, c)
                    textViewResult.text = "Result: $result"
                } catch (e: IllegalArgumentException) {
                    Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
