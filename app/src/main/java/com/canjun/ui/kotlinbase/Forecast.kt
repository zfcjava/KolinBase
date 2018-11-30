package com.canjun.ui.kotlinbase

import android.util.Log
import java.util.*

/**
 *
 * created by zfc  on 2018/11/30.
 *
 * 另外除了 getter setter方法 ，还有
 * equals()
 * hashCode()
 * copy() 方法
 *
 */
data class Forecast(val date: Date, val temperature: Float, val details: String){

    val TAG = javaClass.simpleName


    fun printInfo() {
        Log.e(TAG, "date = " + date.toString())
        Log.e(TAG, "temperature = " + temperature.toString())
        Log.e(TAG, "details = " + details.toString())
    }
}
