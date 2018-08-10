package com.example.fede.todoapp.screen.splash

import com.example.fede.todoapp.screen.UIRouter

class SplashScreenPresenter(private val router: UIRouter): SplashScreenContract.Presenter {

    private var view: SplashScreenContract.View? = null

    override fun attach(view: SplashScreenContract.View) {
        this.view = view
    }

    override fun destroy() {
        this.view = null
    }

    override fun dashboardButtonTapped() {
        router.gotoDashboard(view?.context())
    }
}