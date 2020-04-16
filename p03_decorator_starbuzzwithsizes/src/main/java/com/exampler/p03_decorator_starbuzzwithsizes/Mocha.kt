package com.exampler.p03_decorator_starbuzzwithsizes

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
