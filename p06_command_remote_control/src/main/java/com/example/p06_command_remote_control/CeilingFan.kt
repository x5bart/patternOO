package com.example.p06_command_remote_control


class CeilingFan(location: String) {
    var location = ""
    var speed = 0

    fun high() {
        // turns the ceiling fan on to high
        speed = HIGH
        println("$location ceiling fan is on high")
    }

    fun medium() {
        // turns the ceiling fan on to medium
        speed = MEDIUM
        println("$location ceiling fan is on medium")
    }

    fun low() {
        // turns the ceiling fan on to low
        speed = LOW
        println("$location ceiling fan is on low")
    }

    fun off() {
        // turns the ceiling fan off
        speed = 0
        println("$location ceiling fan is off")
    }

    companion object {
        const val HIGH = 2
        const val MEDIUM = 1
        const val LOW = 0
    }

    init {
        this.location = location
    }
}