package com.exampler.weatheratation

import android.content.Context
import java.util.*

class WeatherData(context: Context) : Observable() {
    private var temperature = 0.0
    private var humidity = 0.0
    private var pressure = 0.0
    private var context: MainActivity = context as MainActivity


    fun measurementsChanged() {
        setChanged()
        notifyObservers()
    }

    fun setMeasurements(temperature: Double, humidity: Double, pressure: Double) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    fun getTemperature(): Double {
        return temperature
    }

    fun getHumidity(): Double {
        return humidity
    }

    fun getPressure(): Double {
        return pressure
    }

}