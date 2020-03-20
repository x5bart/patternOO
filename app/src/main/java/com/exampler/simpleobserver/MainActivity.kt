package com.exampler.simpleobserver

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

const val TAG = "MyLogs"

class MainActivity : AppCompatActivity() {
    lateinit var weatherData: WeatherData
    lateinit var currentDisplay: CurrentConditionsDisplay
    lateinit var forecastDisplay: ForecastDisplay
    lateinit var statisticsDisplay: StatisticsDisplay
    private var temperature = 0.0
    private var humidity = 0.0
    private var pressure = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        weatherData = WeatherData()
        forecastDisplay = ForecastDisplay(weatherData, this)
        currentDisplay = CurrentConditionsDisplay(weatherData, this)
        statisticsDisplay = StatisticsDisplay(weatherData, this)

        bt_setValue.setOnClickListener {
            temperature = et_temperature.text.toString().toDouble()
            humidity = et_humidity.text.toString().toDouble()
            pressure = et_pressure.text.toString().toDouble()
            weatherData.setMeasurements(temperature, humidity, pressure)
        }

    }

}
