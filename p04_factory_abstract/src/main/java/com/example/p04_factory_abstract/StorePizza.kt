package com.example.p04_factory_abstract

abstract class StorePizza {

    protected abstract fun createPizza(item: String?): Pizza

    open fun orderPizza(type: String?): Pizza? {
        val pizza = createPizza(type)
        println("--- Making a " + pizza.getName() + " ---")
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }

}
