package com.oganbelema.bindingdemoiii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.oganbelema.bindingdemoiii.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainActivityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainActivityMainBinding.contact = Contact(0, "Belema Ogan", "Oganbelena@gmail.com")
    }
}
