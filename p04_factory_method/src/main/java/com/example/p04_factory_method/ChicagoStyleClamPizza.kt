package com.example.p04_factory_method

import android.R.attr.name
import android.util.Log


class ChicagoStyleClamPizza:Pizza() {
    init{
        pizzaName = "Chicago Style Clam Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"
        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Frozen Clams from Chesapeake Bay")
    }

    override fun cut() {
        Log.d(TAG,"Cutting the pizza into square slices")
    }
}