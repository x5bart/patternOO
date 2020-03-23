package com.exampler.p03_decorator_starbuzzwithsizes

class Decaf : Beverage() {
    override fun cost(): Double {
        return 1.05
    }

    init {
        desc = "Decaf Coffee"
    }
}

