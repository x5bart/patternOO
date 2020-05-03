package com.exampler.p04_factory_simple_pizza

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.widget.TextView
import com.exampler.p04_factory_simple_pizza.observer.PizzaData
import java.util.*

abstract class Pizza() {
    var name: String? = null
    var dough: String? = null
    var sauce: String? = null
    var toppings = ArrayList<String>()
    private var prepare = ""
    private var bake = ""
    private var cut = ""
    private var box = ""



    @SuppressLint("SetTextI18n")
    fun prepare(pizzaData:PizzaData) {
        prepare = "preparing  $name"
        pizzaData.setProgress(prepare, bake, cut, box)
    }

    fun bake(pizzaData:PizzaData) {
        bake = "Baking $name"
        pizzaData.setProgress(prepare, bake, cut, box)
    }

    fun cut(pizzaData:PizzaData) {
        cut = "Cutting $name"
        pizzaData.setProgress(prepare, bake, cut, box)
    }

    fun box(pizzaData:PizzaData) {
        box = "Boxing $name"
        pizzaData.setProgress(prepare, bake, cut, box)
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