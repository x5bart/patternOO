package com.exampler.p04_factory_simple_pizza

class CheesePizza() : Pizza() {
    init {
        name = "Cheese Pizza"
        dough = "Regular Crust"
        sauce = "Marinara Pizza Sauce"
        toppings.add("Fresh Mozzarella")
        toppings.add("Parmesan")
    }
}
