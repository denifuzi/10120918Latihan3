package com.example.a10120918latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textview.MaterialTextView

/**
 * Tanggal Pengerjaan : 29/04/2023
 * NIM : 10120918
 * Nama : Dennie Fuzi Alviyanies
 * Kelas : IF-10
 * */

class FamilyCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family_code)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        btnSubmit.setOnClickListener {
            startActivity(Intent(this, FormActivity::class.java))
        }

    }
}