package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun a (){
        val a = 234
        val g = 534
        var w = 4
        when {
            a==g -> {
                w = 4
            }
            w == 4 -> {
                w = 55
            }
            else -> {

            }
        }
    }
}