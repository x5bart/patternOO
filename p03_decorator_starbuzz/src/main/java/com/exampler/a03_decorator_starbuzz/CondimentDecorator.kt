package com.exampler.a03_decorator_starbuzz

abstract class CondimentDecorator : Beverage() {

    var beverage: Beverage? = null

    abstract override fun getDescription(): String?
}

