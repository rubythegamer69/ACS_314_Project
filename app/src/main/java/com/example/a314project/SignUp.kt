package com.example.a314project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val signup = this.findViewById(R.id.signUp) as Button
        val signin = this.findViewById(R.id.signIn) as Button


        /*signup.setOnClickListener {
            val intent = Intent(this, this::class.java)
            startActivity(intent)
        }*/
        signin.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}