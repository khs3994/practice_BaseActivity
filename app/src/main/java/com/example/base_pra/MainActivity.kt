package com.example.base_pra

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.base_pra.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun init() {
        hello()
    }

    private fun hello() {
        binding.hello.setOnClickListener {
            Util.toast(this,"안녕하세요")
        }
    }


}