package com.exampler.p03_decorator_starbuzzwithsizes

class DarkRoast : Beverage() {
    override fun cost(): Double {
        return .99
    }

    init {
        desc = "Dark Roast Coffee"
    }
}

