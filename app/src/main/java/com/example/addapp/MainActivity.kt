package com.example.addapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.TextValueSanitizer
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ET1:EditText = findViewById(R.id.ET1)
        var ET2:EditText = findViewById(R.id.ET2)
        var buttonadd:Button = findViewById(R.id.buttonadd)
        var tvAnswer:TextView = findViewById(R.id.tvAnswer)
        var buttoncl:Button = findViewById(R.id.buttoncl)

        buttonadd.setOnClickListener(){

            var sum:Int = ET1.text.toString().toInt() + ET2.text.toString().toInt()
            tvAnswer.text = "" + sum
        }
        buttoncl.setOnClickListener(){
            ET1.text.clear()
            ET2.text.clear()
            tvAnswer.text = "Answer"
        }
    }
}