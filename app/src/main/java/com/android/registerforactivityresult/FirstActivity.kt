package com.android.registerforactivityresult

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {

    private var buttonFinish: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        buttonFinish = findViewById(R.id.btn_finish)

        buttonFinish?.setOnClickListener {
            setResult(Activity.RESULT_OK) // It is used to set the RESULT OK which means it is success action which we wants to send back.
            finish()
        }
    }
}