package com.example.p04_factory_abstract

class StorePizzaMoscow : StorePizza() {
    override fun createPizza(item: String?): Pizza {

        var pizza: Pizza? = null
        val ingredientFactory = FactoryPizzaIngredientMoscow()

        when {
            item.equals("cheese") -> {
                pizza = PizzaCheese(ingredientFactory)
                pizza.setName("Moscow Style Cheese Pizza")
            }
            item.equals("veggie") -> {
                pizza = PizzaVeggie(ingredientFactory)
                pizza.setName("Moscow Style Veggie Pizza")
            }
            item.equals("clam") -> {
                pizza = PizzaClam(ingredientFactory)
                pizza.setName("Moscow Style Clam Pizza")
            }
            item.equals("pepperoni") -> {
                pizza = PizzaPepperoni(ingredientFactory)
                pizza.setName("Moscow Style Pepperoni Pizza")
            }
        }
        return pizza!!
    }
}


