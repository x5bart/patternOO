package com.example.p04_factory_method


class NYPizzaStore : PizzaStore() {
    override fun createPizza(item: String?): Pizza? {
        return when (item) {
            "cheese" -> {
                NYStyleCheesePizza()
            }
            "veggie" -> {
                NYStyleVeggiePizza()
            }
            "clam" -> {
                NYStyleClamPizza()
            }
            "pepperoni" -> {
                NYStylePepperoniPizza()
            }
            else -> null
        }
    }
}