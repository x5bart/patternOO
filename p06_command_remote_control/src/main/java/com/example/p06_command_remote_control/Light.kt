package com.example.p06_command_remote_control

class Light(location: String) {
    var location = ""
    fun on() {
        println("$location light is on")
    }

    fun off() {
        println("$location light is off")
    }

    init {
        this.location = location
    }
}