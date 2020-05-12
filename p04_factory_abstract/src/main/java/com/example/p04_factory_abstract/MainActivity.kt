package com.example.p04_factory_abstract

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nyStore = StorePizzaNY()
        val chicagoStore: StorePizza = StorePizzaChicago()
        val moscowStore = StorePizzaMoscow()

        var pizza = nyStore.orderPizza("cheese")
        println("Ethan ordered a $pizza\n")

        pizza = chicagoStore.orderPizza("cheese")
        println("Joel ordered a $pizza\n")

        pizza = nyStore.orderPizza("clam")
        println("Ethan ordered a $pizza\n")

        pizza = chicagoStore.orderPizza("clam")
        println("Joel ordered a $pizza\n")

        pizza = nyStore.orderPizza("pepperoni")
        println("Ethan ordered a $pizza\n")

        pizza = chicagoStore.orderPizza("pepperoni")
        println("Joel ordered a $pizza\n")

        pizza = nyStore.orderPizza("veggie")
        println("Ethan ordered a $pizza\n")

        pizza = chicagoStore.orderPizza("veggie")
        println("Joel ordered a $pizza\n")

        pizza = moscowStore.orderPizza("cheese")
        println("Joel ordered a $pizza\n")

    }
}
