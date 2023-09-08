package com.example.trialproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstlibrary.LibraryClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LibraryClass.showToast(this)
    }
}