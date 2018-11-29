package com.canjun.ui.kotlinbase

import android.util.Log
import java.net.URL

/**
 *
 * created by zfc  on 2018/11/29.
 *
 */
class Request(val url: String) {
    fun run(){
        val forecastJson = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJson)
    }
}