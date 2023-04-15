package com.example.email

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etto :EditText = findViewById(R.id.etto)
        val etsub : EditText = findViewById(R.id.etsub)
        val etmsg : EditText = findViewById(R.id.etmsg)
        val btsend :Button = findViewById(R.id.btsend)

        btsend.setOnClickListener {
            var email = etto.text.toString()
            var subject = etsub.text.toString()
            var text = etmsg.text.toString()

            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            intent.putExtra(Intent.EXTRA_SUBJECT,subject)
            intent.putExtra(Intent.EXTRA_TEXT, text)

            intent.type="message/rfc822"
            startActivity(Intent.createChooser(intent,"Kindly choose a client"))

        }
    }
}