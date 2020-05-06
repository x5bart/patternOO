package com.example.p04_factory_method


class ChicagoPizzaStore : PizzaStore() {

    override fun createPizza(item: String?): Pizza? {
        return when (item) {
            "cheese" -> {
                ChicagoStyleCheesePizza()
            }
            "veggie" -> {
                ChicagoStyleVeggiePizza()
            }
            "clam" -> {
                ChicagoStyleClamPizza()
            }
            "pepperoni" -> {
                ChicagoStylePepperoniPizza()
            }
            else -> null
        }
    }
}