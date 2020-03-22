package com.exampler.a03_decorator_starbuzz

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

const val TAG = "Mylog"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val beverage: Beverage = Espresso()
        Log.d(TAG,
            beverage.getDescription()
                    + " $" + beverage.cost()
        )

        var beverage2: Beverage = DarkRoast()
        beverage2 = Mocha(beverage2)
        beverage2 = Mocha(beverage2)
        beverage2 = Whip(beverage2)
        Log.d(TAG,
            beverage2.getDescription()
                    + " $" + beverage2.cost()
        )

        var beverage3: Beverage = HouseBlend()
        beverage3 = Soy(beverage3)
        beverage3 = Mocha(beverage3)
        beverage3 = Whip(beverage3)
        Log.d(TAG,
            beverage3.getDescription()
                    + " $" + beverage3.cost()
        )

    }
}
