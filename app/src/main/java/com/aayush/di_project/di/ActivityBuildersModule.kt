package com.aayush.di_project.di

import com.aayush.di_project.AuthActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributesAuthActivity(): AuthActivity

    @Module
    companion object {
    @JvmStatic
    @Provides
        fun someString(): String {
            return "This is some string"
        }
    }
}