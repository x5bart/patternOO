package com.exampler.p03_decorator_starbuzzwithsizes

class Espresso : Beverage() {

    override fun cost(): Double {
        return 1.99
    }

    init {
        desc = "Espresso"
    }
}

