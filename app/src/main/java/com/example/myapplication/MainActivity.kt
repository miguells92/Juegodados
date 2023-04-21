package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button2.setOnClickListener() {

            val numeroDadosText = binding.dados.text.toString()
            val numeroCarasText = binding.caras.text.toString()

            val numeroDados = numeroDadosText.toIntOrNull()
            val numeroCaras = numeroCarasText.toIntOrNull()

            if (numeroDados != null && numeroCaras != null) {
                val tiradas: ArrayList<Int> = ArrayList()
                val random = Random
                var numeroAleatorio = 0
                var sumaTotal = 0

                for (i in 0 until numeroDados) {
                    numeroAleatorio = random.nextInt(1, numeroCaras + 1)
                    tiradas.add(numeroAleatorio)
                    sumaTotal += numeroAleatorio

                }
                binding.resultadosTiradas.text = tiradas.joinToString(", ")
                binding.totalTiradas.text = "Total: " +  sumaTotal.toString()


            } else {
                binding.resultadosTiradas.text = "Los campos no pueden estar vacios"
            }

            this.currentFocus?.let { view ->
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
                imm?.hideSoftInputFromWindow(view.windowToken, 0)
            }

        }

    }
}

