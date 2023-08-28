package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.project1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnTest1.setOnClickListener{
                val inputNama =  binding.addName.text.toString().trim()

                val message = "Halo $inputNama"
                Toast.makeText(this@MainActivity, message,Toast.LENGTH_LONG).show()
            }
        }
    }
}