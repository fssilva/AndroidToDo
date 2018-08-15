package com.example.fede.todoapp.screen.splash

import com.example.fede.todoapp.di.AppModule
import dagger.Component

@Component(modules = [AppModule::class])
interface TestSplashScreenComponent {
    fun inject(test: SplashScreenPresenterTest)
}