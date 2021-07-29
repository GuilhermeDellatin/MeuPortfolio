package com.gfdellatin.meuportfolio

import android.app.Application
import com.gfdellatin.meuportfolio.data.di.DataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }
        DataModule.load()
    }
}