package com.example.fede.todoapp.screen.dashboard

import com.example.fede.todoapp.screen.base.BasePresenter
import com.example.fede.todoapp.screen.base.BaseView

interface DashboardContract {

    interface View : BaseView<Presenter>

    interface Presenter: BasePresenter<View>
}