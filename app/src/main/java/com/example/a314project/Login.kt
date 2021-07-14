package com.example.a314project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signup = this.findViewById(R.id.btnSignup) as Button
        val login = this.findViewById(R.id.btnLogin) as Button
        val username = this.findViewById(R.id.userName) as EditText
        val password = this.findViewById(R.id.password) as EditText



        signup.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
        login.setOnClickListener {
            val us: String = username.text.toString()
            val pass: String = password.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            if (us.trim().isNotEmpty() && pass.trim().isNotEmpty()) {
                if (us == "Admin" && pass == "admin") {
                    Toast.makeText(applicationContext, "Login Success ", Toast.LENGTH_SHORT).show()
                    startActivity(intent)
                } else {
                    Toast.makeText(
                        applicationContext,
                        "Invalid Username or password",
                        Toast.LENGTH_SHORT
                    ).show()
                }

            } else if (us.trim().isEmpty() && pass.trim().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Username and password required!",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (pass.trim().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Password required!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    applicationContext,
                    "Username required!",
                    Toast.LENGTH_SHORT
                ).show()

            }
        }
    }
}