package com.canjun.ui.kotlinbase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.canjun.ui.kotlinbase.domain.RequestForecastCommand
import org.jetbrains.anko.custom.async
import org.jetbrains.anko.find
import org.jetbrains.anko.longToast
import org.jetbrains.anko.uiThread
import java.util.*

class MainActivity : AppCompatActivity() {

    //集合组装数据
    private val datas = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 31/7",
            "Wed 6/25 - Cloudy - 31/18",
            "Thurs 6/26 - Rainy - 31/23",
            "Fri 6/27 - XXX - 31/0"
    )

    private val map = mapOf(
        "zfc" to "cangzhou",
        "hy" to "baoding",
        "xcc" to "baocnag"
    )

    private val url = "https://openweathermap.org/find?q=%E5%8C%97%E4%BA%AC"

    private lateinit var forecastList:RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initData()
//        copyDataDomain()
//        useMap()
    }


    private fun initData() {
        async {
            val result = RequestForecastCommand("94043").excute()
            uiThread {
                longToast("request Performed")
                forecastList.adapter = ForecastListAdapter(result)
            }
        }
    }

    fun initView() {

        forecastList = find(R.id.forecast_list)
        //类中的属性 可以直接通过. 操作访问
        forecastList.layoutManager = LinearLayoutManager(this)

    }



    private fun copyDataDomain() {
        val orignalData = Forecast(Date(), 20F, "beijing")
        Log.e(javaClass.simpleName, "original data " + orignalData.toString())
        val changedData = orignalData.copy(temperature = 10F)
        Log.e(javaClass.simpleName, "changed data " + changedData.toString())

        val (date, temperature, details) = changedData.copy(date = Date()
        ,temperature = -10F,details = "cangzhou")

        Log.e(javaClass.simpleName, "date " + date.toString())
        Log.e(javaClass.simpleName, "temperature " + temperature.toString())
        Log.e(javaClass.simpleName, "details " + details.toString())
    }

    private fun useMap() {
        for ((key, value) in map) {
            Log.e("map", "key = $key, value = $value")
        }
    }
}
