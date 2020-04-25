package com.exampler.p04_factory_simple_pizza

import java.util.*

abstract class Pizza {
    var name: String? = null
    var dough: String? = null
    var sauce: String? = null
    var toppings = ArrayList<String>()

    fun prepare() {
        println("Preparing $name")
    }

    fun bake() {
        println("Baking $name")
    }

    fun cut() {
        println("Cutting $name")
    }

    fun box() {
        println("Boxing $name")
    }

    override fun toString(): String {
        // code to display pizza name and ingredients
        val display = StringBuffer()
        display.append("---- $name ----\n")
        display.append("""$dough""".trimIndent())
        display.append("""$sauce""".trimIndent())
        for (topping in toppings) {
            display.append(topping.trimIndent())
        }
        return display.toString()
    }
}