package com.example.p04_factory_abstract




class StorePizzaNY : StorePizza() {
    override fun createPizza(item: String?): Pizza {
        var pizza: Pizza? = null
        val ingredientFactory = FactoryPizzaIngredientNY()

        when {
            item.equals("cheese") -> {
                pizza = PizzaCheese(ingredientFactory)
                pizza.setName("New York Style Cheese Pizza")
            }
            item.equals("veggie") -> {
                pizza = PizzaVeggie(ingredientFactory)
                pizza.setName("New York Style Veggie Pizza")
            }
            item.equals("clam") -> {
                pizza = PizzaClam(ingredientFactory)
                pizza.setName("New York Style Clam Pizza")
            }
            item.equals("pepperoni") -> {
                pizza = PizzaPepperoni(ingredientFactory)
                pizza.setName("New York Style Pepperoni Pizza")
            }
        }
        return pizza!!
    }

}
