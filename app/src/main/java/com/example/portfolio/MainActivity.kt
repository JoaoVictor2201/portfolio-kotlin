package com.example.portfolio
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.portfolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnProjetos.setOnClickListener {
            val intent = Intent(this, Projetos::class.java)
            startActivity(intent)
        }

        binding.btnDesafio.setOnClickListener {
            val intent = Intent(this, Desafio::class.java)
            startActivity(intent)
        }

    }
}