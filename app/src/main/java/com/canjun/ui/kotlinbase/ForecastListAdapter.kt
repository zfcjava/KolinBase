package com.canjun.ui.kotlinbase

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 *
 * created by zfc  on 2018/11/29.
 *
 */
class ForecastListAdapter(val items : List<String>): RecyclerView.Adapter<ForecastListAdapter.ViewHodler>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int) = ViewHodler(TextView(parent.context))


    override fun getItemCount() = items.size


    override fun onBindViewHolder(hodler: ViewHodler, position: Int) {
        //操作符重载
        hodler.textView.text = items[position]
    }


    /**
     * 没有实现内容，可以不写类体
     */
    class ViewHodler(val textView : TextView) : RecyclerView.ViewHolder(textView)
}