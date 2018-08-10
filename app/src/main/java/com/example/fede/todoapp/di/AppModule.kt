package com.example.fede.todoapp.di

import com.example.fede.todoapp.screen.UIRouter
import com.example.fede.todoapp.screen.dashboard.DashboardContract
import com.example.fede.todoapp.screen.dashboard.DashboardPresenter
import com.example.fede.todoapp.screen.splash.SplashScreenContract
import com.example.fede.todoapp.screen.splash.SplashScreenPresenter
import dagger.Module
import dagger.Provides


@Module
open class AppModule {

    @Provides
    open fun provideRouter(): UIRouter {
        return UIRouter.IMPL
    }

    @Provides
    open fun provideSplashScreenPresenter(router: UIRouter): SplashScreenContract.Presenter {
        return SplashScreenPresenter(router)
    }

    @Provides
    open fun provideDashboardPresenter(): DashboardContract.Presenter {
        return DashboardPresenter()
    }
}