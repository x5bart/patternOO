package com.exampler.p04_factory_simple_pizza

class PizzaStore(factory: SimplePizzaFactory) {
    private var factory: SimplePizzaFactory = factory

    fun orderPizza(type: String?): Pizza? {
        val pizza= factory.createPizza(type)!!
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}