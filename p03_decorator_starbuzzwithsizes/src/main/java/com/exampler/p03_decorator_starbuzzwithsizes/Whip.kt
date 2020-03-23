package com.exampler.p03_decorator_starbuzzwithsizes

class Whip(beverage: Beverage?) : CondimentDecorator() {
    override fun getDescription(): String? {
        return beverage!!.getDescription() + ", Whip"
    }

    override fun cost(): Double {
        return .10 + beverage!!.cost()
    }

    init {
        this.beverage = beverage
    }
}