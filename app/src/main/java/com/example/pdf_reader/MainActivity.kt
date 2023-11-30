package com.example.pdf_reader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(kotlinx.coroutines.Runnable {
            val i = Intent(this@MainActivity,findPdfActivity::class.java)
            startActivity(i)
        },4000)
    }
}