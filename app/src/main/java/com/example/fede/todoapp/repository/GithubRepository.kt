package com.example.fede.todoapp.repository

import com.example.fede.todoapp.model.Repo
import com.example.fede.todoapp.service.GithubService
import retrofit2.Callback

class GithubRepository (private val service: GithubService) {

    fun allRepositories(username: String, callback: Callback<List<Repo>>) {
        return service.listRepos(username).enqueue(callback)
    }
}