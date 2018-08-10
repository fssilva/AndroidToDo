package com.example.fede.todoapp.di

import com.example.fede.todoapp.screen.dashboard.DashboardActivity
import com.example.fede.todoapp.screen.splash.SplashScreenActivity
import com.example.fede.todoapp.screen.splash.SplashScreenPresenter
import dagger.Component

@Component(modules = [AppModule::class])
interface ActivityComponent {
    fun inject(activity: SplashScreenActivity)
    fun inject(activity: DashboardActivity)
}