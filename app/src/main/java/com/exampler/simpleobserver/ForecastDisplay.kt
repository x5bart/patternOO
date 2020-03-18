//package com.exampler.simpleobserver
//
//import java.util.*
//import java.util.Observer
//
//class ForecastDisplay(observable: Observable) : Observer,
//    DisplayElement {
//    private var currentPressure = 29.92
//    private var lastPressure = 0.0
//    override fun update(observable: Observable, arg: Any) {
//        if (observable is WeatherData) {
//            val weatherData: WeatherData = observable as WeatherData
//            lastPressure = currentPressure
//            currentPressure = weatherData.getPressure()
//            display()
//        }
//    }
//
//    override fun display() {
//        print("Forecast: ")
//        if (currentPressure > lastPressure) {
//            println("Improving weather on the way!")
//        } else if (currentPressure == lastPressure) {
//            println("More of the same")
//        } else if (currentPressure < lastPressure) {
//            println("Watch out for cooler, rainy weather")
//        }
//    }
//
//    init {
//        observable.addObserver(this)
//    }
//}