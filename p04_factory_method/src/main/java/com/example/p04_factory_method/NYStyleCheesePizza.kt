package com.example.p04_factory_method

import android.R.attr.name


class NYStyleCheesePizza:Pizza() {
    fun NYStyleCheesePizza() {
        pizzaName = "NY Style Sauce and Cheese Pizza"
        dough = "Thin Crust Dough"
        sauce = "Marinara Sauce"
        toppings.add("Grated Reggiano Cheese")
    }
}