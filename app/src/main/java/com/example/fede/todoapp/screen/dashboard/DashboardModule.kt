package com.example.fede.todoapp.screen.dashboard

import com.example.fede.todoapp.repository.GithubRepository
import dagger.Module
import dagger.Provides

@Module
open class DashboardModule {
    @Provides
    open fun provideDashboardPresenter(service: GithubRepository): DashboardContract.Presenter {
        return DashboardPresenter(service)
    }
}