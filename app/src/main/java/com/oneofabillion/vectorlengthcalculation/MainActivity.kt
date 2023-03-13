package com.oneofabillion.vectorlengthcalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oneofabillion.vectorlengthcalculation.databinding.ActivityMainBinding
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var a = 0.0
    var b = 0.0
    var h = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{ calculateH() }



    }
    fun calculateH() {
        if ((binding.EditText.text.toString() != "") && (binding.EditText1.text.toString() != "")){
        a = binding.EditText.text.toString().toDouble()
        b = binding.EditText1.text.toString().toDouble()
        h = sqrt (a * a + b * b)
        binding.textView.text = "H=%.3f".format(h)
    }
    }
}