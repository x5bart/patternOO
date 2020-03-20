package com.exampler.simpleobserver

import android.content.Context
import kotlinx.android.synthetic.main.activity_main.*

class StatisticsDisplay(weatherData: WeatherData,context: Context) : Observer, DisplayElement {
    private var maxTemp = 0.0
    private var minTemp = 200.0
    private var tempSum = 0.0
    private var numReadings = 0
    private var context: MainActivity = context as MainActivity


    override fun update(temp: Double, humidity: Double, pressure: Double) {
//        Log.d(TAG,"update StatisticsDisplay")
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

    override fun display() {
        val resultDisplay = "Avg/Max/Min temperature = ${tempSum/numReadings}/$maxTemp/$minTemp"
        context.tv_StatisticsDisplay.text = resultDisplay
    }

    init {
        weatherData.registerObserver(this)
    }
}