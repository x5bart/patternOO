package com.example.p04_factory_method

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nyStore = NYPizzaStore()
        val chicagoStore = ChicagoPizzaStore()

        var pizza = nyStore.orderPizza("cheese")
        println("""Ethan ordered a ${pizza!!.pizzaName}""".trimIndent())

        pizza = chicagoStore.orderPizza("cheese")
        println("""Joel ordered a ${pizza!!.pizzaName}""".trimIndent())

        pizza = nyStore.orderPizza("clam")
        println("""Ethan ordered a ${pizza!!.pizzaName}""".trimIndent())

        pizza = chicagoStore.orderPizza("clam")
        println("""Joel ordered a ${pizza!!.pizzaName}""".trimIndent())

        pizza = nyStore.orderPizza("pepperoni")
        println("""Ethan ordered a ${pizza!!.pizzaName}""".trimIndent())

        pizza = chicagoStore.orderPizza("pepperoni")
        println("""Joel ordered a ${pizza!!.pizzaName}""".trimIndent())

        pizza = nyStore.orderPizza("veggie")
        println("""Ethan ordered a ${pizza!!.pizzaName}""".trimIndent())

        pizza = chicagoStore.orderPizza("veggie")
        println("""Joel ordered a ${pizza!!.pizzaName}""".trimIndent())

    }
}
