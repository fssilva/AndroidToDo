package com.example.fede.todoapp.screen.splash

import com.example.fede.todoapp.di.AppModule
import dagger.Component


@Component(modules = [SplashScreenModule::class, AppModule::class])
interface SplashScreenComponent {
    fun inject(activity: SplashScreenActivity)
}