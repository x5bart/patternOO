//package com.exampler.simpleobserver
//
//import java.util.*
//import java.util.Observer
//
//class StatisticsDisplay(observable: Observable) : Observer,
//    DisplayElement {
//    private var maxTemp = 0.0
//    private var minTemp = 200.0
//    private var tempSum = 0.0
//    private var numReadings = 0
//    override fun update(observable: Observable, arg: Any) {
//        if (observable is WeatherData) {
//            val weatherData = observable as WeatherData
//            val temp: Float = weatherData.getTemperature()
//            tempSum += temp
//            numReadings++
//            if (temp > maxTemp) {
//                maxTemp = temp
//            }
//            if (temp < minTemp) {
//                minTemp = temp
//            }
//            display()
//        }
//    }
//
//    override fun display() {
//        println(
//            "Avg/Max/Min temperature = " + tempSum / numReadings
//                    + "/" + maxTemp + "/" + minTemp
//        )
//    }
//
//    init {
//        observable.addObserver(this)
//    }
//}
