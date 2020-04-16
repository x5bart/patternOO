package com.exampler.p03_decorator_starbuzzwithsizes

abstract class Beverage {

    enum class Size {
        TALL, GRANDE, VENTI
    }

    var size = Size.TALL

    var desc = "Unknown Beverage"


    open fun getDescription(): String? {
        return desc
    }

    fun setSize1() {
        this.size = size!!
    }

    fun getSize1(): Size? {
        return size
    }

   abstract fun cost(): Double

}

