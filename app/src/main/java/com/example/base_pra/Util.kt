package com.example.base_pra

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast

@SuppressLint("StaticFieldLeak")
object Util {

    lateinit var context: Context
    lateinit var str: String

    fun toast(context: Context , str : String) {
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show()
    }
}