package com.phrase.phrases.application

import android.app.Application

/**
 * Application class used for initialization and define global scope attributes.
 * Created by luiscarino on 3/24/16.
 */
class PhrasesApplication : Application() {

    companion object {
        //platformStatic allow access it from java code (i.e. generates java code)
        @JvmStatic lateinit var graph: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        // build dependency injection graph.
        graph = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build();
    }

}