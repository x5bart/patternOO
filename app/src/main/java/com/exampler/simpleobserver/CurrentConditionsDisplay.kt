package com.exampler.simpleobserver

import android.util.Log

class CurrentConditionsDisplay : Observer, DisplayElement {
    private var temperature = 0.0
    private var humidity = 0.0
    private lateinit var weatherData: Subject

    fun currentConditionsDisplay(weatherData: Subject) {
        Log.d(TAG, "CurrentConditionsDisplay :currentConditionsDisplay")
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    override fun update(temp: Double, humidity: Double, pressure: Double) {
        this.temperature = temp
        this.humidity = humidity
        Log.d(TAG, "CurrentConditionsDisplay :update")
        display()
    }

    override fun display() {
        Log.d(TAG, "Current conditions $temperature F degrees and humidity + % $humidity")
    }

}