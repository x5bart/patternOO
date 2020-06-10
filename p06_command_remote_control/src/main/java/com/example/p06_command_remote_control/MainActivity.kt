package com.example.p06_command_remote_control

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val remoteControl = RemoteControl()

        val livingRoomLight = Light("Living Room")
        val kitchenLight = Light("Kitchen")
        val ceilingFan = CeilingFan("Living Room")
        val garageDoor = GarageDoor("")
        val stereo = Stereo("Living Room")

        val livingRoomLightOn = LightOnCommand(livingRoomLight)
        val livingRoomLightOff = LightOffCommand(livingRoomLight)
        val kitchenLightOn = LightOnCommand(kitchenLight)
        val kitchenLightOff = LightOffCommand(kitchenLight)

        val ceilingFanOn = CeilingFanOnCommand(ceilingFan)
        val ceilingFanOff = CeilingFanOffCommand(ceilingFan)

        val garageDoorUp = GarageDoorUpCommand(garageDoor)
        val garageDoorDown = GarageDoorDownCommand(garageDoor)

        val stereoOnWithCD = StereoOnWithCDCommand(stereo)
        val stereoOff = StereoOffCommand(stereo)

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff)
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff)
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff)

        println(remoteControl)

        remoteControl.onButtonWasPushed(0)
        remoteControl.offButtonWasPushed(0)
        remoteControl.onButtonWasPushed(1)
        remoteControl.offButtonWasPushed(1)
        remoteControl.onButtonWasPushed(2)
        remoteControl.offButtonWasPushed(2)
        remoteControl.onButtonWasPushed(3)
        remoteControl.offButtonWasPushed(3)
        et_btn1.setOnClickListener {

        }

    }
}
