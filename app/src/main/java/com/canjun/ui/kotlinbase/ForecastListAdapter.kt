package com.canjun.ui.kotlinbase

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.canjun.ui.kotlinbase.domain.ForecastList

/**
 *
 * created by zfc  on 2018/11/29.
 *
 */
class ForecastListAdapter(val weekForecast : ForecastList): RecyclerView.Adapter<ForecastListAdapter.ViewHodler>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int) = ViewHodler(TextView(parent.context))


    override fun getItemCount() = weekForecast.size()


    override fun onBindViewHolder(hodler: ViewHodler, position: Int) {
        with(weekForecast[position]){
            hodler.textView.text = "$date---$description---$high/$low"
        }
    }


    /**
     * 没有实现内容，可以不写类体
     */
    class ViewHodler(val textView : TextView) : RecyclerView.ViewHolder(textView)
}