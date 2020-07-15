package com.example.calduladoranova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.calculator.module.Calculator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Multiplicação", Calculator(number1 = 4.0, number2 = 10.0).multiplication().toString())

    }
}