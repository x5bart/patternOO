package com.exampler.simpleobserver

import android.util.Log


class ForecastDisplay(weatherData: WeatherData): Observer, DisplayElement {

    private var currentPressure = 29.92
    private var lastPressure = 0.0


    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Double, humidity: Double, pressure: Double) {
        Log.d(TAG,"update ForecastDisplay")
        lastPressure = currentPressure
        currentPressure = pressure
        display()
    }

    override fun display() {
        val t = "Forecast:"
        when {
            currentPressure > lastPressure -> {
                Log.d(TAG,"$t Improving weather on the way!")
            }
            currentPressure == lastPressure -> {
                Log.d(TAG,"$t More of the same")
            }
            currentPressure < lastPressure -> {
                Log.d(TAG,"$t Watch out for cooler, rainy weather")
            }
        }
    }


}