package com.lintangprayogo.latihandagger

import com.lintangprayogo.latihandagger.di.AppComponent
import com.lintangprayogo.latihandagger.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class BaseApp:DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }
}