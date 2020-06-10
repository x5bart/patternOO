package com.example.p06_command_remote_control

class CeilingFanOffCommand(var ceilingFan: CeilingFan) :
    Command {
    override fun execute() {
        ceilingFan.off()
    }

}