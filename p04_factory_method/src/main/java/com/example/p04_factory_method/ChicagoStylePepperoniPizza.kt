package com.example.p04_factory_method

import android.R.attr.name


class ChicagoStylePepperoniPizza:Pizza() {
    fun ChicagoStylePepperoniPizza() {
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
        println("Cutting the pizza into square slices")
    }
}