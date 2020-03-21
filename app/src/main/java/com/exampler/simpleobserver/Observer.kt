package com.exampler.simpleobserver

interface Observer {
    fun add(weatherData: WeatherData){
        weatherData.registerObserver(this)
    }
    fun remove(weatherData: WeatherData){
        weatherData.removeObserver(this)
    }
    fun update(temp: Double, humidity: Double, pressure: Double)
}