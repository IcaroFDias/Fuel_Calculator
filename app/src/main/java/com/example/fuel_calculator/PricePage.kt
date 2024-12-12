package com.example.fuel_calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PricePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.prince)

        val buttonExpenditure = findViewById<Button>(R.id.button2)
            buttonExpenditure.setOnClickListener {

                val intent2 = Intent(this, ExpenditurePage::class.java)
                startActivity(intent2)

        }

    }
}