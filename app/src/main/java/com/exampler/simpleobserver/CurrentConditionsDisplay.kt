package com.exampler.simpleobserver

import android.content.Context
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class CurrentConditionsDisplay( context: Context) : Observer,
    DisplayElement {
    private var temperature = 0.0
    private var humidity = 0.0
    private var context: MainActivity = context as MainActivity


    init {
        WeatherData(context)
    }

//    fun add() {
//        context.weatherData.registerObserver(this)
//    }
//
//    fun remove() {
//        context.weatherData.removeObserver(this)
//    }

    override fun update(temp: Double, humidity: Double, pressure: Double) {
        Log.d(
            TAG,
            "CurrentConditionsDisplay before update() t:${this.temperature} h:${this.humidity} "
        )
        this.temperature = temp
        this.humidity = humidity
        Log.d(
            TAG,
            "CurrentConditionsDisplay before update() t:${this.temperature} h:${this.humidity} "
        )
//        Log.d(TAG, "update CurrentConditionsDisplay")
        display()
    }

    override fun display() {
        val resultDisplay = "Current conditions $temperature F degrees and humidity + % $humidity"
        context.tv_CurrentConditions.text = resultDisplay
    }
}

