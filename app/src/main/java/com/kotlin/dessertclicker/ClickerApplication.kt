package com.kotlin.dessertclicker

import android.app.Application
import timber.log.Timber

// SOS: This object is created before any other objs in the app and destroyed last. Good place for
// one-time init of stuff that is needed throughout the app
class ClickerApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
        Timber.i("Application onCreate called")
    }
}