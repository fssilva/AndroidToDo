package com.example.fede.todoapp.screen.dashboard

import com.example.fede.todoapp.model.Repo
import com.example.fede.todoapp.repository.GithubRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DashboardPresenter(private val githubRepository: GithubRepository): DashboardContract.Presenter, Callback<List<Repo>> {

    var view: DashboardContract.View? = null

    override fun attach(view: DashboardContract.View) {
        this.view = view
        githubRepository.allRepositories("fssilva", this)
    }

    override fun destroy() {
        this.view = null
    }

    override fun onFailure(call: Call<List<Repo>>?, t: Throwable?) {}

    override fun onResponse(call: Call<List<Repo>>?, response: Response<List<Repo>>?) {
        if (response?.isSuccessful == true) {
            // Do something
        }

    }

}