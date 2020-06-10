package com.example.p06_command_remote_control

class GarageDoorUpCommand(var garageDoor: GarageDoor) :
    Command {
    override fun execute() {
        garageDoor.up()
    }

}