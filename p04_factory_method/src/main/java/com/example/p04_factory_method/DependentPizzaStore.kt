package com.example.p04_factory_method

import android.util.Log

class DependentPizzaStore {
    fun createPizza(style: String,type: String): Pizza? {
        var pizza: Pizza? = null
        when (style) {
            "NY" -> {
                when (type) {
                    "cheese" -> pizza = NYStyleCheesePizza()
                    "veggie" -> pizza = NYStyleVeggiePizza()
                    "clam" -> pizza = NYStyleClamPizza()
                    "pepperoni" -> pizza = NYStylePepperoniPizza()
                }
            }
            "Chicago" -> {
                when (type) {
                    "cheese" -> pizza = ChicagoStyleCheesePizza()
                    "veggie" -> pizza = ChicagoStyleVeggiePizza()
                    "clam" -> pizza = ChicagoStyleClamPizza()
                    "pepperoni" -> pizza = ChicagoStylePepperoniPizza()
                }
            }
            else -> {
                Log.d(TAG, "Error: invalid type of pizza")
                return null
            }
        }
        pizza!!.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}