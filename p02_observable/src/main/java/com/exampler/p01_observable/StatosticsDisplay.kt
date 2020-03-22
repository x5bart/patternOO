package com.exampler.p01_observable

import android.content.Context
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class StatisticsDisplay(context: Context) : Observer, DisplayElement {
    private var maxTemp = 0.0
    private var minTemp = 200.0
    private var tempSum = 0.0
    private var numReadings = 0
    private var context: MainActivity = context as MainActivity


    override fun update(obs: Observable?, arg: Any?) {
        if (obs is WeatherData) {
            val weatherData: WeatherData = obs
            val temp = weatherData.getTemperature()
            tempSum += temp
            numReadings++
            if (temp > maxTemp) {
                maxTemp = temp
            }
            if (temp < minTemp) {
                minTemp = temp
            }
            display()
        }
    }

    override fun display() {
        val resultDisplay = "Avg/Max/Min temperature = ${tempSum / numReadings}/$maxTemp/$minTemp"
        context.tv_StatisticsDisplay.text = resultDisplay
    }


}