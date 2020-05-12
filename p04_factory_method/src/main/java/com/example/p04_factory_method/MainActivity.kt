package com.example.p04_factory_method

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


const val TAG = "Mylogs"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nyStore = NYPizzaStore()
        val chicagoStore = ChicagoPizzaStore()
        val moscowStore = MoscowPizzaStore()

        var pizza = nyStore.orderPizza("cheese")
        Log.d(TAG,"""Ethan ordered a ${pizza!!.pizzaName}""".trimIndent())

        pizza = chicagoStore.orderPizza("cheese")
        Log.d(TAG,"""Joel ordered a ${pizza!!.pizzaName}""".trimIndent())

        pizza = nyStore.orderPizza("clam")
        Log.d(TAG,"""Ethan ordered a ${pizza!!.pizzaName}""".trimIndent())

        pizza = chicagoStore.orderPizza("clam")
        Log.d(TAG,"""Joel ordered a ${pizza!!.pizzaName}""".trimIndent())

        pizza = nyStore.orderPizza("pepperoni")
        Log.d(TAG,"""Ethan ordered a ${pizza!!.pizzaName}""".trimIndent())

        pizza = chicagoStore.orderPizza("pepperoni")
        Log.d(TAG,"""Joel ordered a ${pizza!!.pizzaName}""".trimIndent())

        pizza = nyStore.orderPizza("veggie")
        Log.d(TAG,"""Ethan ordered a ${pizza!!.pizzaName}""".trimIndent())

        pizza = chicagoStore.orderPizza("veggie")
        Log.d(TAG,"""Joel ordered a ${pizza!!.pizzaName}""".trimIndent())

        pizza = moscowStore.orderPizza("cheese")
        Log.d(TAG,"""Ethan ordered a ${pizza!!.pizzaName}""".trimIndent())
    }
}
