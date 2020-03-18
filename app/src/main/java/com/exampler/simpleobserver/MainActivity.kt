package com.exampler.simpleobserver

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

const val TAG = "MyLogs"

class MainActivity : AppCompatActivity() {
    lateinit var weatherData: WeatherData
    lateinit var currentDisplay: CurrentConditionsDisplay

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weatherData = WeatherData()
        weatherData.weatherData()

        currentDisplay = CurrentConditionsDisplay()
        currentDisplay.currentConditionsDisplay(weatherData)



        weatherData.setMeasurements(80.0,65.0,30.4)
//        weatherData.setMeasurements(82.0,70.0,29.2)
//        weatherData.setMeasurements(78.0,90.0,29.2)


    }


}
