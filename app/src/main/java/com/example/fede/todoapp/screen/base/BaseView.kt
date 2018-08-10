package com.example.fede.todoapp.screen.base

import android.content.Context

interface BaseView<T> {

    var presenter: T

    fun context(): Context

}