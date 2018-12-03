package com.canjun.ui.kotlinbase.request

import com.canjun.ui.kotlinbase.date.ForecastResult
import com.google.gson.Gson
import java.net.URL

/**
 *
 * created by zfc  on 2018/12/4.
 *
 */
public class ForecastRequest(val zipCode: String) {

    companion object {
        private val APP_ID = "15646a06818f61f7b8d7823ca833e1ce"

        private val URL = "http://api.openweathermap.org/data/2.5/"+
                "forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "$URL&APPID=$APP_ID&q="


    }

    public fun excute():ForecastResult{
        val forecastJsonStr = URL(COMPLETE_URL + zipCode).readText()
        return Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
    }
}