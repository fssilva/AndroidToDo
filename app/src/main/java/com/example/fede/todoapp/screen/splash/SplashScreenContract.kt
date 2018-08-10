package com.example.fede.todoapp.screen.splash

import com.example.fede.todoapp.screen.base.BasePresenter
import com.example.fede.todoapp.screen.base.BaseView

interface SplashScreenContract {

    interface View: BaseView<Presenter>

    interface Presenter: BasePresenter<View> {
        fun dashboardButtonTapped()
    }
}