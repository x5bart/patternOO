package com.exampler.p03_decorator_starbuzzwithsizes


class HouseBlend : Beverage() {
    override fun cost(): Double {
        return 0.89
    }

    init {
        desc = "House Blend Coffee"
    }
}

