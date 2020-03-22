package com.exampler.p01_observable

import android.content.Context
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class ForecastDisplay( context: Context) : DisplayElement, Observer {

    private var currentPressure = 29.92
    private var lastPressure = 0.0
    private var context: MainActivity = context as MainActivity


    override fun update(obs: Observable, arg: Any?) {
        if (obs is WeatherData) {
            val weatherData: WeatherData = obs
            lastPressure = currentPressure
            currentPressure = weatherData.getPressure()
            display()
        }
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