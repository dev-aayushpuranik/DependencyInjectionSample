package com.aayush.di_project

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class AuthActivity : AppCompatActivity() {

    @Inject
    lateinit var stringProperty : String

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)


        Log.d("Auth Activity", stringProperty)
        findViewById<TextView>(R.id.text_view).text = stringProperty
    }
}