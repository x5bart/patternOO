package com.exampler.simpleobserver

import android.util.Log

class WeatherData : Subject {
    private var observers: ArrayList<Observer>? = null
    private var temperature = 0.0
    private var humidity = 0.0
    private var pressure = 0.0

    init {
        observers = ArrayList()
    }

    override fun registerObserver(o: Observer) {
        observers!!.add(o)
        Log.d(TAG,"registerObserver ${o}")
    }

    override fun removeObserver(o: Observer) {
        val i = observers?.indexOf(o)
        if (i != null && i >= 0) observers?.removeAt(i)
        Log.d(TAG,"removeObserver $o")
    }


    override fun notifyObserver() {
//        Log.d(TAG,"notifyObserver()")
        for (i in observers!!.indices) {
            Log.d(TAG,"${observers!![i]} t:$temperature, h:$humidity, p:$pressure")
            observers!![i].update(temperature, humidity, pressure)
        }
    }

    private fun measurementChanged() {
//        Log.d(TAG,"measurementChanged()")
        notifyObserver()
    }

    fun setMeasurements(temperature: Double, humidity: Double, pressure: Double) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure= pressure
        Log.d(TAG,"setMeasurements: t:$temperature, h:$humidity, p:$pressure")
        measurementChanged()

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