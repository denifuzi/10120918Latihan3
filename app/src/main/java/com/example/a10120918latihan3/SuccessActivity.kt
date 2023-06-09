package com.example.a10120918latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textview.MaterialTextView

/**
 * Tanggal Pengerjaan : 29/04/2023
 * NIM : 10120918
 * Nama : Dennie Fuzi Alviyanies
 * Kelas : IF-10
 * */

class SuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        val argument = intent.getStringExtra("name").toString()
        val textCongratulations = findViewById<MaterialTextView>(R.id.tvCongratulations)

        textCongratulations.text =
            resources.getString(R.string.congratulations, argument, argument, argument)
    }
}