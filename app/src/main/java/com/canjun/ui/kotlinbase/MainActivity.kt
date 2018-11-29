package com.canjun.ui.kotlinbase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //集合组装数据
    private val datas = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 31/7",
            "Wed 6/25 - Cloudy - 31/18",
            "Thurs 6/26 - Rainy - 31/23",
            "Fri 6/27 - XXX - 31/0"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView(): Unit {
        val forecastList = findViewById(R.id.forecast_list) as RecyclerView
        //类中的属性 可以直接通过. 操作访问
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(datas)
    }
}
