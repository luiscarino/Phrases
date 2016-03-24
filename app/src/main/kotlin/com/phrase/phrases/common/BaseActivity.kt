package com.phrase.phrases.common

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import com.phrase.phrases.application.PhrasesApplication


/**
 * Created by luiscarino on 3/24/16.
 */
class BaseActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        PhrasesApplication.graph.inject(this)
    }


    override fun onStop() {
        super.onStop()
    }
}