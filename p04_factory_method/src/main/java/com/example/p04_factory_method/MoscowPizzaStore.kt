package com.example.p04_factory_method


class MoscowPizzaStore : PizzaStore() {
    override fun createPizza(item: String?): Pizza? {
        return when (item) {
            "cheese" -> {
                MoscowStyleCheesePizza()
            }
            "veggie" -> {
                MoscowStyleVeggiePizza()
            }
            "clam" -> {
                MoscowStyleClamPizza()
            }
            "pepperoni" -> {
                MoscowStylePepperoniPizza()
            }
            else -> null
        }
    }
}