package com.example.fede.todoapp.screen.splash

import com.example.fede.todoapp.screen.UIRouter
import dagger.Module
import dagger.Provides

@Module
open class SplashScreenModule {
    @Provides
    open fun provideSplashScreenPresenter(router: UIRouter): SplashScreenContract.Presenter {
        return SplashScreenPresenter(router)
    }
}