package com.neppplus.intent_20211113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveToOther.setOnClickListener {

//            OtherActivity로 이동

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)


        }

        btnSendMessage.setOnClickListener {
//            화면이동 및 입력한 문구 가지고 이동
//            입력한 내용 변수에 담아두자

            val inputMessage = editMessage.text.toString()

//            화면을 이동
            val myIntent3 = Intent(this, ViewMessageActivity::class.java)
//            inputMessage 같이 보내기
            myIntent3.putExtra("message",inputMessage)
            startActivity(myIntent3)
        }

    }
}