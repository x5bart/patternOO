package com.exampler.p03_decorator_starbuzzwithsizes

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