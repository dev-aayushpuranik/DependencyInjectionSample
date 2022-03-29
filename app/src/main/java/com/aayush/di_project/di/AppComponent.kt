package com.aayush.di_project.di

import android.app.Application
import com.aayush.di_project.BaseApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityBuildersModule::class
])
interface AppComponent : AndroidInjector<BaseApp> {

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun appMethod(app: Application) :Builder

        fun build(): AppComponent
    }
}