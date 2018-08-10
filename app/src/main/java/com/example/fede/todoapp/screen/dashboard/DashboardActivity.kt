package com.example.fede.todoapp.screen.dashboard

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.fede.todoapp.R
import com.example.fede.todoapp.di.DaggerActivityComponent
import javax.inject.Inject

class DashboardActivity : AppCompatActivity(), DashboardContract.View {


    @Inject
    override lateinit var presenter: DashboardContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        DaggerActivityComponent.create().inject(this)
    }

    override fun context(): Context {
        return this
    }
}
