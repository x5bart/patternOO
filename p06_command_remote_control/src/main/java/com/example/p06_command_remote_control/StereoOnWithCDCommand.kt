package com.example.p06_command_remote_control

class StereoOnWithCDCommand(var stereo: Stereo) :
    Command {
    override fun execute() {
        stereo.on()
        stereo.setCD()
        stereo.setVolume(11)
    }

}