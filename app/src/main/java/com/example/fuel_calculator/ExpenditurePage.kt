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

class ExpenditurePage : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.expenditure)

        val price = intent.getFloatExtra("PRECO",0f)

        val consumoEdt = findViewById<TextInputEditText>(R.id.textConsumo)

        val buttonExpenditure = findViewById<Button>(R.id.button3)
        buttonExpenditure.setOnClickListener {


            val consumoStr:String = consumoEdt.text.toString()

            if (consumoStr.isBlank()) {
                Snackbar.make(
                    consumoEdt,
                    "Preencha o campo corretamente",
                    Snackbar.LENGTH_LONG
                ).show()
                return@setOnClickListener
            }
            val consumo: Float
            try {
                consumo = consumoStr.toFloat()
            } catch (e: NumberFormatException) {
                Snackbar.make(
                    consumoEdt,
                    "Digite um número válido",
                    Snackbar.LENGTH_LONG
                ).show()
                return@setOnClickListener
            }

            println(consumo)

            val intent = Intent(this, DistancePage::class.java)
            intent.putExtra("CONSUMO",consumo)
            intent.putExtra("PRECO",price)
            startActivity(intent)


        }
    }
}