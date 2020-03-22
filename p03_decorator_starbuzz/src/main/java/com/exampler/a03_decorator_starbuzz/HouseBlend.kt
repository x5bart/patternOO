package com.exampler.a03_decorator_starbuzz


class HouseBlend : Beverage() {
    override fun cost(): Double {
        return 0.89
    }

    init {
        desc = "House Blend Coffee"
    }
}

