package com.example.p04_factory_method

import android.R.attr.name
import android.util.Log


class ChicagoStylePepperoniPizza:Pizza() {
    init{
        pizzaName = "Chicago Style Pepperoni Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"
        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Black Olives")
        toppings.add("Spinach")
        toppings.add("Eggplant")
        toppings.add("Sliced Pepperoni")
    }

    override fun cut() {
        Log.d(TAG,"Cutting the pizza into square slices")
    }
}