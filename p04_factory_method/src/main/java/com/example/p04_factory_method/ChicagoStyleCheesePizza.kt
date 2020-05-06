package com.example.p04_factory_method

import android.R.attr.name


class ChicagoStyleCheesePizza:Pizza() {
    fun ChicagoStyleCheesePizza() {
        pizzaName = "Chicago Style Deep Dish Cheese Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"
        toppings.add("Shredded Mozzarella Cheese")
    }

    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}