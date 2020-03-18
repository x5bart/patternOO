package com.exampler.simpleobserver

import android.os.Bundle
import android.widget.TextView
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
    lateinit var tv_CC: TextView
    lateinit var resultDisplay: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        weatherData = WeatherData()
        forecastDisplay = ForecastDisplay(weatherData)
        currentDisplay = CurrentConditionsDisplay(weatherData)
        statisticsDisplay = StatisticsDisplay(weatherData)

        tv_CC = findViewById(R.id.tv_CurrentConditions)

        bt_setValue.setOnClickListener {
            temperature = et_humidity.text.toString().toDouble()
            humidity = et_humidity.text.toString().toDouble()
            pressure = et_pressure.text.toString().toDouble()
            weatherData.setMeasurements(temperature, humidity, pressure)
        }


    }

    fun updateCurrentDisplay(resultDisplay: String) {
        this.resultDisplay = resultDisplay
        tv_CurrentConditions.text = resultDisplay
    }


}
