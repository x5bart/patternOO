package com.exampler.a03_decorator_starbuzz

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