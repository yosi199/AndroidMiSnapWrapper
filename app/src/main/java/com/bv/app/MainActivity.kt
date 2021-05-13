package com.bv.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bv.androidmisnapwrapper.HelloWorld

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        HelloWorld().print()
    }
}