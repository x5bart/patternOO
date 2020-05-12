package com.example.p04_factory_abstract

class FactoryPizzaIngredientNY : FactoryPizzaIngredient {
    override fun createDough(): Dough? {
        return DoughThinCrust()
    }

    override fun createSauce(): Sauce? {
        return SauceMarinara()
    }

    override fun createCheese(): Cheese? {
        return CheeseReggiano()
    }

    override fun createVeggies(): Array<Veggies?>? {
        return arrayOf(VeggiesGarlic(), VeggiesOnion(), VeggiesMushroom(), VeggiesRedPepper())
    }

    override fun createPepperoni(): Pepperoni? {
        return PepperoniSliced()
    }

    override fun createClam(): Clams? {
        return ClamsFresh()
    }
}