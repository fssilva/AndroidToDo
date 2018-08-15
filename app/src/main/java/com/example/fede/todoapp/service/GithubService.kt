package com.example.fede.todoapp.service

import com.example.fede.todoapp.model.Repo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface GithubService {

    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String): Call<List<Repo>>
}