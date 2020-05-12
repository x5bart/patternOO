package com.example.p04_factory_abstract

class FactoryPizzaIngredientChicago:FactoryPizzaIngredient {

    override fun createDough(): Dough? {
        return DoughThickCrust()
    }

    override fun createSauce(): Sauce? {
        return SaucePlumTomato()
    }

    override fun createCheese(): Cheese? {
        return CheeseMozzarella()
    }

    override fun createVeggies(): Array<Veggies?>? {
        return arrayOf(
            VeggiesBlackOlives(),
            VeggiesSpinach(),
            VeggiesEggplant()
        )
    }

    override fun createPepperoni(): Pepperoni? {
        return PepperoniSliced()
    }

    override fun createClam(): Clams? {
        return ClamsFrozen()
    }
}