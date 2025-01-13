package com.example.fuel_calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val price = intent.getFloatExtra("PRECO",0f)
        val consumo = intent.getFloatExtra("CONSUMO",0f)
        val distancia = intent.getFloatExtra("COMBUSTIVEL",0f)
        val Tpreco = intent.getFloatExtra("Tpreco",0f)

        val Tprecotxt = findViewById<TextView>(R.id.textViewResult)
        val Tconsumotxt = findViewById<TextView>(R.id.txtconsumo)
        val Tdistanciatxt = findViewById<TextView>(R.id.txtdistancia)
        val Tpricetxt = findViewById<TextView>(R.id.txtpreco)

        Tprecotxt.text = Tpreco.toString()
        Tconsumotxt.text = consumo.toString()
        Tdistanciatxt.text = distancia.toString()
        Tpricetxt.text = price.toString()


        val buttonExpenditure = findViewById<Button>(R.id.button4)
        buttonExpenditure.setOnClickListener {

            val intent = Intent(this, PricePage::class.java)
            startActivity(intent)


        }
    }
}