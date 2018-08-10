package com.example.fede.todoapp.di

import com.example.fede.todoapp.screen.splash.SplashScreenPresenterTest
import dagger.Component

@Component(modules = [AppModule::class])
interface TestPresenterComponent {
    fun inject(test: SplashScreenPresenterTest)
}