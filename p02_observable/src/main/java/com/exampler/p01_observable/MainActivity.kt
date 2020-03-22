package com.exampler.p01_observable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        currentDisplay = CurrentConditionsDisplay(weatherData,this)
        forecastDisplay = ForecastDisplay(this)
        statisticsDisplay = StatisticsDisplay(this)
        heatIndexDisplay = HeatIndexDisplay(this)


        cb_currentConditions.setOnClickListener {
            if (cb_currentConditions.isChecked) {
                currentDisplay.add()
                tv_CurrentConditions.visibility = View.VISIBLE
//                set()
            } else {
                currentDisplay.remove()
                tv_CurrentConditions.visibility = View.GONE
            }
        }
//
        cb_forecastDisplay.setOnClickListener {
            if (cb_forecastDisplay.isChecked) {
                weatherData.addObserver(forecastDisplay)
                tv_ForecastDisplay.visibility = View.VISIBLE
                set()
            } else {
                weatherData.deleteObserver(forecastDisplay)
                tv_ForecastDisplay.visibility = View.GONE
            }
        }
//
        cb_statisticsDisplay.setOnClickListener {
            if (cb_statisticsDisplay.isChecked) {
                weatherData.addObserver(statisticsDisplay)
                tv_StatisticsDisplay.visibility = View.VISIBLE
                set()
            } else {
                weatherData.deleteObserver(statisticsDisplay)
                tv_StatisticsDisplay.visibility = View.GONE
            }
        }

        cb_heatIndexDisplay.setOnClickListener {
            if (cb_heatIndexDisplay.isChecked) {
                weatherData.addObserver(heatIndexDisplay)
                tv_heatIndexDisplay.visibility = View.VISIBLE
                set()
            } else {
                weatherData.deleteObserver(heatIndexDisplay)
                tv_heatIndexDisplay.visibility = View.GONE
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



