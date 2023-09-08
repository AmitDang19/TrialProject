package com.example.myfirstlibrary

import android.content.Context
import android.widget.Toast

class LibraryClass {
    companion object{
        fun showToast(context:Context){
            Toast.makeText(context,"First Toast",Toast.LENGTH_LONG).show()
        }
    }
}