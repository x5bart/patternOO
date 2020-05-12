package com.example.p04_factory_method

import android.R.attr.name
import android.util.Log


class ChicagoStyleCheesePizza:Pizza() {
    init {
        pizzaName = "Chicago Style Deep Dish Cheese Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"
        toppings.add("Shredded Mozzarella Cheese")
    }

    override fun cut() {
        Log.d(TAG,"Cutting the pizza into square slices")
    }
}