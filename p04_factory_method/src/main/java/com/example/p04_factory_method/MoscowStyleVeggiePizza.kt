package com.example.p04_factory_method

import android.R.attr.name


class MoscowStyleVeggiePizza:Pizza() {
    init{
        pizzaName = "Moscow Style Veggie Pizza"
        dough = "Thin Crust Dough"
        sauce = "Marinara Sauce"
        toppings.add("Grated Reggiano Cheese")
        toppings.add("Garlic")
        toppings.add("Onion")
        toppings.add("Mushrooms")
        toppings.add("Red Pepper")
    }
}