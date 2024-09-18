package com.example.cardview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var cardHola: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciarComponentes()
    }

    private fun iniciarComponentes() {
        cardHola = findViewById(R.id.cvrIMC)
        cardHola.setOnClickListener {
           val intent = Intent(this, ActivityImc::class.java)
            startActivity(intent)

        }
    }
}