package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var layout: ConstraintLayout
    lateinit var button: Button
    lateinit var editText: EditText
    lateinit var title: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout = findViewById(R.id.main)
        button = findViewById(R.id.button)
        editText = findViewById(R.id.editText)
        title = findViewById(R.id.title)

        button.setOnClickListener{

            OurClass.backgroundType = editText.text.toString()

            if(OurClass.backgroundType.equals("day", true)) {
                layout.setBackgroundResource(R.drawable.sun__phone_background__f2u__by_melody1720_d8zih7a)
                editText.setTextColor(Color.parseColor("black"))
                title.setTextColor(Color.parseColor("black"))
            }
            if(OurClass.backgroundType.equals("night", true)) {
                layout.setBackgroundResource(R.drawable.night)
                editText.setTextColor(Color.parseColor("white"))
                title.setTextColor(Color.parseColor("white"))
            }
        }
    }
}