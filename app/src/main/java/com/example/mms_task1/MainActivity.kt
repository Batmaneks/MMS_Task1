package com.example.mms_task1
import android.util.Log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG", "onCreate() Event")
    }
    override fun onStart(){
        super.onStart()
        Log.d("TAG", "onStart() Event")
    }
    override fun onResume(){
        super.onResume()
        Log.d("TAG", "onResume() Event")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAG","onRestart() Event")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","onPause() Event")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Tag", "onStop() Event")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Tag","onDestroy() Event")
    }
}