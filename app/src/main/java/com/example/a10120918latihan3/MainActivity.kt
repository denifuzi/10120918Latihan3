package com.example.a10120918latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.button.MaterialButton

/**
 * Tanggal Pengerjaan : 29/04/2023
 * NIM : 10120918
 * Nama : Dennie Fuzi Alviyanies
 * Kelas : IF-10
 * */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            startActivity(Intent(this, FamilyCodeActivity::class.java))
        }

    }
}