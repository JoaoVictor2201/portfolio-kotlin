package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.portfolio.databinding.ActivityProjetosBinding

class Projetos: AppCompatActivity() {

    private lateinit var binding: ActivityProjetosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjetosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarProjetos.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

}