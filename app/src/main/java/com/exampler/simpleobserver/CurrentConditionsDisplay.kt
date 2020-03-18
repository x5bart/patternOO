package com.exampler.simpleobserver

import android.util.Log
import android.view.View
import android.widget.TextView

class CurrentConditionsDisplay(weatherData: WeatherData) : Observer, DisplayElement {
    private var temperature = 0.0
    private var humidity = 0.0


    init {
        weatherData.registerObserver(this)
    }

    fun remove(weatherData: WeatherData) {
        weatherData.removeObserver(this)
    }

    override fun update(temp: Double, humidity: Double, pressure: Double) {
        this.temperature = temp
        this.humidity = humidity
        Log.d(TAG, "update CurrentConditionsDisplay")
        display()
    }

    override fun display() {
        val resultDisplay = "Current conditions $temperature F degrees and humidity + % $humidity"
        val mainActivity = MainActivity()
        mainActivity.updateCurrentDisplay(resultDisplay)
        Log.d(TAG, "Current conditions $temperature F degrees and humidity + % $humidity")
    }

}