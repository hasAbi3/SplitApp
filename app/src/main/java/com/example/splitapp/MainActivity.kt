package com.example.splitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    val login = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (login)
            findNavController(R.id.firstFragment).navigate(R.id.secondFragment)
        else
            findNavController(R.id.firstFragment)
    }
}