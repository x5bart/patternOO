package com.example.p06_command_remote_control

class LightOnCommand(var light: Light) :
    Command {
    override fun execute() {
        light.on()
    }

}