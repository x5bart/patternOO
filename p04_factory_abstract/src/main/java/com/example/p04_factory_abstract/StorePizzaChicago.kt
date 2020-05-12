package com.example.p04_factory_abstract



class StorePizzaChicago : StorePizza() {
    override fun createPizza(item: String?): Pizza {
        var pizza: Pizza? = null
        val ingredientFactory = FactoryPizzaIngredientChicago()

        when {
            item.equals("cheese") -> {
                pizza = PizzaCheese(ingredientFactory)
                pizza.setName("Chicago Style Cheese Pizza")
            }
            item.equals("veggie") -> {
                pizza = PizzaVeggie(ingredientFactory)
                pizza.setName("Chicago Style Veggie Pizza")
            }
            item.equals("clam") -> {
                pizza = PizzaClam(ingredientFactory)
                pizza.setName("Chicago Style Clam Pizza")
            }
            item.equals("pepperoni") -> {
                pizza = PizzaPepperoni(ingredientFactory)
                pizza.setName("Chicago Style Pepperoni Pizza")
            }
        }
        return pizza!!
    }

}
