package com.exampler.a03_decorator_starbuzz

class Espresso : Beverage() {

    override fun cost(): Double {
        return 1.99
    }

    init {
        desc = "Espresso"
    }
}

