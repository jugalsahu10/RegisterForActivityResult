package com.android.registerforactivityresult

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private var btnSubmit: Button? = null
    private var etName: EditText? = null
    private var etEmail: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnSubmit = findViewById(R.id.btn_submit)
        etName = findViewById(R.id.et_name)
        etEmail = findViewById(R.id.et_email)

        btnSubmit?.setOnClickListener {
// This is used send the custom data with the result.
            val intent = Intent()
            intent.putExtra(MainActivity.NAME, etName?.text.toString())
            intent.putExtra(MainActivity.EMAIL, etEmail?.text.toString())

            setResult(
                Activity.RESULT_OK,
                intent
            ) // It is used to set the RESULT OK and a custom data values which we wants to send back.
            finish()
        }
    }
}