package com.example.testforwsr

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val intent = Intent(this, Registration::class.java)
        startActivity(intent)
        finish()
    }
}