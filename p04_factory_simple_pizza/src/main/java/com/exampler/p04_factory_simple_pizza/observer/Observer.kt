package com.exampler.p04_factory_simple_pizza.observer

interface Observer {
    fun add(pizzaData: PizzaData) {
        pizzaData.registerObserver(this)
    }

    fun remove(pizzaData: PizzaData) {
        pizzaData.removeObserver(this)
    }

    fun update(prepare: String, bake: String, cut: String, box: String)
}