package com.example.triviaapp.ui

import android.os.Bundle
import com.example.triviaapp.R
import com.example.triviaapp.base.DaggerBaseActivity

class MainActivity : DaggerBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Add username fragment//
        if (supportFragmentManager.findFragmentByTag(UserNameFragment.TAG) == null) {
            supportFragmentManager.beginTransaction()
                .add(
                    R.id.flContainer,
                    UserNameFragment.newInstance(),
                    UserNameFragment.TAG
                )
                .commit()
        }
    }
}