package com.example.p06_command_remote_control

class RemoteControl {
    var onCommands: Array<Command?>
    var offCommands: Array<Command?>


    init {
        onCommands = arrayOfNulls<Command>(7)
        offCommands = arrayOfNulls<Command>(7)
        val noCommand: Command = NoCommand()
        for (i in 0..6) {
            onCommands[i] = noCommand
            offCommands[i] = noCommand
        }
    }

    fun setCommand(slot: Int, onCommand: Command?, offCommand: Command?) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot]?.execute()
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot]?.execute()
    }

    override fun toString(): String {
        val stringBuff = StringBuffer()
        stringBuff.append("\n------ Remote Control -------\n")
        for (i in onCommands.indices) {
            stringBuff.append(
                """[slot $i] ${onCommands[i]?.javaClass?.name} ${offCommands[i]?.javaClass?.name}"""
            )
        }
        return stringBuff.toString()
    }
}