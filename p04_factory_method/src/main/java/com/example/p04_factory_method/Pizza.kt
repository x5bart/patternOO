package com.example.p04_factory_method

abstract class Pizza {
    var pizzaName: String? = null
    var dough: String? = null
    var sauce: String? = null
    var toppings = ArrayList<String>()

    fun prepare() {
        println("Prepare $pizzaName")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings: ")
        for (topping in toppings) {
            println("   $topping")
        }
    }

    fun bake() {
        println("Bake for 25 minutes at 350")
    }

    open fun cut() {
        println("Cut the pizza into diagonal slices")
    }

    fun box() {
        println("Place pizza in official PizzaStore box")
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