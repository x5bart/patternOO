package com.example.p05_singleton_classic

import android.util.Log

object Singleton {

    private var uniqueInstance: Singleton? = null
    var count = 0
    var countInit = 0

    init {
        countInit++
        Log.d(TAG, "Singleton init $Singleton count $countInit")

    }


    // other useful methods here
    fun getDescription(): String? {
        count++
        return "I'm a classic Singleton! use $count"
    }

}