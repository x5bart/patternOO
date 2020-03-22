package com.exampler.a03_decorator_starbuzz

class Mocha(beverage: Beverage) : CondimentDecorator() {


    override fun getDescription(): String? {
        return beverage!!.getDescription() + ", Mocha";
    }

    override fun cost(): Double {
        return .20 + beverage!!.cost()
    }

    init {
        this.beverage = beverage
    }
}
