package com.example.base_pra

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

//데이터 바인딩을 사용하기 위한 추상클래스 생성
                            //바인딩을 사용할 Activity          그 Activity와 연결할 layout
abstract class BaseActivity<Activity : ViewDataBinding>(@LayoutRes private val layoutResId: Int) :
    AppCompatActivity() {
    protected lateinit var binding: Activity //바인딩을 할 Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutResId)//받은 레이아웃의 아이디로 데이터 바인딩 적용
        init()
    }

    abstract fun init() // init의 추상클래스화
}