package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
        Log.d("lifeCycle", "onCreate")

    }

    override fun onStart() {
        Log.d("lifeCycle", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("lifeCycle", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("lifeCycle", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("lifeCycle", "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("lifeCycle", "onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d("lifeCycle", "onRestart")
        super.onRestart()
    }

}