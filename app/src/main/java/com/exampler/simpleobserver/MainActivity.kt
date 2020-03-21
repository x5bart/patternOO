package com.exampler.simpleobserver

import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

const val TAG = "MyLogs"

class MainActivity : AppCompatActivity() {
    lateinit var weatherData: WeatherData
    lateinit var currentDisplay: CurrentConditionsDisplay
    lateinit var forecastDisplay: ForecastDisplay
    lateinit var statisticsDisplay: StatisticsDisplay
    lateinit var heatIndexDisplay: HeatIndexDisplay
    private var temperature = 0.0
    private var humidity = 0.0
    private var pressure = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        weatherData = WeatherData(this)
        currentDisplay = CurrentConditionsDisplay(this)
        forecastDisplay = ForecastDisplay(this)
        statisticsDisplay = StatisticsDisplay(this)
        heatIndexDisplay = HeatIndexDisplay(this)


        cb_currentConditions.setOnClickListener {
            if (cb_currentConditions.isChecked) {
                currentDisplay.add(weatherData)
                tv_CurrentConditions.visibility = VISIBLE
                set()
            } else {
                currentDisplay.remove(weatherData)
                tv_CurrentConditions.visibility = GONE
            }
        }

        cb_forecastDisplay.setOnClickListener {
            if (cb_forecastDisplay.isChecked) {
                forecastDisplay.add(weatherData)
                tv_ForecastDisplay.visibility = VISIBLE
                set()
            } else {
                forecastDisplay.remove(weatherData)
                tv_ForecastDisplay.visibility = GONE
            }
        }

        cb_statisticsDisplay.setOnClickListener {
            if (cb_statisticsDisplay.isChecked) {
                statisticsDisplay.add(weatherData)
                tv_StatisticsDisplay.visibility = VISIBLE
                set()
            } else {
                statisticsDisplay.remove(weatherData)
                tv_StatisticsDisplay.visibility = GONE
            }
        }

        cb_heatIndexDisplay.setOnClickListener {
            if (cb_heatIndexDisplay.isChecked) {
                heatIndexDisplay.add(weatherData)
                tv_heatIndexDisplay.visibility = VISIBLE
                set()
            } else {
                heatIndexDisplay.remove(weatherData)
                tv_heatIndexDisplay.visibility = GONE
            }
        }

        bt_setValue.setOnClickListener {
            set()
        }
    }

    fun set() {
        temperature = et_temperature.text.toString().toDouble()
        humidity = et_humidity.text.toString().toDouble()
        pressure = et_pressure.text.toString().toDouble()
        weatherData.setMeasurements(temperature, humidity, pressure)
    }
}



