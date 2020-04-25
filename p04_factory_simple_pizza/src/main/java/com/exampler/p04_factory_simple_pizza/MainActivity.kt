package com.exampler.p04_factory_simple_pizza

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

const val TAG = "Mylogs"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val factory = SimplePizzaFactory()
        val store = PizzaStore(factory)

        var pizza = store.orderPizza("cheese")
        Log.d(TAG,""" We ordered a ${pizza}""".trimIndent())
        println(pizza)

        pizza = store.orderPizza("veggie")
        println(
            """
                We ordered a ${pizza}
                
                """.trimIndent()
        )
        println(pizza)
    }
}
