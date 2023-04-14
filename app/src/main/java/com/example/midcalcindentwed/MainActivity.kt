package com.example.midcalcindentwed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var buttoncalc: Button
    lateinit var buttonweb: Button
    lateinit var buttonintent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttoncalc = findViewById(R.id.btn_calc)
        buttonintent = findViewById(R.id.btn_inted)
        buttonweb = findViewById(R.id.btn_wedview)
        buttonweb.setOnClickListener {
            val intent = Intent(this, WebActivity::class.java)
            startActivity(intent)
        }
        buttoncalc.setOnClickListener {
            val intent = Intent(this, CalculaterActivity::class.java)
            startActivity(intent)
        }
        buttonintent.setOnClickListener {
            val intent = Intent(this, IntentActivity::class.java)
            startActivity(intent)
        }
    }
}