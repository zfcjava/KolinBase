package com.canjun.ui.kotlinbase.domain

import com.canjun.ui.kotlinbase.date.Forecast
import com.canjun.ui.kotlinbase.date.ForecastResult
import java.text.DateFormat
import java.util.*
import com.canjun.ui.kotlinbase.domain.Forecast as ModelForecast

/**
 *
 * created by zfc  on 2018/12/4.
 *
 */
public class ForecastDataMapper{

    fun convertFromDataModel(forecast: ForecastResult): ForecastList {
        return ForecastList(forecast.city.name,forecast.city.country,convertForecastListToDomain(forecast.list))
    }

    private fun convertForecastListToDomain(list: List<Forecast>): List<ModelForecast> {
        return list.map { convertForecastItemToDomain(it) }
    }

    private fun convertForecastItemToDomain(forecast: Forecast): ModelForecast {
        return ModelForecast(convertDate(forecast.dt),forecast.weather[0].description,
                forecast.tmp.max.toInt(),
                forecast.tmp.min.toInt())
    }

    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date * 1000)
    }
}