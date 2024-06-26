package com.projetosrafaelfemina.bancomr

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.projetosrafaelfemina.bancomr.databinding.ActivityTransferenciasBinding

private lateinit var binding: ActivityTransferenciasBinding

class Transferencias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTransferenciasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportActionBar!!.hide()
        val toolbar = binding.toolbarTransferencias
        toolbar.title = "Transferencias"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(200, 0, 200, 0)
        toolbar.setBackgroundColor(getColor(R.color.blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}