package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import kotlin.random.Random
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sortear : Button = findViewById(R.id.button_sortear)
        sortear.setOnClickListener { sortearNumeros() }
    }
    private fun sortearNumeros() {
         val resultado :TextView= findViewById(R.id.text_nenhum_numero_selecionado)
         val sorteador = Random.nextInt(0, 100)+1
         resultado.text = "Número sorteado foi: " + sorteador
         resultado.contentDescription = sorteador.toString()
         }
     }

