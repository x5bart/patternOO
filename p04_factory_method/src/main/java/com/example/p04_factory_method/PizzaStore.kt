package com.example.p04_factory_method

import android.util.Log

abstract class PizzaStore {
    abstract fun createPizza(item: String?): Pizza?

    open fun orderPizza(type: String?): Pizza? {
        val pizza = createPizza(type)
        Log.d(TAG,"--- Making a " + pizza!!.getName() + " ---")
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}