package com.neppplus.intent_20211113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    멤버변수
    val REQ_FOR_NICKNAME = 1000



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

        btnNickName.setOnClickListener {

            val myIntent = Intent(this,EditNickNameActivity::class.java)

//             왕복여행을 하고 돌아오기 위한 구분 필요
//            구별에 사용하는 숫자 필요. REQUEST_CODE 라고 부름

            startActivityForResult(myIntent, REQ_FOR_NICKNAME )


        }

    }
}