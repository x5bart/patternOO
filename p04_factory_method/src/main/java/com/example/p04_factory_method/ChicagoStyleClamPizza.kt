package com.example.p04_factory_method

import android.R.attr.name


class ChicagoStyleClamPizza:Pizza() {
    fun ChicagoStyleClamPizza() {
        pizzaName = "Chicago Style Clam Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"
        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Frozen Clams from Chesapeake Bay")
    }

    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}