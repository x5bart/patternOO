package com.example.p06_command_simple_remote

class GarageDoor {

    fun up(): String {
        return "Garage Door is Open"
    }

    fun down(): String {
        return "Garage Door is Closed"
    }

    fun stop(): String {
        return "Garage Door is Stopped"
    }

    fun lightOn(): String {
        return "Garage light is on"
    }

    fun lightOff(): String {
        return "Garage light is off"
    }
}