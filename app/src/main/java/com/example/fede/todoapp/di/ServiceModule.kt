package com.example.fede.todoapp.di

import com.example.fede.todoapp.repository.GithubRepository
import com.example.fede.todoapp.service.GithubService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class ServiceModule {
    @Provides
    fun provideGithubService(): GithubService {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        return retrofit.create<GithubService>(GithubService::class.java)
    }

    @Provides
    fun provideGithubRepository(service: GithubService): GithubRepository {
        return GithubRepository(service)
    }
}