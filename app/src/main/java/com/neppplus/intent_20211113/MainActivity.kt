package com.neppplus.intent_20211113

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    멤버변수
    val REQ_FOR_NICKNAME = 1000



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSms.setOnClickListener {
            val inputPhoneNum = editPhoneNum.text.toString()

//            그 전화전호에 실제 전화 연결
            val myUri = Uri.parse("smsto:${inputPhoneNum}")
            val myIntent = Intent( Intent.ACTION_SENDTO, myUri )
            myIntent.putExtra("sms_body", "이 문자는 자동입력")
            startActivity(myIntent)

        }

        btnNaverLink.setOnClickListener {

            val myUri = Uri.parse("https://www.naver.com")
            val myIntent = Intent( Intent.ACTION_VIEW, myUri )
            startActivity(myIntent)

        }

        btnDial.setOnClickListener { 
//            입력한 전화번호 추츨(변수에 저장)
            val inputPhoneNum = editPhoneNum.text.toString()

//            그 전화전호에 실제 전화 연결
            val myUri = Uri.parse("tel:${inputPhoneNum}")
            val myIntent = Intent( Intent.ACTION_DIAL, myUri )
            startActivity(myIntent)
        }

        btnCall.setOnClickListener {
//            입력한 전화번호 추츨(변수에 저장)
            val inputPhoneNum = editPhoneNum.text.toString()

//            그 전화전호에 실제 전화 연결
            val myUri = Uri.parse("tel:${inputPhoneNum}")
            val myIntent = Intent( Intent.ACTION_CALL, myUri )
            startActivity(myIntent)
        }

        
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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
//        request_Code : 어떤 것을 가지러 다녕녹너지 알려주는 숫자가 기록됨

        if (requestCode == REQ_FOR_NICKNAME) {
//            닉네임을 가지러 다녀왔을때 실행됨

//            resultCode : 확인(ok) / 취소(cancle) 중 어떤것을 눌렀는지 알려줌

            if(resultCode == RESULT_OK ){
//                닉네임을 가지러 가서 확인버튼(ok)을 누른게 맞을때 실행되는 코드

//                data : 이전화면에서 담아준 resultIntent를 들고 있는 역할

                val newNickName = data?.getStringExtra("nick")

                txtNickname.text = newNickName

            }
        }

    }


}