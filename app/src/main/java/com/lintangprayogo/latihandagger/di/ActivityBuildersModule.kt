package com.lintangprayogo.latihandagger.di

import com.lintangprayogo.latihandagger.AuthActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {
 @ContributesAndroidInjector
 abstract fun contributeAuthActivity():AuthActivity

 companion object{
     @Provides
     @JvmStatic
     fun someString():String{
         return "This A Test"
     }
 }
}