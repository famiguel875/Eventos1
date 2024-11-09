package com.example.eventosbackground

import android.os.Bundle
import android.graphics.Color
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private var colorIndex = 0
    private val colors = arrayOf(
        Color.RED,
        Color.GREEN,
        Color.BLUE,
        Color.YELLOW,
        Color.CYAN,
        Color.MAGENTA
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainLayout = findViewById<ConstraintLayout>(R.id.main)
        val btnCambiarColor = findViewById<Button>(R.id.btnCambiarColor)

        btnCambiarColor.setOnClickListener {
            // Cambiar al siguiente color en la lista
            colorIndex = (colorIndex + 1) % colors.size
            mainLayout.setBackgroundColor(colors[colorIndex])
        }
    }
}