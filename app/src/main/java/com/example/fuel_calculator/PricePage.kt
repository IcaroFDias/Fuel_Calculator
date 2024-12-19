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

class PricePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.prince)

        val precoedt = findViewById<TextInputEditText>(R.id.textPreco)

        val buttonExpenditure = findViewById<Button>(R.id.button2)
            buttonExpenditure.setOnClickListener {

                val precoStr:String = precoedt.text.toString()

                if (precoStr.isBlank()) {
                    Snackbar.make(
                        precoedt,
                        "Preencha o campo corretamente",
                        Snackbar.LENGTH_LONG
                    ).show()
                    return@setOnClickListener
                }
                val preco: Float
                try {
                    preco = precoStr.toFloat()
                } catch (e: NumberFormatException) {
                    Snackbar.make(
                        precoedt,
                        "Digite um número válido",
                        Snackbar.LENGTH_LONG
                    ).show()
                    return@setOnClickListener
                }

                println(preco)

                val intent = Intent(this, ExpenditurePage::class.java)
                intent.putExtra("PRECO",preco)
                startActivity(intent)

        }

    }
}