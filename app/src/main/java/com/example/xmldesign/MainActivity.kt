package com.example.xmldesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.xmldesign.databinding.ActivityMainBinding
import com.example.xmldesign.databinding.FragmentChargeStationBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val bottomSheetFragment = ChargeStation()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chargeStation1.setOnClickListener {
            showBottomScreen()
        }

        binding.chargeStation2.setOnClickListener {
            showBottomScreen()
        }

        binding.chargeStation3.setOnClickListener {
            showBottomScreen()
        }

    }

    private fun showBottomScreen() {

            bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)

    }
}