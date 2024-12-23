package com.example.fuel_calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


            val buttonNextPage = findViewById<Button>(R.id.button)
            buttonNextPage.setOnClickListener {
                // Iniciar a próxima Activity
                val intent = Intent(this, PricePage::class.java)
                startActivity(intent)
            }
    }
}