package com.example.p04_factory_abstract

abstract class Pizza {
    var pizzaName: String? = null

    var dough: Dough? = null
    var sauce: Sauce? = null
    var veggies: Array<Veggies>? = null
    var cheese: Cheese? = null
    var pepperoni: Pepperoni? = null
    var clam: Clams? = null

    abstract fun prepare()

    open fun bake() {
        println("Bake for 25 minutes at 350")
    }

    open fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    open fun box() {
        println("Place pizza in official PizzaStore box")
    }

    open fun setName(name: String?) {
        this.pizzaName = name
    }

    open fun getName(): String? {
        return pizzaName
    }

    override fun toString(): String {
        val result = StringBuffer()
        result.append("---- $pizzaName ----\n")
        if (dough != null) {
            result.append(dough)
            result.append("\n")
        }
        if (sauce != null) {
            result.append(sauce)
            result.append("\n")
        }
        if (cheese != null) {
            result.append(cheese)
            result.append("\n")
        }
        if (veggies != null) {
            for (i in veggies!!.indices) {
                result.append(veggies!![i])
                if (i < veggies!!.size - 1) {
                    result.append(", ")
                }
            }
            result.append("\n")
        }
        if (clam != null) {
            result.append(clam)
            result.append("\n")
        }
        if (pepperoni != null) {
            result.append(pepperoni)
            result.append("\n")
        }
        return result.toString()
    }
}