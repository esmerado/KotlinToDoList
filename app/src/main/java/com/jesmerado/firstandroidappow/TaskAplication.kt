package com.jesmerado.firstandroidappow

import android.app.Application

class TaskAplication:Application() {

    companion object {
        lateinit var prefs:Preferences
    }

    override fun onCreate() {
        super.onCreate()
        prefs = Preferences(baseContext)
    }
}