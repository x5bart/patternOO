package com.exampler.p04_factory_simple_pizza

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.exampler.p04_factory_simple_pizza.observer.DisplayShower
import com.exampler.p04_factory_simple_pizza.observer.PizzaData
import kotlinx.android.synthetic.main.activity_main.*

const val TAG = "Mylogs"

class MainActivity : AppCompatActivity() {
    lateinit var pizzaData: PizzaData
    lateinit var displayShower: DisplayShower

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayShower = DisplayShower(this)
        pizzaData = PizzaData()

        val simplePizzaFactory = SimplePizzaFactory()
        val pizzaStore = PizzaStore(simplePizzaFactory)
        btn_pizzaChease.setOnClickListener {
//            pizzaData = PizzaData()
            displayShower.add(pizzaData)
            pizzaStore.orderPizza("cheese", pizzaData)
        }

//        var pizza = store.orderPizza("cheese")
//        Log.d(TAG,""" We ordered a $pizza""".trimIndent())
//        println(pizza)
//
//        pizza = store.orderPizza("veggie")
//        println(
//            """
//                We ordered a ${pizza}
//
//                """.trimIndent()
//        )
//        println(pizza)
    }
}
