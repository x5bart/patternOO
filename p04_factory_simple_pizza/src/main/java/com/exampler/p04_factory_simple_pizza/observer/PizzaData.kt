package com.exampler.p04_factory_simple_pizza.observer

import android.util.Log
import com.exampler.p04_factory_simple_pizza.TAG

class PizzaData() : Subject {
    private var observers: ArrayList<Observer>? = null
    private var prepare = ""
    private var bake = ""
    private var cut = ""
    private var box = ""


    init {
        observers = ArrayList()
    }

    override fun registerObserver(o: Observer) {
        val i = observers?.indexOf(o)
        val observerName = o.toString().substringAfter("observer.").substringBefore("@")
        var isContains = observers!!.toString().contains(observerName)
//        Log.d(TAG, " registerObserver i:$i o:$observers")
//        Log.d(TAG, " registerObserver i:$i o:$observerName isContains:$isContains")
        if (!isContains) {
            observers!!.add(o)
//            Toast.makeText(context, "$observerName added", Toast.LENGTH_SHORT).show()
//            Log.d(TAG, " registerObserver i:$i o:$observers")
        }
        isContains = observers!!.toString().contains(observerName)
//        Log.d(TAG, " registerObserver i:$i o:$observerName isContains:$isContains")
    }

    override fun removeObserver(o: Observer) {
        val observerName = o.toString().substringAfter("observer.").substringBefore("@")
        val isContains = observers!!.toString().contains(observerName)

        val i = observers!!.indexOf(o)
        Log.d(TAG, "removeObserver $o")
        Log.d(TAG, "removeObserver i:$i o:$observers")
        Log.d(TAG, "removeObserver i:$i o:$observerName isContains:$isContains")
        if (i >= 0) {
            observers!!.removeAt(i)
        }
        Log.d(TAG, "removeObserver i:$i o:$observers")
    }

    override fun notifyObserver() {
//        Log.d(TAG, "notifyObserver()")

        Log.d(TAG, "notifyObserver(): observers:$observers")

        for (i in observers!!.indices) {
            Log.d(
                TAG, "${observers!![i]}: \n" +
                        "prepare: $prepare, \n" +
                        "bake: $bake, \n" +
                        "cut: $cut, \n" +
                        "box: $box"
            )
//            Log.d(TAG, "${observers!![i].update(prepare, bake, cut, box)}")
            observers!![i].update(prepare, bake, cut, box)
        }
    }

    private fun progressChanged() {
        Log.d(TAG, "progressChanged()")
        notifyObserver()
    }

    fun setProgress(prepare: String, bake: String, cut: String, box: String) {
        this.prepare = prepare
        this.bake = bake
        this.cut = cut
        this.box = box
//        Log.d(TAG, "setProgress: \nprepare: $prepare, \nbake: $bake, \ncut: $cut, \nbox: $box")
        progressChanged()

    }
}