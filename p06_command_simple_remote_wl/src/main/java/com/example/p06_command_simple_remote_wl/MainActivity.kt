package com.example.p06_command_simple_remote_wl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val remote = SimpleRemoteControl()
        val light =  Light()
        val garageDoor = GarageDoor()

        remote.setCommand(object : Command {
            override fun execute() {
                light.on()
            }
        })
        remote.buttonWasPressed()
        remote.setCommand(object : Command {
            override fun execute() {
                garageDoor.up()
            }
        })
        remote.buttonWasPressed()
        remote.setCommand(object : Command {
            override fun execute() {
                garageDoor.lightOn()
            }
        })
        remote.buttonWasPressed()
        remote.setCommand(object : Command {
            override fun execute() {
                garageDoor.lightOff()
            }
        })
        remote.buttonWasPressed()
    }
}
