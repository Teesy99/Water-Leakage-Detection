package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Logo:AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        val dice1 : ImageView = findViewById(R.id.imageView2)
        dice1.setImageResource(R.drawable.logo)

        Handler().postDelayed({
            startActivity(Intent(this,Water_supply_login::class.java))
            finish()
        }, SPLASH_TIME_OUT)

    }
}