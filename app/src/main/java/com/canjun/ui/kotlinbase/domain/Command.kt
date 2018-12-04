package com.canjun.ui.kotlinbase.domain

/**
 *
 * created by zfc  on 2018/12/4.
 *
 */
interface Command<T> {
    fun excute(): T
}