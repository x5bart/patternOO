package com.exampler.p03_io

import android.content.Context
import android.widget.TextView
import android.widget.Toast
import java.io.*

class InputOutputStream(context: Context) {

    private val context: MainActivity = context as MainActivity


    // путь к файлу который будем читать и записывать
    private val path: String? = context.getExternalFilesDir("text").toString()
    private lateinit var file: File


    fun read(textView: TextView, fileName: String) {
        file = File(path + File.separator + fileName)
        if (file.exists()) {
            val inputStream = file.inputStream()
            val bufferSize = 1024
            val buffer = CharArray(bufferSize)
            val out = StringBuilder()
            val `in`: Reader = InputStreamReader(inputStream, "UTF-8")
            while (true) {
                val rsz: Int = `in`.read(buffer, 0, buffer.size)
                if (rsz < 0) break
                out.append(buffer, 0, rsz)
            }
            textView.text = out
        } else {
            Toast.makeText(context, "not file for read", Toast.LENGTH_SHORT).show()
        }
    }

    fun readWithlowerCase(textView: TextView, fileName: String) {
        file = File(path + File.separator + fileName)
        val lowerCaseInputStream = LowerCaseInputStream(
            BufferedInputStream(
                FileInputStream(file)
            )
        )
        val bufferSize = 1024
        val buffer = CharArray(bufferSize)
        val out = StringBuilder()
        val reader: Reader = InputStreamReader(lowerCaseInputStream, "UTF-8")
        while (true) {
            val rsz: Int = reader.read(buffer, 0, buffer.size)
            if (rsz < 0) break
            out.append(buffer, 0, rsz)
        }
        textView.text = out
    }
    fun readWithUpperCase(textView: TextView, fileName: String) {
        file = File(path + File.separator + fileName)
        val upperCaseInputSream = UpperCaseInputSream(
            BufferedInputStream(
                FileInputStream(file)
            )
        )
        val bufferSize = 1024
        val buffer = CharArray(bufferSize)
        val out = StringBuilder()
        val reader: Reader = InputStreamReader(upperCaseInputSream, "UTF-8")
        while (true) {
            val rsz: Int = reader.read(buffer, 0, buffer.size)
            if (rsz < 0) break
            out.append(buffer, 0, rsz)
        }
        textView.text = out
    }


    // запись в файл используя OutputStream
    fun write(st: String, fileName: String) {
        file = File(path + File.separator + fileName)
        // инициализируем поток для вывода данных
        // что позволит нам записать новые данные в файл
        val outputStream = FileOutputStream(file)
        // передаем полученную строку st и приводим её к byte массиву.
        outputStream.write(st.toByteArray())
        // закрываем поток вывода
        // только после того как мы закроем поток данные попадут в файл.
        outputStream.close()
    }
}