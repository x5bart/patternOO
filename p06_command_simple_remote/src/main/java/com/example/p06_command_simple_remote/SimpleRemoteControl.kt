package com.example.p06_command_simple_remote

class SimpleRemoteControl {
    var slot: Command? = null

    fun setCommand(command: Command?) {
        slot = command
    }

    fun buttonWasPressed():String {
        return slot!!.execute()
    }
}