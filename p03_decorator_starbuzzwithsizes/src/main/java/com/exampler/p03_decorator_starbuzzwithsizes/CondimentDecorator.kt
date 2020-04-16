package com.exampler.p03_decorator_starbuzzwithsizes

abstract class CondimentDecorator : Beverage() {

    var beverage: Beverage? = null

    abstract override fun getDescription(): String?
}

