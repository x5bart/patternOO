package com.example.p04_factory_abstract

class FactoryPizzaIngredientMoscow : FactoryPizzaIngredient {
    override fun createDough(): Dough? {
        return DoughPush()
    }

    override fun createSauce(): Sauce? {
        return SauceMoscowStyle()
    }

    override fun createCheese(): Cheese? {
        return CheeseMasdam()
    }

    override fun createVeggies(): Array<Veggies?>? {
        return arrayOf(VeggiesBlackOlives(),VeggiesMushroom(),VeggiesRedPepper())
    }

    override fun createPepperoni(): Pepperoni? {
        return PepperoniSliced()
    }

    override fun createClam(): Clams? {
        return ClamsFresh()
    }

}
