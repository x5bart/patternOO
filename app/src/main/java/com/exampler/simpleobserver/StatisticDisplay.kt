package com.exampler.simpleobserver

import android.util.Log

class StatisticsDisplay(weatherData: WeatherData) : Observer, DisplayElement {
    private var maxTemp = 0.0
    private var minTemp = 200.0
    private var tempSum = 0.0
    private var numReadings = 0


    override fun update(temp: Double, humidity: Double, pressure: Double) {
        Log.d(TAG,"update StatisticsDisplay")
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
        Log.d(TAG,
            "Avg/Max/Min temperature = ${tempSum/numReadings}/$maxTemp/$minTemp"
        )
    }

    init {
        weatherData.registerObserver(this)
    }
}