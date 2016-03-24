package com.phrase.phrases.application

import android.app.Application
import android.content.Context
import android.location.LocationManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Main app module for dependencies which require a [android.content.Context] or [ ] to create.
 * Created by luiscarino on 3/24/16.
 */

@Module
class AppModule(private val application: Application) {

    @Provides
    @Singleton
    fun provideLocationManager(): LocationManager {
        return application.getSystemService(Context.LOCATION_SERVICE) as LocationManager
    }
}