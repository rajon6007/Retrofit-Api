package com.example.restapi_dipti_16

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main16)

        Handler(Looper.getMainLooper()).postDelayed({

            startActivity(Intent(this@MainActivity16,ProductActivity_16::class.java))
            finish()

        },3000)

    }
}