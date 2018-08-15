package com.example.fede.todoapp.di

import com.example.fede.todoapp.screen.UIRouter
import dagger.Module
import dagger.Provides


@Module
open class AppModule {

    @Provides
    open fun provideRouter(): UIRouter {
        return UIRouter.IMPL
    }
}