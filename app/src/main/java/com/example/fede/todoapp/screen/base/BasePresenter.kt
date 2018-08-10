package com.example.fede.todoapp.screen.base

interface BasePresenter<T> {

    fun attach(view: T)
    fun destroy()
}