package com.example.p06_command_remote_control

class GarageDoorDownCommand(var garageDoor: GarageDoor) :
    Command {
    override fun execute() {
        garageDoor.down()
    }

}