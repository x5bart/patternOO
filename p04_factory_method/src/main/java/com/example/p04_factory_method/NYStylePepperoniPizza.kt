package com.example.p04_factory_method

import android.R.attr.name


class NYStylePepperoniPizza:Pizza() {
    fun NYStylePepperoniPizza() {
        pizzaName = "NY Style Pepperoni Pizza"
        dough = "Thin Crust Dough"
        sauce = "Marinara Sauce"
        toppings.add("Grated Reggiano Cheese")
        toppings.add("Sliced Pepperoni")
        toppings.add("Garlic")
        toppings.add("Onion")
        toppings.add("Mushrooms")
        toppings.add("Red Pepper")
    }
}