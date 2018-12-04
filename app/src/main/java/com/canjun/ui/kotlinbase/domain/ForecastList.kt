package com.canjun.ui.kotlinbase.domain
/**
 *
 * created by zfc  on 2018/12/4.
 *
 */
data class ForecastList(val city: String,val country:String,val dailyForecast:List<Forecast>){
    //操作符进行重载
    operator fun get(position: Int) = dailyForecast[position]
    fun size()= dailyForecast.size
}