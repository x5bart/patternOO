package com.exampler.simpleobserver

import android.content.Context
import android.util.Log
import android.widget.Toast


class WeatherData(context: Context) : Subject {
    private var observers: ArrayList<Observer>? = null
    private var temperature = 0.0
    private var humidity = 0.0
    private var pressure = 0.0
    private var context: MainActivity = context as MainActivity

    init {
        observers = ArrayList()
    }

    override fun registerObserver(o: Observer) {
        val i = observers?.indexOf(o)
        val observer = o.toString().substringAfter("simpleobserver.").substringBefore("@")
        val isContains = observers!!.toString().contains(observer)
        Log.d(TAG, " registerObserver i:$i o:$observers")
        Log.d(TAG, " registerObserver i:$i o:$observer isContains:$isContains")
        if (!isContains) {
            observers!!.add(o)
            Toast.makeText(context, "$observer added", Toast.LENGTH_SHORT).show()
            Log.d(TAG, " registerObserver i:$i o:$observers")
        }
//        Log.d(TAG,"registerObserver ${o}")
    }

//    override fun removeObserver(o: Observer) {
//        val observer = o.toString().substringAfter("simpleobserver.").substringBefore("@")
//        val isContains = observers!!.toString().contains(observer)
//        val i = observers?.indexOf(o)
//        Log.d(TAG, "removeObserver i:$i o:$observer isContains:$isContains")
//        Log.d(TAG, "removeObserver i:$i o:$observers")
//        if (i != null && i >= 0) {
//            observers?.removeAt(i)
//            Toast.makeText(context, "$o removed", Toast.LENGTH_SHORT).show()
//            Log.d(TAG, "removeObserver i:$i o:$observers")
//        }
//        Log.d(TAG,"removeObserver $o")
//    }

   override fun removeObserver(o: Observer) {
       val observer = o.toString().substringAfter("simpleobserver.").substringBefore("@")
        val isContains = observers!!.toString().contains(observer)

        val i = observers!!.indexOf(o)
       Log.d(TAG,"removeObserver $o")
       Log.d(TAG, "removeObserver i:$i o:$observers")
       Log.d(TAG, "removeObserver i:$i o:$observer isContains:$isContains")
        if (i >= 0) {
            observers!!.removeAt(i)
        }
       Log.d(TAG, "removeObserver i:$i o:$observers")
    }

    override fun notifyObserver() {
//        Log.d(TAG,"notifyObserver()")
        for (i in observers!!.indices) {
//            Log.d(TAG,"${observers!![i]} t:$temperature, h:$humidity, p:$pressure")
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
        this.pressure = pressure
//        Log.d(TAG,"setMeasurements: t:$temperature, h:$humidity, p:$pressure")
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