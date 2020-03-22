package com.exampler.a03_decorator_starbuzz

import android.util.Log

abstract class Beverage {

    var desc = "Unknown Beverage"


    open fun getDescription(): String? {
        return desc
    }

   abstract fun cost(): Double

}

