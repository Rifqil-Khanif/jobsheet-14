package com.app.jobsheeet14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTo = findViewById<Button>(R.id.btnTo)
        val btnTpfl = findViewById<Button>(R.id.btnTpfl)
        val btnPplg = findViewById<Button>(R.id.btnPplg)
        val btnKuliner = findViewById<Button>(R.id.btnKuliner)
        val btnBusana = findViewById<Button>(R.id.btnBusana)

        btnTo.setOnClickListener {
            val fragmentpindah = supportFragmentManager.beginTransaction()
            fragmentpindah.replace(R.id.fragmentContainer, OtomotifFragment())
            fragmentpindah.commit()
        }
        btnTpfl.setOnClickListener {
            val fragmentpindah = supportFragmentManager.beginTransaction()
            fragmentpindah.replace(R.id.fragmentContainer, PengelasanFragment())
            fragmentpindah.commit()
        }
        btnPplg.setOnClickListener {
            val fragmentpindah = supportFragmentManager.beginTransaction()
            fragmentpindah.replace(R.id.fragmentContainer, PplgFragment())
            fragmentpindah.commit()
        }
        btnKuliner.setOnClickListener {
            val fragmentpindah = supportFragmentManager.beginTransaction()
            fragmentpindah.replace(R.id.fragmentContainer, KulinerFragment())
            fragmentpindah.commit()
        }
        btnBusana.setOnClickListener {
            val fragmentpindah = supportFragmentManager.beginTransaction()
            fragmentpindah.replace(R.id.fragmentContainer, BusanaFragment())
            fragmentpindah.commit()
        }
    }
}