package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.portfolio.databinding.ActivityDesafioBinding

class Desafio: AppCompatActivity() {

    private lateinit var binding: ActivityDesafioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesafioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarDesafio.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}