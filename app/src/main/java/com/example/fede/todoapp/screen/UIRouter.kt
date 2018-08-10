package com.example.fede.todoapp.screen

import android.content.Context
import cn.nekocode.meepo.Meepo
import cn.nekocode.meepo.annotation.Clazz
import com.example.fede.todoapp.screen.dashboard.DashboardActivity

interface UIRouter {
    companion object {
        val IMPL = Meepo.Builder().build().create(UIRouter::class.java)
    }

    @Clazz(DashboardActivity::class)
    fun gotoDashboard(context: Context?) {
        IMPL.gotoDashboard(context)
    }
}