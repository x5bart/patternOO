package com.exampler.a03_decorator_starbuzz

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View.*
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

const val TAG = "Mylog"

class MainActivity : AppCompatActivity() {

    lateinit var beverage: Beverage
    var btnCondimend = false
    var sumCost = 0.0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hideCondiments()

        btn_darkRoast.setOnClickListener {
            beverage = DarkRoast()
            tv_preResult.text = "${beverage.getDescription()} $  ${beverage.cost()}"
            showCondiments()
            hideBeverage(btn_darkRoast)
        }

        btn_decaf.setOnClickListener {
            beverage = Decaf()
            tv_preResult.text = "${beverage.getDescription()} $  ${beverage.cost()}"
            showCondiments()
            hideBeverage(btn_decaf)
        }

        btn_espresso.setOnClickListener {
            beverage = Espresso()
            tv_preResult.text = "${beverage.getDescription()} $  ${beverage.cost()}"
            showCondiments()
            hideBeverage(btn_espresso)
        }

        btn_houseBlend.setOnClickListener {
            beverage = HouseBlend()
            tv_preResult.text = "${beverage.getDescription()} $  ${beverage.cost()}"
            showCondiments()
            hideBeverage(btn_houseBlend)
        }

        btn_mocha.setOnClickListener {
            beverage = Mocha(beverage)
            tv_preResult.text = "${beverage.getDescription()} $ ${beverage.cost()}"
        }

        btn_soy.setOnClickListener {
            beverage = Soy(beverage)
            tv_preResult.text = "${beverage.getDescription()} $ ${beverage.cost()}"
        }
        btn_whip.setOnClickListener {
            beverage = Whip(beverage)
            tv_preResult.text = "${beverage.getDescription()} $ ${beverage.cost()}"
        }
        btn_addBeverage.setOnClickListener {
            val preResult = tv_preResult.text.toString()
            tv_preResult.text = ""
            val result = tv_result.text.toString()
            tv_result.text = "$result \n $preResult"
            hideCondiments()
            showBeverage()
            showCost()
        }

        btn_clear.setOnClickListener {
            tv_preResult.text = ""
            tv_result.text = ""
            tv_sumCost.text = ""
            hideCondiments()
        }

    }

    private fun showCondiments() {
        btn_mocha.visibility = VISIBLE
        btn_soy.visibility = VISIBLE
        btn_whip.visibility = VISIBLE
    }

    private fun hideCondiments() {
        btn_mocha.visibility = GONE
        btn_soy.visibility = GONE
        btn_whip.visibility = GONE
    }

    fun hideBeverage(view: Button) {
        when (view) {
            btn_darkRoast -> {
                btn_decaf.visibility = INVISIBLE
                btn_espresso.visibility = INVISIBLE
                btn_houseBlend.visibility = INVISIBLE
            }
            btn_decaf -> {
                btn_darkRoast.visibility = INVISIBLE
                btn_espresso.visibility = INVISIBLE
                btn_houseBlend.visibility = INVISIBLE
            }
            btn_espresso -> {
                btn_darkRoast.visibility = INVISIBLE
                btn_decaf.visibility = INVISIBLE
                btn_houseBlend.visibility = INVISIBLE
            }
            btn_houseBlend -> {
                btn_darkRoast.visibility = INVISIBLE
                btn_decaf.visibility = INVISIBLE
                btn_espresso.visibility = INVISIBLE
            }
        }
    }

    fun showBeverage() {
        btn_darkRoast.visibility = VISIBLE
        btn_decaf.visibility = VISIBLE
        btn_espresso.visibility = VISIBLE
        btn_houseBlend.visibility = VISIBLE
    }

    @SuppressLint("SetTextI18n")
    fun showCost() {
        sumCost += beverage.cost()
        tv_sumCost.text = "Cost: \$ $sumCost"
    }

}
