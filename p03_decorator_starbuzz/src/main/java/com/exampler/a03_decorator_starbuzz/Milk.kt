package com.exampler.a03_decorator_starbuzz

class Milk(beverage: Beverage?) : CondimentDecorator() {
    override fun getDescription(): String? {
        return beverage!!.getDescription() + ", Milk"
    }

    override fun cost(): Double {
        return (.10 + beverage!!.cost())
    }

    init {
        this.beverage = beverage
    }
}