package com.baseeta.bassetasampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.baseeta.merchant.application_lib.config.BassetaConfigration

class MainActivity : AppCompatActivity() {

    private lateinit var btnStartBasseta : Button
    private lateinit var bassetaConfigration : BassetaConfigration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bassetaConfigration = BassetaConfigration(this)
        bassetaConfigration.setConfiguration(isDebug = true, language = "ar", merchantId = "1")

        btnStartBasseta = findViewById(R.id.btnShow)
        btnStartBasseta.setOnClickListener {
            bassetaConfigration.showBassetaJourney()
        }
    }
}