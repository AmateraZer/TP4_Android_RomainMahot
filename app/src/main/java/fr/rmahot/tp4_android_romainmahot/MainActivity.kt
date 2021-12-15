package fr.rmahot.tp4_android_romainmahot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lateinit var pizza: CheckBox
        pizza = findViewById(R.id.checkBoxPizza)

        lateinit var cafe: CheckBox
        cafe = findViewById(R.id.checkBoxCafe)

        lateinit var burger: CheckBox
        burger = findViewById(R.id.checkBoxBurger)

        var buttonValider: Button
        buttonValider = findViewById(R.id.buttonValider)

        buttonValider.setOnClickListener(){
            var produit ="Produit que tu as selectionné :\n";
            var cpt = 0;

            if(pizza.isChecked){
                produit += "Pizza 10€\n";
                cpt += 10;
            }

            if(cafe.isChecked){
                produit += "Café 2€\n";
                cpt += 2;
            }

            if(burger.isChecked){
                produit += "Burger 12€\n";
                cpt += 12;

            }

            produit += "Total : " + cpt + "€"

            val MonToast = Toast.makeText(this, produit, Toast.LENGTH_SHORT)
            MonToast.show()
        }
    }
}