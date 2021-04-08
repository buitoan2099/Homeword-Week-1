package com.example.week1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_login.*
data class LogInInfor(var logInName : String, var logInPassword: String)

class screen_login : AppCompatActivity() {

    private val Admin : LogInInfor = LogInInfor("ronaldo@gmail.com", "123456")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

        r9.setOnClickListener{
            val id: String = r5.text.toString()
            if(id != Admin.logInName) Toast.makeText(this,R.string.No_user_warning,Toast.LENGTH_SHORT).show()
            else {
                val pass: String = password.text.toString()
                if (pass != Admin.logInPassword) Toast.makeText(this, R.string.Wrong_password_warning, Toast.LENGTH_SHORT).show()
                else{
                    val intent= Intent(this,screen_profile::class.java)
                    startActivity(intent)
                }
            }
        }

        back_from_login.setOnClickListener {
            finish()
        }

    }
}