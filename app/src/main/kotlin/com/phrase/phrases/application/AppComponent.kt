package com.phrase.phrases.application

import android.app.Activity
import android.app.Application
import dagger.Component
import javax.inject.Singleton

/**
 * Main application module for binding dependencies.
 * Created by luiscarino on 3/24/16.
 */

@Singleton
@Component (modules = arrayOf(AppModule :: class))
interface AppComponent {

    fun inject(myApplication: Application)

    fun inject(baseActivity: Activity)
}