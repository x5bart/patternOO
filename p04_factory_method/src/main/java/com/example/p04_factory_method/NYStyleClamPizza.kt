package com.example.p04_factory_method

import android.R.attr.name


class NYStyleClamPizza:Pizza() {

    fun NYStyleClamPizza() {
        pizzaName = "NY Style Clam Pizza"
        dough = "Thin Crust Dough"
        sauce = "Marinara Sauce"
        toppings.add("Grated Reggiano Cheese")
        toppings.add("Fresh Clams from Long Island Sound")
    }
}