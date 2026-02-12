package com.example.helloui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi View
        val etNama = findViewById<EditText>(R.id.etNama)
        val btnSapa = findViewById<Button>(R.id.btnSapa)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)
        val switchMode = findViewById<Switch>(R.id.switchMode)

        // Tombol Sapa
        btnSapa.setOnClickListener {
            val nama = etNama.text.toString()
            tvHasil.text = "Hello $nama"
        }

        // Switch Mode Gelap / Terang
        switchMode.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_YES
                )
                switchMode.text = "Mode Gelap"
            } else {
                AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_NO
                )
                switchMode.text = "Mode Terang"
            }
        }
    }
}
