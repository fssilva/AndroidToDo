package com.example.fede.todoapp.di

import com.example.fede.todoapp.screen.UIRouter
import org.mockito.Mockito.mock

class TestAppModule: AppModule() {


    override fun provideRouter(): UIRouter {
        return mock(UIRouter::class.java)
    }

}