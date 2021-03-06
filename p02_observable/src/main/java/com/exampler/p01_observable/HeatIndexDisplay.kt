package com.exampler.p01_observable

import android.content.Context
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class HeatIndexDisplay(context: Context) : Observer, DisplayElement {
    private var heatIndex = 0.0
    private val context: MainActivity = context as MainActivity


    override fun update(obs: Observable?, arg: Any?) {
        if (obs is WeatherData) {
            val weatherData: WeatherData = obs
            val t = weatherData.getTemperature()
            val rh = weatherData.getHumidity()
            heatIndex = computeHeatIndex(t, rh)
            display()
        }
    }

    override fun display() {
        val resultDisplay = "Heat index is $heatIndex"
        context.tv_heatIndexDisplay.text = resultDisplay

    }


    private fun computeHeatIndex(t: Double, rh: Double): Double {
        return ((16.923 + 0.185212 * t + 5.37941 * rh - 0.100254 * t * rh + 0.00941695 * (t * t) + 0.00728898 * (rh * rh)
                + 0.000345372 * (t * t * rh)) - 0.000814971 * (t * rh * rh) +
                0.0000102102 * (t * t * rh * rh) - 0.000038646 * (t * t * t) + 0.0000291583 *
                (rh * rh * rh) + 0.00000142721 * (t * t * t * rh) +
                0.000000197483 * (t * rh * rh * rh) - 0.0000000218429 * (t * t * t * rh * rh) +
                0.000000000843296 * (t * t * rh * rh * rh) -
                0.0000000000481975 * (t * t * t * rh * rh * rh))
    }

}