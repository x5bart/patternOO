package com.exampler.a03_decorator_starbuzz

class Soy(beverage: Beverage?) : CondimentDecorator() {
    override fun getDescription(): String? {
        return beverage!!.getDescription() + ", Soy"
    }

    override fun cost(): Double {
        return .15 + beverage!!.cost()
    }

    init {
        this.beverage = beverage
    }
}