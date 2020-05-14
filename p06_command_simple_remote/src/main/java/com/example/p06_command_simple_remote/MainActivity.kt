package com.example.p06_command_simple_remote

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var slot: Command? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val remote = SimpleRemoteControl()

        bt_check.setOnClickListener {
            checkSlot()
            remote.setCommand(slot)
            val result = remote.buttonWasPressed()
            tv_result.text = result
        }
    }

    private fun checkSlot() {
        val light = Light()
        val garageDoor = GarageDoor()
        when {
            rb_lightsOn.isChecked -> slot = LightOnCommand(light)
            rb_lightsOff.isChecked -> slot = LightOffCommand(light)
            rb_garageDoorOpen.isChecked -> slot = GarageDoorOpenCommand(garageDoor)
            rb_garageDoorClose.isChecked -> slot = GarageDoorCloseCommand(garageDoor)
            rb_garageDoorStop.isChecked -> slot = GarageDoorStopCommand(garageDoor)
            rb_garageDoorLightsOn.isChecked -> slot = GarageDoorLightsOnCommand(garageDoor)
            rb_garageDoorLightsOff.isChecked -> slot = GarageDoorLightsOffCommand(garageDoor)
        }
    }
}
