package com.example.fuel_calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class DistancePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.distance_page)

        val consumo = intent.getFloatExtra("CONSUMO",0f)

        val preco = intent.getFloatExtra("PRECO",0f)

        val distanciaEdt = findViewById<TextInputEditText>(R.id.textCombustivel)


        val buttonExpenditure = findViewById<Button>(R.id.button3)
        buttonExpenditure.setOnClickListener {

            val distanciaStr:String = distanciaEdt.text.toString()

            if (distanciaStr.isBlank()) {
                Snackbar.make(
                    distanciaEdt,
                    "Preencha o campo corretamente",
                    Snackbar.LENGTH_LONG
                ).show()
                return@setOnClickListener
            }
            val distancia: Float
            try {
                distancia = distanciaStr.toFloat()
            } catch (e: NumberFormatException) {
                Snackbar.make(
                    distanciaEdt,
                    "Digite um número válido",
                    Snackbar.LENGTH_LONG
                ).show()
                return@setOnClickListener
            }

            val Lnecessario = distancia/consumo
            val Tpreco = Lnecessario * preco

            println(Tpreco)

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("COMBUSTIVEL",distancia)
            startActivity(intent)


        }
    }
}