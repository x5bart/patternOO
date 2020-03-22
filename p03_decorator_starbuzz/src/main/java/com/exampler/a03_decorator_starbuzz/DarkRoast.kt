package com.exampler.a03_decorator_starbuzz

class DarkRoast : Beverage() {
    override fun cost(): Double {
        return .99
    }

    init {
        desc = "Dark Roast Coffee"
    }
}

