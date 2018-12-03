package com.canjun.ui.kotlinbase.date

/**
 *
 * created by zfc  on 2018/12/4.
 *
 */

data class Forecast(val dt: Long, val tmp: Temperature, val pressure: Float,
                    val humidity: Int, val weather: List<Weather>,
                    val speed: Float, val deg: Int, val clouds: Int, val rain: Float)
