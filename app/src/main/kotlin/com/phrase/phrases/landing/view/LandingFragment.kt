package com.phrase.phrases.landing.view

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.phrase.phrases.landing.presenter.LandingPresenter
import com.phrase.phrases.landing.presenter.LandingPresenterImp

/**
 * Created by luiscarino on 3/24/16.
 */
class LandingFragment : Fragment(), LandingView {

    private val presenter: LandingPresenter = LandingPresenterImp(this);


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }


    override fun loadPhrases() {
        throw UnsupportedOperationException()
    }
}