package com.lintangprayogo.latihandagger

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.RequestManager
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {
    @Inject
    @JvmField
    var requestManager:RequestManager?=null

    @Inject
    @JvmField
    var drawable:Drawable?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        setLogo()


    }

    private  fun setLogo(){
     requestManager?.load(drawable)?.into(login_logo)
    }
}