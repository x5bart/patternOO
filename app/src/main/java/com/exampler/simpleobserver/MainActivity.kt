package com.exampler.simpleobserver

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
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
    lateinit var view: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view = findViewById(R.id.tv_CurrentConditions)
        weatherData = WeatherData()
        forecastDisplay = ForecastDisplay(weatherData)
        currentDisplay = CurrentConditionsDisplay(weatherData)
        statisticsDisplay = StatisticsDisplay(weatherData)




        bt_setValue.setOnClickListener {
            temperature = et_humidity.text.toString().toDouble()
            humidity = et_humidity.text.toString().toDouble()
            pressure = et_pressure.text.toString().toDouble()
            weatherData.setMeasurements(temperature, humidity, pressure)
        }


    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {

        return super.onCreateView(name, context, attrs)

    }
    fun updateCurrentDisplay(resultDisplay: String) {
        view = findViewById(R.id.tv_CurrentConditions)
        view.text = resultDisplay

    }
}
