package com.canjun.ui.kotlinbase.domain

import com.canjun.ui.kotlinbase.date.City

/**
 *
 * created by zfc  on 2018/12/4.
 *
 */
data class ForecastList(val city: String,val country:String,val dailyForecast:List<Forecast>)