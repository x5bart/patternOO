package com.exampler.p03_io

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var inputOutputStream: InputOutputStream
    private val file1 = "file1.txt"
    private val file2 = "file2.txt"
    lateinit var file: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputOutputStream = InputOutputStream(this)


        bt_read.setOnClickListener {
            radiobuttonCheck()
            if (cb_lowerCase.isChecked && cb_UpperCase.isChecked) {
                Toast.makeText(this, "Please select only one filter", Toast.LENGTH_SHORT).show()
            } else {
                when {
                    cb_lowerCase.isChecked -> inputOutputStream.readWithlowerCase(tv_result, file)
                    cb_UpperCase.isChecked -> inputOutputStream.readWithUpperCase(tv_result, file)
                    else -> inputOutputStream.read(tv_result, file)
                }
            }
        }

        bt_write.setOnClickListener {
            radiobuttonCheck()
            val st = et_editText.text.toString()
            inputOutputStream.write(st, file)
            et_editText.text.clear()
            Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show()
        }


    }

    private fun radiobuttonCheck() {
        if (rb_file1.isChecked) file = file1
        if (rb_file2.isChecked) file = file2
    }


}
