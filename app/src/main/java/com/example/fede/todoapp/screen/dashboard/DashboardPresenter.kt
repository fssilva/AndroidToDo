package com.example.fede.todoapp.screen.dashboard

class DashboardPresenter: DashboardContract.Presenter {

    var view: DashboardContract.View? = null

    override fun attach(view: DashboardContract.View) {
        this.view = view
    }

    override fun destroy() {
        this.view = null
    }

}