package com.example.p04_factory_abstract

interface FactoryPizzaIngredient {
    fun createDough(): Dough?
    fun createSauce(): Sauce?
    fun createCheese(): Cheese?
    fun createVeggies(): Array<Veggies?>?
    fun createPepperoni(): Pepperoni?
    fun createClam(): Clams?
}
