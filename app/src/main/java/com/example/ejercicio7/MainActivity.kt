package com.example.ejercicio7

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.botonGuerrero).setOnClickListener {
            findViewById<ImageView>(R.id.imagen).setImageResource(R.drawable.guerrero)
        }

        findViewById<Button>(R.id.botonLadron).setOnClickListener {
            findViewById<ImageView>(R.id.imagen).setImageResource(R.drawable.ladron)
        }

        findViewById<Button>(R.id.botonMago).setOnClickListener {
            findViewById<ImageView>(R.id.imagen).setImageResource(R.drawable.mago)
        }

        findViewById<Button>(R.id.botonElfo).setOnClickListener {
            findViewById<ImageView>(R.id.imagen).setImageResource(R.drawable.elfo)
        }

        findViewById<Button>(R.id.botonaceptar).setOnClickListener {
            val intento = Intent(this, ActivityVacio::class.java)
            startActivity(intento)
        }

    }
}