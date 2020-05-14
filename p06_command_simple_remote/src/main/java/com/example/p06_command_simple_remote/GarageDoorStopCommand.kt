package com.example.p06_command_simple_remote

class GarageDoorStopCommand(garageDoor: GarageDoor) : Command {

    private var garageDoor: GarageDoor? = null

    init {
        this.garageDoor = garageDoor
    }

    override fun execute():String {
       return garageDoor!!.stop()
    }
}