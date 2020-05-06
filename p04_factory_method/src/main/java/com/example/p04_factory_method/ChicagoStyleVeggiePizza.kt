package com.example.p04_factory_method

import android.R.attr.name


class ChicagoStyleVeggiePizza:Pizza() {
    fun ChicagoStyleVeggiePizza() {
        pizzaName = "Chicago Deep Dish Veggie Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"
        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Black Olives")
        toppings.add("Spinach")
        toppings.add("Eggplant")
    }

    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}