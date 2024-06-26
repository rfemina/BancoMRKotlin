package com.projetosrafaelfemina.bancomr

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.projetosrafaelfemina.bancomr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.imgSaldo.setOnClickListener {
            val intent = Intent(this,Saldo::class.java)
            startActivity(intent)
        }
        binding.imgFatura.setOnClickListener {
            val intent = Intent(this,Fatura::class.java)
            startActivity(intent)
        }
        binding.imgTransferencias.setOnClickListener {
            val intent = Intent(this,Transferencias::class.java)
            startActivity(intent)
        }
        binding.imgPoupanca.setOnClickListener {
            val intent = Intent(this,Poupanca::class.java)
            startActivity(intent)
        }

    }
}