package com.example.p04_factory_method

abstract class PizzaStore {
    abstract fun createPizza(item: String?): Pizza?

    open fun orderPizza(type: String?): Pizza? {
        val pizza = createPizza(type)
        println("--- Making a " + pizza!!.getName() + " ---")
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}