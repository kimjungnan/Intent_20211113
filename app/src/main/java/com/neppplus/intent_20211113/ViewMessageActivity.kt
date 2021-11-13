package com.neppplus.intent_20211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_message.*

class ViewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

//        보낸 문구를 바로 반영, 화면 로딩 시 같이 실행 영역

//        1. 메인화면에서 보내준 문구를 받아서 변수로 담아두기
//        나한테 올때 사용한 intent를 이용하자. 거기에 붙어온 짐을 꺼내기

        val sendMessage = intent.getStringExtra("message")

//        2. 메세지를 보여주는 텍스트뷰의 문구로 반영
        txtMessage.text = sendMessage

    }
}