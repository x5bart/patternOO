package com.exampler.p01_observer

interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObserver()
}