package com.neppplus.intent_20211113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        btnReturnMain.setOnClickListener {
//            val myIntent2 = Intent(this, MainActivity::class.java)
//            startActivity(myIntent2)

            finish()
        }
    }
}