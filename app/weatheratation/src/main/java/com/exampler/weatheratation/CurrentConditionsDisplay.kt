package com.exampler.weatheratation

import android.content.Context
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class CurrentConditionsDisplay(observable: Observable, context: Context) : Observer,
    DisplayElement {
    private var temperature = 0.0
    private var humidity = 0.0
    private var context: MainActivity = context as MainActivity
    private var observable = Observable()

    override fun update(obs: Observable, arg: Any?) {
        if (obs is WeatherData) {
            val weatherData: WeatherData = obs
            temperature = weatherData.getTemperature()
            humidity = weatherData.getHumidity()
            display()
        }
    }

    override fun display() {
        val result = "Current conditions: $temperature F degrees and $humidity % humidity"
        context.tv_CurrentConditions.text = result
    }

    fun add() {
        observable.addObserver(this)
    }

    fun remove() {
        observable.deleteObserver(this)
    }


    init {
        observable.addObserver(this)
    }
}