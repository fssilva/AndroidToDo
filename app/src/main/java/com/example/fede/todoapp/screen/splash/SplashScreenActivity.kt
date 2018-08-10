package com.example.fede.todoapp.screen.splash

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.fede.todoapp.R
import com.example.fede.todoapp.di.DaggerActivityComponent
import kotlinx.android.synthetic.main.activity_splash_screen.*
import javax.inject.Inject

class SplashScreenActivity : AppCompatActivity(), SplashScreenContract.View {

    @Inject
    override lateinit var presenter: SplashScreenContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        DaggerActivityComponent.create().inject(this)
        presenter.attach(this)

        setupButtons()
    }

    override fun onDestroy() {
        presenter.destroy()
        super.onDestroy()
    }

    override fun context(): Context {
        return this
    }

    private fun setupButtons() {
        dashboardButton.setOnClickListener { presenter.dashboardButtonTapped() }
    }
}
