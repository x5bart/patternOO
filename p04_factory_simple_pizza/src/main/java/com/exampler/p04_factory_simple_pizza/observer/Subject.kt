package com.exampler.p04_factory_simple_pizza.observer

interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObserver()
}