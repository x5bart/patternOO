package com.exampler.p04_factory_simple_pizza

import android.os.HandlerThread
import com.exampler.p04_factory_simple_pizza.observer.PizzaData
import java.util.logging.Handler

class PizzaStore(private var factory: SimplePizzaFactory) {
//    private var factory: SimplePizzaFactory = factory

    fun orderPizza(type: String?,pizzaData: PizzaData): Pizza? {
        val pizza= factory.createPizza(type)!!
        pizza.prepare(pizzaData)
        HandlerThread.sleep(2000)
        pizza.bake(pizzaData)
        HandlerThread.sleep(2000)
        pizza.cut(pizzaData)
        HandlerThread.sleep(2000)
        pizza.box(pizzaData)
        return pizza
    }
}