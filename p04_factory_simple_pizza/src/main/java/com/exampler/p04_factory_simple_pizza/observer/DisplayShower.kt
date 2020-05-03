package com.exampler.p04_factory_simple_pizza.observer

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.widget.TextView
import com.exampler.p04_factory_simple_pizza.MainActivity
import com.exampler.p04_factory_simple_pizza.TAG
import kotlinx.android.synthetic.main.activity_main.*

class DisplayShower(context: Context) : Observer, DisplayElement {
    private var prepare = "."
    private var bake = "."
    private var cut = "."
    private var box = "."

    private val context = context as MainActivity

    override fun update(prepare: String, bake: String, cut: String, box: String) {
        Log.d(TAG,"DisplayShower: update()")
        this.prepare = prepare
        this.bake = bake
        this.cut = cut
        this.box = box
        display()
    }

    override fun display() {
        context.tv_processShower.text = "$prepare \n$bake \n$cut \n$box"
        Log.d(TAG,"DisplayShower: display() \n $prepare \n" +
                "$bake \n" +
                "$cut \n" +
                box
        )
        context.tv_processShower.text = "$prepare \n$bake \n$cut \n$box"
    }


}