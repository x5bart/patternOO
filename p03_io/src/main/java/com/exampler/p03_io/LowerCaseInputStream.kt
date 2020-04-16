package com.exampler.p03_io

import java.io.FilterInputStream
import java.io.IOException
import java.io.InputStream

class LowerCaseInputStream(inputStream: InputStream?) : FilterInputStream(inputStream) {

//    @Throws(IOException::class)
//    override fun read(): Int {
//        val c = `in`.read()
//        return (if (c == -1) c else Character.toLowerCase(c.toChar()).toInt())
//    }

    @Throws(IOException::class)
    override fun read(b: ByteArray, offset: Int, len: Int): Int {
        val result = `in`.read(b, offset, len)
        for (i in offset until offset + result) {
            b[i] = Character.toLowerCase(b[i].toChar()).toByte()
            
        }
        return result
    }
}