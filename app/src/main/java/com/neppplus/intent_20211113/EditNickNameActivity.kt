package com.neppplus.intent_20211113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick_name.*

class EditNickNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)

        btnOK.setOnClickListener {

            val inputNickName = textNickName.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("nick", inputNickName)

            setResult(RESULT_OK, resultIntent)

            finish()

        }
    }
}