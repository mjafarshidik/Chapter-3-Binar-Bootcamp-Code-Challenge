package com.mjafarshidik.suitgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mjafarshidik.suitgame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        btnStart()
    }

    private fun btnStart() {
        mainBinding.apply {
            btnStart.setOnClickListener {
                val intent = Intent(this@MainActivity, SuitActivity::class.java)
                startActivity(intent)
            }
        }
    }
}