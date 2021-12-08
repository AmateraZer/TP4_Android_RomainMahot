package fr.rmahot.tp4_android_romainmahot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lateinit var pizza: CheckBox
        pizza = findViewById(R.id.checkBox1)
        pizza.isChecked

    }

}