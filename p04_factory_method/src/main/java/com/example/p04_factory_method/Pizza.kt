package com.example.p04_factory_method

import android.util.Log

abstract class Pizza {
    var pizzaName: String? = null
    var dough: String? = null
    var sauce: String? = null
    var toppings = ArrayList<String>()

    fun prepare() {
        Log.d(TAG,"Prepare $pizzaName")
        Log.d(TAG,"Tossing dough...")
        Log.d(TAG,"Adding sauce...")
        Log.d(TAG,"Adding toppings: ")
        for (topping in toppings) {
            Log.d(TAG,"   $topping")
        }
    }

    fun bake() {
        Log.d(TAG,"Bake for 25 minutes at 350")
    }

    open fun cut() {
        Log.d(TAG,"Cut the pizza into diagonal slices")
    }

    fun box() {
        Log.d(TAG,"Place pizza in official PizzaStore box")
    }

    fun getName(): String? {
        return pizzaName
    }

    override fun toString(): String {
        val display = StringBuffer()
        display.append("---- $pizzaName ----\n")
        display.append(""" $dough """.trimIndent())
        display.append(""" $sauce """.trimIndent())
        for (topping in toppings) {
            display.append(""" $topping """.trimIndent())
        }
        return display.toString()
    }
}