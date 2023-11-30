package com.example.pdf_reader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.result.contract.ActivityResultContracts
import com.example.pdf_reader.databinding.ActivityFindPdfBinding

class findPdfActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFindPdfBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFindPdfBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.selectPdf.setOnClickListener {
            laucnher.launch("application/pdf")
        }
    }

    private val laucnher = registerForActivityResult(
        ActivityResultContracts.GetContent()
    ){
        uri -> uri.let{
            binding.pdfView.fromUri(it).load()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        onDestroy()
    }
}