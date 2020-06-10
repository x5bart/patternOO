package com.example.p06_command_remote_control

class CeilingFanOnCommand(var ceilingFan: CeilingFan) :
    Command {
    override fun execute() {
        ceilingFan.high()
    }

}