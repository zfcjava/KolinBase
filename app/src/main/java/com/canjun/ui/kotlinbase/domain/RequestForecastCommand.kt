package com.canjun.ui.kotlinbase.domain

import com.canjun.ui.kotlinbase.request.ForecastRequest

/**
 *
 * created by zfc  on 2018/12/4.
 *
 */
class RequestForecastCommand(val zipCode:String):

    Command<ForecastList>{
    override fun excute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.excute())
    }
}