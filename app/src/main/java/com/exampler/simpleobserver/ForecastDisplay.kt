package com.exampler.simpleobserver

import android.content.Context
import kotlinx.android.synthetic.main.activity_main.*


class ForecastDisplay( context: Context) : Observer, DisplayElement {

    private var currentPressure = 29.92
    private var lastPressure = 0.0
    private var context: MainActivity = context as MainActivity


    override fun update(temp: Double, humidity: Double, pressure: Double) {
//        Log.d(TAG,"update ForecastDisplay")
        lastPressure = currentPressure
        currentPressure = pressure
        display()
    }

    override fun display() {
        var resultDisplay = ""
        val t = "Forecast:"
        var tmp = ""
        when {
            currentPressure > lastPressure -> {
                tmp = "$t Improving weather on the way!"
            }
            currentPressure == lastPressure -> {
                tmp = "$t More of the same"
            }
            currentPressure < lastPressure -> {
                tmp = "$t Watch out for cooler, rainy weather"
            }
        }
        resultDisplay = tmp
        context.tv_ForecastDisplay.text = resultDisplay
    }


}