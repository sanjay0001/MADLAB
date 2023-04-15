package com.example.sms

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etphno : EditText = findViewById(R.id.p1)
        val etmsg : EditText = findViewById(R.id.p2)
        val btsend : Button = findViewById(R.id.btnsend)

        //Android 10 and above we need to seek permission every time. Below 10, permission in manifest is enough
        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.SEND_SMS),10)

        btsend.setOnClickListener {
            var phoneno = etphno.text.toString()
            var message = etmsg.text.toString()

            var smsManager : SmsManager
            smsManager =SmsManager.getDefault()
            smsManager.sendTextMessage(phoneno,null,message,null,null)

            Toast.makeText(applicationContext,"Message Sent", Toast.LENGTH_SHORT).show()
        }

    }
}