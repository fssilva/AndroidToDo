package com.example.fede.todoapp.screen.dashboard

import com.example.fede.todoapp.di.ServiceModule
import dagger.Component

@Component(modules = [DashboardModule::class, ServiceModule::class])
interface DashboardComponent {
    fun inject(activity: DashboardActivity)
}