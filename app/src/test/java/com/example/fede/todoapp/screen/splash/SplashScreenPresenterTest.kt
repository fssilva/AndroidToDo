package com.example.fede.todoapp.screen.splash

import com.example.fede.todoapp.di.TestAppModule
import com.example.fede.todoapp.screen.UIRouter
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*
import javax.inject.Inject

class SplashScreenPresenterTest {

    @Inject
    lateinit var router: UIRouter
    lateinit var view: SplashScreenContract.View
    lateinit var sut: SplashScreenPresenter

    @Before
    fun setup() {
        DaggerTestSplashScreenComponent.builder().appModule(TestAppModule()).build().inject(this)
        view = mock(SplashScreenContract.View::class.java)
        sut = SplashScreenPresenter(router)
    }

    @Test
    fun testRouterWired() {
        verify(router, never()).gotoDashboard(view.context())

        sut.dashboardButtonTapped()

        verify(router).gotoDashboard(view.context())
    }
}