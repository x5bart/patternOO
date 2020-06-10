package com.example.p06_command_remote_control

class LightOffCommand(var light: Light) :
    Command {
    override fun execute() {
        light.off()
    }

}