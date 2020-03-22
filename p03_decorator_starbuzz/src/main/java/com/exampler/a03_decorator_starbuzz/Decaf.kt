package com.exampler.a03_decorator_starbuzz

class Decaf : Beverage() {
    override fun cost(): Double {
        return 1.05
    }

    init {
        desc = "Decaf Coffee"
    }
}

