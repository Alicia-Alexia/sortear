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
        val sorter : Button = findViewById(R.id.button_sortear)
        sorter.setOnClickListener { sortearNumeros() }
    }
    private fun sortearNumeros() {
         val result :TextView= findViewById(R.id.text_nenhum_numero_selecionado)
         val sorted = Random.nextInt(0, 100)+1
        ("Número sorteado foi: $sorted").also { result.text = it }
         }
     }

