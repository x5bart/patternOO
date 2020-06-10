package com.example.p06_command_remote_control

class StereoOffCommand(var stereo: Stereo) :
    Command {
    override fun execute() {
        stereo.off()
    }

}