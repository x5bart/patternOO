package com.example.p06_command_simple_remote

class LightOnCommand(light: Light):Command {

    private var light: Light? = null

    init {
        this.light = light
    }

    override fun execute():String {
        return light!!.on()
    }
}