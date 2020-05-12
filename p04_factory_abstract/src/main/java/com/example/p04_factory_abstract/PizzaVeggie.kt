package com.example.p04_factory_abstract

class PizzaVeggie (ingredientFactory: FactoryPizzaIngredient) : Pizza() {
    private var ingredientFactory: FactoryPizzaIngredient? = null

    init {
        this.ingredientFactory = ingredientFactory
    }

    override fun prepare() {
        println("Preparing $pizzaName")
        dough = ingredientFactory!!.createDough()
        sauce = ingredientFactory!!.createSauce()
        cheese = ingredientFactory!!.createCheese()
    }
}