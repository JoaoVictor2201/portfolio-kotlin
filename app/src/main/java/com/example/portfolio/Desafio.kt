package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.portfolio.databinding.ActivityDesafioBinding

class Desafio: AppCompatActivity() {

    private lateinit var binding: ActivityDesafioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesafioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun fumando(cigas: Int, quantosAnos: Int): Int {
            val totalCigas = cigas * (quantosAnos * 365)
            val vidaPerdidaMinutos = totalCigas * 10
            val vidaPerdidaDias = vidaPerdidaMinutos / 1440

            return vidaPerdidaDias
        }

        val campoCigas = binding.campoCigas
        val campoTempo = binding.campoTempo
        val botao = binding.btnCalcular

        binding.toolbarDesafio.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnCalcular.setOnClickListener {
            val textoCigas = campoCigas.text.toString()
            val textoTempo = campoTempo.text.toString()

            if (textoCigas.isEmpty() || textoTempo.isEmpty()) {
                Toast.makeText(this, "Preencha os campos!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val cigasInt = textoCigas.toInt()
            val tempoInt = textoTempo.toInt()

            val vidaPerdida = fumando(cigasInt, tempoInt)

            binding.resultadoFumante.text = "Uma pessoa fumando $cigasInt cigarros por dia por $tempoInt anos perdeu $vidaPerdida dias de vida"
        }
    }

}