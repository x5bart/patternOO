package com.exampler.simpleobserver

interface Observer {
    fun update(temp: Double, humidity: Double, pressure: Double)
}