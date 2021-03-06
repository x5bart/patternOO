package com.exampler.p04_factory_simple_pizza

import android.content.Context
import com.exampler.p04_factory_simple_pizza.observer.PizzaData

class SimplePizzaFactory {

    fun createPizza(type: String?): Pizza? {
        var pizza: Pizza? = null

        when (type) {
            "cheese" -> pizza = CheesePizza()
            "pepperoni" -> pizza = PepperoniPizza()
            "clam" -> pizza = ClamPizza()
            "veggie" -> pizza = VeggiePizza()
        }
        return pizza
    }
}