package com.exampler.p04_factory_simple_pizza

class ClamPizza : Pizza() {
    init {
        name = "Clam Pizza"
        dough = "Thin crust"
        sauce = "White garlic sauce"
        toppings.add("Clams")
        toppings.add("Grated parmesan cheese")
    }
}
